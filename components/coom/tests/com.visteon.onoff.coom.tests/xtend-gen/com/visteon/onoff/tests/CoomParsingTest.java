/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.tests;

import com.google.inject.Inject;
import com.visteon.onoff.coom.ComponentOnOffManifest;
import com.visteon.onoff.coom.FullComponentOnOffManifest;
import com.visteon.onoff.coom.State;
import com.visteon.onoff.coom.Transition;
import com.visteon.onoff.tests.CoomInjectorProvider;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(CoomInjectorProvider.class)
@SuppressWarnings("all")
public class CoomParsingTest {
  @Inject
  private ParseHelper<FullComponentOnOffManifest> parseHelper;
  
  @Inject
  private ValidationTestHelper validationHelper;
  
  @Test
  public void loadModelWithValidStates() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.component");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Component ComponentA {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("version {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("major 1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("minor 1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("initial State State1 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("State State2 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("State State3 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final FullComponentOnOffManifest result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assert.assertTrue(_builder_1.toString(), errors.isEmpty());
      final List<Issue> validate = this.validationHelper.validate(result);
      int _size = validate.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
      final ComponentOnOffManifest coom = result.getCoom();
      Assert.assertEquals("ComponentA", coom.getName());
      Assert.assertEquals(3, coom.getStates().size());
      Assert.assertTrue(coom.getStates().get(0).isInitial());
      Assert.assertEquals("State1", coom.getStates().get(0).getName());
      Assert.assertEquals("State2", coom.getStates().get(1).getName());
      Assert.assertEquals("State3", coom.getStates().get(2).getName());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadModelWithDuplicateStates() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.component");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Component ComponentA {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("version {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("major 1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("minor 1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("initial State State1 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("State State2 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("State State2 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final FullComponentOnOffManifest result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assert.assertTrue(_builder_1.toString(), errors.isEmpty());
      final List<Issue> validate = this.validationHelper.validate(result);
      int _size = validate.size();
      boolean _equals = (_size == 2);
      Assert.assertTrue(_equals);
      Assert.assertEquals("Duplicate State \'State2\' in ComponentOnOffManifest \'ComponentA\'", validate.get(0).getMessage());
      Assert.assertEquals("Duplicate State \'State2\' in ComponentOnOffManifest \'ComponentA\'", validate.get(1).getMessage());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadModelWithValidTransitions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.component");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Component ComponentA {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("version {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("major 1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("minor 1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("initial State State1 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("State State2 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("State State3 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Transition S1ToS2\t: State1 -> State2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Transition S2ToS3\t: State2 -> State3");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final FullComponentOnOffManifest result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assert.assertTrue(_builder_1.toString(), errors.isEmpty());
      final List<Issue> validate = this.validationHelper.validate(result);
      int _size = validate.size();
      boolean _equals = (_size == 0);
      Assert.assertTrue(_equals);
      final ComponentOnOffManifest coom = result.getCoom();
      Assert.assertEquals("ComponentA", coom.getName());
      final EList<State> states = coom.getStates();
      Assert.assertEquals(3, states.size());
      Assert.assertTrue(states.get(0).isInitial());
      Assert.assertEquals("State1", states.get(0).getName());
      Assert.assertEquals("State2", states.get(1).getName());
      Assert.assertEquals("State3", states.get(2).getName());
      final EList<Transition> transitions = coom.getTransitions();
      Assert.assertEquals(2, transitions.size());
      Assert.assertEquals("S1ToS2", transitions.get(0).getName());
      Assert.assertEquals("S2ToS3", transitions.get(1).getName());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadModelWithMultipleStartStates() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.component");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Component ComponentA {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("version {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("major 1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("minor 1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("initial State State1 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("initial State State2 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("State State3 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Transition S1ToS2\t: State1 -> State2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Transition S2ToS3\t: State2 -> State3");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final FullComponentOnOffManifest result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assert.assertTrue(_builder_1.toString(), errors.isEmpty());
      final List<Issue> validate = this.validationHelper.validate(result);
      int _size = validate.size();
      boolean _equals = (_size == 2);
      Assert.assertTrue(_equals);
      Assert.assertEquals("A component cannot have multiple start States", validate.get(0).getMessage());
      Assert.assertEquals("A component cannot have multiple start States", validate.get(1).getMessage());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
