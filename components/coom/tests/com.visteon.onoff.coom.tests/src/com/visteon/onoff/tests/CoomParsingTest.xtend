/*
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.tests

import com.google.inject.Inject
import com.visteon.onoff.coom.ComponentOnOffManifest
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(CoomInjectorProvider)
class CoomParsingTest {
	@Inject
	ParseHelper<ComponentOnOffManifest> parseHelper

	@Inject
	ValidationTestHelper validationHelper

	@Test
	def void loadModelWithValidStates() {
		val result = parseHelper.parse('''
			
			Component ComponentA {
				
				version {
					major 1
					minor 1
				}
				
				initial State State1
				
				State State2
				
				State State3
				
			}
		''')

		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', errors.isEmpty)

		val validate = validationHelper.validate(result)
		Assert.assertTrue(validate.size == 0);

		val coom = result
		Assert.assertEquals("ComponentA", coom.name)
		Assert.assertEquals(3, coom.states.size)
		Assert.assertTrue(coom.states.get(0).isInitial)
		Assert.assertEquals("State1", coom.states.get(0).name)
		Assert.assertEquals("State2", coom.states.get(1).name)
		Assert.assertEquals("State3", coom.states.get(2).name)

	}

	@Test
	def void loadModelWithDuplicateStates() {
		val result = parseHelper.parse('''
			
			Component ComponentA {
				
				version {
					major 1
					minor 1
				}
				
				initial State State1
				
				State State2
				
				State State2
				
			}
		''')

		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', errors.isEmpty)

		val validate = validationHelper.validate(result)
		Assert.assertTrue(validate.size == 2);

		Assert.assertEquals("Duplicate State 'State2' in ComponentOnOffManifest 'ComponentA'", validate.get(0).message)
		Assert.assertEquals("Duplicate State 'State2' in ComponentOnOffManifest 'ComponentA'", validate.get(1).message)
	}

	@Test
	def void loadModelWithValidTransitions() {
		val result = parseHelper.parse('''
			
			Component ComponentA {
				
				version {
					major 1
					minor 1
				}
				
				initial State State1
				
				State State2
				
				State State3
				
				Transition S1ToS2	: State1 -> State2
				Transition S2ToS3	: State2 -> State3
				
			}
		''')

		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', errors.isEmpty)

		val validate = validationHelper.validate(result)
		Assert.assertTrue(validate.size == 0);

		val coom = result
		Assert.assertEquals("ComponentA", coom.name)

		val states = coom.states
		Assert.assertEquals(3, states.size)

		Assert.assertTrue(states.get(0).isInitial)
		Assert.assertEquals("State1", states.get(0).name)
		Assert.assertEquals("State2", states.get(1).name)
		Assert.assertEquals("State3", states.get(2).name)

		val transitions = coom.transitions
		Assert.assertEquals(2, transitions.size)

		Assert.assertEquals("S1ToS2", transitions.get(0).name)
		Assert.assertEquals("S2ToS3", transitions.get(1).name)
	}

	@Test
	def loadModelWithMultipleStartStates() {
		val result = parseHelper.parse('''
			
			Component ComponentA {
				
				version {
					major 1
					minor 1
				}
				
				initial State State1
				
				initial State State2
				
				State State3
				
				Transition S1ToS2	: State1 -> State2
				Transition S2ToS3	: State2 -> State3
				
			}
		''')

		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', errors.isEmpty)

		val validate = validationHelper.validate(result)
		Assert.assertTrue(validate.size == 2);

		Assert.assertEquals("A component cannot have multiple start States", validate.get(0).message)
		Assert.assertEquals("A component cannot have multiple start States", validate.get(1).message)
	}

	@Test
	def loadCoomWithoutVersion() {
		val result = parseHelper.parse('''
			
			Component ComponentA {
				
			}
		''')

		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: �errors.join(", ")�''', !errors.isEmpty)
		Assert.assertEquals("mismatched input '}' expecting 'version'", errors.get(0).message);
	}
}
