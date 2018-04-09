/*
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.validation

import com.visteon.onoff.states.ClientConfiguration
import com.visteon.onoff.states.ComponentFeature
import com.visteon.onoff.states.ComponentState
import com.visteon.onoff.states.ComponentTransition
import com.visteon.onoff.states.FeatureDependency
import com.visteon.onoff.states.NodeState
import com.visteon.onoff.states.NodeStateAssociation
import com.visteon.onoff.states.StateDependency
import com.visteon.onoff.states.StatesPackage
import com.visteon.onoff.states.TransitionDependency
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class StatesValidator extends AbstractStatesValidator {

//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					StatesPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	@Check
	def checkForMultipleInitialStates(NodeState state) {
		if (state.isInitial) {
			if (EcoreUtil2.getSiblingsOfType(state, NodeState).filter[isInitial].size > 0) {
				error('A StateDiagram cannot have multiple start States', StatesPackage.Literals.NODE_STATE__INITIAL)
			}
		}
	}

	@Check
	def checkforDuplicateStateDependency_States(StateDependency sd) {
		val states = sd.states
		for (var i = 0; i < states.size; i++) {
			val st = states.get(i)
			if (states.filter[equals(st)].size > 1) {
				error("Duplicate State " + st.name, sd, StatesPackage.Literals.STATE_DEPENDENCY__STATES, i)
			}
		}
	}

	@Check
	def checkForDuplicateTransitionDependency_Transistions(TransitionDependency td) {
		val transistions = td.transistions
		for (var i = 0; i < transistions.size; i++) {
			val tr = transistions.get(i)
			if (transistions.filter[equals(tr)].size > 1) {
				error("Duplicate Transition " + tr.name, td, StatesPackage.Literals.TRANSITION_DEPENDENCY__TRANSISTIONS,
					i)
			}
		}
	}

	@Check
	def checkForDuplicateFeatureDependency_Features(FeatureDependency td) {
		val features = td.features
		for (var i = 0; i < features.size; i++) {
			val ft = features.get(i)
			if (features.filter[equals(ft)].size > 1) {
				error("Duplicate Feature " + ft.name, td, StatesPackage.Literals.FEATURE_DEPENDENCY__FEATURES, i)
			}
		}
	}

	@Check
	def checkForDuplicateComponentFeature_States(ComponentFeature cf) {
		val states = cf.states
		for (var i = 0; i < states.size; i++) {
			val ft = states.get(i)
			if (states.filter[equals(ft)].size > 1) {
				error("Duplicate State " + ft.name, cf, StatesPackage.Literals.COMPONENT_FEATURE__STATES, i)
			}
		}
	}

	@Check
	def checkForDuplicateNodeStateAssociation_States(NodeStateAssociation nsa) {
		val states = nsa.states
		for (var i = 0; i < states.size; i++) {
			val ft = states.get(i)
			if (states.filter[equals(ft)].size > 1) {
				error("Duplicate State " + ft.name, nsa, StatesPackage.Literals.NODE_STATE_ASSOCIATION__STATES, i)
			}
		}
	}

	@Check
	def checkForDuplicateComponentState_State(ComponentState cs) {
		val cc = EcoreUtil2.getContainerOfType(cs, ClientConfiguration)
		val map = cc.states.map[state]
		if (map.filter[equals(cs.state)].size > 1) {
			error("Duplicate State " + cs.state.name, cs, StatesPackage.Literals.COMPONENT_STATE__STATE)
		}
	}

	@Check
	def checkForComponentTransition_Transition(ComponentTransition ct) {
		val cc = EcoreUtil2.getContainerOfType(ct, ClientConfiguration)
		val map = cc.transitions.map[transition]
		if (map.filter[equals(ct.transition)].size > 1) {
			error("Duplicate Transition " + ct.transition.name, ct,
				StatesPackage.Literals.COMPONENT_TRANSITION__TRANSITION)
		}
	}

	@Check
	def checkForDuplicateNodeStateAssociation_ClientState(NodeStateAssociation nsa) {
		val cc = EcoreUtil2.getContainerOfType(nsa, ClientConfiguration)
		val map = cc.nodeStateAssociations.map[clientState]
		if (map.filter[equals(nsa.clientState)].size > 1) {
			error("Duplicate State " + nsa.clientState.name, nsa,
				StatesPackage.Literals.NODE_STATE_ASSOCIATION__CLIENT_STATE)
		}
	}
}
