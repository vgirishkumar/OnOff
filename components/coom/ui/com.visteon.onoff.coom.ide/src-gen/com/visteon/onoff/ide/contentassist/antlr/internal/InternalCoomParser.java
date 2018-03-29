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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Component'", "'{'", "'}'", "'version'", "'major'", "'minor'", "'State'", "'Transition'", "':'", "'->'", "'initial'"
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
    public static final int RULE_ML_COMMENT=7;
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



    // $ANTLR start "entryRuleComponentOnOffManifest"
    // InternalCoom.g:53:1: entryRuleComponentOnOffManifest : ruleComponentOnOffManifest EOF ;
    public final void entryRuleComponentOnOffManifest() throws RecognitionException {
        try {
            // InternalCoom.g:54:1: ( ruleComponentOnOffManifest EOF )
            // InternalCoom.g:55:1: ruleComponentOnOffManifest EOF
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
    // InternalCoom.g:62:1: ruleComponentOnOffManifest : ( ( rule__ComponentOnOffManifest__Group__0 ) ) ;
    public final void ruleComponentOnOffManifest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:66:2: ( ( ( rule__ComponentOnOffManifest__Group__0 ) ) )
            // InternalCoom.g:67:2: ( ( rule__ComponentOnOffManifest__Group__0 ) )
            {
            // InternalCoom.g:67:2: ( ( rule__ComponentOnOffManifest__Group__0 ) )
            // InternalCoom.g:68:3: ( rule__ComponentOnOffManifest__Group__0 )
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getGroup()); 
            // InternalCoom.g:69:3: ( rule__ComponentOnOffManifest__Group__0 )
            // InternalCoom.g:69:4: rule__ComponentOnOffManifest__Group__0
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
    // InternalCoom.g:78:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalCoom.g:79:1: ( ruleVersion EOF )
            // InternalCoom.g:80:1: ruleVersion EOF
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
    // InternalCoom.g:87:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:91:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalCoom.g:92:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalCoom.g:92:2: ( ( rule__Version__Group__0 ) )
            // InternalCoom.g:93:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalCoom.g:94:3: ( rule__Version__Group__0 )
            // InternalCoom.g:94:4: rule__Version__Group__0
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
    // InternalCoom.g:103:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalCoom.g:104:1: ( ruleState EOF )
            // InternalCoom.g:105:1: ruleState EOF
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
    // InternalCoom.g:112:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:116:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalCoom.g:117:2: ( ( rule__State__Group__0 ) )
            {
            // InternalCoom.g:117:2: ( ( rule__State__Group__0 ) )
            // InternalCoom.g:118:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalCoom.g:119:3: ( rule__State__Group__0 )
            // InternalCoom.g:119:4: rule__State__Group__0
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
    // InternalCoom.g:128:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalCoom.g:129:1: ( ruleTransition EOF )
            // InternalCoom.g:130:1: ruleTransition EOF
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
    // InternalCoom.g:137:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:141:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalCoom.g:142:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalCoom.g:142:2: ( ( rule__Transition__Group__0 ) )
            // InternalCoom.g:143:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalCoom.g:144:3: ( rule__Transition__Group__0 )
            // InternalCoom.g:144:4: rule__Transition__Group__0
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


    // $ANTLR start "rule__ComponentOnOffManifest__Alternatives_4"
    // InternalCoom.g:152:1: rule__ComponentOnOffManifest__Alternatives_4 : ( ( ( rule__ComponentOnOffManifest__StatesAssignment_4_0 ) ) | ( ( rule__ComponentOnOffManifest__TransitionsAssignment_4_1 ) ) );
    public final void rule__ComponentOnOffManifest__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:156:1: ( ( ( rule__ComponentOnOffManifest__StatesAssignment_4_0 ) ) | ( ( rule__ComponentOnOffManifest__TransitionsAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17||LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCoom.g:157:2: ( ( rule__ComponentOnOffManifest__StatesAssignment_4_0 ) )
                    {
                    // InternalCoom.g:157:2: ( ( rule__ComponentOnOffManifest__StatesAssignment_4_0 ) )
                    // InternalCoom.g:158:3: ( rule__ComponentOnOffManifest__StatesAssignment_4_0 )
                    {
                     before(grammarAccess.getComponentOnOffManifestAccess().getStatesAssignment_4_0()); 
                    // InternalCoom.g:159:3: ( rule__ComponentOnOffManifest__StatesAssignment_4_0 )
                    // InternalCoom.g:159:4: rule__ComponentOnOffManifest__StatesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentOnOffManifest__StatesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentOnOffManifestAccess().getStatesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCoom.g:163:2: ( ( rule__ComponentOnOffManifest__TransitionsAssignment_4_1 ) )
                    {
                    // InternalCoom.g:163:2: ( ( rule__ComponentOnOffManifest__TransitionsAssignment_4_1 ) )
                    // InternalCoom.g:164:3: ( rule__ComponentOnOffManifest__TransitionsAssignment_4_1 )
                    {
                     before(grammarAccess.getComponentOnOffManifestAccess().getTransitionsAssignment_4_1()); 
                    // InternalCoom.g:165:3: ( rule__ComponentOnOffManifest__TransitionsAssignment_4_1 )
                    // InternalCoom.g:165:4: rule__ComponentOnOffManifest__TransitionsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentOnOffManifest__TransitionsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentOnOffManifestAccess().getTransitionsAssignment_4_1()); 

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
    // $ANTLR end "rule__ComponentOnOffManifest__Alternatives_4"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__0"
    // InternalCoom.g:173:1: rule__ComponentOnOffManifest__Group__0 : rule__ComponentOnOffManifest__Group__0__Impl rule__ComponentOnOffManifest__Group__1 ;
    public final void rule__ComponentOnOffManifest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:177:1: ( rule__ComponentOnOffManifest__Group__0__Impl rule__ComponentOnOffManifest__Group__1 )
            // InternalCoom.g:178:2: rule__ComponentOnOffManifest__Group__0__Impl rule__ComponentOnOffManifest__Group__1
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
    // InternalCoom.g:185:1: rule__ComponentOnOffManifest__Group__0__Impl : ( 'Component' ) ;
    public final void rule__ComponentOnOffManifest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:189:1: ( ( 'Component' ) )
            // InternalCoom.g:190:1: ( 'Component' )
            {
            // InternalCoom.g:190:1: ( 'Component' )
            // InternalCoom.g:191:2: 'Component'
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getComponentKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getComponentOnOffManifestAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__ComponentOnOffManifest__Group__0__Impl"


    // $ANTLR start "rule__ComponentOnOffManifest__Group__1"
    // InternalCoom.g:200:1: rule__ComponentOnOffManifest__Group__1 : rule__ComponentOnOffManifest__Group__1__Impl rule__ComponentOnOffManifest__Group__2 ;
    public final void rule__ComponentOnOffManifest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:204:1: ( rule__ComponentOnOffManifest__Group__1__Impl rule__ComponentOnOffManifest__Group__2 )
            // InternalCoom.g:205:2: rule__ComponentOnOffManifest__Group__1__Impl rule__ComponentOnOffManifest__Group__2
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
    // InternalCoom.g:212:1: rule__ComponentOnOffManifest__Group__1__Impl : ( ( rule__ComponentOnOffManifest__NameAssignment_1 ) ) ;
    public final void rule__ComponentOnOffManifest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:216:1: ( ( ( rule__ComponentOnOffManifest__NameAssignment_1 ) ) )
            // InternalCoom.g:217:1: ( ( rule__ComponentOnOffManifest__NameAssignment_1 ) )
            {
            // InternalCoom.g:217:1: ( ( rule__ComponentOnOffManifest__NameAssignment_1 ) )
            // InternalCoom.g:218:2: ( rule__ComponentOnOffManifest__NameAssignment_1 )
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getNameAssignment_1()); 
            // InternalCoom.g:219:2: ( rule__ComponentOnOffManifest__NameAssignment_1 )
            // InternalCoom.g:219:3: rule__ComponentOnOffManifest__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentOnOffManifestAccess().getNameAssignment_1()); 

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
    // InternalCoom.g:227:1: rule__ComponentOnOffManifest__Group__2 : rule__ComponentOnOffManifest__Group__2__Impl rule__ComponentOnOffManifest__Group__3 ;
    public final void rule__ComponentOnOffManifest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:231:1: ( rule__ComponentOnOffManifest__Group__2__Impl rule__ComponentOnOffManifest__Group__3 )
            // InternalCoom.g:232:2: rule__ComponentOnOffManifest__Group__2__Impl rule__ComponentOnOffManifest__Group__3
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
    // InternalCoom.g:239:1: rule__ComponentOnOffManifest__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentOnOffManifest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:243:1: ( ( '{' ) )
            // InternalCoom.g:244:1: ( '{' )
            {
            // InternalCoom.g:244:1: ( '{' )
            // InternalCoom.g:245:2: '{'
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentOnOffManifestAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalCoom.g:254:1: rule__ComponentOnOffManifest__Group__3 : rule__ComponentOnOffManifest__Group__3__Impl rule__ComponentOnOffManifest__Group__4 ;
    public final void rule__ComponentOnOffManifest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:258:1: ( rule__ComponentOnOffManifest__Group__3__Impl rule__ComponentOnOffManifest__Group__4 )
            // InternalCoom.g:259:2: rule__ComponentOnOffManifest__Group__3__Impl rule__ComponentOnOffManifest__Group__4
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
    // InternalCoom.g:266:1: rule__ComponentOnOffManifest__Group__3__Impl : ( ( rule__ComponentOnOffManifest__VersionAssignment_3 ) ) ;
    public final void rule__ComponentOnOffManifest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:270:1: ( ( ( rule__ComponentOnOffManifest__VersionAssignment_3 ) ) )
            // InternalCoom.g:271:1: ( ( rule__ComponentOnOffManifest__VersionAssignment_3 ) )
            {
            // InternalCoom.g:271:1: ( ( rule__ComponentOnOffManifest__VersionAssignment_3 ) )
            // InternalCoom.g:272:2: ( rule__ComponentOnOffManifest__VersionAssignment_3 )
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getVersionAssignment_3()); 
            // InternalCoom.g:273:2: ( rule__ComponentOnOffManifest__VersionAssignment_3 )
            // InternalCoom.g:273:3: rule__ComponentOnOffManifest__VersionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__VersionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentOnOffManifestAccess().getVersionAssignment_3()); 

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
    // InternalCoom.g:281:1: rule__ComponentOnOffManifest__Group__4 : rule__ComponentOnOffManifest__Group__4__Impl rule__ComponentOnOffManifest__Group__5 ;
    public final void rule__ComponentOnOffManifest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:285:1: ( rule__ComponentOnOffManifest__Group__4__Impl rule__ComponentOnOffManifest__Group__5 )
            // InternalCoom.g:286:2: rule__ComponentOnOffManifest__Group__4__Impl rule__ComponentOnOffManifest__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalCoom.g:293:1: rule__ComponentOnOffManifest__Group__4__Impl : ( ( rule__ComponentOnOffManifest__Alternatives_4 )* ) ;
    public final void rule__ComponentOnOffManifest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:297:1: ( ( ( rule__ComponentOnOffManifest__Alternatives_4 )* ) )
            // InternalCoom.g:298:1: ( ( rule__ComponentOnOffManifest__Alternatives_4 )* )
            {
            // InternalCoom.g:298:1: ( ( rule__ComponentOnOffManifest__Alternatives_4 )* )
            // InternalCoom.g:299:2: ( rule__ComponentOnOffManifest__Alternatives_4 )*
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getAlternatives_4()); 
            // InternalCoom.g:300:2: ( rule__ComponentOnOffManifest__Alternatives_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=18)||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCoom.g:300:3: rule__ComponentOnOffManifest__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ComponentOnOffManifest__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getComponentOnOffManifestAccess().getAlternatives_4()); 

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
    // InternalCoom.g:308:1: rule__ComponentOnOffManifest__Group__5 : rule__ComponentOnOffManifest__Group__5__Impl ;
    public final void rule__ComponentOnOffManifest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:312:1: ( rule__ComponentOnOffManifest__Group__5__Impl )
            // InternalCoom.g:313:2: rule__ComponentOnOffManifest__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentOnOffManifest__Group__5__Impl();

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
    // InternalCoom.g:319:1: rule__ComponentOnOffManifest__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentOnOffManifest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:323:1: ( ( '}' ) )
            // InternalCoom.g:324:1: ( '}' )
            {
            // InternalCoom.g:324:1: ( '}' )
            // InternalCoom.g:325:2: '}'
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentOnOffManifestAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Version__Group__0"
    // InternalCoom.g:335:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:339:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalCoom.g:340:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCoom.g:347:1: rule__Version__Group__0__Impl : ( 'version' ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:351:1: ( ( 'version' ) )
            // InternalCoom.g:352:1: ( 'version' )
            {
            // InternalCoom.g:352:1: ( 'version' )
            // InternalCoom.g:353:2: 'version'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalCoom.g:362:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:366:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalCoom.g:367:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCoom.g:374:1: rule__Version__Group__1__Impl : ( '{' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:378:1: ( ( '{' ) )
            // InternalCoom.g:379:1: ( '{' )
            {
            // InternalCoom.g:379:1: ( '{' )
            // InternalCoom.g:380:2: '{'
            {
             before(grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalCoom.g:389:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:393:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // InternalCoom.g:394:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalCoom.g:401:1: rule__Version__Group__2__Impl : ( 'major' ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:405:1: ( ( 'major' ) )
            // InternalCoom.g:406:1: ( 'major' )
            {
            // InternalCoom.g:406:1: ( 'major' )
            // InternalCoom.g:407:2: 'major'
            {
             before(grammarAccess.getVersionAccess().getMajorKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalCoom.g:416:1: rule__Version__Group__3 : rule__Version__Group__3__Impl rule__Version__Group__4 ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:420:1: ( rule__Version__Group__3__Impl rule__Version__Group__4 )
            // InternalCoom.g:421:2: rule__Version__Group__3__Impl rule__Version__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalCoom.g:428:1: rule__Version__Group__3__Impl : ( ( rule__Version__MajorMalueAssignment_3 ) ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:432:1: ( ( ( rule__Version__MajorMalueAssignment_3 ) ) )
            // InternalCoom.g:433:1: ( ( rule__Version__MajorMalueAssignment_3 ) )
            {
            // InternalCoom.g:433:1: ( ( rule__Version__MajorMalueAssignment_3 ) )
            // InternalCoom.g:434:2: ( rule__Version__MajorMalueAssignment_3 )
            {
             before(grammarAccess.getVersionAccess().getMajorMalueAssignment_3()); 
            // InternalCoom.g:435:2: ( rule__Version__MajorMalueAssignment_3 )
            // InternalCoom.g:435:3: rule__Version__MajorMalueAssignment_3
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
    // InternalCoom.g:443:1: rule__Version__Group__4 : rule__Version__Group__4__Impl rule__Version__Group__5 ;
    public final void rule__Version__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:447:1: ( rule__Version__Group__4__Impl rule__Version__Group__5 )
            // InternalCoom.g:448:2: rule__Version__Group__4__Impl rule__Version__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalCoom.g:455:1: rule__Version__Group__4__Impl : ( 'minor' ) ;
    public final void rule__Version__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:459:1: ( ( 'minor' ) )
            // InternalCoom.g:460:1: ( 'minor' )
            {
            // InternalCoom.g:460:1: ( 'minor' )
            // InternalCoom.g:461:2: 'minor'
            {
             before(grammarAccess.getVersionAccess().getMinorKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCoom.g:470:1: rule__Version__Group__5 : rule__Version__Group__5__Impl rule__Version__Group__6 ;
    public final void rule__Version__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:474:1: ( rule__Version__Group__5__Impl rule__Version__Group__6 )
            // InternalCoom.g:475:2: rule__Version__Group__5__Impl rule__Version__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalCoom.g:482:1: rule__Version__Group__5__Impl : ( ( rule__Version__MinorValueAssignment_5 ) ) ;
    public final void rule__Version__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:486:1: ( ( ( rule__Version__MinorValueAssignment_5 ) ) )
            // InternalCoom.g:487:1: ( ( rule__Version__MinorValueAssignment_5 ) )
            {
            // InternalCoom.g:487:1: ( ( rule__Version__MinorValueAssignment_5 ) )
            // InternalCoom.g:488:2: ( rule__Version__MinorValueAssignment_5 )
            {
             before(grammarAccess.getVersionAccess().getMinorValueAssignment_5()); 
            // InternalCoom.g:489:2: ( rule__Version__MinorValueAssignment_5 )
            // InternalCoom.g:489:3: rule__Version__MinorValueAssignment_5
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
    // InternalCoom.g:497:1: rule__Version__Group__6 : rule__Version__Group__6__Impl ;
    public final void rule__Version__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:501:1: ( rule__Version__Group__6__Impl )
            // InternalCoom.g:502:2: rule__Version__Group__6__Impl
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
    // InternalCoom.g:508:1: rule__Version__Group__6__Impl : ( '}' ) ;
    public final void rule__Version__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:512:1: ( ( '}' ) )
            // InternalCoom.g:513:1: ( '}' )
            {
            // InternalCoom.g:513:1: ( '}' )
            // InternalCoom.g:514:2: '}'
            {
             before(grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
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
    // InternalCoom.g:524:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:528:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalCoom.g:529:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCoom.g:536:1: rule__State__Group__0__Impl : ( ( rule__State__InitialAssignment_0 )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:540:1: ( ( ( rule__State__InitialAssignment_0 )? ) )
            // InternalCoom.g:541:1: ( ( rule__State__InitialAssignment_0 )? )
            {
            // InternalCoom.g:541:1: ( ( rule__State__InitialAssignment_0 )? )
            // InternalCoom.g:542:2: ( rule__State__InitialAssignment_0 )?
            {
             before(grammarAccess.getStateAccess().getInitialAssignment_0()); 
            // InternalCoom.g:543:2: ( rule__State__InitialAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCoom.g:543:3: rule__State__InitialAssignment_0
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
    // InternalCoom.g:551:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:555:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalCoom.g:556:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalCoom.g:563:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:567:1: ( ( 'State' ) )
            // InternalCoom.g:568:1: ( 'State' )
            {
            // InternalCoom.g:568:1: ( 'State' )
            // InternalCoom.g:569:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalCoom.g:578:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:582:1: ( rule__State__Group__2__Impl )
            // InternalCoom.g:583:2: rule__State__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__2__Impl();

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
    // InternalCoom.g:589:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:593:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalCoom.g:594:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalCoom.g:594:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalCoom.g:595:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalCoom.g:596:2: ( rule__State__NameAssignment_2 )
            // InternalCoom.g:596:3: rule__State__NameAssignment_2
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


    // $ANTLR start "rule__Transition__Group__0"
    // InternalCoom.g:605:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:609:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalCoom.g:610:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalCoom.g:617:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:621:1: ( ( 'Transition' ) )
            // InternalCoom.g:622:1: ( 'Transition' )
            {
            // InternalCoom.g:622:1: ( 'Transition' )
            // InternalCoom.g:623:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCoom.g:632:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:636:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalCoom.g:637:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalCoom.g:644:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:648:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalCoom.g:649:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalCoom.g:649:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalCoom.g:650:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalCoom.g:651:2: ( rule__Transition__NameAssignment_1 )
            // InternalCoom.g:651:3: rule__Transition__NameAssignment_1
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
    // InternalCoom.g:659:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:663:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalCoom.g:664:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalCoom.g:671:1: rule__Transition__Group__2__Impl : ( ':' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:675:1: ( ( ':' ) )
            // InternalCoom.g:676:1: ( ':' )
            {
            // InternalCoom.g:676:1: ( ':' )
            // InternalCoom.g:677:2: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCoom.g:686:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:690:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalCoom.g:691:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalCoom.g:698:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__FromStateAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:702:1: ( ( ( rule__Transition__FromStateAssignment_3 ) ) )
            // InternalCoom.g:703:1: ( ( rule__Transition__FromStateAssignment_3 ) )
            {
            // InternalCoom.g:703:1: ( ( rule__Transition__FromStateAssignment_3 ) )
            // InternalCoom.g:704:2: ( rule__Transition__FromStateAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getFromStateAssignment_3()); 
            // InternalCoom.g:705:2: ( rule__Transition__FromStateAssignment_3 )
            // InternalCoom.g:705:3: rule__Transition__FromStateAssignment_3
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
    // InternalCoom.g:713:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:717:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalCoom.g:718:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalCoom.g:725:1: rule__Transition__Group__4__Impl : ( '->' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:729:1: ( ( '->' ) )
            // InternalCoom.g:730:1: ( '->' )
            {
            // InternalCoom.g:730:1: ( '->' )
            // InternalCoom.g:731:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCoom.g:740:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:744:1: ( rule__Transition__Group__5__Impl )
            // InternalCoom.g:745:2: rule__Transition__Group__5__Impl
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
    // InternalCoom.g:751:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__ToStateAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:755:1: ( ( ( rule__Transition__ToStateAssignment_5 ) ) )
            // InternalCoom.g:756:1: ( ( rule__Transition__ToStateAssignment_5 ) )
            {
            // InternalCoom.g:756:1: ( ( rule__Transition__ToStateAssignment_5 ) )
            // InternalCoom.g:757:2: ( rule__Transition__ToStateAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getToStateAssignment_5()); 
            // InternalCoom.g:758:2: ( rule__Transition__ToStateAssignment_5 )
            // InternalCoom.g:758:3: rule__Transition__ToStateAssignment_5
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


    // $ANTLR start "rule__ComponentOnOffManifest__NameAssignment_1"
    // InternalCoom.g:767:1: rule__ComponentOnOffManifest__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentOnOffManifest__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:771:1: ( ( RULE_ID ) )
            // InternalCoom.g:772:2: ( RULE_ID )
            {
            // InternalCoom.g:772:2: ( RULE_ID )
            // InternalCoom.g:773:3: RULE_ID
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentOnOffManifestAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComponentOnOffManifest__NameAssignment_1"


    // $ANTLR start "rule__ComponentOnOffManifest__VersionAssignment_3"
    // InternalCoom.g:782:1: rule__ComponentOnOffManifest__VersionAssignment_3 : ( ruleVersion ) ;
    public final void rule__ComponentOnOffManifest__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:786:1: ( ( ruleVersion ) )
            // InternalCoom.g:787:2: ( ruleVersion )
            {
            // InternalCoom.g:787:2: ( ruleVersion )
            // InternalCoom.g:788:3: ruleVersion
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getVersionVersionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getComponentOnOffManifestAccess().getVersionVersionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ComponentOnOffManifest__VersionAssignment_3"


    // $ANTLR start "rule__ComponentOnOffManifest__StatesAssignment_4_0"
    // InternalCoom.g:797:1: rule__ComponentOnOffManifest__StatesAssignment_4_0 : ( ruleState ) ;
    public final void rule__ComponentOnOffManifest__StatesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:801:1: ( ( ruleState ) )
            // InternalCoom.g:802:2: ( ruleState )
            {
            // InternalCoom.g:802:2: ( ruleState )
            // InternalCoom.g:803:3: ruleState
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getStatesStateParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getComponentOnOffManifestAccess().getStatesStateParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__ComponentOnOffManifest__StatesAssignment_4_0"


    // $ANTLR start "rule__ComponentOnOffManifest__TransitionsAssignment_4_1"
    // InternalCoom.g:812:1: rule__ComponentOnOffManifest__TransitionsAssignment_4_1 : ( ruleTransition ) ;
    public final void rule__ComponentOnOffManifest__TransitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:816:1: ( ( ruleTransition ) )
            // InternalCoom.g:817:2: ( ruleTransition )
            {
            // InternalCoom.g:817:2: ( ruleTransition )
            // InternalCoom.g:818:3: ruleTransition
            {
             before(grammarAccess.getComponentOnOffManifestAccess().getTransitionsTransitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getComponentOnOffManifestAccess().getTransitionsTransitionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ComponentOnOffManifest__TransitionsAssignment_4_1"


    // $ANTLR start "rule__Version__MajorMalueAssignment_3"
    // InternalCoom.g:827:1: rule__Version__MajorMalueAssignment_3 : ( RULE_INT ) ;
    public final void rule__Version__MajorMalueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:831:1: ( ( RULE_INT ) )
            // InternalCoom.g:832:2: ( RULE_INT )
            {
            // InternalCoom.g:832:2: ( RULE_INT )
            // InternalCoom.g:833:3: RULE_INT
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
    // InternalCoom.g:842:1: rule__Version__MinorValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__Version__MinorValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:846:1: ( ( RULE_INT ) )
            // InternalCoom.g:847:2: ( RULE_INT )
            {
            // InternalCoom.g:847:2: ( RULE_INT )
            // InternalCoom.g:848:3: RULE_INT
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
    // InternalCoom.g:857:1: rule__State__InitialAssignment_0 : ( ( 'initial' ) ) ;
    public final void rule__State__InitialAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:861:1: ( ( ( 'initial' ) ) )
            // InternalCoom.g:862:2: ( ( 'initial' ) )
            {
            // InternalCoom.g:862:2: ( ( 'initial' ) )
            // InternalCoom.g:863:3: ( 'initial' )
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 
            // InternalCoom.g:864:3: ( 'initial' )
            // InternalCoom.g:865:4: 'initial'
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCoom.g:876:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:880:1: ( ( RULE_ID ) )
            // InternalCoom.g:881:2: ( RULE_ID )
            {
            // InternalCoom.g:881:2: ( RULE_ID )
            // InternalCoom.g:882:3: RULE_ID
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
    // InternalCoom.g:891:1: rule__Transition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:895:1: ( ( RULE_ID ) )
            // InternalCoom.g:896:2: ( RULE_ID )
            {
            // InternalCoom.g:896:2: ( RULE_ID )
            // InternalCoom.g:897:3: RULE_ID
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
    // InternalCoom.g:906:1: rule__Transition__FromStateAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__FromStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:910:1: ( ( ( RULE_ID ) ) )
            // InternalCoom.g:911:2: ( ( RULE_ID ) )
            {
            // InternalCoom.g:911:2: ( ( RULE_ID ) )
            // InternalCoom.g:912:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getFromStateStateCrossReference_3_0()); 
            // InternalCoom.g:913:3: ( RULE_ID )
            // InternalCoom.g:914:4: RULE_ID
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
    // InternalCoom.g:925:1: rule__Transition__ToStateAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__ToStateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCoom.g:929:1: ( ( ( RULE_ID ) ) )
            // InternalCoom.g:930:2: ( ( RULE_ID ) )
            {
            // InternalCoom.g:930:2: ( ( RULE_ID ) )
            // InternalCoom.g:931:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getToStateStateCrossReference_5_0()); 
            // InternalCoom.g:932:3: ( RULE_ID )
            // InternalCoom.g:933:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000262000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000260002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});

}