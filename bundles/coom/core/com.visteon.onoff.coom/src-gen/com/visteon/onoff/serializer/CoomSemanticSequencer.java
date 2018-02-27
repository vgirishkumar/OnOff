/*
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.serializer;

import com.google.inject.Inject;
import com.visteon.onoff.coom.ComponentOnOffManifest;
import com.visteon.onoff.coom.CoomPackage;
import com.visteon.onoff.coom.FullComponentOnOffManifest;
import com.visteon.onoff.coom.State;
import com.visteon.onoff.coom.Transition;
import com.visteon.onoff.coom.Version;
import com.visteon.onoff.services.CoomGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CoomSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CoomGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CoomPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CoomPackage.COMPONENT_ON_OFF_MANIFEST:
				sequence_ComponentOnOffManifest(context, (ComponentOnOffManifest) semanticObject); 
				return; 
			case CoomPackage.FULL_COMPONENT_ON_OFF_MANIFEST:
				sequence_FullComponentOnOffManifest(context, (FullComponentOnOffManifest) semanticObject); 
				return; 
			case CoomPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case CoomPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case CoomPackage.VERSION:
				sequence_Version(context, (Version) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ComponentOnOffManifest returns ComponentOnOffManifest
	 *
	 * Constraint:
	 *     (name=FQN version=Version (states+=State | transitions+=Transition)*)
	 */
	protected void sequence_ComponentOnOffManifest(ISerializationContext context, ComponentOnOffManifest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FullComponentOnOffManifest returns FullComponentOnOffManifest
	 *
	 * Constraint:
	 *     ((name=FQN coom=ComponentOnOffManifest) | coom=ComponentOnOffManifest)?
	 */
	protected void sequence_FullComponentOnOffManifest(ISerializationContext context, FullComponentOnOffManifest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (initial?='initial'? name=ID)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (name=ID fromState=[State|ID] toState=[State|ID])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoomPackage.Literals.TRANSITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoomPackage.Literals.TRANSITION__NAME));
			if (transientValues.isValueTransient(semanticObject, CoomPackage.Literals.TRANSITION__FROM_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoomPackage.Literals.TRANSITION__FROM_STATE));
			if (transientValues.isValueTransient(semanticObject, CoomPackage.Literals.TRANSITION__TO_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoomPackage.Literals.TRANSITION__TO_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransitionAccess().getFromStateStateIDTerminalRuleCall_3_0_1(), semanticObject.eGet(CoomPackage.Literals.TRANSITION__FROM_STATE, false));
		feeder.accept(grammarAccess.getTransitionAccess().getToStateStateIDTerminalRuleCall_5_0_1(), semanticObject.eGet(CoomPackage.Literals.TRANSITION__TO_STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Version returns Version
	 *
	 * Constraint:
	 *     (majorMalue=INT minorValue=INT)
	 */
	protected void sequence_Version(ISerializationContext context, Version semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CoomPackage.Literals.VERSION__MAJOR_MALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoomPackage.Literals.VERSION__MAJOR_MALUE));
			if (transientValues.isValueTransient(semanticObject, CoomPackage.Literals.VERSION__MINOR_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoomPackage.Literals.VERSION__MINOR_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVersionAccess().getMajorMalueINTTerminalRuleCall_3_0(), semanticObject.getMajorMalue());
		feeder.accept(grammarAccess.getVersionAccess().getMinorValueINTTerminalRuleCall_5_0(), semanticObject.getMinorValue());
		feeder.finish();
	}
	
	
}
