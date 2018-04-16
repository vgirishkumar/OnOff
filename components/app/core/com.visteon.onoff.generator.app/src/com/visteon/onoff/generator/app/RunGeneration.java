package com.visteon.onoff.generator.app;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.common.collect.Lists;
import com.google.common.io.Files;
import com.visteon.onoff.CoomStandaloneSetup;
import com.visteon.onoff.StatesStandaloneSetup;

public class RunGeneration implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Starting the Headless Product for Code generation");

		System.out.println("Workspace Location : " + ResourcesPlugin.getWorkspace().getRoot().getLocation());

		final String[] appArgs = scanArguments(context);

		doCodeGeneration(appArgs);

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

	private void doCodeGeneration(String[] appArgs) {
		List<File> resources = collectResources(appArgs);

		setUpXtextPackages();

		long start = System.currentTimeMillis();
		XtextResourceSet rset = loadModels(resources);

		for (Resource res : rset.getResources()) {
			System.out.println("Loading " + res.getURI().toString());
			// based on extension, look for generators and call doGenerate on all of them
			/*
			 * if (res.getURI().fileExtension().equals("coom")) { new
			 * CoomGenerator().doGenerate(res, null, null); } else { new
			 * StatesGenerator().doGenerate(res, null, null); }
			 */
		}
		long end = System.currentTimeMillis();
		System.out.println("Loading Completed in : " + (end - start) + "ms");
		// System.out.println("Code Generation Completed");

	}

	private XtextResourceSet loadModels(List<File> resources) {
		XtextResourceSet rset = new XtextResourceSet();
		for (File iResource : resources) {

			URI locationURI = iResource.toURI();
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

	private List<File> collectResources(String[] appArgs) {

		List<File> models = new ArrayList<File>();
		String programPath = appArgs[0];

		String componentFolderPath = programPath + File.separator + "components";
		File Componetfolder = new File(componentFolderPath);
		File[] components = Componetfolder.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		});
		String coom = "coom";
		for (File file : components) {
			File[] componentsWithCoom = file.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.equals(coom);
				}
			});

			for (File file2 : componentsWithCoom) {
				File[] cooms = file2.listFiles(new FileFilter() {
					@Override
					public boolean accept(File pathname) {
						// TODO Auto-generated method stub
						return !pathname.isDirectory()
								&& Files.getFileExtension(pathname.getAbsolutePath()).equals(coom);
					}
				});
				models.addAll(Lists.newArrayList(cooms));
			}
		}

		String nsd = "nsd";
		File[] nsds = new File(programPath).listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return !pathname.isDirectory() && Files.getFileExtension(pathname.getAbsolutePath()).equals(nsd);
			}
		});
		models.addAll(Lists.newArrayList(nsds));
		return models;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
