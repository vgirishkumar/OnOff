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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Component'", "'{'", "'}'", "'version'", "'major'", "'minor'", "'initial'", "'State'", "'Transition'", "':'", "'->'"
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

        public InternalCoomParser(TokenStream input, CoomGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentOnOffManifest";
       	}

       	@Override
       	protected CoomGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentOnOffManifest"
    // InternalCoom.g:64:1: entryRuleComponentOnOffManifest returns [EObject current=null] : iv_ruleComponentOnOffManifest= ruleComponentOnOffManifest EOF ;
    public final EObject entryRuleComponentOnOffManifest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentOnOffManifest = null;


        try {
            // InternalCoom.g:64:63: (iv_ruleComponentOnOffManifest= ruleComponentOnOffManifest EOF )
            // InternalCoom.g:65:2: iv_ruleComponentOnOffManifest= ruleComponentOnOffManifest EOF
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
    // InternalCoom.g:71:1: ruleComponentOnOffManifest returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_version_3_0= ruleVersion ) ) ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleComponentOnOffManifest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_version_3_0 = null;

        EObject lv_states_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalCoom.g:77:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_version_3_0= ruleVersion ) ) ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* otherlv_6= '}' ) )
            // InternalCoom.g:78:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_version_3_0= ruleVersion ) ) ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* otherlv_6= '}' )
            {
            // InternalCoom.g:78:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_version_3_0= ruleVersion ) ) ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* otherlv_6= '}' )
            // InternalCoom.g:79:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_version_3_0= ruleVersion ) ) ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentOnOffManifestAccess().getComponentKeyword_0());
            		
            // InternalCoom.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCoom.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCoom.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalCoom.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentOnOffManifestAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentOnOffManifestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentOnOffManifestAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCoom.g:105:3: ( (lv_version_3_0= ruleVersion ) )
            // InternalCoom.g:106:4: (lv_version_3_0= ruleVersion )
            {
            // InternalCoom.g:106:4: (lv_version_3_0= ruleVersion )
            // InternalCoom.g:107:5: lv_version_3_0= ruleVersion
            {

            					newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getVersionVersionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_version_3_0=ruleVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_3_0,
            						"com.visteon.onoff.Coom.Version");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCoom.g:124:3: ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleTransition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==19) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCoom.g:125:4: ( (lv_states_4_0= ruleState ) )
            	    {
            	    // InternalCoom.g:125:4: ( (lv_states_4_0= ruleState ) )
            	    // InternalCoom.g:126:5: (lv_states_4_0= ruleState )
            	    {
            	    // InternalCoom.g:126:5: (lv_states_4_0= ruleState )
            	    // InternalCoom.g:127:6: lv_states_4_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getStatesStateParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_states_4_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_4_0,
            	    							"com.visteon.onoff.Coom.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCoom.g:145:4: ( (lv_transitions_5_0= ruleTransition ) )
            	    {
            	    // InternalCoom.g:145:4: ( (lv_transitions_5_0= ruleTransition ) )
            	    // InternalCoom.g:146:5: (lv_transitions_5_0= ruleTransition )
            	    {
            	    // InternalCoom.g:146:5: (lv_transitions_5_0= ruleTransition )
            	    // InternalCoom.g:147:6: lv_transitions_5_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getComponentOnOffManifestAccess().getTransitionsTransitionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_transitions_5_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentOnOffManifestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_5_0,
            	    							"com.visteon.onoff.Coom.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentOnOffManifestAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalCoom.g:173:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalCoom.g:173:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalCoom.g:174:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalCoom.g:180:1: ruleVersion returns [EObject current=null] : (otherlv_0= 'version' otherlv_1= '{' otherlv_2= 'major' ( (lv_majorMalue_3_0= RULE_INT ) ) otherlv_4= 'minor' ( (lv_minorValue_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
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
            // InternalCoom.g:186:2: ( (otherlv_0= 'version' otherlv_1= '{' otherlv_2= 'major' ( (lv_majorMalue_3_0= RULE_INT ) ) otherlv_4= 'minor' ( (lv_minorValue_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalCoom.g:187:2: (otherlv_0= 'version' otherlv_1= '{' otherlv_2= 'major' ( (lv_majorMalue_3_0= RULE_INT ) ) otherlv_4= 'minor' ( (lv_minorValue_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalCoom.g:187:2: (otherlv_0= 'version' otherlv_1= '{' otherlv_2= 'major' ( (lv_majorMalue_3_0= RULE_INT ) ) otherlv_4= 'minor' ( (lv_minorValue_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalCoom.g:188:3: otherlv_0= 'version' otherlv_1= '{' otherlv_2= 'major' ( (lv_majorMalue_3_0= RULE_INT ) ) otherlv_4= 'minor' ( (lv_minorValue_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getVersionAccess().getMajorKeyword_2());
            		
            // InternalCoom.g:200:3: ( (lv_majorMalue_3_0= RULE_INT ) )
            // InternalCoom.g:201:4: (lv_majorMalue_3_0= RULE_INT )
            {
            // InternalCoom.g:201:4: (lv_majorMalue_3_0= RULE_INT )
            // InternalCoom.g:202:5: lv_majorMalue_3_0= RULE_INT
            {
            lv_majorMalue_3_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getVersionAccess().getMinorKeyword_4());
            		
            // InternalCoom.g:222:3: ( (lv_minorValue_5_0= RULE_INT ) )
            // InternalCoom.g:223:4: (lv_minorValue_5_0= RULE_INT )
            {
            // InternalCoom.g:223:4: (lv_minorValue_5_0= RULE_INT )
            // InternalCoom.g:224:5: lv_minorValue_5_0= RULE_INT
            {
            lv_minorValue_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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
    // InternalCoom.g:248:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalCoom.g:248:46: (iv_ruleState= ruleState EOF )
            // InternalCoom.g:249:2: iv_ruleState= ruleState EOF
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
    // InternalCoom.g:255:1: ruleState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalCoom.g:261:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalCoom.g:262:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalCoom.g:262:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalCoom.g:263:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalCoom.g:263:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCoom.g:264:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalCoom.g:264:4: (lv_initial_0_0= 'initial' )
                    // InternalCoom.g:265:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,17,FOLLOW_11); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getStateAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalCoom.g:281:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCoom.g:282:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCoom.g:282:4: (lv_name_2_0= RULE_ID )
            // InternalCoom.g:283:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalCoom.g:303:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalCoom.g:303:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalCoom.g:304:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalCoom.g:310:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ) ;
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
            // InternalCoom.g:316:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalCoom.g:317:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalCoom.g:317:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) )
            // InternalCoom.g:318:3: otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalCoom.g:322:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCoom.g:323:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCoom.g:323:4: (lv_name_1_0= RULE_ID )
            // InternalCoom.g:324:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getColonKeyword_2());
            		
            // InternalCoom.g:344:3: ( (otherlv_3= RULE_ID ) )
            // InternalCoom.g:345:4: (otherlv_3= RULE_ID )
            {
            // InternalCoom.g:345:4: (otherlv_3= RULE_ID )
            // InternalCoom.g:346:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getFromStateStateCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalCoom.g:361:3: ( (otherlv_5= RULE_ID ) )
            // InternalCoom.g:362:4: (otherlv_5= RULE_ID )
            {
            // InternalCoom.g:362:4: (otherlv_5= RULE_ID )
            // InternalCoom.g:363:5: otherlv_5= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000E2000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}