/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.visteon.onoff.CoomRuntimeModule;
import com.visteon.onoff.CoomStandaloneSetup;
import com.visteon.onoff.ide.CoomIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class CoomIdeSetup extends CoomStandaloneSetup {
  @Override
  public Injector createInjector() {
    CoomRuntimeModule _coomRuntimeModule = new CoomRuntimeModule();
    CoomIdeModule _coomIdeModule = new CoomIdeModule();
    return Guice.createInjector(Modules2.mixin(_coomRuntimeModule, _coomIdeModule));
  }
}
