package com.visteon.onoff.coom.ui.newwizard;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;

import com.google.common.base.Strings;
import com.visteon.onoff.coom.CoomFactory;
import com.visteon.onoff.coom.State;
import com.visteon.onoff.workbench.ui.AbstractValidationWizardPage;
import org.eclipse.swt.widgets.Control;

public class NewCoomWizardPage extends AbstractValidationWizardPage {

	private Text compName_text;
	private Text majorVersion_text;
	private Text minorVersion_text;
	private Table table;

	private List<State> states;

	protected NewCoomWizardPage() {
		super("New Component OnOff Manifest", "Creates a new Component OnOff Manifest");
		states = new ArrayList<>();
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

		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

		CheckboxTableViewer checkboxTableViewer = CheckboxTableViewer.newCheckList(composite,
				SWT.BORDER | SWT.FULL_SELECTION);
		table = checkboxTableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		checkboxTableViewer.setCheckStateProvider(new ICheckStateProvider() {

			@Override
			public boolean isGrayed(Object element) {
				return false;
			}

			@Override
			public boolean isChecked(Object element) {
				if (element instanceof State) {
					return ((State) element).isInitial();
				}
				return false;
			}
		});
		checkboxTableViewer.addCheckStateListener(new ICheckStateListener() {

			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				State element = (State) event.getElement();
				element.setInitial(event.getChecked());

			}
		});
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(checkboxTableViewer, SWT.NONE);
		TableColumn tblclmnInitial = tableViewerColumn_1.getColumn();
		tblclmnInitial.setWidth(100);
		tblclmnInitial.setText("Initial");
		tableViewerColumn_1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return StringUtils.EMPTY;
			}
		});

		TableViewerColumn tableViewerColumn = new TableViewerColumn(checkboxTableViewer, SWT.NONE);
		tableViewerColumn.setEditingSupport(new EditingSupport(checkboxTableViewer) {

			protected boolean canEdit(Object element) {
				return true;
			}

			protected CellEditor getCellEditor(Object element) {
				return new TextCellEditor(table);
			}

			protected Object getValue(Object element) {
				return ((State) element).getName();
			}

			protected void setValue(Object element, Object value) {
				((State) element).setName(String.valueOf(value));
				checkboxTableViewer.update(element, null);
			}
		});
		TableColumn tblclmnName = tableViewerColumn.getColumn();
		tblclmnName.setWidth(200);
		tblclmnName.setText("Name");
		tableViewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof State) {
					return ((State) element).getName();
				}
				return super.getText(element);
			}
		});

		checkboxTableViewer.setContentProvider(new ArrayContentProvider());
		checkboxTableViewer.setInput(states);

		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		composite_1.setLayout(new RowLayout(SWT.VERTICAL));

		Button btnNewButton = new Button(composite_1, SWT.NONE);
		btnNewButton.setImage(ResourceManager.getPluginImage("com.visteon.onoff.coom.ui.newwizard", "icons/Add.png"));

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				State createState = CoomFactory.eINSTANCE.createState();
				createState.setInitial(false);
				createState.setName("state");
				states.add(createState);

				checkboxTableViewer.refresh();
			}
		});

		Button btnNewButton_1 = new Button(composite_1, SWT.NONE);
		btnNewButton_1
				.setImage(ResourceManager.getPluginImage("com.visteon.onoff.coom.ui.newwizard", "icons/Remove.png"));
		composite_1.setTabList(new Control[]{btnNewButton, btnNewButton_1});
		composite.setTabList(new Control[]{composite_1});
		container.setTabList(new Control[]{compName_text, majorVersion_text, minorVersion_text, composite});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				ISelection selection = checkboxTableViewer.getSelection();
				if (!selection.isEmpty() && selection instanceof StructuredSelection) {
					for (Object object : ((StructuredSelection) selection).toList()) {
						states.remove(object);
					}
					checkboxTableViewer.refresh();
				}
			}
		});
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

	public List<State> getStates() {
		return states;
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