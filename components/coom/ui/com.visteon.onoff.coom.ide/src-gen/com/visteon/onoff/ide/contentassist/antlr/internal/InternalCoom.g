/*
 * generated by Xtext 2.13.0
 */
grammar InternalCoom;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package com.visteon.onoff.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.visteon.onoff.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.visteon.onoff.services.CoomGrammarAccess;

}
@parser::members {
	private CoomGrammarAccess grammarAccess;

	public void setGrammarAccess(CoomGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleComponentOnOffManifest
entryRuleComponentOnOffManifest
:
{ before(grammarAccess.getComponentOnOffManifestRule()); }
	 ruleComponentOnOffManifest
{ after(grammarAccess.getComponentOnOffManifestRule()); } 
	 EOF 
;

// Rule ComponentOnOffManifest
ruleComponentOnOffManifest 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentOnOffManifestAccess().getGroup()); }
		(rule__ComponentOnOffManifest__Group__0)
		{ after(grammarAccess.getComponentOnOffManifestAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVersion
entryRuleVersion
:
{ before(grammarAccess.getVersionRule()); }
	 ruleVersion
{ after(grammarAccess.getVersionRule()); } 
	 EOF 
;

// Rule Version
ruleVersion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionAccess().getGroup()); }
		(rule__Version__Group__0)
		{ after(grammarAccess.getVersionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransition
entryRuleTransition
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionAccess().getGroup()); }
		(rule__Transition__Group__0)
		{ after(grammarAccess.getTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentOnOffManifestAccess().getStatesAssignment_4_0()); }
		(rule__ComponentOnOffManifest__StatesAssignment_4_0)
		{ after(grammarAccess.getComponentOnOffManifestAccess().getStatesAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getComponentOnOffManifestAccess().getTransitionsAssignment_4_1()); }
		(rule__ComponentOnOffManifest__TransitionsAssignment_4_1)
		{ after(grammarAccess.getComponentOnOffManifestAccess().getTransitionsAssignment_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentOnOffManifest__Group__0__Impl
	rule__ComponentOnOffManifest__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentOnOffManifestAccess().getComponentKeyword_0()); }
	'Component'
	{ after(grammarAccess.getComponentOnOffManifestAccess().getComponentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentOnOffManifest__Group__1__Impl
	rule__ComponentOnOffManifest__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentOnOffManifestAccess().getNameAssignment_1()); }
	(rule__ComponentOnOffManifest__NameAssignment_1)
	{ after(grammarAccess.getComponentOnOffManifestAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentOnOffManifest__Group__2__Impl
	rule__ComponentOnOffManifest__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentOnOffManifestAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getComponentOnOffManifestAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentOnOffManifest__Group__3__Impl
	rule__ComponentOnOffManifest__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentOnOffManifestAccess().getVersionAssignment_3()); }
	(rule__ComponentOnOffManifest__VersionAssignment_3)
	{ after(grammarAccess.getComponentOnOffManifestAccess().getVersionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentOnOffManifest__Group__4__Impl
	rule__ComponentOnOffManifest__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentOnOffManifestAccess().getAlternatives_4()); }
	(rule__ComponentOnOffManifest__Alternatives_4)*
	{ after(grammarAccess.getComponentOnOffManifestAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentOnOffManifest__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentOnOffManifestAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getComponentOnOffManifestAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__0__Impl
	rule__Version__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getVersionKeyword_0()); }
	'version'
	{ after(grammarAccess.getVersionAccess().getVersionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__1__Impl
	rule__Version__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__2__Impl
	rule__Version__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getMajorKeyword_2()); }
	'major'
	{ after(grammarAccess.getVersionAccess().getMajorKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__3__Impl
	rule__Version__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getMajorMalueAssignment_3()); }
	(rule__Version__MajorMalueAssignment_3)
	{ after(grammarAccess.getVersionAccess().getMajorMalueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__4__Impl
	rule__Version__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getMinorKeyword_4()); }
	'minor'
	{ after(grammarAccess.getVersionAccess().getMinorKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__5__Impl
	rule__Version__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getMinorValueAssignment_5()); }
	(rule__Version__MinorValueAssignment_5)
	{ after(grammarAccess.getVersionAccess().getMinorValueAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getInitialAssignment_0()); }
	(rule__State__InitialAssignment_0)?
	{ after(grammarAccess.getStateAccess().getInitialAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_1()); }
	'State'
	{ after(grammarAccess.getStateAccess().getStateKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameAssignment_2()); }
	(rule__State__NameAssignment_2)
	{ after(grammarAccess.getStateAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); }
	'Transition'
	{ after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__1__Impl
	rule__Transition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getNameAssignment_1()); }
	(rule__Transition__NameAssignment_1)
	{ after(grammarAccess.getTransitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__2__Impl
	rule__Transition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getTransitionAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__3__Impl
	rule__Transition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getFromStateAssignment_3()); }
	(rule__Transition__FromStateAssignment_3)
	{ after(grammarAccess.getTransitionAccess().getFromStateAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__4__Impl
	rule__Transition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4()); }
	'->'
	{ after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getToStateAssignment_5()); }
	(rule__Transition__ToStateAssignment_5)
	{ after(grammarAccess.getTransitionAccess().getToStateAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentOnOffManifest__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentOnOffManifestAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentOnOffManifestAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__VersionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentOnOffManifestAccess().getVersionVersionParserRuleCall_3_0()); }
		ruleVersion
		{ after(grammarAccess.getComponentOnOffManifestAccess().getVersionVersionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__StatesAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentOnOffManifestAccess().getStatesStateParserRuleCall_4_0_0()); }
		ruleState
		{ after(grammarAccess.getComponentOnOffManifestAccess().getStatesStateParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentOnOffManifest__TransitionsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentOnOffManifestAccess().getTransitionsTransitionParserRuleCall_4_1_0()); }
		ruleTransition
		{ after(grammarAccess.getComponentOnOffManifestAccess().getTransitionsTransitionParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__MajorMalueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getMajorMalueINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getMajorMalueINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__MinorValueAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getMinorValueINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getMinorValueINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__InitialAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); }
		(
			{ before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); }
			'initial'
			{ after(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); }
		)
		{ after(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__FromStateAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getFromStateStateCrossReference_3_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getFromStateStateIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTransitionAccess().getFromStateStateIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getFromStateStateCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__ToStateAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getToStateStateCrossReference_5_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getToStateStateIDTerminalRuleCall_5_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTransitionAccess().getToStateStateIDTerminalRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getToStateStateCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
