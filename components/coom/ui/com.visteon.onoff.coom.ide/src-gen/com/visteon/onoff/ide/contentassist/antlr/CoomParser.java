/*
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.visteon.onoff.ide.contentassist.antlr.internal.InternalCoomParser;
import com.visteon.onoff.services.CoomGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class CoomParser extends AbstractContentAssistParser {

	@Inject
	private CoomGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCoomParser createParser() {
		InternalCoomParser result = new InternalCoomParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getComponentOnOffManifestAccess().getAlternatives_5(), "rule__ComponentOnOffManifest__Alternatives_5");
					put(grammarAccess.getFullComponentOnOffManifestAccess().getGroup(), "rule__FullComponentOnOffManifest__Group__0");
					put(grammarAccess.getFullComponentOnOffManifestAccess().getGroup_0(), "rule__FullComponentOnOffManifest__Group_0__0");
					put(grammarAccess.getComponentOnOffManifestAccess().getGroup(), "rule__ComponentOnOffManifest__Group__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateAccess().getGroup_3(), "rule__State__Group_3__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getFullComponentOnOffManifestAccess().getNameAssignment_0_1(), "rule__FullComponentOnOffManifest__NameAssignment_0_1");
					put(grammarAccess.getFullComponentOnOffManifestAccess().getCoomAssignment_1(), "rule__FullComponentOnOffManifest__CoomAssignment_1");
					put(grammarAccess.getComponentOnOffManifestAccess().getNameAssignment_2(), "rule__ComponentOnOffManifest__NameAssignment_2");
					put(grammarAccess.getComponentOnOffManifestAccess().getVersionAssignment_4(), "rule__ComponentOnOffManifest__VersionAssignment_4");
					put(grammarAccess.getComponentOnOffManifestAccess().getStatesAssignment_5_0(), "rule__ComponentOnOffManifest__StatesAssignment_5_0");
					put(grammarAccess.getComponentOnOffManifestAccess().getTransitionsAssignment_5_1(), "rule__ComponentOnOffManifest__TransitionsAssignment_5_1");
					put(grammarAccess.getVersionAccess().getMajorMalueAssignment_3(), "rule__Version__MajorMalueAssignment_3");
					put(grammarAccess.getVersionAccess().getMinorValueAssignment_5(), "rule__Version__MinorValueAssignment_5");
					put(grammarAccess.getStateAccess().getInitialAssignment_0(), "rule__State__InitialAssignment_0");
					put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
					put(grammarAccess.getTransitionAccess().getNameAssignment_1(), "rule__Transition__NameAssignment_1");
					put(grammarAccess.getTransitionAccess().getFromStateAssignment_3(), "rule__Transition__FromStateAssignment_3");
					put(grammarAccess.getTransitionAccess().getToStateAssignment_5(), "rule__Transition__ToStateAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CoomGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CoomGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}