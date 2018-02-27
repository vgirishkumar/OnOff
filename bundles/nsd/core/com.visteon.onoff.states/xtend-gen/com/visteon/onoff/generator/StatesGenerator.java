/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.generator;

import com.google.common.collect.Iterators;
import com.visteon.onoff.states.ClientConfiguration;
import com.visteon.onoff.states.ComponentState;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class StatesGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String _fileString = resource.getURI().toFileString();
    String _plus = ("Code generation for " + _fileString);
    InputOutput.<String>println(_plus);
    final Consumer<ComponentState> _function = (ComponentState it) -> {
      String _name = it.getState().getName();
      String _plus_1 = (_name + " is from ");
      String _fileString_1 = it.getState().eResource().getURI().toFileString();
      String _plus_2 = (_plus_1 + _fileString_1);
      String _plus_3 = (_plus_2 + " and start state =");
      boolean _isInitial = it.getState().isInitial();
      String _plus_4 = (_plus_3 + Boolean.valueOf(_isInitial));
      InputOutput.<String>println(_plus_4);
    };
    IteratorExtensions.<ClientConfiguration>head(Iterators.<ClientConfiguration>filter(resource.getAllContents(), ClientConfiguration.class)).getComponentStates().forEach(_function);
  }
}
