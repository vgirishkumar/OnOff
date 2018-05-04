package com.visteon.onoff.workbench.ui;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

/**
 * Abstract Wizard Page for all wizard Page , which provides validation support
 * for Wizards
 * 
 * @author GVENKATA
 *
 */
public abstract class AbstractValidationWizardPage extends WizardPage implements Listener {

	public AbstractValidationWizardPage(String pageName, String description) {
		super(pageName);
		setDescription(description);
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		createUI(container);
		setPageComplete(validate());
	}

	abstract protected boolean validate();

	abstract protected void createUI(Composite container);

	@Override
	public void handleEvent(Event event) {
		setPageComplete(validate());
	}

}