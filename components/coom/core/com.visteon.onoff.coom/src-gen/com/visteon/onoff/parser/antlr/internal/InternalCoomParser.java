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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCoomParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'Component'", "'{'", "'}'", "'version'", "'major'", "'minor'", "'initial'", "'State'", "'Transition'", "':'", "'->'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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




    // $ANTLR start "entryRuleFullComponentOnOffManifest"
    // InternalCoom.g:64:1: entryRuleFullComponentOnOffManifest returns [EObject current=null] : iv_ruleFullComponentOnOffManifest= ruleFullComponentOnOffManifest EOF ;
    public final EObject entryRuleFullComponentOnOffManifest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullComponentOnOffManifest = null;


        try {
            // InternalCoom.g:64:67: (iv_ruleFullComponentOnOffManifest= ruleFullComponentOnOffManifest EOF )
            // InternalCoom.g:65:2: iv_ruleFullComponentOnOffManifest= ruleFullComponentOnOffManifest EOF
            {
             newCompositeNode(grammarAccess.getFullComponentOnOffManifestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFullComponentOnOffManifest=ruleFullComponentOnOffManifest();

            state._fsp--;

             current =iv_ruleFullComponentOnOffManifest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullComponentOnOffManifest"


    // $ANTLR start "ruleFullComponentOnOffManifest"
    // InternalCoom.g:71:1: ruleFullComponentOnOffManifest returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )? ( (lv_coom_2_0= ruleComponentOnOffManifest ) )? ) ;
    public final EObject ruleFullComponentOnOffManifest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_coom_2_0 = null;



        	enterRule();

        try {
            // InternalCoom.g:77:2: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )? ( (lv_coom_2_0= ruleComponentOnOffManifest ) )? ) )
            // InternalCoom.g:78:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )? ( (lv_coom_2_0= ruleComponentOnOffManifest ) )? )
            {
            // InternalCoom.g:78:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )? ( (lv_coom_2_0= ruleComponentOnOffManifest ) )? )
            // InternalCoom.g:79:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )? ( (lv_coom_2_0= ruleComponentOnOffManifest ) )?
            {
            // InternalCoom.g:79:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCoom.g:80:4: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getFullComponentOnOffManifestAccess().getPackageKeyword_0_0());
                    			
                    // InternalCoom.g:84:4: ( (lv_name_1_0= ruleFQN ) )
                    // InternalCoom.g:85:5: (lv_name_1_0= ruleFQN )
                    {
                    // InternalCoom.g:85:5: (lv_name_1_0= ruleFQN )
                    // InternalCoom.g:86:6: lv_name_1_0= ruleFQN
                    {

                    						newCompositeNode(grammarAccess.getFullComponentOnOffManifestAccess().getNameFQNParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleFQN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFullComponentOnOffManifestRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"com.visteon.onoff.Coom.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCoom.g:104:3: ( (lv_coom_2_0= ruleComponentOnOffManifest ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCoom.g:105:4: (lv_coom_2_0= ruleComponentOnOffManifest )
                    {
                    // InternalCoom.g:105:4: (lv_coom_2_0= ruleComponentOnOffManifest )
                    // InternalCoom.g:106:5: lv_coom_2_0= ruleComponentOnOffManifest
                    {

                    					newCompositeNode(grammarAccess.getFullComponentOnOffManifestAccess().getCoomComponentOnOffManifestParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_coom_2_0=ruleComponentOnOffManifest();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFullComponentOnOffManifestRule());
                    					}
                    					set(
                    						current,
                    						"coom",
                    						lv_coom_2_0,
                    						"com.visteon.onoff.Coom.ComponentOnOffManifest");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullComponentOnOffManifest"


    // $ANTLR start "entryRuleComponentOnOffManifest"
    // InternalCoom.g:127:1: entryRuleComponentOnOffManifest returns [EObject current=null] : iv_ruleComponentOnOffManifest= ruleComponentOnOffManifest EOF ;
    public final EObject entryRuleComponentOnOffManifest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentOnOffManifest = null;


        try {
            // InternalCoom.g:127:63: (iv_ruleComponentOnOffManifest= ruleComponentOnOffManifest EOF )
            // InternalCoom.g:128:2: iv_ruleComponentOnOffManifest= ruleComponentOnOffManifest EOF
            {
             newCompositeNode(grammarAccess.getComponentOnOffManifestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentOnOffManifest=ruleComponentOnOffManifest();

            state._fsp--;

             current =iv_ruleComponentOnOffManifest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentOnOffManifest"


    // $ANTLR start "ruleComponentOnOffManifest"
    // InternalCoom.g:134:1: ruleComponentOnOffManifest returns [EObject current=null] : ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_version_4_0= ruleVersion ) ) ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleComponentOnOffManifest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_version_4_0 = null;

        EObject lv_states_5_0 = null;

        EObject lv_transitions_6_0 = null;



        	enterRule();

        try {
            // InternalCoom.g:140:2: ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_version_4_0= ruleVersion ) ) ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' ) )
            // InternalCoom.g:141:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_version_4_0= ruleVersion ) ) ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' )
            {
            // InternalCoom.g:141:2: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_version_4_0= ruleVersion ) ) ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' )
            // InternalCoom.g:142:3: () otherlv_1= 'Component' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_version_4_0= ruleVersion ) ) ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}'
            {
            // InternalCoom.g:142:3: ()
            // InternalCoom.g:143:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentOnOffManifestAccess().getComponentOnOffManifestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentOnOffManifestAccess().getComponentKeyword_1());
            		
            // InternalCoom.g:153:3: ( (lv_name_2_0= ruleFQN ) )
            // InternalCoom.g:154:4: (lv_name_2_0= ruleFQN )
            {
            // InternalCoom.g:154:4: (lv_name_2_0= ruleFQN )
            // InternalCoom.g:155:5: lv_name_2_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getNameFQNParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.visteon.onoff.Coom.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentOnOffManifestAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCoom.g:176:3: ( (lv_version_4_0= ruleVersion ) )
            // InternalCoom.g:177:4: (lv_version_4_0= ruleVersion )
            {
            // InternalCoom.g:177:4: (lv_version_4_0= ruleVersion )
            // InternalCoom.g:178:5: lv_version_4_0= ruleVersion
            {

            					newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getVersionVersionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_version_4_0=ruleVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_4_0,
            						"com.visteon.onoff.Coom.Version");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCoom.g:195:3: ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=19)) ) {
                    alt3=1;
                }
                else if ( (LA3_0==20) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCoom.g:196:4: ( (lv_states_5_0= ruleState ) )
            	    {
            	    // InternalCoom.g:196:4: ( (lv_states_5_0= ruleState ) )
            	    // InternalCoom.g:197:5: (lv_states_5_0= ruleState )
            	    {
            	    // InternalCoom.g:197:5: (lv_states_5_0= ruleState )
            	    // InternalCoom.g:198:6: lv_states_5_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getStatesStateParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_5_0,
            	    							"com.visteon.onoff.Coom.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCoom.g:216:4: ( (lv_transitions_6_0= ruleTransition ) )
            	    {
            	    // InternalCoom.g:216:4: ( (lv_transitions_6_0= ruleTransition ) )
            	    // InternalCoom.g:217:5: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // InternalCoom.g:217:5: (lv_transitions_6_0= ruleTransition )
            	    // InternalCoom.g:218:6: lv_transitions_6_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getTransitionsTransitionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_transitions_6_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_6_0,
            	    							"com.visteon.onoff.Coom.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentOnOffManifestAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentOnOffManifest"


    // $ANTLR start "entryRuleVersion"
    // InternalCoom.g:244:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalCoom.g:244:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalCoom.g:245:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalCoom.g:251:1: ruleVersion returns [EObject current=null] : (otherlv_0= 'version' otherlv_1= '{' otherlv_2= 'major' ( (lv_majorMalue_3_0= RULE_INT ) ) otherlv_4= 'minor' ( (lv_minorValue_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_majorMalue_3_0=null;
        Token otherlv_4=null;
        Token lv_minorValue_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalCoom.g:257:2: ( (otherlv_0= 'version' otherlv_1= '{' otherlv_2= 'major' ( (lv_majorMalue_3_0= RULE_INT ) ) otherlv_4= 'minor' ( (lv_minorValue_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalCoom.g:258:2: (otherlv_0= 'version' otherlv_1= '{' otherlv_2= 'major' ( (lv_majorMalue_3_0= RULE_INT ) ) otherlv_4= 'minor' ( (lv_minorValue_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalCoom.g:258:2: (otherlv_0= 'version' otherlv_1= '{' otherlv_2= 'major' ( (lv_majorMalue_3_0= RULE_INT ) ) otherlv_4= 'minor' ( (lv_minorValue_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalCoom.g:259:3: otherlv_0= 'version' otherlv_1= '{' otherlv_2= 'major' ( (lv_majorMalue_3_0= RULE_INT ) ) otherlv_4= 'minor' ( (lv_minorValue_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getVersionAccess().getMajorKeyword_2());
            		
            // InternalCoom.g:271:3: ( (lv_majorMalue_3_0= RULE_INT ) )
            // InternalCoom.g:272:4: (lv_majorMalue_3_0= RULE_INT )
            {
            // InternalCoom.g:272:4: (lv_majorMalue_3_0= RULE_INT )
            // InternalCoom.g:273:5: lv_majorMalue_3_0= RULE_INT
            {
            lv_majorMalue_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_majorMalue_3_0, grammarAccess.getVersionAccess().getMajorMalueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"majorMalue",
            						lv_majorMalue_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getVersionAccess().getMinorKeyword_4());
            		
            // InternalCoom.g:293:3: ( (lv_minorValue_5_0= RULE_INT ) )
            // InternalCoom.g:294:4: (lv_minorValue_5_0= RULE_INT )
            {
            // InternalCoom.g:294:4: (lv_minorValue_5_0= RULE_INT )
            // InternalCoom.g:295:5: lv_minorValue_5_0= RULE_INT
            {
            lv_minorValue_5_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_minorValue_5_0, grammarAccess.getVersionAccess().getMinorValueINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minorValue",
            						lv_minorValue_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleState"
    // InternalCoom.g:319:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalCoom.g:319:46: (iv_ruleState= ruleState EOF )
            // InternalCoom.g:320:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalCoom.g:326:1: ruleState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' otherlv_4= '}' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCoom.g:332:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' otherlv_4= '}' )? ) )
            // InternalCoom.g:333:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' otherlv_4= '}' )? )
            {
            // InternalCoom.g:333:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' otherlv_4= '}' )? )
            // InternalCoom.g:334:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' otherlv_4= '}' )?
            {
            // InternalCoom.g:334:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCoom.g:335:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalCoom.g:335:4: (lv_initial_0_0= 'initial' )
                    // InternalCoom.g:336:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getStateAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalCoom.g:352:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCoom.g:353:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCoom.g:353:4: (lv_name_2_0= RULE_ID )
            // InternalCoom.g:354:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCoom.g:370:3: (otherlv_3= '{' otherlv_4= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCoom.g:371:4: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalCoom.g:384:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalCoom.g:384:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalCoom.g:385:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalCoom.g:391:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCoom.g:397:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalCoom.g:398:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalCoom.g:398:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) )
            // InternalCoom.g:399:3: otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalCoom.g:403:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCoom.g:404:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCoom.g:404:4: (lv_name_1_0= RULE_ID )
            // InternalCoom.g:405:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getColonKeyword_2());
            		
            // InternalCoom.g:425:3: ( (otherlv_3= RULE_ID ) )
            // InternalCoom.g:426:4: (otherlv_3= RULE_ID )
            {
            // InternalCoom.g:426:4: (otherlv_3= RULE_ID )
            // InternalCoom.g:427:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getFromStateStateCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalCoom.g:442:3: ( (otherlv_5= RULE_ID ) )
            // InternalCoom.g:443:4: (otherlv_5= RULE_ID )
            {
            // InternalCoom.g:443:4: (otherlv_5= RULE_ID )
            // InternalCoom.g:444:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getToStateStateCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleFQN"
    // InternalCoom.g:459:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCoom.g:459:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCoom.g:460:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalCoom.g:466:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCoom.g:472:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCoom.g:473:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCoom.g:473:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCoom.g:474:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalCoom.g:481:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCoom.g:482:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001C4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});

}