/*
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CoomGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ComponentOnOffManifestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.visteon.onoff.Coom.ComponentOnOffManifest");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVersionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVersionVersionParserRuleCall_3_0 = (RuleCall)cVersionAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cStatesAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cStatesStateParserRuleCall_4_0_0 = (RuleCall)cStatesAssignment_4_0.eContents().get(0);
		private final Assignment cTransitionsAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cTransitionsTransitionParserRuleCall_4_1_0 = (RuleCall)cTransitionsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ComponentOnOffManifest:
		//	'Component' name=ID '{'
		//	version=Version (states+=State | transitions+=Transition)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Component' name=ID '{' version=Version (states+=State | transitions+=Transition)* '}'
		public Group getGroup() { return cGroup; }
		
		//'Component'
		public Keyword getComponentKeyword_0() { return cComponentKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//version=Version
		public Assignment getVersionAssignment_3() { return cVersionAssignment_3; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_3_0() { return cVersionVersionParserRuleCall_3_0; }
		
		//(states+=State | transitions+=Transition)*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//states+=State
		public Assignment getStatesAssignment_4_0() { return cStatesAssignment_4_0; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_4_0_0() { return cStatesStateParserRuleCall_4_0_0; }
		
		//transitions+=Transition
		public Assignment getTransitionsAssignment_4_1() { return cTransitionsAssignment_4_1; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_4_1_0() { return cTransitionsTransitionParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.visteon.onoff.Coom.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVersionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMajorKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMajorMalueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMajorMalueINTTerminalRuleCall_3_0 = (RuleCall)cMajorMalueAssignment_3.eContents().get(0);
		private final Keyword cMinorKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cMinorValueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cMinorValueINTTerminalRuleCall_5_0 = (RuleCall)cMinorValueAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Version:
		//	'version' '{'
		//	'major' majorMalue=INT
		//	'minor' minorValue=INT
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'version' '{' 'major' majorMalue=INT 'minor' minorValue=INT '}'
		public Group getGroup() { return cGroup; }
		
		//'version'
		public Keyword getVersionKeyword_0() { return cVersionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'major'
		public Keyword getMajorKeyword_2() { return cMajorKeyword_2; }
		
		//majorMalue=INT
		public Assignment getMajorMalueAssignment_3() { return cMajorMalueAssignment_3; }
		
		//INT
		public RuleCall getMajorMalueINTTerminalRuleCall_3_0() { return cMajorMalueINTTerminalRuleCall_3_0; }
		
		//'minor'
		public Keyword getMinorKeyword_4() { return cMinorKeyword_4; }
		
		//minorValue=INT
		public Assignment getMinorValueAssignment_5() { return cMinorValueAssignment_5; }
		
		//INT
		public RuleCall getMinorValueINTTerminalRuleCall_5_0() { return cMinorValueINTTerminalRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.visteon.onoff.Coom.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInitialAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cInitialInitialKeyword_0_0 = (Keyword)cInitialAssignment_0.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//State:
		//	initial?='initial'? 'State' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//initial?='initial'? 'State' name=ID
		public Group getGroup() { return cGroup; }
		
		//initial?='initial'?
		public Assignment getInitialAssignment_0() { return cInitialAssignment_0; }
		
		//'initial'
		public Keyword getInitialInitialKeyword_0_0() { return cInitialInitialKeyword_0_0; }
		
		//'State'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.visteon.onoff.Coom.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFromStateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFromStateStateCrossReference_3_0 = (CrossReference)cFromStateAssignment_3.eContents().get(0);
		private final RuleCall cFromStateStateIDTerminalRuleCall_3_0_1 = (RuleCall)cFromStateStateCrossReference_3_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cToStateAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cToStateStateCrossReference_5_0 = (CrossReference)cToStateAssignment_5.eContents().get(0);
		private final RuleCall cToStateStateIDTerminalRuleCall_5_0_1 = (RuleCall)cToStateStateCrossReference_5_0.eContents().get(1);
		
		//Transition:
		//	'Transition' name=ID ':' fromState=[State] '->' toState=[State];
		@Override public ParserRule getRule() { return rule; }
		
		//'Transition' name=ID ':' fromState=[State] '->' toState=[State]
		public Group getGroup() { return cGroup; }
		
		//'Transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//fromState=[State]
		public Assignment getFromStateAssignment_3() { return cFromStateAssignment_3; }
		
		//[State]
		public CrossReference getFromStateStateCrossReference_3_0() { return cFromStateStateCrossReference_3_0; }
		
		//ID
		public RuleCall getFromStateStateIDTerminalRuleCall_3_0_1() { return cFromStateStateIDTerminalRuleCall_3_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4() { return cHyphenMinusGreaterThanSignKeyword_4; }
		
		//toState=[State]
		public Assignment getToStateAssignment_5() { return cToStateAssignment_5; }
		
		//[State]
		public CrossReference getToStateStateCrossReference_5_0() { return cToStateStateCrossReference_5_0; }
		
		//ID
		public RuleCall getToStateStateIDTerminalRuleCall_5_0_1() { return cToStateStateIDTerminalRuleCall_5_0_1; }
	}
	
	
	private final ComponentOnOffManifestElements pComponentOnOffManifest;
	private final VersionElements pVersion;
	private final StateElements pState;
	private final TransitionElements pTransition;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CoomGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pComponentOnOffManifest = new ComponentOnOffManifestElements();
		this.pVersion = new VersionElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.visteon.onoff.Coom".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ComponentOnOffManifest:
	//	'Component' name=ID '{'
	//	version=Version (states+=State | transitions+=Transition)*
	//	'}';
	public ComponentOnOffManifestElements getComponentOnOffManifestAccess() {
		return pComponentOnOffManifest;
	}
	
	public ParserRule getComponentOnOffManifestRule() {
		return getComponentOnOffManifestAccess().getRule();
	}
	
	//Version:
	//	'version' '{'
	//	'major' majorMalue=INT
	//	'minor' minorValue=INT
	//	'}';
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//State:
	//	initial?='initial'? 'State' name=ID;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//	'Transition' name=ID ':' fromState=[State] '->' toState=[State];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
