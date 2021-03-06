/*
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.tests

import com.google.inject.Inject
import com.visteon.onoff.states.NodeStateConfiguration
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(StatesInjectorProvider)
class StatesParsingTest {
	@Inject
	ParseHelper<NodeStateConfiguration> parseHelper

	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			NodeStateDiagram {
				State State1
				State State2
				
				Transition S1toS2 : State1 -> State2
			}
			
			Client Test {
				coom CompA
				
				State CompA.S1 {
					depends on transitions CompA.S1toS2
				}
				
				State CompA.S2 {
					depends on transitions CompA.S1toS2
				}
				
				Feature Name {
					states CompA.S1 , CompA.S2
				}
				
				Transition CompA.S1toS2 {
					timeout 1
				}
			}
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', errors.isEmpty)
	}
}
