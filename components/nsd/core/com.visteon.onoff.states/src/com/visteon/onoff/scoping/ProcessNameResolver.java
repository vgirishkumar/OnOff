package com.visteon.onoff.scoping;

import java.io.File;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.visteon.onoff.coom.ComponentOnOffManifest;

/**
 * Static API to load process and store them as static variable
 * 
 * @author GVENKATA
 */
public class ProcessNameResolver {

	private static ComponentOnOffManifest process;

	public static ComponentOnOffManifest getProcess(XtextResourceSet rset) {
		if (process == null) {
			String installLocation = Platform.getInstallLocation().getURL().getFile();
			File file = new File(installLocation + File.separator + "process" + File.separator + "Process.coom");
			URI createURI = URI.createURI(file.toURI().toString());
			Resource resource = rset.getResource(createURI, true);
			EcoreUtil2.resolveAll(resource);
			process = (ComponentOnOffManifest) resource.getContents().get(0);
		}
		return process;
	}

}
