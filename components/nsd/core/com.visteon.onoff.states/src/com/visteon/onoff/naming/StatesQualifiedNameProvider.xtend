package com.visteon.onoff.naming

import com.visteon.onoff.states.ClientConfiguration
import com.visteon.onoff.states.ComponentState
import com.visteon.onoff.states.StatesPackage
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import com.visteon.onoff.states.ComponentTransition

class StatesQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	def QualifiedName qualifiedName(ComponentState cs) {
		val cc = cs.eContainer() as ClientConfiguration
		val text = NodeModelUtils.findNodesForFeature(cs, StatesPackage.Literals.COMPONENT_STATE__STATE).head.text.trim
		return QualifiedName.create(cc.name, text)
	}

	def QualifiedName qualifiedName(ComponentTransition ct) {
		val cc = ct.eContainer() as ClientConfiguration
		val text = NodeModelUtils.findNodesForFeature(ct, StatesPackage.Literals.COMPONENT_TRANSITION__TRANSITION).head.
			text.trim
		return QualifiedName.create(cc.name, text)
	}
}
