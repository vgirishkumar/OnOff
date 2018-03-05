package com.visteon.onoff.generator.app;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.visteon.onoff.CoomStandaloneSetup;
import com.visteon.onoff.StatesStandaloneSetup;
import com.visteon.onoff.generator.CoomGenerator;
import com.visteon.onoff.generator.StatesGenerator;

public class RunGeneration implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Starting the Headless Product for Code generation");

		System.out.println("Workspace Location : " + ResourcesPlugin.getWorkspace().getRoot().getLocation());

		final String[] appArgs = scanArguments(context);

		IProject project = prepareWorkspace(appArgs);

		buildProject(project);

		doCodeGeneration(project);

		return IApplication.EXIT_OK;
	}

	private String[] scanArguments(IApplicationContext context) {
		final Map<?, ?> args = context.getArguments();
		final String[] appArgs = (String[]) args.get("application.args");
		System.out.println("Scanning the Arguments");
		for (final String arg : appArgs) {
			System.out.println(arg);
		}
		System.out.println("Scanning of the Arguments completed Successfully!");
		return appArgs;
	}

	private void doCodeGeneration(IProject project) {
		System.out.println("Loading the project '" + project.getName() + "' ...");
		List<IResource> resources = collectResources(project);

		setUpXtextPackages();

		XtextResourceSet rset = loadModels(resources);

		System.out.println("Loading Completed");

		System.out.println("Code generation started for project '" + project.getName() + "' ...");
		for (Resource res : rset.getResources()) {
			// based on extension, look for generators and call doGenerate on all of them
			if (res.getURI().fileExtension().equals("coom")) {
				new CoomGenerator().doGenerate(res, null, null);
			} else {
				new StatesGenerator().doGenerate(res, null, null);
			}
		}
		System.out.println("Code Generation Completed");

	}

	private XtextResourceSet loadModels(List<IResource> resources) {
		XtextResourceSet rset = new XtextResourceSet();
		for (IResource iResource : resources) {

			URI locationURI = iResource.getLocationURI();
			org.eclipse.emf.common.util.URI createURI = org.eclipse.emf.common.util.URI
					.createURI(locationURI.toString());
			rset.getResource(createURI, true);
		}
		EcoreUtil.resolveAll(rset);
		return rset;
	}

	private void setUpXtextPackages() {
		// This as well needs to be configured from extension
		CoomStandaloneSetup.doSetup();
		StatesStandaloneSetup.doSetup();
	}

	private List<IResource> collectResources(IProject project) {

		// This information should be available through extensions
		List<String> extensions = new ArrayList<>();
		extensions.add("coom");
		extensions.add("nsd");

		final List<IResource> resources = new ArrayList<>();
		try {
			project.accept(new IResourceVisitor() {
				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IFile && !"bin".equals(resource.getProjectRelativePath().segments()[0])
							&& extensions.contains(resource.getFileExtension())) {
						resources.add(resource);
					}
					return true;
				}
			});
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.reverse(resources);
		return resources;
	}

	private void buildProject(IProject project) throws CoreException {
		project.build(IncrementalProjectBuilder.FULL_BUILD, null);
	}

	private IProject prepareWorkspace(final String[] appArgs) throws CoreException {
		System.out.println("Importing the project " + appArgs[0] + " in to workspace");
		IProjectDescription description = ResourcesPlugin.getWorkspace()
				.loadProjectDescription(new Path(appArgs[0] + "/.project"));
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
		project.create(description, null);
		project.open(null);
		System.out.println("Importing the project " + appArgs[0] + " completed");
		return project;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
