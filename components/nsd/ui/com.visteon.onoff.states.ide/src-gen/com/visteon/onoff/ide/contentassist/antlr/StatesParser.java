/*
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.visteon.onoff.ide.contentassist.antlr.internal.InternalStatesParser;
import com.visteon.onoff.services.StatesGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class StatesParser extends AbstractContentAssistParser {

	@Inject
	private StatesGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalStatesParser createParser() {
		InternalStatesParser result = new InternalStatesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNodeStateDiagramAccess().getAlternatives_5(), "rule__NodeStateDiagram__Alternatives_5");
					put(grammarAccess.getClientConfigurationAccess().getAlternatives_6(), "rule__ClientConfiguration__Alternatives_6");
					put(grammarAccess.getNodeStateConfigurationAccess().getGroup(), "rule__NodeStateConfiguration__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getNodeStateDiagramAccess().getGroup(), "rule__NodeStateDiagram__Group__0");
					put(grammarAccess.getNodeStateDiagramAccess().getGroup_3(), "rule__NodeStateDiagram__Group_3__0");
					put(grammarAccess.getNodeStateDiagramAccess().getGroup_4(), "rule__NodeStateDiagram__Group_4__0");
					put(grammarAccess.getNodeStateAccess().getGroup(), "rule__NodeState__Group__0");
					put(grammarAccess.getNodeTransitionAccess().getGroup(), "rule__NodeTransition__Group__0");
					put(grammarAccess.getNodeTransitionAccess().getGroup_7(), "rule__NodeTransition__Group_7__0");
					put(grammarAccess.getNodeTransitionAccess().getGroup_7_1(), "rule__NodeTransition__Group_7_1__0");
					put(grammarAccess.getNodeTransitionAccess().getGroup_7_2(), "rule__NodeTransition__Group_7_2__0");
					put(grammarAccess.getClientConfigurationAccess().getGroup(), "rule__ClientConfiguration__Group__0");
					put(grammarAccess.getClientConfigurationAccess().getGroup_3(), "rule__ClientConfiguration__Group_3__0");
					put(grammarAccess.getClientConfigurationAccess().getGroup_4(), "rule__ClientConfiguration__Group_4__0");
					put(grammarAccess.getComponentTransitionAccess().getGroup(), "rule__ComponentTransition__Group__0");
					put(grammarAccess.getComponentTransitionAccess().getGroup_4(), "rule__ComponentTransition__Group_4__0");
					put(grammarAccess.getComponentTransitionAccess().getGroup_5(), "rule__ComponentTransition__Group_5__0");
					put(grammarAccess.getComponentStateAccess().getGroup(), "rule__ComponentState__Group__0");
					put(grammarAccess.getStateDependencyAccess().getGroup(), "rule__StateDependency__Group__0");
					put(grammarAccess.getStateDependencyAccess().getGroup_2(), "rule__StateDependency__Group_2__0");
					put(grammarAccess.getTransitionDependencyAccess().getGroup(), "rule__TransitionDependency__Group__0");
					put(grammarAccess.getTransitionDependencyAccess().getGroup_2(), "rule__TransitionDependency__Group_2__0");
					put(grammarAccess.getFeatureDependencyAccess().getGroup(), "rule__FeatureDependency__Group__0");
					put(grammarAccess.getFeatureDependencyAccess().getGroup_2(), "rule__FeatureDependency__Group_2__0");
					put(grammarAccess.getNodeStateAssociationAccess().getGroup(), "rule__NodeStateAssociation__Group__0");
					put(grammarAccess.getNodeStateAssociationAccess().getGroup_4(), "rule__NodeStateAssociation__Group_4__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup_5(), "rule__Feature__Group_5__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getNodeStateConfigurationAccess().getImportsAssignment_0(), "rule__NodeStateConfiguration__ImportsAssignment_0");
					put(grammarAccess.getNodeStateConfigurationAccess().getNsdAssignment_1(), "rule__NodeStateConfiguration__NsdAssignment_1");
					put(grammarAccess.getNodeStateConfigurationAccess().getClientConfigAssignment_2(), "rule__NodeStateConfiguration__ClientConfigAssignment_2");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getNodeStateDiagramAccess().getGEdgeWeightAssignment_3_1(), "rule__NodeStateDiagram__GEdgeWeightAssignment_3_1");
					put(grammarAccess.getNodeStateDiagramAccess().getGTransitionTimeoutInMillisecondsAssignment_4_1(), "rule__NodeStateDiagram__GTransitionTimeoutInMillisecondsAssignment_4_1");
					put(grammarAccess.getNodeStateDiagramAccess().getNodeStatesAssignment_5_0(), "rule__NodeStateDiagram__NodeStatesAssignment_5_0");
					put(grammarAccess.getNodeStateDiagramAccess().getNodeTransitionsAssignment_5_1(), "rule__NodeStateDiagram__NodeTransitionsAssignment_5_1");
					put(grammarAccess.getNodeStateAccess().getInitialAssignment_0(), "rule__NodeState__InitialAssignment_0");
					put(grammarAccess.getNodeStateAccess().getNameAssignment_2(), "rule__NodeState__NameAssignment_2");
					put(grammarAccess.getNodeTransitionAccess().getEssentialAssignment_0(), "rule__NodeTransition__EssentialAssignment_0");
					put(grammarAccess.getNodeTransitionAccess().getNameAssignment_2(), "rule__NodeTransition__NameAssignment_2");
					put(grammarAccess.getNodeTransitionAccess().getFromStateAssignment_4(), "rule__NodeTransition__FromStateAssignment_4");
					put(grammarAccess.getNodeTransitionAccess().getToStateAssignment_6(), "rule__NodeTransition__ToStateAssignment_6");
					put(grammarAccess.getNodeTransitionAccess().getEdgeweightAssignment_7_1_1(), "rule__NodeTransition__EdgeweightAssignment_7_1_1");
					put(grammarAccess.getNodeTransitionAccess().getTimeoutInMillisecondsAssignment_7_2_1(), "rule__NodeTransition__TimeoutInMillisecondsAssignment_7_2_1");
					put(grammarAccess.getClientConfigurationAccess().getNameAssignment_1(), "rule__ClientConfiguration__NameAssignment_1");
					put(grammarAccess.getClientConfigurationAccess().getCoomRefAssignment_3_1(), "rule__ClientConfiguration__CoomRefAssignment_3_1");
					put(grammarAccess.getClientConfigurationAccess().getTransTimeoutInMillisecondsAssignment_4_1(), "rule__ClientConfiguration__TransTimeoutInMillisecondsAssignment_4_1");
					put(grammarAccess.getClientConfigurationAccess().getNodeStateAssociationsAssignment_5(), "rule__ClientConfiguration__NodeStateAssociationsAssignment_5");
					put(grammarAccess.getClientConfigurationAccess().getComponentTransitionsAssignment_6_0(), "rule__ClientConfiguration__ComponentTransitionsAssignment_6_0");
					put(grammarAccess.getClientConfigurationAccess().getComponentStatesAssignment_6_1(), "rule__ClientConfiguration__ComponentStatesAssignment_6_1");
					put(grammarAccess.getClientConfigurationAccess().getFeaturesAssignment_6_2(), "rule__ClientConfiguration__FeaturesAssignment_6_2");
					put(grammarAccess.getComponentTransitionAccess().getEssentialAssignment_0(), "rule__ComponentTransition__EssentialAssignment_0");
					put(grammarAccess.getComponentTransitionAccess().getTransitionAssignment_2(), "rule__ComponentTransition__TransitionAssignment_2");
					put(grammarAccess.getComponentTransitionAccess().getTimeoutInMillisecondsAssignment_4_1(), "rule__ComponentTransition__TimeoutInMillisecondsAssignment_4_1");
					put(grammarAccess.getComponentTransitionAccess().getMaxretriesAssignment_5_1(), "rule__ComponentTransition__MaxretriesAssignment_5_1");
					put(grammarAccess.getComponentStateAccess().getStateAssignment_1(), "rule__ComponentState__StateAssignment_1");
					put(grammarAccess.getComponentStateAccess().getStateDependenciesAssignment_3_0(), "rule__ComponentState__StateDependenciesAssignment_3_0");
					put(grammarAccess.getComponentStateAccess().getFeatureDependenciesAssignment_3_1(), "rule__ComponentState__FeatureDependenciesAssignment_3_1");
					put(grammarAccess.getComponentStateAccess().getTransitionDependenciesAssignment_3_2(), "rule__ComponentState__TransitionDependenciesAssignment_3_2");
					put(grammarAccess.getStateDependencyAccess().getStatesAssignment_1(), "rule__StateDependency__StatesAssignment_1");
					put(grammarAccess.getStateDependencyAccess().getStatesAssignment_2_1(), "rule__StateDependency__StatesAssignment_2_1");
					put(grammarAccess.getTransitionDependencyAccess().getTransistionsAssignment_1(), "rule__TransitionDependency__TransistionsAssignment_1");
					put(grammarAccess.getTransitionDependencyAccess().getTransistionsAssignment_2_1(), "rule__TransitionDependency__TransistionsAssignment_2_1");
					put(grammarAccess.getFeatureDependencyAccess().getFeaturesAssignment_1(), "rule__FeatureDependency__FeaturesAssignment_1");
					put(grammarAccess.getFeatureDependencyAccess().getFeaturesAssignment_2_1(), "rule__FeatureDependency__FeaturesAssignment_2_1");
					put(grammarAccess.getNodeStateAssociationAccess().getClientStateAssignment_1(), "rule__NodeStateAssociation__ClientStateAssignment_1");
					put(grammarAccess.getNodeStateAssociationAccess().getSystemStatesAssignment_3(), "rule__NodeStateAssociation__SystemStatesAssignment_3");
					put(grammarAccess.getNodeStateAssociationAccess().getSystemStatesAssignment_4_1(), "rule__NodeStateAssociation__SystemStatesAssignment_4_1");
					put(grammarAccess.getFeatureAccess().getNameAssignment_1(), "rule__Feature__NameAssignment_1");
					put(grammarAccess.getFeatureAccess().getFeatureStatesAssignment_4(), "rule__Feature__FeatureStatesAssignment_4");
					put(grammarAccess.getFeatureAccess().getFeatureStatesAssignment_5_1(), "rule__Feature__FeatureStatesAssignment_5_1");
					put(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), "rule__ComponentState__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public StatesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StatesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
