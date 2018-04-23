package com.visteon.onoff.resource.strategy

import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.resource.IEObjectDescription

class StatesResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		return false
	}

}
