package com.visteon.onoff.coom.ui.newwizard;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.google.common.base.Strings;
import com.visteon.onoff.workbench.ui.AbstractValidationWizardPage;

public class NewCoomWizardPage extends AbstractValidationWizardPage {

	private Text compName_text;
	private Text majorVersion_text;
	private Text minorVersion_text;

	protected NewCoomWizardPage() {
		super("New Component OnOff Manifest", "Creates a new Component OnOff Manifest");
	}

	protected void createUI(Composite container) {
		GridLayout gl_container = new GridLayout(2, false);
		gl_container.horizontalSpacing = 10;
		gl_container.verticalSpacing = 10;
		container.setLayout(gl_container);

		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Component Name");

		compName_text = new Text(container, SWT.BORDER);
		compName_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		compName_text.addListener(SWT.Modify, this);

		Label lblMajorVersion = new Label(container, SWT.NONE);
		lblMajorVersion.setText("Major Version");

		majorVersion_text = new Text(container, SWT.BORDER);
		majorVersion_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		majorVersion_text.addListener(SWT.Modify, this);

		Label lblMinorVersion = new Label(container, SWT.NONE);
		lblMinorVersion.setText("Minor Version");

		minorVersion_text = new Text(container, SWT.BORDER);
		minorVersion_text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		minorVersion_text.addListener(SWT.Modify, this);
	}

	protected boolean validate() {
		String componentName = compName_text.getText();
		if (Strings.isNullOrEmpty(componentName)) {
			setErrorMessage("Component Name cannot be empty!");
			return false;
		}
		String majorVersion = majorVersion_text.getText();
		if (Strings.isNullOrEmpty(majorVersion)) {
			setErrorMessage("Major Version cannot be empty!");
			return false;
		}

		if (!isPositiveInteger(majorVersion)) {
			setErrorMessage("Major Version can only be positive Integer!");
			return false;
		}

		String minorVersion = minorVersion_text.getText();
		if (Strings.isNullOrEmpty(minorVersion)) {
			setErrorMessage("Minor Version cannot be empty!");
			return false;
		}
		if (!isPositiveInteger(minorVersion)) {
			setErrorMessage("Minor Version can only be positive Integer!");
			return false;
		}

		setErrorMessage(null);
		return true;
	}

	public String getComponentName() {
		return compName_text.getText();
	}

	public int getMajorVersion() {
		return Integer.parseInt(majorVersion_text.getText());
	}

	public int getMinorVersion() {
		return Integer.parseInt(minorVersion_text.getText());
	}

	public static boolean isPositiveInteger(String input) {
		try {
			int parseInt = Integer.parseInt(input);
			if (parseInt >= 0)
				return true;
		} catch (Exception e) {
			// Duck this Exception, as I want only boolean value here, which means its not
			// positive int here
		}
		return false;
	}

}