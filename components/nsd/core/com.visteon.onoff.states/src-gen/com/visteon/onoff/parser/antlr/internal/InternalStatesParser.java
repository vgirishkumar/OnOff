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
import com.visteon.onoff.services.StatesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NodeStateDiagram'", "'{'", "'globalEdgeweight'", "'globalTransitionTimeout'", "'}'", "'initial'", "'State'", "'essential'", "'Transition'", "':'", "'->'", "'edgeweight'", "'timeout'", "'Client'", "'coom'", "'clientTransitionTimeout'", "'max-retries'", "'depends on states'", "','", "'depends on transitions'", "'depends on features'", "'for'", "'set system-states'", "'Feature'", "'states'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStatesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStatesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStatesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStates.g"; }



     	private StatesGrammarAccess grammarAccess;

        public InternalStatesParser(TokenStream input, StatesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NodeStateConfiguration";
       	}

       	@Override
       	protected StatesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNodeStateConfiguration"
    // InternalStates.g:64:1: entryRuleNodeStateConfiguration returns [EObject current=null] : iv_ruleNodeStateConfiguration= ruleNodeStateConfiguration EOF ;
    public final EObject entryRuleNodeStateConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStateConfiguration = null;


        try {
            // InternalStates.g:64:63: (iv_ruleNodeStateConfiguration= ruleNodeStateConfiguration EOF )
            // InternalStates.g:65:2: iv_ruleNodeStateConfiguration= ruleNodeStateConfiguration EOF
            {
             newCompositeNode(grammarAccess.getNodeStateConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeStateConfiguration=ruleNodeStateConfiguration();

            state._fsp--;

             current =iv_ruleNodeStateConfiguration; 
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
    // $ANTLR end "entryRuleNodeStateConfiguration"


    // $ANTLR start "ruleNodeStateConfiguration"
    // InternalStates.g:71:1: ruleNodeStateConfiguration returns [EObject current=null] : ( ( (lv_nsd_0_0= ruleNodeStateDiagram ) ) ( (lv_clientConfig_1_0= ruleClientConfiguration ) )* ) ;
    public final EObject ruleNodeStateConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_nsd_0_0 = null;

        EObject lv_clientConfig_1_0 = null;



        	enterRule();

        try {
            // InternalStates.g:77:2: ( ( ( (lv_nsd_0_0= ruleNodeStateDiagram ) ) ( (lv_clientConfig_1_0= ruleClientConfiguration ) )* ) )
            // InternalStates.g:78:2: ( ( (lv_nsd_0_0= ruleNodeStateDiagram ) ) ( (lv_clientConfig_1_0= ruleClientConfiguration ) )* )
            {
            // InternalStates.g:78:2: ( ( (lv_nsd_0_0= ruleNodeStateDiagram ) ) ( (lv_clientConfig_1_0= ruleClientConfiguration ) )* )
            // InternalStates.g:79:3: ( (lv_nsd_0_0= ruleNodeStateDiagram ) ) ( (lv_clientConfig_1_0= ruleClientConfiguration ) )*
            {
            // InternalStates.g:79:3: ( (lv_nsd_0_0= ruleNodeStateDiagram ) )
            // InternalStates.g:80:4: (lv_nsd_0_0= ruleNodeStateDiagram )
            {
            // InternalStates.g:80:4: (lv_nsd_0_0= ruleNodeStateDiagram )
            // InternalStates.g:81:5: lv_nsd_0_0= ruleNodeStateDiagram
            {

            					newCompositeNode(grammarAccess.getNodeStateConfigurationAccess().getNsdNodeStateDiagramParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_nsd_0_0=ruleNodeStateDiagram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeStateConfigurationRule());
            					}
            					set(
            						current,
            						"nsd",
            						lv_nsd_0_0,
            						"com.visteon.onoff.States.NodeStateDiagram");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:98:3: ( (lv_clientConfig_1_0= ruleClientConfiguration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStates.g:99:4: (lv_clientConfig_1_0= ruleClientConfiguration )
            	    {
            	    // InternalStates.g:99:4: (lv_clientConfig_1_0= ruleClientConfiguration )
            	    // InternalStates.g:100:5: lv_clientConfig_1_0= ruleClientConfiguration
            	    {

            	    					newCompositeNode(grammarAccess.getNodeStateConfigurationAccess().getClientConfigClientConfigurationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_clientConfig_1_0=ruleClientConfiguration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeStateConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clientConfig",
            	    						lv_clientConfig_1_0,
            	    						"com.visteon.onoff.States.ClientConfiguration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleNodeStateConfiguration"


    // $ANTLR start "entryRuleNodeStateDiagram"
    // InternalStates.g:121:1: entryRuleNodeStateDiagram returns [EObject current=null] : iv_ruleNodeStateDiagram= ruleNodeStateDiagram EOF ;
    public final EObject entryRuleNodeStateDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStateDiagram = null;


        try {
            // InternalStates.g:121:57: (iv_ruleNodeStateDiagram= ruleNodeStateDiagram EOF )
            // InternalStates.g:122:2: iv_ruleNodeStateDiagram= ruleNodeStateDiagram EOF
            {
             newCompositeNode(grammarAccess.getNodeStateDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeStateDiagram=ruleNodeStateDiagram();

            state._fsp--;

             current =iv_ruleNodeStateDiagram; 
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
    // $ANTLR end "entryRuleNodeStateDiagram"


    // $ANTLR start "ruleNodeStateDiagram"
    // InternalStates.g:128:1: ruleNodeStateDiagram returns [EObject current=null] : ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_states_7_0= ruleNodeState ) ) | ( (lv_transitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleNodeStateDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_gEdgeWeight_4_0=null;
        Token otherlv_5=null;
        Token lv_gTransitionTimeoutInMilliseconds_6_0=null;
        Token otherlv_9=null;
        EObject lv_states_7_0 = null;

        EObject lv_transitions_8_0 = null;



        	enterRule();

        try {
            // InternalStates.g:134:2: ( ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_states_7_0= ruleNodeState ) ) | ( (lv_transitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' ) )
            // InternalStates.g:135:2: ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_states_7_0= ruleNodeState ) ) | ( (lv_transitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' )
            {
            // InternalStates.g:135:2: ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_states_7_0= ruleNodeState ) ) | ( (lv_transitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' )
            // InternalStates.g:136:3: () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_states_7_0= ruleNodeState ) ) | ( (lv_transitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}'
            {
            // InternalStates.g:136:3: ()
            // InternalStates.g:137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeStateDiagramAccess().getNodeStateDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeStateDiagramAccess().getNodeStateDiagramKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeStateDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStates.g:151:3: (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalStates.g:152:4: otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getNodeStateDiagramAccess().getGlobalEdgeweightKeyword_3_0());
                    			
                    // InternalStates.g:156:4: ( (lv_gEdgeWeight_4_0= RULE_INT ) )
                    // InternalStates.g:157:5: (lv_gEdgeWeight_4_0= RULE_INT )
                    {
                    // InternalStates.g:157:5: (lv_gEdgeWeight_4_0= RULE_INT )
                    // InternalStates.g:158:6: lv_gEdgeWeight_4_0= RULE_INT
                    {
                    lv_gEdgeWeight_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                    						newLeafNode(lv_gEdgeWeight_4_0, grammarAccess.getNodeStateDiagramAccess().getGEdgeWeightINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeStateDiagramRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"gEdgeWeight",
                    							lv_gEdgeWeight_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStates.g:175:3: (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStates.g:176:4: otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeStateDiagramAccess().getGlobalTransitionTimeoutKeyword_4_0());
                    			
                    // InternalStates.g:180:4: ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) )
                    // InternalStates.g:181:5: (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT )
                    {
                    // InternalStates.g:181:5: (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT )
                    // InternalStates.g:182:6: lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT
                    {
                    lv_gTransitionTimeoutInMilliseconds_6_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    						newLeafNode(lv_gTransitionTimeoutInMilliseconds_6_0, grammarAccess.getNodeStateDiagramAccess().getGTransitionTimeoutInMillisecondsINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeStateDiagramRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"gTransitionTimeoutInMilliseconds",
                    							lv_gTransitionTimeoutInMilliseconds_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStates.g:199:3: ( ( (lv_states_7_0= ruleNodeState ) ) | ( (lv_transitions_8_0= ruleNodeTransition ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=17)) ) {
                    alt4=1;
                }
                else if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStates.g:200:4: ( (lv_states_7_0= ruleNodeState ) )
            	    {
            	    // InternalStates.g:200:4: ( (lv_states_7_0= ruleNodeState ) )
            	    // InternalStates.g:201:5: (lv_states_7_0= ruleNodeState )
            	    {
            	    // InternalStates.g:201:5: (lv_states_7_0= ruleNodeState )
            	    // InternalStates.g:202:6: lv_states_7_0= ruleNodeState
            	    {

            	    						newCompositeNode(grammarAccess.getNodeStateDiagramAccess().getStatesNodeStateParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_states_7_0=ruleNodeState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNodeStateDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_7_0,
            	    							"com.visteon.onoff.States.NodeState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStates.g:220:4: ( (lv_transitions_8_0= ruleNodeTransition ) )
            	    {
            	    // InternalStates.g:220:4: ( (lv_transitions_8_0= ruleNodeTransition ) )
            	    // InternalStates.g:221:5: (lv_transitions_8_0= ruleNodeTransition )
            	    {
            	    // InternalStates.g:221:5: (lv_transitions_8_0= ruleNodeTransition )
            	    // InternalStates.g:222:6: lv_transitions_8_0= ruleNodeTransition
            	    {

            	    						newCompositeNode(grammarAccess.getNodeStateDiagramAccess().getTransitionsNodeTransitionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_transitions_8_0=ruleNodeTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNodeStateDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_8_0,
            	    							"com.visteon.onoff.States.NodeTransition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNodeStateDiagramAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleNodeStateDiagram"


    // $ANTLR start "entryRuleNodeState"
    // InternalStates.g:248:1: entryRuleNodeState returns [EObject current=null] : iv_ruleNodeState= ruleNodeState EOF ;
    public final EObject entryRuleNodeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeState = null;


        try {
            // InternalStates.g:248:50: (iv_ruleNodeState= ruleNodeState EOF )
            // InternalStates.g:249:2: iv_ruleNodeState= ruleNodeState EOF
            {
             newCompositeNode(grammarAccess.getNodeStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeState=ruleNodeState();

            state._fsp--;

             current =iv_ruleNodeState; 
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
    // $ANTLR end "entryRuleNodeState"


    // $ANTLR start "ruleNodeState"
    // InternalStates.g:255:1: ruleNodeState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleNodeState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalStates.g:261:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalStates.g:262:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalStates.g:262:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalStates.g:263:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalStates.g:263:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStates.g:264:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalStates.g:264:4: (lv_initial_0_0= 'initial' )
                    // InternalStates.g:265:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getNodeStateAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeStateAccess().getStateKeyword_1());
            		
            // InternalStates.g:281:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalStates.g:282:4: (lv_name_2_0= RULE_ID )
            {
            // InternalStates.g:282:4: (lv_name_2_0= RULE_ID )
            // InternalStates.g:283:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getNodeStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeStateRule());
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
    // $ANTLR end "ruleNodeState"


    // $ANTLR start "entryRuleNodeTransition"
    // InternalStates.g:303:1: entryRuleNodeTransition returns [EObject current=null] : iv_ruleNodeTransition= ruleNodeTransition EOF ;
    public final EObject entryRuleNodeTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTransition = null;


        try {
            // InternalStates.g:303:55: (iv_ruleNodeTransition= ruleNodeTransition EOF )
            // InternalStates.g:304:2: iv_ruleNodeTransition= ruleNodeTransition EOF
            {
             newCompositeNode(grammarAccess.getNodeTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeTransition=ruleNodeTransition();

            state._fsp--;

             current =iv_ruleNodeTransition; 
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
    // $ANTLR end "entryRuleNodeTransition"


    // $ANTLR start "ruleNodeTransition"
    // InternalStates.g:310:1: ruleNodeTransition returns [EObject current=null] : ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? ) ;
    public final EObject ruleNodeTransition() throws RecognitionException {
        EObject current = null;

        Token lv_essential_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_edgeweight_9_0=null;
        Token otherlv_10=null;
        Token lv_timeoutInMilliseconds_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalStates.g:316:2: ( ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? ) )
            // InternalStates.g:317:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? )
            {
            // InternalStates.g:317:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? )
            // InternalStates.g:318:3: ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )?
            {
            // InternalStates.g:318:3: ( (lv_essential_0_0= 'essential' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStates.g:319:4: (lv_essential_0_0= 'essential' )
                    {
                    // InternalStates.g:319:4: (lv_essential_0_0= 'essential' )
                    // InternalStates.g:320:5: lv_essential_0_0= 'essential'
                    {
                    lv_essential_0_0=(Token)match(input,18,FOLLOW_11); 

                    					newLeafNode(lv_essential_0_0, grammarAccess.getNodeTransitionAccess().getEssentialEssentialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeTransitionRule());
                    					}
                    					setWithLastConsumed(current, "essential", true, "essential");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeTransitionAccess().getTransitionKeyword_1());
            		
            // InternalStates.g:336:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalStates.g:337:4: (lv_name_2_0= RULE_ID )
            {
            // InternalStates.g:337:4: (lv_name_2_0= RULE_ID )
            // InternalStates.g:338:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getNodeTransitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeTransitionAccess().getColonKeyword_3());
            		
            // InternalStates.g:358:3: ( (otherlv_4= RULE_ID ) )
            // InternalStates.g:359:4: (otherlv_4= RULE_ID )
            {
            // InternalStates.g:359:4: (otherlv_4= RULE_ID )
            // InternalStates.g:360:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTransitionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_4, grammarAccess.getNodeTransitionAccess().getFromStateNodeStateCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getNodeTransitionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalStates.g:375:3: ( (otherlv_6= RULE_ID ) )
            // InternalStates.g:376:4: (otherlv_6= RULE_ID )
            {
            // InternalStates.g:376:4: (otherlv_6= RULE_ID )
            // InternalStates.g:377:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTransitionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_6, grammarAccess.getNodeTransitionAccess().getToStateNodeStateCrossReference_6_0());
            				

            }


            }

            // InternalStates.g:388:3: (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStates.g:389:4: otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getNodeTransitionAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalStates.g:393:4: (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==22) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalStates.g:394:5: otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) )
                            {
                            otherlv_8=(Token)match(input,22,FOLLOW_6); 

                            					newLeafNode(otherlv_8, grammarAccess.getNodeTransitionAccess().getEdgeweightKeyword_7_1_0());
                            				
                            // InternalStates.g:398:5: ( (lv_edgeweight_9_0= RULE_INT ) )
                            // InternalStates.g:399:6: (lv_edgeweight_9_0= RULE_INT )
                            {
                            // InternalStates.g:399:6: (lv_edgeweight_9_0= RULE_INT )
                            // InternalStates.g:400:7: lv_edgeweight_9_0= RULE_INT
                            {
                            lv_edgeweight_9_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                            							newLeafNode(lv_edgeweight_9_0, grammarAccess.getNodeTransitionAccess().getEdgeweightINTTerminalRuleCall_7_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeTransitionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"edgeweight",
                            								lv_edgeweight_9_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalStates.g:417:4: (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==23) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalStates.g:418:5: otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) )
                            {
                            otherlv_10=(Token)match(input,23,FOLLOW_6); 

                            					newLeafNode(otherlv_10, grammarAccess.getNodeTransitionAccess().getTimeoutKeyword_7_2_0());
                            				
                            // InternalStates.g:422:5: ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) )
                            // InternalStates.g:423:6: (lv_timeoutInMilliseconds_11_0= RULE_INT )
                            {
                            // InternalStates.g:423:6: (lv_timeoutInMilliseconds_11_0= RULE_INT )
                            // InternalStates.g:424:7: lv_timeoutInMilliseconds_11_0= RULE_INT
                            {
                            lv_timeoutInMilliseconds_11_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                            							newLeafNode(lv_timeoutInMilliseconds_11_0, grammarAccess.getNodeTransitionAccess().getTimeoutInMillisecondsINTTerminalRuleCall_7_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeTransitionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"timeoutInMilliseconds",
                            								lv_timeoutInMilliseconds_11_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getNodeTransitionAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleNodeTransition"


    // $ANTLR start "entryRuleClientConfiguration"
    // InternalStates.g:450:1: entryRuleClientConfiguration returns [EObject current=null] : iv_ruleClientConfiguration= ruleClientConfiguration EOF ;
    public final EObject entryRuleClientConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClientConfiguration = null;


        try {
            // InternalStates.g:450:60: (iv_ruleClientConfiguration= ruleClientConfiguration EOF )
            // InternalStates.g:451:2: iv_ruleClientConfiguration= ruleClientConfiguration EOF
            {
             newCompositeNode(grammarAccess.getClientConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClientConfiguration=ruleClientConfiguration();

            state._fsp--;

             current =iv_ruleClientConfiguration; 
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
    // $ANTLR end "entryRuleClientConfiguration"


    // $ANTLR start "ruleClientConfiguration"
    // InternalStates.g:457:1: ruleClientConfiguration returns [EObject current=null] : (otherlv_0= 'Client' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_transitions_7_0= ruleComponentTransition ) ) | ( (lv_states_8_0= ruleComponentState ) ) | ( (lv_features_9_0= ruleComponentFeature ) ) | ( (lv_nodeStateAssociations_10_0= ruleNodeStateAssociation ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleClientConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_transTimeoutInMilliseconds_6_0=null;
        Token otherlv_11=null;
        EObject lv_transitions_7_0 = null;

        EObject lv_states_8_0 = null;

        EObject lv_features_9_0 = null;

        EObject lv_nodeStateAssociations_10_0 = null;



        	enterRule();

        try {
            // InternalStates.g:463:2: ( (otherlv_0= 'Client' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_transitions_7_0= ruleComponentTransition ) ) | ( (lv_states_8_0= ruleComponentState ) ) | ( (lv_features_9_0= ruleComponentFeature ) ) | ( (lv_nodeStateAssociations_10_0= ruleNodeStateAssociation ) ) )* otherlv_11= '}' ) )
            // InternalStates.g:464:2: (otherlv_0= 'Client' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_transitions_7_0= ruleComponentTransition ) ) | ( (lv_states_8_0= ruleComponentState ) ) | ( (lv_features_9_0= ruleComponentFeature ) ) | ( (lv_nodeStateAssociations_10_0= ruleNodeStateAssociation ) ) )* otherlv_11= '}' )
            {
            // InternalStates.g:464:2: (otherlv_0= 'Client' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_transitions_7_0= ruleComponentTransition ) ) | ( (lv_states_8_0= ruleComponentState ) ) | ( (lv_features_9_0= ruleComponentFeature ) ) | ( (lv_nodeStateAssociations_10_0= ruleNodeStateAssociation ) ) )* otherlv_11= '}' )
            // InternalStates.g:465:3: otherlv_0= 'Client' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_transitions_7_0= ruleComponentTransition ) ) | ( (lv_states_8_0= ruleComponentState ) ) | ( (lv_features_9_0= ruleComponentFeature ) ) | ( (lv_nodeStateAssociations_10_0= ruleNodeStateAssociation ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getClientConfigurationAccess().getClientKeyword_0());
            		
            // InternalStates.g:469:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStates.g:470:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStates.g:470:4: (lv_name_1_0= RULE_ID )
            // InternalStates.g:471:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClientConfigurationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClientConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getClientConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getClientConfigurationAccess().getCoomKeyword_3());
            		
            // InternalStates.g:495:3: ( (otherlv_4= RULE_ID ) )
            // InternalStates.g:496:4: (otherlv_4= RULE_ID )
            {
            // InternalStates.g:496:4: (otherlv_4= RULE_ID )
            // InternalStates.g:497:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClientConfigurationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_4, grammarAccess.getClientConfigurationAccess().getCoomRefComponentOnOffManifestCrossReference_4_0());
            				

            }


            }

            // InternalStates.g:508:3: (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStates.g:509:4: otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getClientConfigurationAccess().getClientTransitionTimeoutKeyword_5_0());
                    			
                    // InternalStates.g:513:4: ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) )
                    // InternalStates.g:514:5: (lv_transTimeoutInMilliseconds_6_0= RULE_INT )
                    {
                    // InternalStates.g:514:5: (lv_transTimeoutInMilliseconds_6_0= RULE_INT )
                    // InternalStates.g:515:6: lv_transTimeoutInMilliseconds_6_0= RULE_INT
                    {
                    lv_transTimeoutInMilliseconds_6_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    						newLeafNode(lv_transTimeoutInMilliseconds_6_0, grammarAccess.getClientConfigurationAccess().getTransTimeoutInMillisecondsINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClientConfigurationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"transTimeoutInMilliseconds",
                    							lv_transTimeoutInMilliseconds_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStates.g:532:3: ( ( (lv_transitions_7_0= ruleComponentTransition ) ) | ( (lv_states_8_0= ruleComponentState ) ) | ( (lv_features_9_0= ruleComponentFeature ) ) | ( (lv_nodeStateAssociations_10_0= ruleNodeStateAssociation ) ) )*
            loop11:
            do {
                int alt11=5;
                switch ( input.LA(1) ) {
                case 18:
                case 19:
                    {
                    alt11=1;
                    }
                    break;
                case 17:
                    {
                    alt11=2;
                    }
                    break;
                case 34:
                    {
                    alt11=3;
                    }
                    break;
                case 32:
                    {
                    alt11=4;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalStates.g:533:4: ( (lv_transitions_7_0= ruleComponentTransition ) )
            	    {
            	    // InternalStates.g:533:4: ( (lv_transitions_7_0= ruleComponentTransition ) )
            	    // InternalStates.g:534:5: (lv_transitions_7_0= ruleComponentTransition )
            	    {
            	    // InternalStates.g:534:5: (lv_transitions_7_0= ruleComponentTransition )
            	    // InternalStates.g:535:6: lv_transitions_7_0= ruleComponentTransition
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getTransitionsComponentTransitionParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_transitions_7_0=ruleComponentTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_7_0,
            	    							"com.visteon.onoff.States.ComponentTransition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStates.g:553:4: ( (lv_states_8_0= ruleComponentState ) )
            	    {
            	    // InternalStates.g:553:4: ( (lv_states_8_0= ruleComponentState ) )
            	    // InternalStates.g:554:5: (lv_states_8_0= ruleComponentState )
            	    {
            	    // InternalStates.g:554:5: (lv_states_8_0= ruleComponentState )
            	    // InternalStates.g:555:6: lv_states_8_0= ruleComponentState
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getStatesComponentStateParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_states_8_0=ruleComponentState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_8_0,
            	    							"com.visteon.onoff.States.ComponentState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStates.g:573:4: ( (lv_features_9_0= ruleComponentFeature ) )
            	    {
            	    // InternalStates.g:573:4: ( (lv_features_9_0= ruleComponentFeature ) )
            	    // InternalStates.g:574:5: (lv_features_9_0= ruleComponentFeature )
            	    {
            	    // InternalStates.g:574:5: (lv_features_9_0= ruleComponentFeature )
            	    // InternalStates.g:575:6: lv_features_9_0= ruleComponentFeature
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getFeaturesComponentFeatureParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_features_9_0=ruleComponentFeature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"features",
            	    							lv_features_9_0,
            	    							"com.visteon.onoff.States.ComponentFeature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalStates.g:593:4: ( (lv_nodeStateAssociations_10_0= ruleNodeStateAssociation ) )
            	    {
            	    // InternalStates.g:593:4: ( (lv_nodeStateAssociations_10_0= ruleNodeStateAssociation ) )
            	    // InternalStates.g:594:5: (lv_nodeStateAssociations_10_0= ruleNodeStateAssociation )
            	    {
            	    // InternalStates.g:594:5: (lv_nodeStateAssociations_10_0= ruleNodeStateAssociation )
            	    // InternalStates.g:595:6: lv_nodeStateAssociations_10_0= ruleNodeStateAssociation
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getNodeStateAssociationsNodeStateAssociationParserRuleCall_6_3_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_nodeStateAssociations_10_0=ruleNodeStateAssociation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nodeStateAssociations",
            	    							lv_nodeStateAssociations_10_0,
            	    							"com.visteon.onoff.States.NodeStateAssociation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getClientConfigurationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleClientConfiguration"


    // $ANTLR start "entryRuleComponentTransition"
    // InternalStates.g:621:1: entryRuleComponentTransition returns [EObject current=null] : iv_ruleComponentTransition= ruleComponentTransition EOF ;
    public final EObject entryRuleComponentTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTransition = null;


        try {
            // InternalStates.g:621:60: (iv_ruleComponentTransition= ruleComponentTransition EOF )
            // InternalStates.g:622:2: iv_ruleComponentTransition= ruleComponentTransition EOF
            {
             newCompositeNode(grammarAccess.getComponentTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentTransition=ruleComponentTransition();

            state._fsp--;

             current =iv_ruleComponentTransition; 
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
    // $ANTLR end "entryRuleComponentTransition"


    // $ANTLR start "ruleComponentTransition"
    // InternalStates.g:628:1: ruleComponentTransition returns [EObject current=null] : ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleComponentTransition() throws RecognitionException {
        EObject current = null;

        Token lv_essential_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_timeoutInMilliseconds_5_0=null;
        Token otherlv_6=null;
        Token lv_maxretries_7_0=null;
        Token otherlv_11=null;
        EObject lv_stateDependency_9_0 = null;

        EObject lv_featureDependency_10_0 = null;



        	enterRule();

        try {
            // InternalStates.g:634:2: ( ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalStates.g:635:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalStates.g:635:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalStates.g:636:3: ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalStates.g:636:3: ( (lv_essential_0_0= 'essential' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStates.g:637:4: (lv_essential_0_0= 'essential' )
                    {
                    // InternalStates.g:637:4: (lv_essential_0_0= 'essential' )
                    // InternalStates.g:638:5: lv_essential_0_0= 'essential'
                    {
                    lv_essential_0_0=(Token)match(input,18,FOLLOW_11); 

                    					newLeafNode(lv_essential_0_0, grammarAccess.getComponentTransitionAccess().getEssentialEssentialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentTransitionRule());
                    					}
                    					setWithLastConsumed(current, "essential", true, "essential");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTransitionAccess().getTransitionKeyword_1());
            		
            // InternalStates.g:654:3: ( ( ruleFQN ) )
            // InternalStates.g:655:4: ( ruleFQN )
            {
            // InternalStates.g:655:4: ( ruleFQN )
            // InternalStates.g:656:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentTransitionAccess().getTransitionTransitionCrossReference_2_0());
            				
            pushFollow(FOLLOW_4);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentTransitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalStates.g:674:3: (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStates.g:675:4: otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentTransitionAccess().getTimeoutKeyword_4_0());
                    			
                    // InternalStates.g:679:4: ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) )
                    // InternalStates.g:680:5: (lv_timeoutInMilliseconds_5_0= RULE_INT )
                    {
                    // InternalStates.g:680:5: (lv_timeoutInMilliseconds_5_0= RULE_INT )
                    // InternalStates.g:681:6: lv_timeoutInMilliseconds_5_0= RULE_INT
                    {
                    lv_timeoutInMilliseconds_5_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_timeoutInMilliseconds_5_0, grammarAccess.getComponentTransitionAccess().getTimeoutInMillisecondsINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"timeoutInMilliseconds",
                    							lv_timeoutInMilliseconds_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStates.g:698:3: (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStates.g:699:4: otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentTransitionAccess().getMaxRetriesKeyword_5_0());
                    			
                    // InternalStates.g:703:4: ( (lv_maxretries_7_0= RULE_INT ) )
                    // InternalStates.g:704:5: (lv_maxretries_7_0= RULE_INT )
                    {
                    // InternalStates.g:704:5: (lv_maxretries_7_0= RULE_INT )
                    // InternalStates.g:705:6: lv_maxretries_7_0= RULE_INT
                    {
                    lv_maxretries_7_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    						newLeafNode(lv_maxretries_7_0, grammarAccess.getComponentTransitionAccess().getMaxretriesINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxretries",
                    							lv_maxretries_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStates.g:722:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )* ) ) )
            // InternalStates.g:723:4: ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )* ) )
            {
            // InternalStates.g:723:4: ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )* ) )
            // InternalStates.g:724:5: ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6());
            				
            // InternalStates.g:727:5: ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )* )
            // InternalStates.g:728:6: ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )*
            {
            // InternalStates.g:728:6: ( ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalStates.g:729:4: ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) )
            	    {
            	    // InternalStates.g:729:4: ({...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) ) )
            	    // InternalStates.g:730:5: {...}? => ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentTransition", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalStates.g:730:116: ( ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) ) )
            	    // InternalStates.g:731:6: ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6(), 0);
            	    					
            	    // InternalStates.g:734:9: ({...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) ) )
            	    // InternalStates.g:734:10: {...}? => ( (lv_stateDependency_9_0= ruleStateDependency ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentTransition", "true");
            	    }
            	    // InternalStates.g:734:19: ( (lv_stateDependency_9_0= ruleStateDependency ) )
            	    // InternalStates.g:734:20: (lv_stateDependency_9_0= ruleStateDependency )
            	    {
            	    // InternalStates.g:734:20: (lv_stateDependency_9_0= ruleStateDependency )
            	    // InternalStates.g:735:10: lv_stateDependency_9_0= ruleStateDependency
            	    {

            	    										newCompositeNode(grammarAccess.getComponentTransitionAccess().getStateDependencyStateDependencyParserRuleCall_6_0_0());
            	    									
            	    pushFollow(FOLLOW_23);
            	    lv_stateDependency_9_0=ruleStateDependency();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentTransitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"stateDependency",
            	    											lv_stateDependency_9_0,
            	    											"com.visteon.onoff.States.StateDependency");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStates.g:757:4: ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) )
            	    {
            	    // InternalStates.g:757:4: ({...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) ) )
            	    // InternalStates.g:758:5: {...}? => ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentTransition", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalStates.g:758:116: ( ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) ) )
            	    // InternalStates.g:759:6: ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6(), 1);
            	    					
            	    // InternalStates.g:762:9: ({...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) ) )
            	    // InternalStates.g:762:10: {...}? => ( (lv_featureDependency_10_0= ruleFeatureDependency ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentTransition", "true");
            	    }
            	    // InternalStates.g:762:19: ( (lv_featureDependency_10_0= ruleFeatureDependency ) )
            	    // InternalStates.g:762:20: (lv_featureDependency_10_0= ruleFeatureDependency )
            	    {
            	    // InternalStates.g:762:20: (lv_featureDependency_10_0= ruleFeatureDependency )
            	    // InternalStates.g:763:10: lv_featureDependency_10_0= ruleFeatureDependency
            	    {

            	    										newCompositeNode(grammarAccess.getComponentTransitionAccess().getFeatureDependencyFeatureDependencyParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_23);
            	    lv_featureDependency_10_0=ruleFeatureDependency();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentTransitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"featureDependency",
            	    											lv_featureDependency_10_0,
            	    											"com.visteon.onoff.States.FeatureDependency");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentTransitionAccess().getUnorderedGroup_6());
            				

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getComponentTransitionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleComponentTransition"


    // $ANTLR start "entryRuleComponentState"
    // InternalStates.g:800:1: entryRuleComponentState returns [EObject current=null] : iv_ruleComponentState= ruleComponentState EOF ;
    public final EObject entryRuleComponentState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentState = null;


        try {
            // InternalStates.g:800:55: (iv_ruleComponentState= ruleComponentState EOF )
            // InternalStates.g:801:2: iv_ruleComponentState= ruleComponentState EOF
            {
             newCompositeNode(grammarAccess.getComponentStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentState=ruleComponentState();

            state._fsp--;

             current =iv_ruleComponentState; 
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
    // $ANTLR end "entryRuleComponentState"


    // $ANTLR start "ruleComponentState"
    // InternalStates.g:807:1: ruleComponentState returns [EObject current=null] : (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleComponentState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_stateDependency_4_0 = null;

        EObject lv_featureDependency_5_0 = null;

        EObject lv_transitionDependency_6_0 = null;



        	enterRule();

        try {
            // InternalStates.g:813:2: ( (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) )
            // InternalStates.g:814:2: (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            {
            // InternalStates.g:814:2: (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            // InternalStates.g:815:3: otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentStateAccess().getStateKeyword_0());
            		
            // InternalStates.g:819:3: ( ( ruleFQN ) )
            // InternalStates.g:820:4: ( ruleFQN )
            {
            // InternalStates.g:820:4: ( ruleFQN )
            // InternalStates.g:821:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentStateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentStateAccess().getStateStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentStateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStates.g:839:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) )
            // InternalStates.g:840:4: ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )* ) )
            {
            // InternalStates.g:840:4: ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )* ) )
            // InternalStates.g:841:5: ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentStateAccess().getUnorderedGroup_3());
            				
            // InternalStates.g:844:5: ( ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )* )
            // InternalStates.g:845:6: ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )*
            {
            // InternalStates.g:845:6: ( ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) ) )*
            loop16:
            do {
                int alt16=4;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 2) ) {
                    alt16=3;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalStates.g:846:4: ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) )
            	    {
            	    // InternalStates.g:846:4: ({...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) ) )
            	    // InternalStates.g:847:5: {...}? => ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalStates.g:847:111: ( ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) ) )
            	    // InternalStates.g:848:6: ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalStates.g:851:9: ({...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) ) )
            	    // InternalStates.g:851:10: {...}? => ( (lv_stateDependency_4_0= ruleStateDependency ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "true");
            	    }
            	    // InternalStates.g:851:19: ( (lv_stateDependency_4_0= ruleStateDependency ) )
            	    // InternalStates.g:851:20: (lv_stateDependency_4_0= ruleStateDependency )
            	    {
            	    // InternalStates.g:851:20: (lv_stateDependency_4_0= ruleStateDependency )
            	    // InternalStates.g:852:10: lv_stateDependency_4_0= ruleStateDependency
            	    {

            	    										newCompositeNode(grammarAccess.getComponentStateAccess().getStateDependencyStateDependencyParserRuleCall_3_0_0());
            	    									
            	    pushFollow(FOLLOW_24);
            	    lv_stateDependency_4_0=ruleStateDependency();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentStateRule());
            	    										}
            	    										set(
            	    											current,
            	    											"stateDependency",
            	    											lv_stateDependency_4_0,
            	    											"com.visteon.onoff.States.StateDependency");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentStateAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStates.g:874:4: ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) )
            	    {
            	    // InternalStates.g:874:4: ({...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) ) )
            	    // InternalStates.g:875:5: {...}? => ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalStates.g:875:111: ( ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) ) )
            	    // InternalStates.g:876:6: ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalStates.g:879:9: ({...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) ) )
            	    // InternalStates.g:879:10: {...}? => ( (lv_featureDependency_5_0= ruleFeatureDependency ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "true");
            	    }
            	    // InternalStates.g:879:19: ( (lv_featureDependency_5_0= ruleFeatureDependency ) )
            	    // InternalStates.g:879:20: (lv_featureDependency_5_0= ruleFeatureDependency )
            	    {
            	    // InternalStates.g:879:20: (lv_featureDependency_5_0= ruleFeatureDependency )
            	    // InternalStates.g:880:10: lv_featureDependency_5_0= ruleFeatureDependency
            	    {

            	    										newCompositeNode(grammarAccess.getComponentStateAccess().getFeatureDependencyFeatureDependencyParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_24);
            	    lv_featureDependency_5_0=ruleFeatureDependency();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentStateRule());
            	    										}
            	    										set(
            	    											current,
            	    											"featureDependency",
            	    											lv_featureDependency_5_0,
            	    											"com.visteon.onoff.States.FeatureDependency");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentStateAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStates.g:902:4: ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) )
            	    {
            	    // InternalStates.g:902:4: ({...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) ) )
            	    // InternalStates.g:903:5: {...}? => ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalStates.g:903:111: ( ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) ) )
            	    // InternalStates.g:904:6: ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalStates.g:907:9: ({...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) ) )
            	    // InternalStates.g:907:10: {...}? => ( (lv_transitionDependency_6_0= ruleTransitionDependency ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "true");
            	    }
            	    // InternalStates.g:907:19: ( (lv_transitionDependency_6_0= ruleTransitionDependency ) )
            	    // InternalStates.g:907:20: (lv_transitionDependency_6_0= ruleTransitionDependency )
            	    {
            	    // InternalStates.g:907:20: (lv_transitionDependency_6_0= ruleTransitionDependency )
            	    // InternalStates.g:908:10: lv_transitionDependency_6_0= ruleTransitionDependency
            	    {

            	    										newCompositeNode(grammarAccess.getComponentStateAccess().getTransitionDependencyTransitionDependencyParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_24);
            	    lv_transitionDependency_6_0=ruleTransitionDependency();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentStateRule());
            	    										}
            	    										set(
            	    											current,
            	    											"transitionDependency",
            	    											lv_transitionDependency_6_0,
            	    											"com.visteon.onoff.States.TransitionDependency");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentStateAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentStateAccess().getUnorderedGroup_3());
            				

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentStateAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComponentState"


    // $ANTLR start "entryRuleStateDependency"
    // InternalStates.g:945:1: entryRuleStateDependency returns [EObject current=null] : iv_ruleStateDependency= ruleStateDependency EOF ;
    public final EObject entryRuleStateDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDependency = null;


        try {
            // InternalStates.g:945:56: (iv_ruleStateDependency= ruleStateDependency EOF )
            // InternalStates.g:946:2: iv_ruleStateDependency= ruleStateDependency EOF
            {
             newCompositeNode(grammarAccess.getStateDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateDependency=ruleStateDependency();

            state._fsp--;

             current =iv_ruleStateDependency; 
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
    // $ANTLR end "entryRuleStateDependency"


    // $ANTLR start "ruleStateDependency"
    // InternalStates.g:952:1: ruleStateDependency returns [EObject current=null] : (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) ;
    public final EObject ruleStateDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStates.g:958:2: ( (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) )
            // InternalStates.g:959:2: (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            {
            // InternalStates.g:959:2: (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            // InternalStates.g:960:3: otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDependencyAccess().getDependsOnStatesKeyword_0());
            		
            // InternalStates.g:964:3: ( ( ruleFQN ) )
            // InternalStates.g:965:4: ( ruleFQN )
            {
            // InternalStates.g:965:4: ( ruleFQN )
            // InternalStates.g:966:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateDependencyAccess().getStatesComponentStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_25);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:980:3: (otherlv_2= ',' ( ( ruleFQN ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStates.g:981:4: otherlv_2= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStateDependencyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStates.g:985:4: ( ( ruleFQN ) )
            	    // InternalStates.g:986:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:986:5: ( ruleFQN )
            	    // InternalStates.g:987:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStateDependencyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getStateDependencyAccess().getStatesComponentStateCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    ruleFQN();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleStateDependency"


    // $ANTLR start "entryRuleTransitionDependency"
    // InternalStates.g:1006:1: entryRuleTransitionDependency returns [EObject current=null] : iv_ruleTransitionDependency= ruleTransitionDependency EOF ;
    public final EObject entryRuleTransitionDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDependency = null;


        try {
            // InternalStates.g:1006:61: (iv_ruleTransitionDependency= ruleTransitionDependency EOF )
            // InternalStates.g:1007:2: iv_ruleTransitionDependency= ruleTransitionDependency EOF
            {
             newCompositeNode(grammarAccess.getTransitionDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionDependency=ruleTransitionDependency();

            state._fsp--;

             current =iv_ruleTransitionDependency; 
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
    // $ANTLR end "entryRuleTransitionDependency"


    // $ANTLR start "ruleTransitionDependency"
    // InternalStates.g:1013:1: ruleTransitionDependency returns [EObject current=null] : (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) ;
    public final EObject ruleTransitionDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStates.g:1019:2: ( (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) )
            // InternalStates.g:1020:2: (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            {
            // InternalStates.g:1020:2: (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            // InternalStates.g:1021:3: otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDependencyAccess().getDependsOnTransitionsKeyword_0());
            		
            // InternalStates.g:1025:3: ( ( ruleFQN ) )
            // InternalStates.g:1026:4: ( ruleFQN )
            {
            // InternalStates.g:1026:4: ( ruleFQN )
            // InternalStates.g:1027:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionDependencyAccess().getTransistionsComponentTransitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_25);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:1041:3: (otherlv_2= ',' ( ( ruleFQN ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStates.g:1042:4: otherlv_2= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTransitionDependencyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStates.g:1046:4: ( ( ruleFQN ) )
            	    // InternalStates.g:1047:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:1047:5: ( ruleFQN )
            	    // InternalStates.g:1048:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionDependencyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionDependencyAccess().getTransistionsComponentTransitionCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    ruleFQN();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleTransitionDependency"


    // $ANTLR start "entryRuleFeatureDependency"
    // InternalStates.g:1067:1: entryRuleFeatureDependency returns [EObject current=null] : iv_ruleFeatureDependency= ruleFeatureDependency EOF ;
    public final EObject entryRuleFeatureDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDependency = null;


        try {
            // InternalStates.g:1067:58: (iv_ruleFeatureDependency= ruleFeatureDependency EOF )
            // InternalStates.g:1068:2: iv_ruleFeatureDependency= ruleFeatureDependency EOF
            {
             newCompositeNode(grammarAccess.getFeatureDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureDependency=ruleFeatureDependency();

            state._fsp--;

             current =iv_ruleFeatureDependency; 
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
    // $ANTLR end "entryRuleFeatureDependency"


    // $ANTLR start "ruleFeatureDependency"
    // InternalStates.g:1074:1: ruleFeatureDependency returns [EObject current=null] : (otherlv_0= 'depends on features' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) ;
    public final EObject ruleFeatureDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStates.g:1080:2: ( (otherlv_0= 'depends on features' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) )
            // InternalStates.g:1081:2: (otherlv_0= 'depends on features' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            {
            // InternalStates.g:1081:2: (otherlv_0= 'depends on features' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            // InternalStates.g:1082:3: otherlv_0= 'depends on features' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureDependencyAccess().getDependsOnFeaturesKeyword_0());
            		
            // InternalStates.g:1086:3: ( ( ruleFQN ) )
            // InternalStates.g:1087:4: ( ruleFQN )
            {
            // InternalStates.g:1087:4: ( ruleFQN )
            // InternalStates.g:1088:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureDependencyAccess().getFeaturesComponentFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_25);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:1102:3: (otherlv_2= ',' ( ( ruleFQN ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStates.g:1103:4: otherlv_2= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFeatureDependencyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStates.g:1107:4: ( ( ruleFQN ) )
            	    // InternalStates.g:1108:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:1108:5: ( ruleFQN )
            	    // InternalStates.g:1109:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFeatureDependencyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFeatureDependencyAccess().getFeaturesComponentFeatureCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    ruleFQN();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleFeatureDependency"


    // $ANTLR start "entryRuleNodeStateAssociation"
    // InternalStates.g:1128:1: entryRuleNodeStateAssociation returns [EObject current=null] : iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF ;
    public final EObject entryRuleNodeStateAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStateAssociation = null;


        try {
            // InternalStates.g:1128:61: (iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF )
            // InternalStates.g:1129:2: iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF
            {
             newCompositeNode(grammarAccess.getNodeStateAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeStateAssociation=ruleNodeStateAssociation();

            state._fsp--;

             current =iv_ruleNodeStateAssociation; 
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
    // $ANTLR end "entryRuleNodeStateAssociation"


    // $ANTLR start "ruleNodeStateAssociation"
    // InternalStates.g:1135:1: ruleNodeStateAssociation returns [EObject current=null] : (otherlv_0= 'for' ( ( ruleFQN ) ) otherlv_2= 'set system-states' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleNodeStateAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalStates.g:1141:2: ( (otherlv_0= 'for' ( ( ruleFQN ) ) otherlv_2= 'set system-states' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalStates.g:1142:2: (otherlv_0= 'for' ( ( ruleFQN ) ) otherlv_2= 'set system-states' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalStates.g:1142:2: (otherlv_0= 'for' ( ( ruleFQN ) ) otherlv_2= 'set system-states' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalStates.g:1143:3: otherlv_0= 'for' ( ( ruleFQN ) ) otherlv_2= 'set system-states' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeStateAssociationAccess().getForKeyword_0());
            		
            // InternalStates.g:1147:3: ( ( ruleFQN ) )
            // InternalStates.g:1148:4: ( ruleFQN )
            {
            // InternalStates.g:1148:4: ( ruleFQN )
            // InternalStates.g:1149:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeStateAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeStateAssociationAccess().getClientStateStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_26);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeStateAssociationAccess().getSetSystemStatesKeyword_2());
            		
            // InternalStates.g:1167:3: ( (otherlv_3= RULE_ID ) )
            // InternalStates.g:1168:4: (otherlv_3= RULE_ID )
            {
            // InternalStates.g:1168:4: (otherlv_3= RULE_ID )
            // InternalStates.g:1169:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeStateAssociationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_3, grammarAccess.getNodeStateAssociationAccess().getStatesNodeStateCrossReference_3_0());
            				

            }


            }

            // InternalStates.g:1180:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalStates.g:1181:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getNodeStateAssociationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalStates.g:1185:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalStates.g:1186:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalStates.g:1186:5: (otherlv_5= RULE_ID )
            	    // InternalStates.g:1187:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNodeStateAssociationRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_5, grammarAccess.getNodeStateAssociationAccess().getStatesNodeStateCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleNodeStateAssociation"


    // $ANTLR start "entryRuleComponentFeature"
    // InternalStates.g:1203:1: entryRuleComponentFeature returns [EObject current=null] : iv_ruleComponentFeature= ruleComponentFeature EOF ;
    public final EObject entryRuleComponentFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentFeature = null;


        try {
            // InternalStates.g:1203:57: (iv_ruleComponentFeature= ruleComponentFeature EOF )
            // InternalStates.g:1204:2: iv_ruleComponentFeature= ruleComponentFeature EOF
            {
             newCompositeNode(grammarAccess.getComponentFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentFeature=ruleComponentFeature();

            state._fsp--;

             current =iv_ruleComponentFeature; 
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
    // $ANTLR end "entryRuleComponentFeature"


    // $ANTLR start "ruleComponentFeature"
    // InternalStates.g:1210:1: ruleComponentFeature returns [EObject current=null] : (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleComponentFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalStates.g:1216:2: ( (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' ) )
            // InternalStates.g:1217:2: (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' )
            {
            // InternalStates.g:1217:2: (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' )
            // InternalStates.g:1218:3: otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentFeatureAccess().getFeatureKeyword_0());
            		
            // InternalStates.g:1222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStates.g:1223:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStates.g:1223:4: (lv_name_1_0= RULE_ID )
            // InternalStates.g:1224:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentFeatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentFeatureAccess().getStatesKeyword_3());
            		
            // InternalStates.g:1248:3: ( ( ruleFQN ) )
            // InternalStates.g:1249:4: ( ruleFQN )
            {
            // InternalStates.g:1249:4: ( ruleFQN )
            // InternalStates.g:1250:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentFeatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentFeatureAccess().getStatesStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:1264:3: (otherlv_5= ',' ( ( ruleFQN ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalStates.g:1265:4: otherlv_5= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_5=(Token)match(input,29,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getComponentFeatureAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalStates.g:1269:4: ( ( ruleFQN ) )
            	    // InternalStates.g:1270:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:1270:5: ( ruleFQN )
            	    // InternalStates.g:1271:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComponentFeatureRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getComponentFeatureAccess().getStatesStateCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    ruleFQN();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentFeatureAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleComponentFeature"


    // $ANTLR start "entryRuleFQN"
    // InternalStates.g:1294:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalStates.g:1294:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalStates.g:1295:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalStates.g:1301:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalStates.g:1307:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalStates.g:1308:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalStates.g:1308:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalStates.g:1309:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalStates.g:1316:3: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalStates.g:1317:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000005040E8000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000005000E8000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000098808000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000098008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000090008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000D0008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000002L});

}
