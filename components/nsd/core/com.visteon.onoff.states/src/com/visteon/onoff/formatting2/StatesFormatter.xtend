/*
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.formatting2

import com.google.inject.Inject
import com.visteon.onoff.services.StatesGrammarAccess
import com.visteon.onoff.states.ClientConfiguration
import com.visteon.onoff.states.ComponentFeature
import com.visteon.onoff.states.ComponentState
import com.visteon.onoff.states.ComponentTransition
import com.visteon.onoff.states.NodeState
import com.visteon.onoff.states.NodeStateAssociation
import com.visteon.onoff.states.NodeStateConfiguration
import com.visteon.onoff.states.NodeStateDiagram
import com.visteon.onoff.states.NodeTransition
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class StatesFormatter extends AbstractFormatter2 {

	@Inject extension StatesGrammarAccess

	def dispatch void format(NodeStateConfiguration nodeStateConfiguration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		nodeStateConfiguration.getNsd.format.append[newLines = 2];
		for (ClientConfiguration clientConfiguration : nodeStateConfiguration.clientConfigs) {
			clientConfiguration.format.append[newLines = 2];
		}
	}

	def dispatch void format(NodeStateDiagram nsd, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		nsd.regionFor.keyword("NodeStateDiagram").prepend[noSpace]
		interior(nsd.regionFor.keyword("{"), nsd.regionFor.keyword("}"))[indent]
		interior(nsd.regionFor.keyword("{"), nsd.regionFor.keyword("}"))[newLine]
		for (NodeState nodeState : nsd.getStates()) {
			nodeState.format.append[newLines = 2];
		}
		for (NodeTransition nodeTransition : nsd.getTransitions()) {
			nodeTransition.format.append[newLines = 2];
		}
	}

	def dispatch void format(ClientConfiguration cc, extension IFormattableDocument document) {
		interior(cc.regionFor.keyword("{"), cc.regionFor.keyword("}"))[indent]
		interior(cc.regionFor.keyword("{"), cc.regionFor.keyword("}"))[newLine]
		for (state : cc.states) {
			state.format.append[newLines = 2]
		}
		for (transition : cc.transitions) {
			transition.format.append[newLines = 2]
		}
		for (feature : cc.features) {
			feature.format.append[newLines = 2]
		}
		for (nsa : cc.nodeStateAssociations) {
			nsa.format.append[newLines = 2]
		}
	}

// TODO: implement for ClientConfiguration, ComponentTransition, ComponentState
	def dispatch void format(ComponentTransition cc, extension IFormattableDocument document) {
		interior(cc.regionFor.keyword("{"), cc.regionFor.keyword("}"))[indent]
		interior(cc.regionFor.keyword("{"), cc.regionFor.keyword("}"))[newLine]
	}

	def dispatch void format(ComponentState cc, extension IFormattableDocument document) {
		interior(cc.regionFor.keyword("{"), cc.regionFor.keyword("}"))[indent]
		interior(cc.regionFor.keyword("{"), cc.regionFor.keyword("}"))[newLine]
	}

	def dispatch void format(ComponentFeature cc, extension IFormattableDocument document) {
		interior(cc.regionFor.keyword("{"), cc.regionFor.keyword("}"))[indent]
		interior(cc.regionFor.keyword("{"), cc.regionFor.keyword("}"))[newLine]
	}

	def dispatch void format(NodeStateAssociation cc, extension IFormattableDocument document) {
		interior(cc.regionFor.keyword("{"), cc.regionFor.keyword("}"))[indent]
		interior(cc.regionFor.keyword("{"), cc.regionFor.keyword("}"))[newLine]
	}
}
