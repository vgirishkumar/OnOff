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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'NodeStateDiagram'", "'{'", "'globalEdgeweight'", "'globalTransitionTimeout'", "'}'", "'initial'", "'State'", "'essential'", "'Transition'", "':'", "'->'", "'edgeweight'", "'timeout'", "'Client'", "'coom'", "'clientTransitionTimeout'", "'max-retries'", "'depends on states'", "','", "'depends on transitions'", "'depends on features'", "'For'", "'set system states'", "'Feature'", "'states'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    // InternalStates.g:71:1: ruleNodeStateConfiguration returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_nsd_1_0= ruleNodeStateDiagram ) ) ( (lv_clientConfig_2_0= ruleClientConfiguration ) )* ) ;
    public final EObject ruleNodeStateConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_nsd_1_0 = null;

        EObject lv_clientConfig_2_0 = null;



        	enterRule();

        try {
            // InternalStates.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_nsd_1_0= ruleNodeStateDiagram ) ) ( (lv_clientConfig_2_0= ruleClientConfiguration ) )* ) )
            // InternalStates.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_nsd_1_0= ruleNodeStateDiagram ) ) ( (lv_clientConfig_2_0= ruleClientConfiguration ) )* )
            {
            // InternalStates.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_nsd_1_0= ruleNodeStateDiagram ) ) ( (lv_clientConfig_2_0= ruleClientConfiguration ) )* )
            // InternalStates.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_nsd_1_0= ruleNodeStateDiagram ) ) ( (lv_clientConfig_2_0= ruleClientConfiguration ) )*
            {
            // InternalStates.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStates.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalStates.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalStates.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getNodeStateConfigurationAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeStateConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"com.visteon.onoff.States.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalStates.g:98:3: ( (lv_nsd_1_0= ruleNodeStateDiagram ) )
            // InternalStates.g:99:4: (lv_nsd_1_0= ruleNodeStateDiagram )
            {
            // InternalStates.g:99:4: (lv_nsd_1_0= ruleNodeStateDiagram )
            // InternalStates.g:100:5: lv_nsd_1_0= ruleNodeStateDiagram
            {

            					newCompositeNode(grammarAccess.getNodeStateConfigurationAccess().getNsdNodeStateDiagramParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nsd_1_0=ruleNodeStateDiagram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeStateConfigurationRule());
            					}
            					set(
            						current,
            						"nsd",
            						lv_nsd_1_0,
            						"com.visteon.onoff.States.NodeStateDiagram");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:117:3: ( (lv_clientConfig_2_0= ruleClientConfiguration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStates.g:118:4: (lv_clientConfig_2_0= ruleClientConfiguration )
            	    {
            	    // InternalStates.g:118:4: (lv_clientConfig_2_0= ruleClientConfiguration )
            	    // InternalStates.g:119:5: lv_clientConfig_2_0= ruleClientConfiguration
            	    {

            	    					newCompositeNode(grammarAccess.getNodeStateConfigurationAccess().getClientConfigClientConfigurationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_clientConfig_2_0=ruleClientConfiguration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeStateConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clientConfig",
            	    						lv_clientConfig_2_0,
            	    						"com.visteon.onoff.States.ClientConfiguration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleImport"
    // InternalStates.g:140:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalStates.g:140:47: (iv_ruleImport= ruleImport EOF )
            // InternalStates.g:141:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalStates.g:147:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalStates.g:153:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalStates.g:154:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalStates.g:154:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalStates.g:155:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalStates.g:159:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalStates.g:160:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalStates.g:160:4: (lv_importURI_1_0= RULE_STRING )
            // InternalStates.g:161:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleNodeStateDiagram"
    // InternalStates.g:181:1: entryRuleNodeStateDiagram returns [EObject current=null] : iv_ruleNodeStateDiagram= ruleNodeStateDiagram EOF ;
    public final EObject entryRuleNodeStateDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStateDiagram = null;


        try {
            // InternalStates.g:181:57: (iv_ruleNodeStateDiagram= ruleNodeStateDiagram EOF )
            // InternalStates.g:182:2: iv_ruleNodeStateDiagram= ruleNodeStateDiagram EOF
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
    // InternalStates.g:188:1: ruleNodeStateDiagram returns [EObject current=null] : ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleNodeStateDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_gEdgeWeight_4_0=null;
        Token otherlv_5=null;
        Token lv_gTransitionTimeoutInMilliseconds_6_0=null;
        Token otherlv_9=null;
        EObject lv_nodeStates_7_0 = null;

        EObject lv_nodeTransitions_8_0 = null;



        	enterRule();

        try {
            // InternalStates.g:194:2: ( ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' ) )
            // InternalStates.g:195:2: ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' )
            {
            // InternalStates.g:195:2: ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' )
            // InternalStates.g:196:3: () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}'
            {
            // InternalStates.g:196:3: ()
            // InternalStates.g:197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeStateDiagramAccess().getNodeStateDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeStateDiagramAccess().getNodeStateDiagramKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeStateDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStates.g:211:3: (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStates.g:212:4: otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getNodeStateDiagramAccess().getGlobalEdgeweightKeyword_3_0());
                    			
                    // InternalStates.g:216:4: ( (lv_gEdgeWeight_4_0= RULE_INT ) )
                    // InternalStates.g:217:5: (lv_gEdgeWeight_4_0= RULE_INT )
                    {
                    // InternalStates.g:217:5: (lv_gEdgeWeight_4_0= RULE_INT )
                    // InternalStates.g:218:6: lv_gEdgeWeight_4_0= RULE_INT
                    {
                    lv_gEdgeWeight_4_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            // InternalStates.g:235:3: (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalStates.g:236:4: otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeStateDiagramAccess().getGlobalTransitionTimeoutKeyword_4_0());
                    			
                    // InternalStates.g:240:4: ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) )
                    // InternalStates.g:241:5: (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT )
                    {
                    // InternalStates.g:241:5: (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT )
                    // InternalStates.g:242:6: lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT
                    {
                    lv_gTransitionTimeoutInMilliseconds_6_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            // InternalStates.g:259:3: ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=18)) ) {
                    alt5=1;
                }
                else if ( ((LA5_0>=19 && LA5_0<=20)) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStates.g:260:4: ( (lv_nodeStates_7_0= ruleNodeState ) )
            	    {
            	    // InternalStates.g:260:4: ( (lv_nodeStates_7_0= ruleNodeState ) )
            	    // InternalStates.g:261:5: (lv_nodeStates_7_0= ruleNodeState )
            	    {
            	    // InternalStates.g:261:5: (lv_nodeStates_7_0= ruleNodeState )
            	    // InternalStates.g:262:6: lv_nodeStates_7_0= ruleNodeState
            	    {

            	    						newCompositeNode(grammarAccess.getNodeStateDiagramAccess().getNodeStatesNodeStateParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_nodeStates_7_0=ruleNodeState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNodeStateDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nodeStates",
            	    							lv_nodeStates_7_0,
            	    							"com.visteon.onoff.States.NodeState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStates.g:280:4: ( (lv_nodeTransitions_8_0= ruleNodeTransition ) )
            	    {
            	    // InternalStates.g:280:4: ( (lv_nodeTransitions_8_0= ruleNodeTransition ) )
            	    // InternalStates.g:281:5: (lv_nodeTransitions_8_0= ruleNodeTransition )
            	    {
            	    // InternalStates.g:281:5: (lv_nodeTransitions_8_0= ruleNodeTransition )
            	    // InternalStates.g:282:6: lv_nodeTransitions_8_0= ruleNodeTransition
            	    {

            	    						newCompositeNode(grammarAccess.getNodeStateDiagramAccess().getNodeTransitionsNodeTransitionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_nodeTransitions_8_0=ruleNodeTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNodeStateDiagramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nodeTransitions",
            	    							lv_nodeTransitions_8_0,
            	    							"com.visteon.onoff.States.NodeTransition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

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
    // InternalStates.g:308:1: entryRuleNodeState returns [EObject current=null] : iv_ruleNodeState= ruleNodeState EOF ;
    public final EObject entryRuleNodeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeState = null;


        try {
            // InternalStates.g:308:50: (iv_ruleNodeState= ruleNodeState EOF )
            // InternalStates.g:309:2: iv_ruleNodeState= ruleNodeState EOF
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
    // InternalStates.g:315:1: ruleNodeState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleNodeState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalStates.g:321:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalStates.g:322:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalStates.g:322:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalStates.g:323:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalStates.g:323:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStates.g:324:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalStates.g:324:4: (lv_initial_0_0= 'initial' )
                    // InternalStates.g:325:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,17,FOLLOW_11); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getNodeStateAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeStateAccess().getStateKeyword_1());
            		
            // InternalStates.g:341:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalStates.g:342:4: (lv_name_2_0= RULE_ID )
            {
            // InternalStates.g:342:4: (lv_name_2_0= RULE_ID )
            // InternalStates.g:343:5: lv_name_2_0= RULE_ID
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
    // InternalStates.g:363:1: entryRuleNodeTransition returns [EObject current=null] : iv_ruleNodeTransition= ruleNodeTransition EOF ;
    public final EObject entryRuleNodeTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTransition = null;


        try {
            // InternalStates.g:363:55: (iv_ruleNodeTransition= ruleNodeTransition EOF )
            // InternalStates.g:364:2: iv_ruleNodeTransition= ruleNodeTransition EOF
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
    // InternalStates.g:370:1: ruleNodeTransition returns [EObject current=null] : ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? ) ;
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
            // InternalStates.g:376:2: ( ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? ) )
            // InternalStates.g:377:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? )
            {
            // InternalStates.g:377:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? )
            // InternalStates.g:378:3: ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )?
            {
            // InternalStates.g:378:3: ( (lv_essential_0_0= 'essential' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStates.g:379:4: (lv_essential_0_0= 'essential' )
                    {
                    // InternalStates.g:379:4: (lv_essential_0_0= 'essential' )
                    // InternalStates.g:380:5: lv_essential_0_0= 'essential'
                    {
                    lv_essential_0_0=(Token)match(input,19,FOLLOW_13); 

                    					newLeafNode(lv_essential_0_0, grammarAccess.getNodeTransitionAccess().getEssentialEssentialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeTransitionRule());
                    					}
                    					setWithLastConsumed(current, "essential", true, "essential");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeTransitionAccess().getTransitionKeyword_1());
            		
            // InternalStates.g:396:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalStates.g:397:4: (lv_name_2_0= RULE_ID )
            {
            // InternalStates.g:397:4: (lv_name_2_0= RULE_ID )
            // InternalStates.g:398:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeTransitionAccess().getColonKeyword_3());
            		
            // InternalStates.g:418:3: ( (otherlv_4= RULE_ID ) )
            // InternalStates.g:419:4: (otherlv_4= RULE_ID )
            {
            // InternalStates.g:419:4: (otherlv_4= RULE_ID )
            // InternalStates.g:420:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTransitionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_4, grammarAccess.getNodeTransitionAccess().getFromStateNodeStateCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getNodeTransitionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalStates.g:435:3: ( (otherlv_6= RULE_ID ) )
            // InternalStates.g:436:4: (otherlv_6= RULE_ID )
            {
            // InternalStates.g:436:4: (otherlv_6= RULE_ID )
            // InternalStates.g:437:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTransitionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_6, grammarAccess.getNodeTransitionAccess().getToStateNodeStateCrossReference_6_0());
            				

            }


            }

            // InternalStates.g:448:3: (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStates.g:449:4: otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getNodeTransitionAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalStates.g:453:4: (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==23) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalStates.g:454:5: otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) )
                            {
                            otherlv_8=(Token)match(input,23,FOLLOW_8); 

                            					newLeafNode(otherlv_8, grammarAccess.getNodeTransitionAccess().getEdgeweightKeyword_7_1_0());
                            				
                            // InternalStates.g:458:5: ( (lv_edgeweight_9_0= RULE_INT ) )
                            // InternalStates.g:459:6: (lv_edgeweight_9_0= RULE_INT )
                            {
                            // InternalStates.g:459:6: (lv_edgeweight_9_0= RULE_INT )
                            // InternalStates.g:460:7: lv_edgeweight_9_0= RULE_INT
                            {
                            lv_edgeweight_9_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

                    // InternalStates.g:477:4: (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==24) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalStates.g:478:5: otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) )
                            {
                            otherlv_10=(Token)match(input,24,FOLLOW_8); 

                            					newLeafNode(otherlv_10, grammarAccess.getNodeTransitionAccess().getTimeoutKeyword_7_2_0());
                            				
                            // InternalStates.g:482:5: ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) )
                            // InternalStates.g:483:6: (lv_timeoutInMilliseconds_11_0= RULE_INT )
                            {
                            // InternalStates.g:483:6: (lv_timeoutInMilliseconds_11_0= RULE_INT )
                            // InternalStates.g:484:7: lv_timeoutInMilliseconds_11_0= RULE_INT
                            {
                            lv_timeoutInMilliseconds_11_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

                    otherlv_12=(Token)match(input,16,FOLLOW_2); 

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
    // InternalStates.g:510:1: entryRuleClientConfiguration returns [EObject current=null] : iv_ruleClientConfiguration= ruleClientConfiguration EOF ;
    public final EObject entryRuleClientConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClientConfiguration = null;


        try {
            // InternalStates.g:510:60: (iv_ruleClientConfiguration= ruleClientConfiguration EOF )
            // InternalStates.g:511:2: iv_ruleClientConfiguration= ruleClientConfiguration EOF
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
    // InternalStates.g:517:1: ruleClientConfiguration returns [EObject current=null] : (otherlv_0= 'Client' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( (lv_nodeStateAssociations_7_0= ruleNodeStateAssociation ) )? ( ( (lv_componentTransitions_8_0= ruleComponentTransition ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' ) ;
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
        EObject lv_nodeStateAssociations_7_0 = null;

        EObject lv_componentTransitions_8_0 = null;

        EObject lv_componentStates_9_0 = null;

        EObject lv_features_10_0 = null;



        	enterRule();

        try {
            // InternalStates.g:523:2: ( (otherlv_0= 'Client' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( (lv_nodeStateAssociations_7_0= ruleNodeStateAssociation ) )? ( ( (lv_componentTransitions_8_0= ruleComponentTransition ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' ) )
            // InternalStates.g:524:2: (otherlv_0= 'Client' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( (lv_nodeStateAssociations_7_0= ruleNodeStateAssociation ) )? ( ( (lv_componentTransitions_8_0= ruleComponentTransition ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' )
            {
            // InternalStates.g:524:2: (otherlv_0= 'Client' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( (lv_nodeStateAssociations_7_0= ruleNodeStateAssociation ) )? ( ( (lv_componentTransitions_8_0= ruleComponentTransition ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' )
            // InternalStates.g:525:3: otherlv_0= 'Client' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( (lv_nodeStateAssociations_7_0= ruleNodeStateAssociation ) )? ( ( (lv_componentTransitions_8_0= ruleComponentTransition ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getClientConfigurationAccess().getClientKeyword_0());
            		
            // InternalStates.g:529:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStates.g:530:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStates.g:530:4: (lv_name_1_0= RULE_ID )
            // InternalStates.g:531:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getClientConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStates.g:551:3: (otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) ) )
            // InternalStates.g:552:4: otherlv_3= 'coom' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            				newLeafNode(otherlv_3, grammarAccess.getClientConfigurationAccess().getCoomKeyword_3_0());
            			
            // InternalStates.g:556:4: ( (otherlv_4= RULE_ID ) )
            // InternalStates.g:557:5: (otherlv_4= RULE_ID )
            {
            // InternalStates.g:557:5: (otherlv_4= RULE_ID )
            // InternalStates.g:558:6: otherlv_4= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getClientConfigurationRule());
            						}
            					
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            						newLeafNode(otherlv_4, grammarAccess.getClientConfigurationAccess().getCoomRefComponentOnOffManifestCrossReference_3_1_0());
            					

            }


            }


            }

            // InternalStates.g:570:3: (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStates.g:571:4: otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getClientConfigurationAccess().getClientTransitionTimeoutKeyword_4_0());
                    			
                    // InternalStates.g:575:4: ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) )
                    // InternalStates.g:576:5: (lv_transTimeoutInMilliseconds_6_0= RULE_INT )
                    {
                    // InternalStates.g:576:5: (lv_transTimeoutInMilliseconds_6_0= RULE_INT )
                    // InternalStates.g:577:6: lv_transTimeoutInMilliseconds_6_0= RULE_INT
                    {
                    lv_transTimeoutInMilliseconds_6_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_transTimeoutInMilliseconds_6_0, grammarAccess.getClientConfigurationAccess().getTransTimeoutInMillisecondsINTTerminalRuleCall_4_1_0());
                    					

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

            // InternalStates.g:594:3: ( (lv_nodeStateAssociations_7_0= ruleNodeStateAssociation ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStates.g:595:4: (lv_nodeStateAssociations_7_0= ruleNodeStateAssociation )
                    {
                    // InternalStates.g:595:4: (lv_nodeStateAssociations_7_0= ruleNodeStateAssociation )
                    // InternalStates.g:596:5: lv_nodeStateAssociations_7_0= ruleNodeStateAssociation
                    {

                    					newCompositeNode(grammarAccess.getClientConfigurationAccess().getNodeStateAssociationsNodeStateAssociationParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_nodeStateAssociations_7_0=ruleNodeStateAssociation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
                    					}
                    					set(
                    						current,
                    						"nodeStateAssociations",
                    						lv_nodeStateAssociations_7_0,
                    						"com.visteon.onoff.States.NodeStateAssociation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalStates.g:613:3: ( ( (lv_componentTransitions_8_0= ruleComponentTransition ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )*
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case 19:
                case 20:
                    {
                    alt13=1;
                    }
                    break;
                case 18:
                    {
                    alt13=2;
                    }
                    break;
                case 35:
                    {
                    alt13=3;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalStates.g:614:4: ( (lv_componentTransitions_8_0= ruleComponentTransition ) )
            	    {
            	    // InternalStates.g:614:4: ( (lv_componentTransitions_8_0= ruleComponentTransition ) )
            	    // InternalStates.g:615:5: (lv_componentTransitions_8_0= ruleComponentTransition )
            	    {
            	    // InternalStates.g:615:5: (lv_componentTransitions_8_0= ruleComponentTransition )
            	    // InternalStates.g:616:6: lv_componentTransitions_8_0= ruleComponentTransition
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getComponentTransitionsComponentTransitionParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_componentTransitions_8_0=ruleComponentTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"componentTransitions",
            	    							lv_componentTransitions_8_0,
            	    							"com.visteon.onoff.States.ComponentTransition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStates.g:634:4: ( (lv_componentStates_9_0= ruleComponentState ) )
            	    {
            	    // InternalStates.g:634:4: ( (lv_componentStates_9_0= ruleComponentState ) )
            	    // InternalStates.g:635:5: (lv_componentStates_9_0= ruleComponentState )
            	    {
            	    // InternalStates.g:635:5: (lv_componentStates_9_0= ruleComponentState )
            	    // InternalStates.g:636:6: lv_componentStates_9_0= ruleComponentState
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getComponentStatesComponentStateParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_componentStates_9_0=ruleComponentState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"componentStates",
            	    							lv_componentStates_9_0,
            	    							"com.visteon.onoff.States.ComponentState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStates.g:654:4: ( (lv_features_10_0= ruleFeature ) )
            	    {
            	    // InternalStates.g:654:4: ( (lv_features_10_0= ruleFeature ) )
            	    // InternalStates.g:655:5: (lv_features_10_0= ruleFeature )
            	    {
            	    // InternalStates.g:655:5: (lv_features_10_0= ruleFeature )
            	    // InternalStates.g:656:6: lv_features_10_0= ruleFeature
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getFeaturesFeatureParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_features_10_0=ruleFeature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"features",
            	    							lv_features_10_0,
            	    							"com.visteon.onoff.States.Feature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

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
    // InternalStates.g:682:1: entryRuleComponentTransition returns [EObject current=null] : iv_ruleComponentTransition= ruleComponentTransition EOF ;
    public final EObject entryRuleComponentTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTransition = null;


        try {
            // InternalStates.g:682:60: (iv_ruleComponentTransition= ruleComponentTransition EOF )
            // InternalStates.g:683:2: iv_ruleComponentTransition= ruleComponentTransition EOF
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
    // InternalStates.g:689:1: ruleComponentTransition returns [EObject current=null] : ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleComponentTransition() throws RecognitionException {
        EObject current = null;

        Token lv_essential_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_timeoutInMilliseconds_5_0=null;
        Token otherlv_6=null;
        Token lv_maxretries_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalStates.g:695:2: ( ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? otherlv_8= '}' ) )
            // InternalStates.g:696:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            {
            // InternalStates.g:696:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            // InternalStates.g:697:3: ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? otherlv_8= '}'
            {
            // InternalStates.g:697:3: ( (lv_essential_0_0= 'essential' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStates.g:698:4: (lv_essential_0_0= 'essential' )
                    {
                    // InternalStates.g:698:4: (lv_essential_0_0= 'essential' )
                    // InternalStates.g:699:5: lv_essential_0_0= 'essential'
                    {
                    lv_essential_0_0=(Token)match(input,19,FOLLOW_13); 

                    					newLeafNode(lv_essential_0_0, grammarAccess.getComponentTransitionAccess().getEssentialEssentialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentTransitionRule());
                    					}
                    					setWithLastConsumed(current, "essential", true, "essential");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTransitionAccess().getTransitionKeyword_1());
            		
            // InternalStates.g:715:3: ( ( ruleFQN ) )
            // InternalStates.g:716:4: ( ruleFQN )
            {
            // InternalStates.g:716:4: ( ruleFQN )
            // InternalStates.g:717:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentTransitionAccess().getTransitionTransitionCrossReference_2_0());
            				
            pushFollow(FOLLOW_6);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentTransitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalStates.g:735:3: (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalStates.g:736:4: otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentTransitionAccess().getTimeoutKeyword_4_0());
                    			
                    // InternalStates.g:740:4: ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) )
                    // InternalStates.g:741:5: (lv_timeoutInMilliseconds_5_0= RULE_INT )
                    {
                    // InternalStates.g:741:5: (lv_timeoutInMilliseconds_5_0= RULE_INT )
                    // InternalStates.g:742:6: lv_timeoutInMilliseconds_5_0= RULE_INT
                    {
                    lv_timeoutInMilliseconds_5_0=(Token)match(input,RULE_INT,FOLLOW_25); 

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

            // InternalStates.g:759:3: (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStates.g:760:4: otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentTransitionAccess().getMaxRetriesKeyword_5_0());
                    			
                    // InternalStates.g:764:4: ( (lv_maxretries_7_0= RULE_INT ) )
                    // InternalStates.g:765:5: (lv_maxretries_7_0= RULE_INT )
                    {
                    // InternalStates.g:765:5: (lv_maxretries_7_0= RULE_INT )
                    // InternalStates.g:766:6: lv_maxretries_7_0= RULE_INT
                    {
                    lv_maxretries_7_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentTransitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalStates.g:791:1: entryRuleComponentState returns [EObject current=null] : iv_ruleComponentState= ruleComponentState EOF ;
    public final EObject entryRuleComponentState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentState = null;


        try {
            // InternalStates.g:791:55: (iv_ruleComponentState= ruleComponentState EOF )
            // InternalStates.g:792:2: iv_ruleComponentState= ruleComponentState EOF
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
    // InternalStates.g:798:1: ruleComponentState returns [EObject current=null] : (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleComponentState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_stateDependencies_4_0 = null;

        EObject lv_featureDependencies_5_0 = null;

        EObject lv_transitionDependencies_6_0 = null;



        	enterRule();

        try {
            // InternalStates.g:804:2: ( (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) )
            // InternalStates.g:805:2: (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            {
            // InternalStates.g:805:2: (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            // InternalStates.g:806:3: otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentStateAccess().getStateKeyword_0());
            		
            // InternalStates.g:810:3: ( ( ruleFQN ) )
            // InternalStates.g:811:4: ( ruleFQN )
            {
            // InternalStates.g:811:4: ( ruleFQN )
            // InternalStates.g:812:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentStateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentStateAccess().getStateStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_6);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentStateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStates.g:830:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )* ) ) )
            // InternalStates.g:831:4: ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )* ) )
            {
            // InternalStates.g:831:4: ( ( ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )* ) )
            // InternalStates.g:832:5: ( ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentStateAccess().getUnorderedGroup_3());
            				
            // InternalStates.g:835:5: ( ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )* )
            // InternalStates.g:836:6: ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )*
            {
            // InternalStates.g:836:6: ( ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) ) )*
            loop17:
            do {
                int alt17=4;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 2) ) {
                    alt17=3;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStates.g:837:4: ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) )
            	    {
            	    // InternalStates.g:837:4: ({...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) ) )
            	    // InternalStates.g:838:5: {...}? => ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalStates.g:838:111: ( ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) ) )
            	    // InternalStates.g:839:6: ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalStates.g:842:9: ({...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) ) )
            	    // InternalStates.g:842:10: {...}? => ( (lv_stateDependencies_4_0= ruleStateDependency ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "true");
            	    }
            	    // InternalStates.g:842:19: ( (lv_stateDependencies_4_0= ruleStateDependency ) )
            	    // InternalStates.g:842:20: (lv_stateDependencies_4_0= ruleStateDependency )
            	    {
            	    // InternalStates.g:842:20: (lv_stateDependencies_4_0= ruleStateDependency )
            	    // InternalStates.g:843:10: lv_stateDependencies_4_0= ruleStateDependency
            	    {

            	    										newCompositeNode(grammarAccess.getComponentStateAccess().getStateDependenciesStateDependencyParserRuleCall_3_0_0());
            	    									
            	    pushFollow(FOLLOW_26);
            	    lv_stateDependencies_4_0=ruleStateDependency();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentStateRule());
            	    										}
            	    										set(
            	    											current,
            	    											"stateDependencies",
            	    											lv_stateDependencies_4_0,
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
            	    // InternalStates.g:865:4: ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) )
            	    {
            	    // InternalStates.g:865:4: ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) )
            	    // InternalStates.g:866:5: {...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalStates.g:866:111: ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) )
            	    // InternalStates.g:867:6: ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalStates.g:870:9: ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) )
            	    // InternalStates.g:870:10: {...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "true");
            	    }
            	    // InternalStates.g:870:19: ( (lv_featureDependencies_5_0= ruleFeatureDependency ) )
            	    // InternalStates.g:870:20: (lv_featureDependencies_5_0= ruleFeatureDependency )
            	    {
            	    // InternalStates.g:870:20: (lv_featureDependencies_5_0= ruleFeatureDependency )
            	    // InternalStates.g:871:10: lv_featureDependencies_5_0= ruleFeatureDependency
            	    {

            	    										newCompositeNode(grammarAccess.getComponentStateAccess().getFeatureDependenciesFeatureDependencyParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_26);
            	    lv_featureDependencies_5_0=ruleFeatureDependency();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentStateRule());
            	    										}
            	    										set(
            	    											current,
            	    											"featureDependencies",
            	    											lv_featureDependencies_5_0,
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
            	    // InternalStates.g:893:4: ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) )
            	    {
            	    // InternalStates.g:893:4: ({...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) ) )
            	    // InternalStates.g:894:5: {...}? => ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalStates.g:894:111: ( ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) ) )
            	    // InternalStates.g:895:6: ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentStateAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalStates.g:898:9: ({...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) ) )
            	    // InternalStates.g:898:10: {...}? => ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "true");
            	    }
            	    // InternalStates.g:898:19: ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )
            	    // InternalStates.g:898:20: (lv_transitionDependencies_6_0= ruleTransitionDependency )
            	    {
            	    // InternalStates.g:898:20: (lv_transitionDependencies_6_0= ruleTransitionDependency )
            	    // InternalStates.g:899:10: lv_transitionDependencies_6_0= ruleTransitionDependency
            	    {

            	    										newCompositeNode(grammarAccess.getComponentStateAccess().getTransitionDependenciesTransitionDependencyParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_26);
            	    lv_transitionDependencies_6_0=ruleTransitionDependency();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getComponentStateRule());
            	    										}
            	    										set(
            	    											current,
            	    											"transitionDependencies",
            	    											lv_transitionDependencies_6_0,
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
            	    break loop17;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentStateAccess().getUnorderedGroup_3());
            				

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

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
    // InternalStates.g:936:1: entryRuleStateDependency returns [EObject current=null] : iv_ruleStateDependency= ruleStateDependency EOF ;
    public final EObject entryRuleStateDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDependency = null;


        try {
            // InternalStates.g:936:56: (iv_ruleStateDependency= ruleStateDependency EOF )
            // InternalStates.g:937:2: iv_ruleStateDependency= ruleStateDependency EOF
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
    // InternalStates.g:943:1: ruleStateDependency returns [EObject current=null] : (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) ;
    public final EObject ruleStateDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStates.g:949:2: ( (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) )
            // InternalStates.g:950:2: (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            {
            // InternalStates.g:950:2: (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            // InternalStates.g:951:3: otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDependencyAccess().getDependsOnStatesKeyword_0());
            		
            // InternalStates.g:955:3: ( ( ruleFQN ) )
            // InternalStates.g:956:4: ( ruleFQN )
            {
            // InternalStates.g:956:4: ( ruleFQN )
            // InternalStates.g:957:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateDependencyAccess().getStatesStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:971:3: (otherlv_2= ',' ( ( ruleFQN ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStates.g:972:4: otherlv_2= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStateDependencyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStates.g:976:4: ( ( ruleFQN ) )
            	    // InternalStates.g:977:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:977:5: ( ruleFQN )
            	    // InternalStates.g:978:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStateDependencyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getStateDependencyAccess().getStatesStateCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleStateDependency"


    // $ANTLR start "entryRuleTransitionDependency"
    // InternalStates.g:997:1: entryRuleTransitionDependency returns [EObject current=null] : iv_ruleTransitionDependency= ruleTransitionDependency EOF ;
    public final EObject entryRuleTransitionDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDependency = null;


        try {
            // InternalStates.g:997:61: (iv_ruleTransitionDependency= ruleTransitionDependency EOF )
            // InternalStates.g:998:2: iv_ruleTransitionDependency= ruleTransitionDependency EOF
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
    // InternalStates.g:1004:1: ruleTransitionDependency returns [EObject current=null] : (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) ;
    public final EObject ruleTransitionDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStates.g:1010:2: ( (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) )
            // InternalStates.g:1011:2: (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            {
            // InternalStates.g:1011:2: (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            // InternalStates.g:1012:3: otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDependencyAccess().getDependsOnTransitionsKeyword_0());
            		
            // InternalStates.g:1016:3: ( ( ruleFQN ) )
            // InternalStates.g:1017:4: ( ruleFQN )
            {
            // InternalStates.g:1017:4: ( ruleFQN )
            // InternalStates.g:1018:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionDependencyAccess().getTransistionsTransitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:1032:3: (otherlv_2= ',' ( ( ruleFQN ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStates.g:1033:4: otherlv_2= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTransitionDependencyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStates.g:1037:4: ( ( ruleFQN ) )
            	    // InternalStates.g:1038:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:1038:5: ( ruleFQN )
            	    // InternalStates.g:1039:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTransitionDependencyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTransitionDependencyAccess().getTransistionsTransitionCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleTransitionDependency"


    // $ANTLR start "entryRuleFeatureDependency"
    // InternalStates.g:1058:1: entryRuleFeatureDependency returns [EObject current=null] : iv_ruleFeatureDependency= ruleFeatureDependency EOF ;
    public final EObject entryRuleFeatureDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDependency = null;


        try {
            // InternalStates.g:1058:58: (iv_ruleFeatureDependency= ruleFeatureDependency EOF )
            // InternalStates.g:1059:2: iv_ruleFeatureDependency= ruleFeatureDependency EOF
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
    // InternalStates.g:1065:1: ruleFeatureDependency returns [EObject current=null] : (otherlv_0= 'depends on features' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleFeatureDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStates.g:1071:2: ( (otherlv_0= 'depends on features' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalStates.g:1072:2: (otherlv_0= 'depends on features' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalStates.g:1072:2: (otherlv_0= 'depends on features' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalStates.g:1073:3: otherlv_0= 'depends on features' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureDependencyAccess().getDependsOnFeaturesKeyword_0());
            		
            // InternalStates.g:1077:3: ( (otherlv_1= RULE_ID ) )
            // InternalStates.g:1078:4: (otherlv_1= RULE_ID )
            {
            // InternalStates.g:1078:4: (otherlv_1= RULE_ID )
            // InternalStates.g:1079:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureDependencyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getFeatureDependencyAccess().getFeaturesFeatureCrossReference_1_0());
            				

            }


            }

            // InternalStates.g:1090:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalStates.g:1091:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFeatureDependencyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStates.g:1095:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalStates.g:1096:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalStates.g:1096:5: (otherlv_3= RULE_ID )
            	    // InternalStates.g:1097:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFeatureDependencyRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    						newLeafNode(otherlv_3, grammarAccess.getFeatureDependencyAccess().getFeaturesFeatureCrossReference_2_1_0());
            	    					

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
    // $ANTLR end "ruleFeatureDependency"


    // $ANTLR start "entryRuleNodeStateAssociation"
    // InternalStates.g:1113:1: entryRuleNodeStateAssociation returns [EObject current=null] : iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF ;
    public final EObject entryRuleNodeStateAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStateAssociation = null;


        try {
            // InternalStates.g:1113:61: (iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF )
            // InternalStates.g:1114:2: iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF
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
    // InternalStates.g:1120:1: ruleNodeStateAssociation returns [EObject current=null] : (otherlv_0= 'For' ( ( ruleFQN ) ) otherlv_2= 'set system states' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleNodeStateAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalStates.g:1126:2: ( (otherlv_0= 'For' ( ( ruleFQN ) ) otherlv_2= 'set system states' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalStates.g:1127:2: (otherlv_0= 'For' ( ( ruleFQN ) ) otherlv_2= 'set system states' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalStates.g:1127:2: (otherlv_0= 'For' ( ( ruleFQN ) ) otherlv_2= 'set system states' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalStates.g:1128:3: otherlv_0= 'For' ( ( ruleFQN ) ) otherlv_2= 'set system states' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeStateAssociationAccess().getForKeyword_0());
            		
            // InternalStates.g:1132:3: ( ( ruleFQN ) )
            // InternalStates.g:1133:4: ( ruleFQN )
            {
            // InternalStates.g:1133:4: ( ruleFQN )
            // InternalStates.g:1134:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeStateAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeStateAssociationAccess().getClientStateStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_28);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeStateAssociationAccess().getSetSystemStatesKeyword_2());
            		
            // InternalStates.g:1152:3: ( (otherlv_3= RULE_ID ) )
            // InternalStates.g:1153:4: (otherlv_3= RULE_ID )
            {
            // InternalStates.g:1153:4: (otherlv_3= RULE_ID )
            // InternalStates.g:1154:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeStateAssociationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_3, grammarAccess.getNodeStateAssociationAccess().getSystemStatesNodeStateCrossReference_3_0());
            				

            }


            }

            // InternalStates.g:1165:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalStates.g:1166:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_4, grammarAccess.getNodeStateAssociationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalStates.g:1170:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalStates.g:1171:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalStates.g:1171:5: (otherlv_5= RULE_ID )
            	    // InternalStates.g:1172:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNodeStateAssociationRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    						newLeafNode(otherlv_5, grammarAccess.getNodeStateAssociationAccess().getSystemStatesNodeStateCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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


    // $ANTLR start "entryRuleFeature"
    // InternalStates.g:1188:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalStates.g:1188:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalStates.g:1189:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalStates.g:1195:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalStates.g:1201:2: ( (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' ) )
            // InternalStates.g:1202:2: (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' )
            {
            // InternalStates.g:1202:2: (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' )
            // InternalStates.g:1203:3: otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
            		
            // InternalStates.g:1207:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStates.g:1208:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStates.g:1208:4: (lv_name_1_0= RULE_ID )
            // InternalStates.g:1209:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getStatesKeyword_3());
            		
            // InternalStates.g:1233:3: ( ( ruleFQN ) )
            // InternalStates.g:1234:4: ( ruleFQN )
            {
            // InternalStates.g:1234:4: ( ruleFQN )
            // InternalStates.g:1235:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureAccess().getFeatureStatesStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_30);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:1249:3: (otherlv_5= ',' ( ( ruleFQN ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalStates.g:1250:4: otherlv_5= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_5=(Token)match(input,30,FOLLOW_12); 

            	    				newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalStates.g:1254:4: ( ( ruleFQN ) )
            	    // InternalStates.g:1255:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:1255:5: ( ruleFQN )
            	    // InternalStates.g:1256:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFeatureRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFeatureAccess().getFeatureStatesStateCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    ruleFQN();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFQN"
    // InternalStates.g:1279:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalStates.g:1279:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalStates.g:1280:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalStates.g:1286:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalStates.g:1292:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalStates.g:1293:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalStates.g:1293:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalStates.g:1294:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalStates.g:1301:3: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalStates.g:1302:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000A081D0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000A001D0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000008001D0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000011010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000001A0010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000002L});

}
