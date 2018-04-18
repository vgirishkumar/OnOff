package com.visteon.onoff.coom.ui.newwizard;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.visteon.onoff.coom.ComponentOnOffManifest;
import com.visteon.onoff.coom.CoomFactory;
import com.visteon.onoff.coom.Version;

public class NewCoomWizard extends BasicNewResourceWizard {

	private NewCoomWizardPage newCoomWizardPage;

	public NewCoomWizard() {
		setWindowTitle("New Component OnOff Manifest[coom]");
	}
	@Override
	public void addPages() {
		super.addPages();
		newCoomWizardPage = new NewCoomWizardPage("New Component OnOff Manifest");
		addPage(newCoomWizardPage);
	}

	@Override
	public boolean performFinish() {
		IPath containerFullPath = getSelectionFullPath(getSelection());
		containerFullPath = containerFullPath.append(getFileName() + "." + "coom");
		URI uri = URI.createPlatformResourceURI(containerFullPath.toString(), false);
		XtextResourceSet xtextResourceSet = new XtextResourceSet();
		Resource createResource = xtextResourceSet.createResource(uri);
		createResource.getContents().add(prepareModel());
		try {
			createResource.save(SaveOptions.defaultOptions().toOptionsMap());
			openResourceInEditor(containerFullPath);
		} catch (IOException e) {
			return false;
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	private String getFileName() {
		return newCoomWizardPage.getComponentName() + "__v" + newCoomWizardPage.getMajorVersion() + "_"
				+ newCoomWizardPage.getMinorVersion();
	}

	private ComponentOnOffManifest prepareModel() {
		ComponentOnOffManifest coom = CoomFactory.eINSTANCE.createComponentOnOffManifest();
		coom.setName(newCoomWizardPage.getComponentName());

		Version version = CoomFactory.eINSTANCE.createVersion();
		version.setMajorMalue(newCoomWizardPage.getMajorVersion());
		version.setMinorValue(newCoomWizardPage.getMinorVersion());

		coom.setVersion(version);
		return coom;
	}

	public static IPath getSelectionFullPath(IStructuredSelection iStructuredSelection) {
		if (iStructuredSelection == null) {
			iStructuredSelection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getSelectionService().getSelection();
			if (iStructuredSelection == null) {
				return null;
			}
		}
		Iterator<?> it = iStructuredSelection.iterator();
		if (it.hasNext()) {
			Object obj = it.next();
			IResource selectedResource = null;
			if (obj instanceof IResource) {
				if (obj instanceof IFile) {
					selectedResource = ((IResource) obj).getParent();
				} else {
					selectedResource = (IResource) obj;
				}
			} else if (obj instanceof IAdaptable) {
				selectedResource = (IResource) ((IAdaptable) obj).getAdapter(IResource.class);
			}
			if (selectedResource != null) {
				return selectedResource.getFullPath();
			}
		}
		// you don't need to throw exception here, as if the selection is not
		// valid,
		// still we are showing all the available projects for selection in the
		// wizard
		return null;
	}

	public static void openResourceInEditor(IPath path) throws PartInitException {
		FileEditorInput input = new FileEditorInput(ResourcesPlugin.getWorkspace().getRoot().getFile(path));
		IWorkbench workbench = PlatformUI.getWorkbench();
		IEditorDescriptor desc = workbench.getEditorRegistry().getDefaultEditor(input.getFile().getName());
		workbench.getActiveWorkbenchWindow().getActivePage().openEditor(input, desc.getId());
	}

}
