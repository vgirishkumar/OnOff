package com.visteon.onoff.coom.ui.newwizard;

import com.visteon.onoff.coom.ComponentOnOffManifest;
import com.visteon.onoff.coom.CoomFactory;
import com.visteon.onoff.coom.Version;
import com.visteon.onoff.workbench.ui.AbstractOnOffModelCreationWizard;

public class NewCoomWizard extends AbstractOnOffModelCreationWizard {

	private NewCoomWizardPage newCoomWizardPage;

	public NewCoomWizard() {
		setWindowTitle("New Component OnOff Manifest[coom]");
	}

	@Override
	public void addPages() {
		super.addPages();
		newCoomWizardPage = new NewCoomWizardPage();
		addPage(newCoomWizardPage);
	}

	protected String getFileName() {
		return newCoomWizardPage.getComponentName() + "__v" + newCoomWizardPage.getMajorVersion() + "_"
				+ newCoomWizardPage.getMinorVersion();
	}

	protected ComponentOnOffManifest prepareModel() {
		ComponentOnOffManifest coom = CoomFactory.eINSTANCE.createComponentOnOffManifest();
		coom.setName(newCoomWizardPage.getComponentName());

		Version version = CoomFactory.eINSTANCE.createVersion();
		version.setMajorMalue(newCoomWizardPage.getMajorVersion());
		version.setMinorValue(newCoomWizardPage.getMinorVersion());

		coom.setVersion(version);
		return coom;
	}

	@Override
	protected String getFileExtension() {
		return "coom";
	}

}
