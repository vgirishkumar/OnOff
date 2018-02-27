/*
 * generated by Xtext 2.13.0
 */
grammar InternalCoom;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.visteon.onoff.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.visteon.onoff.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.visteon.onoff.services.CoomGrammarAccess;

}

@parser::members {

 	private CoomGrammarAccess grammarAccess;

    public InternalCoomParser(TokenStream input, CoomGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "FullComponentOnOffManifest";
   	}

   	@Override
   	protected CoomGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFullComponentOnOffManifest
entryRuleFullComponentOnOffManifest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFullComponentOnOffManifestRule()); }
	iv_ruleFullComponentOnOffManifest=ruleFullComponentOnOffManifest
	{ $current=$iv_ruleFullComponentOnOffManifest.current; }
	EOF;

// Rule FullComponentOnOffManifest
ruleFullComponentOnOffManifest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='package'
			{
				newLeafNode(otherlv_0, grammarAccess.getFullComponentOnOffManifestAccess().getPackageKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFullComponentOnOffManifestAccess().getNameFQNParserRuleCall_0_1_0());
					}
					lv_name_1_0=ruleFQN
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFullComponentOnOffManifestRule());
						}
						set(
							$current,
							"name",
							lv_name_1_0,
							"com.visteon.onoff.Coom.FQN");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFullComponentOnOffManifestAccess().getCoomComponentOnOffManifestParserRuleCall_1_0());
				}
				lv_coom_2_0=ruleComponentOnOffManifest
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFullComponentOnOffManifestRule());
					}
					set(
						$current,
						"coom",
						lv_coom_2_0,
						"com.visteon.onoff.Coom.ComponentOnOffManifest");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleComponentOnOffManifest
entryRuleComponentOnOffManifest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentOnOffManifestRule()); }
	iv_ruleComponentOnOffManifest=ruleComponentOnOffManifest
	{ $current=$iv_ruleComponentOnOffManifest.current; }
	EOF;

// Rule ComponentOnOffManifest
ruleComponentOnOffManifest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getComponentOnOffManifestAccess().getComponentOnOffManifestAction_0(),
					$current);
			}
		)
		otherlv_1='Component'
		{
			newLeafNode(otherlv_1, grammarAccess.getComponentOnOffManifestAccess().getComponentKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getNameFQNParserRuleCall_2_0());
				}
				lv_name_2_0=ruleFQN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"com.visteon.onoff.Coom.FQN");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getComponentOnOffManifestAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getVersionVersionParserRuleCall_4_0());
				}
				lv_version_4_0=ruleVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
					}
					set(
						$current,
						"version",
						lv_version_4_0,
						"com.visteon.onoff.Coom.Version");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getStatesStateParserRuleCall_5_0_0());
					}
					lv_states_5_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
						}
						add(
							$current,
							"states",
							lv_states_5_0,
							"com.visteon.onoff.Coom.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getTransitionsTransitionParserRuleCall_5_1_0());
					}
					lv_transitions_6_0=ruleTransition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
						}
						add(
							$current,
							"transitions",
							lv_transitions_6_0,
							"com.visteon.onoff.Coom.Transition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getComponentOnOffManifestAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleVersion
entryRuleVersion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVersionRule()); }
	iv_ruleVersion=ruleVersion
	{ $current=$iv_ruleVersion.current; }
	EOF;

// Rule Version
ruleVersion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='version'
		{
			newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='major'
		{
			newLeafNode(otherlv_2, grammarAccess.getVersionAccess().getMajorKeyword_2());
		}
		(
			(
				lv_majorMalue_3_0=RULE_INT
				{
					newLeafNode(lv_majorMalue_3_0, grammarAccess.getVersionAccess().getMajorMalueINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVersionRule());
					}
					setWithLastConsumed(
						$current,
						"majorMalue",
						lv_majorMalue_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4='minor'
		{
			newLeafNode(otherlv_4, grammarAccess.getVersionAccess().getMinorKeyword_4());
		}
		(
			(
				lv_minorValue_5_0=RULE_INT
				{
					newLeafNode(lv_minorValue_5_0, grammarAccess.getVersionAccess().getMinorValueINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVersionRule());
					}
					setWithLastConsumed(
						$current,
						"minorValue",
						lv_minorValue_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_initial_0_0='initial'
				{
					newLeafNode(lv_initial_0_0, grammarAccess.getStateAccess().getInitialInitialKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed($current, "initial", true, "initial");
				}
			)
		)?
		otherlv_1='State'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_0());
			}
			otherlv_4='}'
			{
				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_1());
			}
		)?
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getFromStateStateCrossReference_3_0());
				}
			)
		)
		otherlv_4='->'
		{
			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getToStateStateCrossReference_5_0());
				}
			)
		)
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;