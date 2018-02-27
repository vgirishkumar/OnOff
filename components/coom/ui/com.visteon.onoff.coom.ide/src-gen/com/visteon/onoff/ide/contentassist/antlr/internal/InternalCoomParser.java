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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCoomParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'Component'", "'{'", "'}'", "'version'", "'major'", "'minor'", "'State'", "'Transition'", "':'", "'->'", "'.'", "'initial'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCoomParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCoomParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCoomParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCoom.g"; }


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



    // $ANTLR start "entryRuleFullComponentOnOffManifest"
    // InternalCoom.g:53:1: entryRuleFullComponentOnOffManifest : ruleFullComponentOnOffManifest EOF ;
    public final void entryRuleFullComponentOnOffManifest() throws RecognitionException {
        try {
            // InternalCoom.g:54:1: ( ruleFullComponentOnOffManifest EOF )
            // InternalCoom.g:55:1: ruleFullComponentOnOffManifest EOF
            {
             before(grammarAccess.getFullComponentOnOffManifestRule()); 
            pushFollow(FOLLOW_1);
            ruleFullComponentOnOffManifest();

            state._fsp--;

             after(grammarAccess.getFullComponentOnOffManifestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFullComponentOnOffManifest"


    // $ANTLR start "ruleFullComponentOnOffManifest"
    // InternalCoom.g:62:1: ruleFullComponentOnOffManifest : ( ( rule__FullComponentOnOffManifest__Group__0 ) ) ;
    public final void ruleFullComponentOnOffManifest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:66:2: ( ( ( rule__FullComponentOnOffManifest__Group__0 ) ) )
            // InternalCoom.g:67:2: ( ( rule__FullComponentOnOffManifest__Group__0 ) )
            {
            // InternalCoom.g:67:2: ( ( rule__FullComponentOnOffManifest__Group__0 ) )
            // InternalCoom.g:68:3: ( rule__FullComponentOnOffManifest__Group__0 )
            {
             before(grammarAccess.getFullComponentOnOffManifestAccess().getGroup()); 
            // InternalCoom.g:69:3: ( rule__FullComponentOnOffManifest__Group__0 )
            // InternalCoom.g:69:4: rule__FullComponentOnOffManifest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FullComponentOnOffManifest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFullComponentOnOffManifestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFullComponentOnOffManifest"


    // $ANTLR start "entryRuleComponentOnOffManifest"
    // InternalCoom.g:78:1: entryRuleComponentOnOffManifest : ruleComponentOnOffManifest EOF ;
    public final void entryRuleComponentOnOffManifest() throws RecognitionException {
        try {
            // InternalCoom.g:79:1: ( ruleComponentOnOffManifest EOF )
            // InternalCoom.g:80:1: ruleComponentOnOffManifest EOF
            {
             before(grammarAccess.getComponentOnOffManifestRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentOnOffManifest();

            state._fsp--;

             after(grammarAccess.getComponentOnOffManifestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentOnOffManifest"


    // $ANTLR start "ruleComponentOnOffManifest"
    // InternalCoom.g:87:1: ruleComponentOnOffManifest : ( ( rule__ComponentOnOffManifest__Group__0 ) ) ;
    public final void ruleComponentOnOffManifest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:91:2: ( ( ( rule__ComponentOnOffManifest__Group__0 ) ) )
            // InternalCoom.g:92:2: ( ( rule__ComponentOnOffManifest__Group__0 ) )
            {
            // InternalCoom.g:92:2: ( ( rule__ComponentOnOffManifest__Group__0 ) )
            // InternalCoom.g:93:3: ( rule__ComponentOnOffManifest__Group__0 )
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getGroup()); 
            // InternalCoom.g:94:3: ( rule__ComponentOnOffManifest__Group__0 )
            // InternalCoom.g:94:4: rule__ComponentOnOffManifest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentOnOffManifestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentOnOffManifest"


    // $ANTLR start "entryRuleVersion"
    // InternalCoom.g:103:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalCoom.g:104:1: ( ruleVersion EOF )
            // InternalCoom.g:105:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalCoom.g:112:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:116:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalCoom.g:117:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalCoom.g:117:2: ( ( rule__Version__Group__0 ) )
            // InternalCoom.g:118:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalCoom.g:119:3: ( rule__Version__Group__0 )
            // InternalCoom.g:119:4: rule__Version__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleState"
    // InternalCoom.g:128:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalCoom.g:129:1: ( ruleState EOF )
            // InternalCoom.g:130:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalCoom.g:137:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:141:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalCoom.g:142:2: ( ( rule__State__Group__0 ) )
            {
            // InternalCoom.g:142:2: ( ( rule__State__Group__0 ) )
            // InternalCoom.g:143:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalCoom.g:144:3: ( rule__State__Group__0 )
            // InternalCoom.g:144:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalCoom.g:153:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalCoom.g:154:1: ( ruleTransition EOF )
            // InternalCoom.g:155:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalCoom.g:162:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:166:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalCoom.g:167:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalCoom.g:167:2: ( ( rule__Transition__Group__0 ) )
            // InternalCoom.g:168:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalCoom.g:169:3: ( rule__Transition__Group__0 )
            // InternalCoom.g:169:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleFQN"
    // InternalCoom.g:178:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalCoom.g:179:1: ( ruleFQN EOF )
            // InternalCoom.g:180:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalCoom.g:187:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:191:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalCoom.g:192:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalCoom.g:192:2: ( ( rule__FQN__Group__0 ) )
            // InternalCoom.g:193:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalCoom.g:194:3: ( rule__FQN__Group__0 )
            // InternalCoom.g:194:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rule__ComponentOnOffManifest__Alternatives_5"
    // InternalCoom.g:202:1: rule__ComponentOnOffManifest__Alternatives_5 : ( ( ( rule__ComponentOnOffManifest__StatesAssignment_5_0 ) ) | ( ( rule__ComponentOnOffManifest__TransitionsAssignment_5_1 ) ) );
    public final void rule__ComponentOnOffManifest__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:206:1: ( ( ( rule__ComponentOnOffManifest__StatesAssignment_5_0 ) ) | ( ( rule__ComponentOnOffManifest__TransitionsAssignment_5_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18||LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCoom.g:207:2: ( ( rule__ComponentOnOffManifest__StatesAssignment_5_0 ) )
                    {
                    // InternalCoom.g:207:2: ( ( rule__ComponentOnOffManifest__StatesAssignment_5_0 ) )
                    // InternalCoom.g:208:3: ( rule__ComponentOnOffManifest__StatesAssignment_5_0 )
                    {
                     before(grammarAccess.getComponentOnOffManifestAccess().getStatesAssignment_5_0()); 
                    // InternalCoom.g:209:3: ( rule__ComponentOnOffManifest__StatesAssignment_5_0 )
                    // InternalCoom.g:209:4: rule__ComponentOnOffManifest__StatesAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentOnOffManifest__StatesAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentOnOffManifestAccess().getStatesAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCoom.g:213:2: ( ( rule__ComponentOnOffManifest__TransitionsAssignment_5_1 ) )
                    {
                    // InternalCoom.g:213:2: ( ( rule__ComponentOnOffManifest__TransitionsAssignment_5_1 ) )
                    // InternalCoom.g:214:3: ( rule__ComponentOnOffManifest__TransitionsAssignment_5_1 )
                    {
                     before(grammarAccess.getComponentOnOffManifestAccess().getTransitionsAssignment_5_1()); 
                    // InternalCoom.g:215:3: ( rule__ComponentOnOffManifest__TransitionsAssignment_5_1 )
                    // InternalCoom.g:215:4: rule__ComponentOnOffManifest__TransitionsAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentOnOffManifest__TransitionsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentOnOffManifestAccess().getTransitionsAssignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Alternatives_5"


    // $ANTLR start "rule__FullComponentOnOffManifest__Group__0"
    // InternalCoom.g:223:1: rule__FullComponentOnOffManifest__Group__0 : rule__FullComponentOnOffManifest__Group__0__Impl rule__FullComponentOnOffManifest__Group__1 ;
    public final void rule__FullComponentOnOffManifest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:227:1: ( rule__FullComponentOnOffManifest__Group__0__Impl rule__FullComponentOnOffManifest__Group__1 )
            // InternalCoom.g:228:2: rule__FullComponentOnOffManifest__Group__0__Impl rule__FullComponentOnOffManifest__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FullComponentOnOffManifest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FullComponentOnOffManifest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullComponentOnOffManifest__Group__0"


    // $ANTLR start "rule__FullComponentOnOffManifest__Group__0__Impl"
    // InternalCoom.g:235:1: rule__FullComponentOnOffManifest__Group__0__Impl : ( ( rule__FullComponentOnOffManifest__Group_0__0 )? ) ;
    public final void rule__FullComponentOnOffManifest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:239:1: ( ( ( rule__FullComponentOnOffManifest__Group_0__0 )? ) )
            // InternalCoom.g:240:1: ( ( rule__FullComponentOnOffManifest__Group_0__0 )? )
            {
            // InternalCoom.g:240:1: ( ( rule__FullComponentOnOffManifest__Group_0__0 )? )
            // InternalCoom.g:241:2: ( rule__FullComponentOnOffManifest__Group_0__0 )?
            {
             before(grammarAccess.getFullComponentOnOffManifestAccess().getGroup_0()); 
            // InternalCoom.g:242:2: ( rule__FullComponentOnOffManifest__Group_0__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCoom.g:242:3: rule__FullComponentOnOffManifest__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FullComponentOnOffManifest__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFullComponentOnOffManifestAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullComponentOnOffManifest__Group__0__Impl"


    // $ANTLR start "rule__FullComponentOnOffManifest__Group__1"
    // InternalCoom.g:250:1: rule__FullComponentOnOffManifest__Group__1 : rule__FullComponentOnOffManifest__Group__1__Impl ;
    public final void rule__FullComponentOnOffManifest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:254:1: ( rule__FullComponentOnOffManifest__Group__1__Impl )
            // InternalCoom.g:255:2: rule__FullComponentOnOffManifest__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FullComponentOnOffManifest__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullComponentOnOffManifest__Group__1"


    // $ANTLR start "rule__FullComponentOnOffManifest__Group__1__Impl"
    // InternalCoom.g:261:1: rule__FullComponentOnOffManifest__Group__1__Impl : ( ( rule__FullComponentOnOffManifest__CoomAssignment_1 )? ) ;
    public final void rule__FullComponentOnOffManifest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:265:1: ( ( ( rule__FullComponentOnOffManifest__CoomAssignment_1 )? ) )
            // InternalCoom.g:266:1: ( ( rule__FullComponentOnOffManifest__CoomAssignment_1 )? )
            {
            // InternalCoom.g:266:1: ( ( rule__FullComponentOnOffManifest__CoomAssignment_1 )? )
            // InternalCoom.g:267:2: ( rule__FullComponentOnOffManifest__CoomAssignment_1 )?
            {
             before(grammarAccess.getFullComponentOnOffManifestAccess().getCoomAssignment_1()); 
            // InternalCoom.g:268:2: ( rule__FullComponentOnOffManifest__CoomAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCoom.g:268:3: rule__FullComponentOnOffManifest__CoomAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FullComponentOnOffManifest__CoomAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFullComponentOnOffManifestAccess().getCoomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullComponentOnOffManifest__Group__1__Impl"


    // $ANTLR start "rule__FullComponentOnOffManifest__Group_0__0"
    // InternalCoom.g:277:1: rule__FullComponentOnOffManifest__Group_0__0 : rule__FullComponentOnOffManifest__Group_0__0__Impl rule__FullComponentOnOffManifest__Group_0__1 ;
    public final void rule__FullComponentOnOffManifest__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:281:1: ( rule__FullComponentOnOffManifest__Group_0__0__Impl rule__FullComponentOnOffManifest__Group_0__1 )
            // InternalCoom.g:282:2: rule__FullComponentOnOffManifest__Group_0__0__Impl rule__FullComponentOnOffManifest__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__FullComponentOnOffManifest__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FullComponentOnOffManifest__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullComponentOnOffManifest__Group_0__0"


    // $ANTLR start "rule__FullComponentOnOffManifest__Group_0__0__Impl"
    // InternalCoom.g:289:1: rule__FullComponentOnOffManifest__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__FullComponentOnOffManifest__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:293:1: ( ( 'package' ) )
            // InternalCoom.g:294:1: ( 'package' )
            {
            // InternalCoom.g:294:1: ( 'package' )
            // InternalCoom.g:295:2: 'package'
            {
             before(grammarAccess.getFullComponentOnOffManifestAccess().getPackageKeyword_0_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFullComponentOnOffManifestAccess().getPackageKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullComponentOnOffManifest__Group_0__0__Impl"


    // $ANTLR start "rule__FullComponentOnOffManifest__Group_0__1"
    // InternalCoom.g:304:1: rule__FullComponentOnOffManifest__Group_0__1 : rule__FullComponentOnOffManifest__Group_0__1__Impl ;
    public final void rule__FullComponentOnOffManifest__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:308:1: ( rule__FullComponentOnOffManifest__Group_0__1__Impl )
            // InternalCoom.g:309:2: rule__FullComponentOnOffManifest__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FullComponentOnOffManifest__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullComponentOnOffManifest__Group_0__1"


    // $ANTLR start "rule__FullComponentOnOffManifest__Group_0__1__Impl"
    // InternalCoom.g:315:1: rule__FullComponentOnOffManifest__Group_0__1__Impl : ( ( rule__FullComponentOnOffManifest__NameAssignment_0_1 ) ) ;
    public final void rule__FullComponentOnOffManifest__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:319:1: ( ( ( rule__FullComponentOnOffManifest__NameAssignment_0_1 ) ) )
            // InternalCoom.g:320:1: ( ( rule__FullComponentOnOffManifest__NameAssignment_0_1 ) )
            {
            // InternalCoom.g:320:1: ( ( rule__FullComponentOnOffManifest__NameAssignment_0_1 ) )
            // InternalCoom.g:321:2: ( rule__FullComponentOnOffManifest__NameAssignment_0_1 )
            {
             before(grammarAccess.getFullComponentOnOffManifestAccess().getNameAssignment_0_1()); 
            // InternalCoom.g:322:2: ( rule__FullComponentOnOffManifest__NameAssignment_0_1 )
            // InternalCoom.g:322:3: rule__FullComponentOnOffManifest__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FullComponentOnOffManifest__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFullComponentOnOffManifestAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullComponentOnOffManifest__Group_0__1__Impl"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__0"
    // InternalCoom.g:331:1: rule__ComponentOnOffManifest__Group__0 : rule__ComponentOnOffManifest__Group__0__Impl rule__ComponentOnOffManifest__Group__1 ;
    public final void rule__ComponentOnOffManifest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:335:1: ( rule__ComponentOnOffManifest__Group__0__Impl rule__ComponentOnOffManifest__Group__1 )
            // InternalCoom.g:336:2: rule__ComponentOnOffManifest__Group__0__Impl rule__ComponentOnOffManifest__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentOnOffManifest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__0"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__0__Impl"
    // InternalCoom.g:343:1: rule__ComponentOnOffManifest__Group__0__Impl : ( () ) ;
    public final void rule__ComponentOnOffManifest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:347:1: ( ( () ) )
            // InternalCoom.g:348:1: ( () )
            {
            // InternalCoom.g:348:1: ( () )
            // InternalCoom.g:349:2: ()
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getComponentOnOffManifestAction_0()); 
            // InternalCoom.g:350:2: ()
            // InternalCoom.g:350:3: 
            {
            }

             after(grammarAccess.getComponentOnOffManifestAccess().getComponentOnOffManifestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__0__Impl"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__1"
    // InternalCoom.g:358:1: rule__ComponentOnOffManifest__Group__1 : rule__ComponentOnOffManifest__Group__1__Impl rule__ComponentOnOffManifest__Group__2 ;
    public final void rule__ComponentOnOffManifest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:362:1: ( rule__ComponentOnOffManifest__Group__1__Impl rule__ComponentOnOffManifest__Group__2 )
            // InternalCoom.g:363:2: rule__ComponentOnOffManifest__Group__1__Impl rule__ComponentOnOffManifest__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentOnOffManifest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__1"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__1__Impl"
    // InternalCoom.g:370:1: rule__ComponentOnOffManifest__Group__1__Impl : ( 'Component' ) ;
    public final void rule__ComponentOnOffManifest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:374:1: ( ( 'Component' ) )
            // InternalCoom.g:375:1: ( 'Component' )
            {
            // InternalCoom.g:375:1: ( 'Component' )
            // InternalCoom.g:376:2: 'Component'
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getComponentKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentOnOffManifestAccess().getComponentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__1__Impl"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__2"
    // InternalCoom.g:385:1: rule__ComponentOnOffManifest__Group__2 : rule__ComponentOnOffManifest__Group__2__Impl rule__ComponentOnOffManifest__Group__3 ;
    public final void rule__ComponentOnOffManifest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:389:1: ( rule__ComponentOnOffManifest__Group__2__Impl rule__ComponentOnOffManifest__Group__3 )
            // InternalCoom.g:390:2: rule__ComponentOnOffManifest__Group__2__Impl rule__ComponentOnOffManifest__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComponentOnOffManifest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__2"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__2__Impl"
    // InternalCoom.g:397:1: rule__ComponentOnOffManifest__Group__2__Impl : ( ( rule__ComponentOnOffManifest__NameAssignment_2 ) ) ;
    public final void rule__ComponentOnOffManifest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:401:1: ( ( ( rule__ComponentOnOffManifest__NameAssignment_2 ) ) )
            // InternalCoom.g:402:1: ( ( rule__ComponentOnOffManifest__NameAssignment_2 ) )
            {
            // InternalCoom.g:402:1: ( ( rule__ComponentOnOffManifest__NameAssignment_2 ) )
            // InternalCoom.g:403:2: ( rule__ComponentOnOffManifest__NameAssignment_2 )
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getNameAssignment_2()); 
            // InternalCoom.g:404:2: ( rule__ComponentOnOffManifest__NameAssignment_2 )
            // InternalCoom.g:404:3: rule__ComponentOnOffManifest__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentOnOffManifestAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__2__Impl"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__3"
    // InternalCoom.g:412:1: rule__ComponentOnOffManifest__Group__3 : rule__ComponentOnOffManifest__Group__3__Impl rule__ComponentOnOffManifest__Group__4 ;
    public final void rule__ComponentOnOffManifest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:416:1: ( rule__ComponentOnOffManifest__Group__3__Impl rule__ComponentOnOffManifest__Group__4 )
            // InternalCoom.g:417:2: rule__ComponentOnOffManifest__Group__3__Impl rule__ComponentOnOffManifest__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ComponentOnOffManifest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__3"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__3__Impl"
    // InternalCoom.g:424:1: rule__ComponentOnOffManifest__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentOnOffManifest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:428:1: ( ( '{' ) )
            // InternalCoom.g:429:1: ( '{' )
            {
            // InternalCoom.g:429:1: ( '{' )
            // InternalCoom.g:430:2: '{'
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentOnOffManifestAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__3__Impl"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__4"
    // InternalCoom.g:439:1: rule__ComponentOnOffManifest__Group__4 : rule__ComponentOnOffManifest__Group__4__Impl rule__ComponentOnOffManifest__Group__5 ;
    public final void rule__ComponentOnOffManifest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:443:1: ( rule__ComponentOnOffManifest__Group__4__Impl rule__ComponentOnOffManifest__Group__5 )
            // InternalCoom.g:444:2: rule__ComponentOnOffManifest__Group__4__Impl rule__ComponentOnOffManifest__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ComponentOnOffManifest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__4"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__4__Impl"
    // InternalCoom.g:451:1: rule__ComponentOnOffManifest__Group__4__Impl : ( ( rule__ComponentOnOffManifest__VersionAssignment_4 ) ) ;
    public final void rule__ComponentOnOffManifest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:455:1: ( ( ( rule__ComponentOnOffManifest__VersionAssignment_4 ) ) )
            // InternalCoom.g:456:1: ( ( rule__ComponentOnOffManifest__VersionAssignment_4 ) )
            {
            // InternalCoom.g:456:1: ( ( rule__ComponentOnOffManifest__VersionAssignment_4 ) )
            // InternalCoom.g:457:2: ( rule__ComponentOnOffManifest__VersionAssignment_4 )
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getVersionAssignment_4()); 
            // InternalCoom.g:458:2: ( rule__ComponentOnOffManifest__VersionAssignment_4 )
            // InternalCoom.g:458:3: rule__ComponentOnOffManifest__VersionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__VersionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentOnOffManifestAccess().getVersionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__4__Impl"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__5"
    // InternalCoom.g:466:1: rule__ComponentOnOffManifest__Group__5 : rule__ComponentOnOffManifest__Group__5__Impl rule__ComponentOnOffManifest__Group__6 ;
    public final void rule__ComponentOnOffManifest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:470:1: ( rule__ComponentOnOffManifest__Group__5__Impl rule__ComponentOnOffManifest__Group__6 )
            // InternalCoom.g:471:2: rule__ComponentOnOffManifest__Group__5__Impl rule__ComponentOnOffManifest__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ComponentOnOffManifest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__5"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__5__Impl"
    // InternalCoom.g:478:1: rule__ComponentOnOffManifest__Group__5__Impl : ( ( rule__ComponentOnOffManifest__Alternatives_5 )* ) ;
    public final void rule__ComponentOnOffManifest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:482:1: ( ( ( rule__ComponentOnOffManifest__Alternatives_5 )* ) )
            // InternalCoom.g:483:1: ( ( rule__ComponentOnOffManifest__Alternatives_5 )* )
            {
            // InternalCoom.g:483:1: ( ( rule__ComponentOnOffManifest__Alternatives_5 )* )
            // InternalCoom.g:484:2: ( rule__ComponentOnOffManifest__Alternatives_5 )*
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getAlternatives_5()); 
            // InternalCoom.g:485:2: ( rule__ComponentOnOffManifest__Alternatives_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=19)||LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCoom.g:485:3: rule__ComponentOnOffManifest__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentOnOffManifest__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getComponentOnOffManifestAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__5__Impl"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__6"
    // InternalCoom.g:493:1: rule__ComponentOnOffManifest__Group__6 : rule__ComponentOnOffManifest__Group__6__Impl ;
    public final void rule__ComponentOnOffManifest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:497:1: ( rule__ComponentOnOffManifest__Group__6__Impl )
            // InternalCoom.g:498:2: rule__ComponentOnOffManifest__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__6"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__6__Impl"
    // InternalCoom.g:504:1: rule__ComponentOnOffManifest__Group__6__Impl : ( '}' ) ;
    public final void rule__ComponentOnOffManifest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:508:1: ( ( '}' ) )
            // InternalCoom.g:509:1: ( '}' )
            {
            // InternalCoom.g:509:1: ( '}' )
            // InternalCoom.g:510:2: '}'
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentOnOffManifestAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__Group__6__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalCoom.g:520:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:524:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalCoom.g:525:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalCoom.g:532:1: rule__Version__Group__0__Impl : ( 'version' ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:536:1: ( ( 'version' ) )
            // InternalCoom.g:537:1: ( 'version' )
            {
            // InternalCoom.g:537:1: ( 'version' )
            // InternalCoom.g:538:2: 'version'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getVersionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalCoom.g:547:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:551:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalCoom.g:552:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalCoom.g:559:1: rule__Version__Group__1__Impl : ( '{' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:563:1: ( ( '{' ) )
            // InternalCoom.g:564:1: ( '{' )
            {
            // InternalCoom.g:564:1: ( '{' )
            // InternalCoom.g:565:2: '{'
            {
             before(grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // InternalCoom.g:574:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:578:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // InternalCoom.g:579:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Version__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // InternalCoom.g:586:1: rule__Version__Group__2__Impl : ( 'major' ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:590:1: ( ( 'major' ) )
            // InternalCoom.g:591:1: ( 'major' )
            {
            // InternalCoom.g:591:1: ( 'major' )
            // InternalCoom.g:592:2: 'major'
            {
             before(grammarAccess.getVersionAccess().getMajorKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getMajorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__Version__Group__3"
    // InternalCoom.g:601:1: rule__Version__Group__3 : rule__Version__Group__3__Impl rule__Version__Group__4 ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:605:1: ( rule__Version__Group__3__Impl rule__Version__Group__4 )
            // InternalCoom.g:606:2: rule__Version__Group__3__Impl rule__Version__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Version__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__3"


    // $ANTLR start "rule__Version__Group__3__Impl"
    // InternalCoom.g:613:1: rule__Version__Group__3__Impl : ( ( rule__Version__MajorMalueAssignment_3 ) ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:617:1: ( ( ( rule__Version__MajorMalueAssignment_3 ) ) )
            // InternalCoom.g:618:1: ( ( rule__Version__MajorMalueAssignment_3 ) )
            {
            // InternalCoom.g:618:1: ( ( rule__Version__MajorMalueAssignment_3 ) )
            // InternalCoom.g:619:2: ( rule__Version__MajorMalueAssignment_3 )
            {
             before(grammarAccess.getVersionAccess().getMajorMalueAssignment_3()); 
            // InternalCoom.g:620:2: ( rule__Version__MajorMalueAssignment_3 )
            // InternalCoom.g:620:3: rule__Version__MajorMalueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Version__MajorMalueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getMajorMalueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__3__Impl"


    // $ANTLR start "rule__Version__Group__4"
    // InternalCoom.g:628:1: rule__Version__Group__4 : rule__Version__Group__4__Impl rule__Version__Group__5 ;
    public final void rule__Version__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:632:1: ( rule__Version__Group__4__Impl rule__Version__Group__5 )
            // InternalCoom.g:633:2: rule__Version__Group__4__Impl rule__Version__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Version__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__4"


    // $ANTLR start "rule__Version__Group__4__Impl"
    // InternalCoom.g:640:1: rule__Version__Group__4__Impl : ( 'minor' ) ;
    public final void rule__Version__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:644:1: ( ( 'minor' ) )
            // InternalCoom.g:645:1: ( 'minor' )
            {
            // InternalCoom.g:645:1: ( 'minor' )
            // InternalCoom.g:646:2: 'minor'
            {
             before(grammarAccess.getVersionAccess().getMinorKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getMinorKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__4__Impl"


    // $ANTLR start "rule__Version__Group__5"
    // InternalCoom.g:655:1: rule__Version__Group__5 : rule__Version__Group__5__Impl rule__Version__Group__6 ;
    public final void rule__Version__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:659:1: ( rule__Version__Group__5__Impl rule__Version__Group__6 )
            // InternalCoom.g:660:2: rule__Version__Group__5__Impl rule__Version__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Version__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__5"


    // $ANTLR start "rule__Version__Group__5__Impl"
    // InternalCoom.g:667:1: rule__Version__Group__5__Impl : ( ( rule__Version__MinorValueAssignment_5 ) ) ;
    public final void rule__Version__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:671:1: ( ( ( rule__Version__MinorValueAssignment_5 ) ) )
            // InternalCoom.g:672:1: ( ( rule__Version__MinorValueAssignment_5 ) )
            {
            // InternalCoom.g:672:1: ( ( rule__Version__MinorValueAssignment_5 ) )
            // InternalCoom.g:673:2: ( rule__Version__MinorValueAssignment_5 )
            {
             before(grammarAccess.getVersionAccess().getMinorValueAssignment_5()); 
            // InternalCoom.g:674:2: ( rule__Version__MinorValueAssignment_5 )
            // InternalCoom.g:674:3: rule__Version__MinorValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Version__MinorValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getMinorValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__5__Impl"


    // $ANTLR start "rule__Version__Group__6"
    // InternalCoom.g:682:1: rule__Version__Group__6 : rule__Version__Group__6__Impl ;
    public final void rule__Version__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:686:1: ( rule__Version__Group__6__Impl )
            // InternalCoom.g:687:2: rule__Version__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__6"


    // $ANTLR start "rule__Version__Group__6__Impl"
    // InternalCoom.g:693:1: rule__Version__Group__6__Impl : ( '}' ) ;
    public final void rule__Version__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:697:1: ( ( '}' ) )
            // InternalCoom.g:698:1: ( '}' )
            {
            // InternalCoom.g:698:1: ( '}' )
            // InternalCoom.g:699:2: '}'
            {
             before(grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__6__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalCoom.g:709:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:713:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalCoom.g:714:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalCoom.g:721:1: rule__State__Group__0__Impl : ( ( rule__State__InitialAssignment_0 )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:725:1: ( ( ( rule__State__InitialAssignment_0 )? ) )
            // InternalCoom.g:726:1: ( ( rule__State__InitialAssignment_0 )? )
            {
            // InternalCoom.g:726:1: ( ( rule__State__InitialAssignment_0 )? )
            // InternalCoom.g:727:2: ( rule__State__InitialAssignment_0 )?
            {
             before(grammarAccess.getStateAccess().getInitialAssignment_0()); 
            // InternalCoom.g:728:2: ( rule__State__InitialAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCoom.g:728:3: rule__State__InitialAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__InitialAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getInitialAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalCoom.g:736:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:740:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalCoom.g:741:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalCoom.g:748:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:752:1: ( ( 'State' ) )
            // InternalCoom.g:753:1: ( 'State' )
            {
            // InternalCoom.g:753:1: ( 'State' )
            // InternalCoom.g:754:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalCoom.g:763:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:767:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalCoom.g:768:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalCoom.g:775:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:779:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalCoom.g:780:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalCoom.g:780:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalCoom.g:781:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalCoom.g:782:2: ( rule__State__NameAssignment_2 )
            // InternalCoom.g:782:3: rule__State__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalCoom.g:790:1: rule__State__Group__3 : rule__State__Group__3__Impl ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:794:1: ( rule__State__Group__3__Impl )
            // InternalCoom.g:795:2: rule__State__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalCoom.g:801:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:805:1: ( ( ( rule__State__Group_3__0 )? ) )
            // InternalCoom.g:806:1: ( ( rule__State__Group_3__0 )? )
            {
            // InternalCoom.g:806:1: ( ( rule__State__Group_3__0 )? )
            // InternalCoom.g:807:2: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalCoom.g:808:2: ( rule__State__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCoom.g:808:3: rule__State__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group_3__0"
    // InternalCoom.g:817:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:821:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalCoom.g:822:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0"


    // $ANTLR start "rule__State__Group_3__0__Impl"
    // InternalCoom.g:829:1: rule__State__Group_3__0__Impl : ( '{' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:833:1: ( ( '{' ) )
            // InternalCoom.g:834:1: ( '{' )
            {
            // InternalCoom.g:834:1: ( '{' )
            // InternalCoom.g:835:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0__Impl"


    // $ANTLR start "rule__State__Group_3__1"
    // InternalCoom.g:844:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:848:1: ( rule__State__Group_3__1__Impl )
            // InternalCoom.g:849:2: rule__State__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1"


    // $ANTLR start "rule__State__Group_3__1__Impl"
    // InternalCoom.g:855:1: rule__State__Group_3__1__Impl : ( '}' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:859:1: ( ( '}' ) )
            // InternalCoom.g:860:1: ( '}' )
            {
            // InternalCoom.g:860:1: ( '}' )
            // InternalCoom.g:861:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalCoom.g:871:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:875:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalCoom.g:876:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalCoom.g:883:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:887:1: ( ( 'Transition' ) )
            // InternalCoom.g:888:1: ( 'Transition' )
            {
            // InternalCoom.g:888:1: ( 'Transition' )
            // InternalCoom.g:889:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalCoom.g:898:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:902:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalCoom.g:903:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalCoom.g:910:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:914:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalCoom.g:915:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalCoom.g:915:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalCoom.g:916:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalCoom.g:917:2: ( rule__Transition__NameAssignment_1 )
            // InternalCoom.g:917:3: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalCoom.g:925:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:929:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalCoom.g:930:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalCoom.g:937:1: rule__Transition__Group__2__Impl : ( ':' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:941:1: ( ( ':' ) )
            // InternalCoom.g:942:1: ( ':' )
            {
            // InternalCoom.g:942:1: ( ':' )
            // InternalCoom.g:943:2: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalCoom.g:952:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:956:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalCoom.g:957:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalCoom.g:964:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__FromStateAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:968:1: ( ( ( rule__Transition__FromStateAssignment_3 ) ) )
            // InternalCoom.g:969:1: ( ( rule__Transition__FromStateAssignment_3 ) )
            {
            // InternalCoom.g:969:1: ( ( rule__Transition__FromStateAssignment_3 ) )
            // InternalCoom.g:970:2: ( rule__Transition__FromStateAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getFromStateAssignment_3()); 
            // InternalCoom.g:971:2: ( rule__Transition__FromStateAssignment_3 )
            // InternalCoom.g:971:3: rule__Transition__FromStateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__FromStateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getFromStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalCoom.g:979:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:983:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalCoom.g:984:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalCoom.g:991:1: rule__Transition__Group__4__Impl : ( '->' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:995:1: ( ( '->' ) )
            // InternalCoom.g:996:1: ( '->' )
            {
            // InternalCoom.g:996:1: ( '->' )
            // InternalCoom.g:997:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalCoom.g:1006:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1010:1: ( rule__Transition__Group__5__Impl )
            // InternalCoom.g:1011:2: rule__Transition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalCoom.g:1017:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__ToStateAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1021:1: ( ( ( rule__Transition__ToStateAssignment_5 ) ) )
            // InternalCoom.g:1022:1: ( ( rule__Transition__ToStateAssignment_5 ) )
            {
            // InternalCoom.g:1022:1: ( ( rule__Transition__ToStateAssignment_5 ) )
            // InternalCoom.g:1023:2: ( rule__Transition__ToStateAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getToStateAssignment_5()); 
            // InternalCoom.g:1024:2: ( rule__Transition__ToStateAssignment_5 )
            // InternalCoom.g:1024:3: rule__Transition__ToStateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ToStateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getToStateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalCoom.g:1033:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1037:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCoom.g:1038:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalCoom.g:1045:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1049:1: ( ( RULE_ID ) )
            // InternalCoom.g:1050:1: ( RULE_ID )
            {
            // InternalCoom.g:1050:1: ( RULE_ID )
            // InternalCoom.g:1051:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalCoom.g:1060:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1064:1: ( rule__FQN__Group__1__Impl )
            // InternalCoom.g:1065:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalCoom.g:1071:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1075:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCoom.g:1076:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCoom.g:1076:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCoom.g:1077:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCoom.g:1078:2: ( rule__FQN__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCoom.g:1078:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalCoom.g:1087:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1091:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCoom.g:1092:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalCoom.g:1099:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1103:1: ( ( '.' ) )
            // InternalCoom.g:1104:1: ( '.' )
            {
            // InternalCoom.g:1104:1: ( '.' )
            // InternalCoom.g:1105:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalCoom.g:1114:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1118:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCoom.g:1119:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalCoom.g:1125:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1129:1: ( ( RULE_ID ) )
            // InternalCoom.g:1130:1: ( RULE_ID )
            {
            // InternalCoom.g:1130:1: ( RULE_ID )
            // InternalCoom.g:1131:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__FullComponentOnOffManifest__NameAssignment_0_1"
    // InternalCoom.g:1141:1: rule__FullComponentOnOffManifest__NameAssignment_0_1 : ( ruleFQN ) ;
    public final void rule__FullComponentOnOffManifest__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1145:1: ( ( ruleFQN ) )
            // InternalCoom.g:1146:2: ( ruleFQN )
            {
            // InternalCoom.g:1146:2: ( ruleFQN )
            // InternalCoom.g:1147:3: ruleFQN
            {
             before(grammarAccess.getFullComponentOnOffManifestAccess().getNameFQNParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFullComponentOnOffManifestAccess().getNameFQNParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullComponentOnOffManifest__NameAssignment_0_1"


    // $ANTLR start "rule__FullComponentOnOffManifest__CoomAssignment_1"
    // InternalCoom.g:1156:1: rule__FullComponentOnOffManifest__CoomAssignment_1 : ( ruleComponentOnOffManifest ) ;
    public final void rule__FullComponentOnOffManifest__CoomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1160:1: ( ( ruleComponentOnOffManifest ) )
            // InternalCoom.g:1161:2: ( ruleComponentOnOffManifest )
            {
            // InternalCoom.g:1161:2: ( ruleComponentOnOffManifest )
            // InternalCoom.g:1162:3: ruleComponentOnOffManifest
            {
             before(grammarAccess.getFullComponentOnOffManifestAccess().getCoomComponentOnOffManifestParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentOnOffManifest();

            state._fsp--;

             after(grammarAccess.getFullComponentOnOffManifestAccess().getCoomComponentOnOffManifestParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullComponentOnOffManifest__CoomAssignment_1"


    // $ANTLR start "rule__ComponentOnOffManifest__NameAssignment_2"
    // InternalCoom.g:1171:1: rule__ComponentOnOffManifest__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__ComponentOnOffManifest__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1175:1: ( ( ruleFQN ) )
            // InternalCoom.g:1176:2: ( ruleFQN )
            {
            // InternalCoom.g:1176:2: ( ruleFQN )
            // InternalCoom.g:1177:3: ruleFQN
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentOnOffManifestAccess().getNameFQNParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__NameAssignment_2"


    // $ANTLR start "rule__ComponentOnOffManifest__VersionAssignment_4"
    // InternalCoom.g:1186:1: rule__ComponentOnOffManifest__VersionAssignment_4 : ( ruleVersion ) ;
    public final void rule__ComponentOnOffManifest__VersionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1190:1: ( ( ruleVersion ) )
            // InternalCoom.g:1191:2: ( ruleVersion )
            {
            // InternalCoom.g:1191:2: ( ruleVersion )
            // InternalCoom.g:1192:3: ruleVersion
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getVersionVersionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getComponentOnOffManifestAccess().getVersionVersionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__VersionAssignment_4"


    // $ANTLR start "rule__ComponentOnOffManifest__StatesAssignment_5_0"
    // InternalCoom.g:1201:1: rule__ComponentOnOffManifest__StatesAssignment_5_0 : ( ruleState ) ;
    public final void rule__ComponentOnOffManifest__StatesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1205:1: ( ( ruleState ) )
            // InternalCoom.g:1206:2: ( ruleState )
            {
            // InternalCoom.g:1206:2: ( ruleState )
            // InternalCoom.g:1207:3: ruleState
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getStatesStateParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getComponentOnOffManifestAccess().getStatesStateParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__StatesAssignment_5_0"


    // $ANTLR start "rule__ComponentOnOffManifest__TransitionsAssignment_5_1"
    // InternalCoom.g:1216:1: rule__ComponentOnOffManifest__TransitionsAssignment_5_1 : ( ruleTransition ) ;
    public final void rule__ComponentOnOffManifest__TransitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1220:1: ( ( ruleTransition ) )
            // InternalCoom.g:1221:2: ( ruleTransition )
            {
            // InternalCoom.g:1221:2: ( ruleTransition )
            // InternalCoom.g:1222:3: ruleTransition
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getComponentOnOffManifestAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentOnOffManifest__TransitionsAssignment_5_1"


    // $ANTLR start "rule__Version__MajorMalueAssignment_3"
    // InternalCoom.g:1231:1: rule__Version__MajorMalueAssignment_3 : ( RULE_INT ) ;
    public final void rule__Version__MajorMalueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1235:1: ( ( RULE_INT ) )
            // InternalCoom.g:1236:2: ( RULE_INT )
            {
            // InternalCoom.g:1236:2: ( RULE_INT )
            // InternalCoom.g:1237:3: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getMajorMalueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getMajorMalueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__MajorMalueAssignment_3"


    // $ANTLR start "rule__Version__MinorValueAssignment_5"
    // InternalCoom.g:1246:1: rule__Version__MinorValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__Version__MinorValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1250:1: ( ( RULE_INT ) )
            // InternalCoom.g:1251:2: ( RULE_INT )
            {
            // InternalCoom.g:1251:2: ( RULE_INT )
            // InternalCoom.g:1252:3: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getMinorValueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getMinorValueINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__MinorValueAssignment_5"


    // $ANTLR start "rule__State__InitialAssignment_0"
    // InternalCoom.g:1261:1: rule__State__InitialAssignment_0 : ( ( 'initial' ) ) ;
    public final void rule__State__InitialAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1265:1: ( ( ( 'initial' ) ) )
            // InternalCoom.g:1266:2: ( ( 'initial' ) )
            {
            // InternalCoom.g:1266:2: ( ( 'initial' ) )
            // InternalCoom.g:1267:3: ( 'initial' )
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 
            // InternalCoom.g:1268:3: ( 'initial' )
            // InternalCoom.g:1269:4: 'initial'
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 

            }

             after(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InitialAssignment_0"


    // $ANTLR start "rule__State__NameAssignment_2"
    // InternalCoom.g:1280:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1284:1: ( ( RULE_ID ) )
            // InternalCoom.g:1285:2: ( RULE_ID )
            {
            // InternalCoom.g:1285:2: ( RULE_ID )
            // InternalCoom.g:1286:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_2"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalCoom.g:1295:1: rule__Transition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1299:1: ( ( RULE_ID ) )
            // InternalCoom.g:1300:2: ( RULE_ID )
            {
            // InternalCoom.g:1300:2: ( RULE_ID )
            // InternalCoom.g:1301:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Transition__FromStateAssignment_3"
    // InternalCoom.g:1310:1: rule__Transition__FromStateAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__FromStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1314:1: ( ( ( RULE_ID ) ) )
            // InternalCoom.g:1315:2: ( ( RULE_ID ) )
            {
            // InternalCoom.g:1315:2: ( ( RULE_ID ) )
            // InternalCoom.g:1316:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getFromStateStateCrossReference_3_0()); 
            // InternalCoom.g:1317:3: ( RULE_ID )
            // InternalCoom.g:1318:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getFromStateStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getFromStateStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getFromStateStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__FromStateAssignment_3"


    // $ANTLR start "rule__Transition__ToStateAssignment_5"
    // InternalCoom.g:1329:1: rule__Transition__ToStateAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__ToStateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:1333:1: ( ( ( RULE_ID ) ) )
            // InternalCoom.g:1334:2: ( ( RULE_ID ) )
            {
            // InternalCoom.g:1334:2: ( ( RULE_ID ) )
            // InternalCoom.g:1335:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getToStateStateCrossReference_5_0()); 
            // InternalCoom.g:1336:3: ( RULE_ID )
            // InternalCoom.g:1337:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getToStateStateIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getToStateStateIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getToStateStateCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ToStateAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000008C4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000008C0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});

}