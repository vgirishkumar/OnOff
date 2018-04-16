package com.visteon.onoff.naming

import com.visteon.onoff.coom.ComponentOnOffManifest
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

class CoomQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	def qualifiedName(ComponentOnOffManifest cs) {
		return QualifiedName.create(cs.name + "__v" + cs.version.majorMalue + "_" + cs.version.minorValue)
	}
}
