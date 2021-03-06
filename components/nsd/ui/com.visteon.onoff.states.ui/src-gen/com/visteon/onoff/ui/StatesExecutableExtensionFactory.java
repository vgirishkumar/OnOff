/*
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.ui;

import com.google.inject.Injector;
import com.visteon.onoff.states.ui.internal.StatesActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StatesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(StatesActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		StatesActivator activator = StatesActivator.getInstance();
		return activator != null ? activator.getInjector(StatesActivator.COM_VISTEON_ONOFF_STATES) : null;
	}

}
