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
					put(grammarAccess.getNodeStateAccess().getAlternatives_0(), "rule__NodeState__Alternatives_0");
					put(grammarAccess.getClientConfigurationAccess().getAlternatives_6(), "rule__ClientConfiguration__Alternatives_6");
					put(grammarAccess.getNodeStateTypeAccess().getAlternatives(), "rule__NodeStateType__Alternatives");
					put(grammarAccess.getNodeStateConfigurationAccess().getGroup(), "rule__NodeStateConfiguration__Group__0");
					put(grammarAccess.getNodeStateDiagramAccess().getGroup(), "rule__NodeStateDiagram__Group__0");
					put(grammarAccess.getNodeStateDiagramAccess().getGroup_3(), "rule__NodeStateDiagram__Group_3__0");
					put(grammarAccess.getNodeStateDiagramAccess().getGroup_4(), "rule__NodeStateDiagram__Group_4__0");
					put(grammarAccess.getNodeStateAccess().getGroup(), "rule__NodeState__Group__0");
					put(grammarAccess.getNodeTransitionAccess().getGroup(), "rule__NodeTransition__Group__0");
					put(grammarAccess.getNodeTransitionAccess().getGroup_7(), "rule__NodeTransition__Group_7__0");
					put(grammarAccess.getNodeTransitionAccess().getGroup_7_1(), "rule__NodeTransition__Group_7_1__0");
					put(grammarAccess.getNodeTransitionAccess().getGroup_7_2(), "rule__NodeTransition__Group_7_2__0");
					put(grammarAccess.getClientConfigurationAccess().getGroup(), "rule__ClientConfiguration__Group__0");
					put(grammarAccess.getClientConfigurationAccess().getGroup_5(), "rule__ClientConfiguration__Group_5__0");
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
					put(grammarAccess.getComponentFeatureAccess().getGroup(), "rule__ComponentFeature__Group__0");
					put(grammarAccess.getComponentFeatureAccess().getGroup_5(), "rule__ComponentFeature__Group_5__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getNodeStateConfigurationAccess().getNsdAssignment_0(), "rule__NodeStateConfiguration__NsdAssignment_0");
					put(grammarAccess.getNodeStateConfigurationAccess().getClientConfigsAssignment_1(), "rule__NodeStateConfiguration__ClientConfigsAssignment_1");
					put(grammarAccess.getNodeStateDiagramAccess().getGEdgeWeightAssignment_3_1(), "rule__NodeStateDiagram__GEdgeWeightAssignment_3_1");
					put(grammarAccess.getNodeStateDiagramAccess().getGTransitionTimeoutInMillisecondsAssignment_4_1(), "rule__NodeStateDiagram__GTransitionTimeoutInMillisecondsAssignment_4_1");
					put(grammarAccess.getNodeStateDiagramAccess().getStatesAssignment_5_0(), "rule__NodeStateDiagram__StatesAssignment_5_0");
					put(grammarAccess.getNodeStateDiagramAccess().getTransitionsAssignment_5_1(), "rule__NodeStateDiagram__TransitionsAssignment_5_1");
					put(grammarAccess.getNodeStateAccess().getInitialAssignment_0_0(), "rule__NodeState__InitialAssignment_0_0");
					put(grammarAccess.getNodeStateAccess().getExitAssignment_0_1(), "rule__NodeState__ExitAssignment_0_1");
					put(grammarAccess.getNodeStateAccess().getNameAssignment_2(), "rule__NodeState__NameAssignment_2");
					put(grammarAccess.getNodeTransitionAccess().getEssentialAssignment_0(), "rule__NodeTransition__EssentialAssignment_0");
					put(grammarAccess.getNodeTransitionAccess().getNameAssignment_2(), "rule__NodeTransition__NameAssignment_2");
					put(grammarAccess.getNodeTransitionAccess().getFromStateAssignment_4(), "rule__NodeTransition__FromStateAssignment_4");
					put(grammarAccess.getNodeTransitionAccess().getToStateAssignment_6(), "rule__NodeTransition__ToStateAssignment_6");
					put(grammarAccess.getNodeTransitionAccess().getEdgeweightAssignment_7_1_1(), "rule__NodeTransition__EdgeweightAssignment_7_1_1");
					put(grammarAccess.getNodeTransitionAccess().getTimeoutInMillisecondsAssignment_7_2_1(), "rule__NodeTransition__TimeoutInMillisecondsAssignment_7_2_1");
					put(grammarAccess.getClientConfigurationAccess().getNameAssignment_1(), "rule__ClientConfiguration__NameAssignment_1");
					put(grammarAccess.getClientConfigurationAccess().getCoomRefAssignment_4(), "rule__ClientConfiguration__CoomRefAssignment_4");
					put(grammarAccess.getClientConfigurationAccess().getTransTimeoutInMillisecondsAssignment_5_1(), "rule__ClientConfiguration__TransTimeoutInMillisecondsAssignment_5_1");
					put(grammarAccess.getClientConfigurationAccess().getTransitionsAssignment_6_0(), "rule__ClientConfiguration__TransitionsAssignment_6_0");
					put(grammarAccess.getClientConfigurationAccess().getStatesAssignment_6_1(), "rule__ClientConfiguration__StatesAssignment_6_1");
					put(grammarAccess.getClientConfigurationAccess().getFeaturesAssignment_6_2(), "rule__ClientConfiguration__FeaturesAssignment_6_2");
					put(grammarAccess.getClientConfigurationAccess().getNodeStateAssociationsAssignment_6_3(), "rule__ClientConfiguration__NodeStateAssociationsAssignment_6_3");
					put(grammarAccess.getComponentTransitionAccess().getEssentialAssignment_0(), "rule__ComponentTransition__EssentialAssignment_0");
					put(grammarAccess.getComponentTransitionAccess().getTransitionAssignment_2(), "rule__ComponentTransition__TransitionAssignment_2");
					put(grammarAccess.getComponentTransitionAccess().getTimeoutInMillisecondsAssignment_4_1(), "rule__ComponentTransition__TimeoutInMillisecondsAssignment_4_1");
					put(grammarAccess.getComponentTransitionAccess().getMaxretriesAssignment_5_1(), "rule__ComponentTransition__MaxretriesAssignment_5_1");
					put(grammarAccess.getComponentTransitionAccess().getStateDependencyAssignment_6_0(), "rule__ComponentTransition__StateDependencyAssignment_6_0");
					put(grammarAccess.getComponentTransitionAccess().getFeatureDependencyAssignment_6_1(), "rule__ComponentTransition__FeatureDependencyAssignment_6_1");
					put(grammarAccess.getComponentStateAccess().getStateAssignment_1(), "rule__ComponentState__StateAssignment_1");
					put(grammarAccess.getComponentStateAccess().getStateDependencyAssignment_3_0(), "rule__ComponentState__StateDependencyAssignment_3_0");
					put(grammarAccess.getComponentStateAccess().getFeatureDependencyAssignment_3_1(), "rule__ComponentState__FeatureDependencyAssignment_3_1");
					put(grammarAccess.getComponentStateAccess().getTransitionDependencyAssignment_3_2(), "rule__ComponentState__TransitionDependencyAssignment_3_2");
					put(grammarAccess.getStateDependencyAccess().getStatesAssignment_1(), "rule__StateDependency__StatesAssignment_1");
					put(grammarAccess.getStateDependencyAccess().getStatesAssignment_2_1(), "rule__StateDependency__StatesAssignment_2_1");
					put(grammarAccess.getTransitionDependencyAccess().getTransistionsAssignment_1(), "rule__TransitionDependency__TransistionsAssignment_1");
					put(grammarAccess.getTransitionDependencyAccess().getTransistionsAssignment_2_1(), "rule__TransitionDependency__TransistionsAssignment_2_1");
					put(grammarAccess.getFeatureDependencyAccess().getFeaturesAssignment_1(), "rule__FeatureDependency__FeaturesAssignment_1");
					put(grammarAccess.getFeatureDependencyAccess().getFeaturesAssignment_2_1(), "rule__FeatureDependency__FeaturesAssignment_2_1");
					put(grammarAccess.getNodeStateAssociationAccess().getNodeStateTypeAssignment_0(), "rule__NodeStateAssociation__NodeStateTypeAssignment_0");
					put(grammarAccess.getNodeStateAssociationAccess().getClientStateAssignment_1(), "rule__NodeStateAssociation__ClientStateAssignment_1");
					put(grammarAccess.getNodeStateAssociationAccess().getStatesAssignment_3(), "rule__NodeStateAssociation__StatesAssignment_3");
					put(grammarAccess.getNodeStateAssociationAccess().getStatesAssignment_4_1(), "rule__NodeStateAssociation__StatesAssignment_4_1");
					put(grammarAccess.getComponentFeatureAccess().getNameAssignment_1(), "rule__ComponentFeature__NameAssignment_1");
					put(grammarAccess.getComponentFeatureAccess().getStatesAssignment_4(), "rule__ComponentFeature__StatesAssignment_4");
					put(grammarAccess.getComponentFeatureAccess().getStatesAssignment_5_1(), "rule__ComponentFeature__StatesAssignment_5_1");
					put(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6(), "rule__ComponentTransition__UnorderedGroup_6");
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
