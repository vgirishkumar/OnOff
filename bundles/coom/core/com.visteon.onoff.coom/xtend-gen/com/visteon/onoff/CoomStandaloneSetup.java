/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff;

import com.visteon.onoff.CoomStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class CoomStandaloneSetup extends CoomStandaloneSetupGenerated {
  public static void doSetup() {
    new CoomStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
