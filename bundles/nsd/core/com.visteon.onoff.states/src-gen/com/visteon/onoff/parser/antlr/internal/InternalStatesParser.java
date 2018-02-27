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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'NodeStateDiagram'", "'{'", "'GlobalTransitionTimeout'", "'GlobalEdgeweight'", "'}'", "'State'", "'initial'", "'Transition'", "':'", "'->'", "'edgeweight'", "'timeout'", "'Client'", "'COOM'", "'ClientTransitionTimeout'", "'depends on State'", "'depends on Transition'", "'depends on Feature'", "'For'", "'set'", "'Feature'", "'States'", "','", "'.'"
    };
    public static final int RULE_STRING=4;
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
    // InternalStates.g:71:1: ruleNodeStateConfiguration returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_nsd_3_0= ruleNodeStateDiagram ) )? ( (lv_clientConfig_4_0= ruleClientConfiguration ) )* ) ;
    public final EObject ruleNodeStateConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_nsd_3_0 = null;

        EObject lv_clientConfig_4_0 = null;



        	enterRule();

        try {
            // InternalStates.g:77:2: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_nsd_3_0= ruleNodeStateDiagram ) )? ( (lv_clientConfig_4_0= ruleClientConfiguration ) )* ) )
            // InternalStates.g:78:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_nsd_3_0= ruleNodeStateDiagram ) )? ( (lv_clientConfig_4_0= ruleClientConfiguration ) )* )
            {
            // InternalStates.g:78:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_nsd_3_0= ruleNodeStateDiagram ) )? ( (lv_clientConfig_4_0= ruleClientConfiguration ) )* )
            // InternalStates.g:79:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_nsd_3_0= ruleNodeStateDiagram ) )? ( (lv_clientConfig_4_0= ruleClientConfiguration ) )*
            {
            // InternalStates.g:79:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalStates.g:80:4: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getNodeStateConfigurationAccess().getPackageKeyword_0_0());
                    			
                    // InternalStates.g:84:4: ( (lv_name_1_0= ruleFQN ) )
                    // InternalStates.g:85:5: (lv_name_1_0= ruleFQN )
                    {
                    // InternalStates.g:85:5: (lv_name_1_0= ruleFQN )
                    // InternalStates.g:86:6: lv_name_1_0= ruleFQN
                    {

                    						newCompositeNode(grammarAccess.getNodeStateConfigurationAccess().getNameFQNParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleFQN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeStateConfigurationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"com.visteon.onoff.States.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStates.g:104:3: ( (lv_imports_2_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStates.g:105:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalStates.g:105:4: (lv_imports_2_0= ruleImport )
            	    // InternalStates.g:106:5: lv_imports_2_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getNodeStateConfigurationAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeStateConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"com.visteon.onoff.States.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalStates.g:123:3: ( (lv_nsd_3_0= ruleNodeStateDiagram ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStates.g:124:4: (lv_nsd_3_0= ruleNodeStateDiagram )
                    {
                    // InternalStates.g:124:4: (lv_nsd_3_0= ruleNodeStateDiagram )
                    // InternalStates.g:125:5: lv_nsd_3_0= ruleNodeStateDiagram
                    {

                    					newCompositeNode(grammarAccess.getNodeStateConfigurationAccess().getNsdNodeStateDiagramParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_nsd_3_0=ruleNodeStateDiagram();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNodeStateConfigurationRule());
                    					}
                    					set(
                    						current,
                    						"nsd",
                    						lv_nsd_3_0,
                    						"com.visteon.onoff.States.NodeStateDiagram");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalStates.g:142:3: ( (lv_clientConfig_4_0= ruleClientConfiguration ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStates.g:143:4: (lv_clientConfig_4_0= ruleClientConfiguration )
            	    {
            	    // InternalStates.g:143:4: (lv_clientConfig_4_0= ruleClientConfiguration )
            	    // InternalStates.g:144:5: lv_clientConfig_4_0= ruleClientConfiguration
            	    {

            	    					newCompositeNode(grammarAccess.getNodeStateConfigurationAccess().getClientConfigClientConfigurationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_clientConfig_4_0=ruleClientConfiguration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeStateConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clientConfig",
            	    						lv_clientConfig_4_0,
            	    						"com.visteon.onoff.States.ClientConfiguration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalStates.g:165:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalStates.g:165:47: (iv_ruleImport= ruleImport EOF )
            // InternalStates.g:166:2: iv_ruleImport= ruleImport EOF
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
    // InternalStates.g:172:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalStates.g:178:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalStates.g:179:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalStates.g:179:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalStates.g:180:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalStates.g:184:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalStates.g:185:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalStates.g:185:4: (lv_importURI_1_0= RULE_STRING )
            // InternalStates.g:186:5: lv_importURI_1_0= RULE_STRING
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
    // InternalStates.g:206:1: entryRuleNodeStateDiagram returns [EObject current=null] : iv_ruleNodeStateDiagram= ruleNodeStateDiagram EOF ;
    public final EObject entryRuleNodeStateDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStateDiagram = null;


        try {
            // InternalStates.g:206:57: (iv_ruleNodeStateDiagram= ruleNodeStateDiagram EOF )
            // InternalStates.g:207:2: iv_ruleNodeStateDiagram= ruleNodeStateDiagram EOF
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
    // InternalStates.g:213:1: ruleNodeStateDiagram returns [EObject current=null] : ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'GlobalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT ) ) )? (otherlv_5= 'GlobalEdgeweight' ( (lv_gEdgeWeight_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleNodeStateDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_gTransitionTimeoutInMilliseconds_4_0=null;
        Token otherlv_5=null;
        Token lv_gEdgeWeight_6_0=null;
        Token otherlv_9=null;
        EObject lv_nodeStates_7_0 = null;

        EObject lv_nodeTransitions_8_0 = null;



        	enterRule();

        try {
            // InternalStates.g:219:2: ( ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'GlobalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT ) ) )? (otherlv_5= 'GlobalEdgeweight' ( (lv_gEdgeWeight_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' ) )
            // InternalStates.g:220:2: ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'GlobalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT ) ) )? (otherlv_5= 'GlobalEdgeweight' ( (lv_gEdgeWeight_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' )
            {
            // InternalStates.g:220:2: ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'GlobalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT ) ) )? (otherlv_5= 'GlobalEdgeweight' ( (lv_gEdgeWeight_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' )
            // InternalStates.g:221:3: () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'GlobalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT ) ) )? (otherlv_5= 'GlobalEdgeweight' ( (lv_gEdgeWeight_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}'
            {
            // InternalStates.g:221:3: ()
            // InternalStates.g:222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeStateDiagramAccess().getNodeStateDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeStateDiagramAccess().getNodeStateDiagramKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeStateDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStates.g:236:3: (otherlv_3= 'GlobalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStates.g:237:4: otherlv_3= 'GlobalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getNodeStateDiagramAccess().getGlobalTransitionTimeoutKeyword_3_0());
                    			
                    // InternalStates.g:241:4: ( (lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT ) )
                    // InternalStates.g:242:5: (lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT )
                    {
                    // InternalStates.g:242:5: (lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT )
                    // InternalStates.g:243:6: lv_gTransitionTimeoutInMilliseconds_4_0= RULE_INT
                    {
                    lv_gTransitionTimeoutInMilliseconds_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_gTransitionTimeoutInMilliseconds_4_0, grammarAccess.getNodeStateDiagramAccess().getGTransitionTimeoutInMillisecondsINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeStateDiagramRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"gTransitionTimeoutInMilliseconds",
                    							lv_gTransitionTimeoutInMilliseconds_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStates.g:260:3: (otherlv_5= 'GlobalEdgeweight' ( (lv_gEdgeWeight_6_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStates.g:261:4: otherlv_5= 'GlobalEdgeweight' ( (lv_gEdgeWeight_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeStateDiagramAccess().getGlobalEdgeweightKeyword_4_0());
                    			
                    // InternalStates.g:265:4: ( (lv_gEdgeWeight_6_0= RULE_INT ) )
                    // InternalStates.g:266:5: (lv_gEdgeWeight_6_0= RULE_INT )
                    {
                    // InternalStates.g:266:5: (lv_gEdgeWeight_6_0= RULE_INT )
                    // InternalStates.g:267:6: lv_gEdgeWeight_6_0= RULE_INT
                    {
                    lv_gEdgeWeight_6_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_gEdgeWeight_6_0, grammarAccess.getNodeStateDiagramAccess().getGEdgeWeightINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeStateDiagramRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"gEdgeWeight",
                    							lv_gEdgeWeight_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStates.g:284:3: ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }
                else if ( (LA7_0==20) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStates.g:285:4: ( (lv_nodeStates_7_0= ruleNodeState ) )
            	    {
            	    // InternalStates.g:285:4: ( (lv_nodeStates_7_0= ruleNodeState ) )
            	    // InternalStates.g:286:5: (lv_nodeStates_7_0= ruleNodeState )
            	    {
            	    // InternalStates.g:286:5: (lv_nodeStates_7_0= ruleNodeState )
            	    // InternalStates.g:287:6: lv_nodeStates_7_0= ruleNodeState
            	    {

            	    						newCompositeNode(grammarAccess.getNodeStateDiagramAccess().getNodeStatesNodeStateParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    // InternalStates.g:305:4: ( (lv_nodeTransitions_8_0= ruleNodeTransition ) )
            	    {
            	    // InternalStates.g:305:4: ( (lv_nodeTransitions_8_0= ruleNodeTransition ) )
            	    // InternalStates.g:306:5: (lv_nodeTransitions_8_0= ruleNodeTransition )
            	    {
            	    // InternalStates.g:306:5: (lv_nodeTransitions_8_0= ruleNodeTransition )
            	    // InternalStates.g:307:6: lv_nodeTransitions_8_0= ruleNodeTransition
            	    {

            	    						newCompositeNode(grammarAccess.getNodeStateDiagramAccess().getNodeTransitionsNodeTransitionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

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
    // InternalStates.g:333:1: entryRuleNodeState returns [EObject current=null] : iv_ruleNodeState= ruleNodeState EOF ;
    public final EObject entryRuleNodeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeState = null;


        try {
            // InternalStates.g:333:50: (iv_ruleNodeState= ruleNodeState EOF )
            // InternalStates.g:334:2: iv_ruleNodeState= ruleNodeState EOF
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
    // InternalStates.g:340:1: ruleNodeState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_initial_3_0= 'initial' ) )? otherlv_4= '}' )? ) ;
    public final EObject ruleNodeState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_initial_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStates.g:346:2: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_initial_3_0= 'initial' ) )? otherlv_4= '}' )? ) )
            // InternalStates.g:347:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_initial_3_0= 'initial' ) )? otherlv_4= '}' )? )
            {
            // InternalStates.g:347:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_initial_3_0= 'initial' ) )? otherlv_4= '}' )? )
            // InternalStates.g:348:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_initial_3_0= 'initial' ) )? otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeStateAccess().getStateKeyword_0());
            		
            // InternalStates.g:352:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStates.g:353:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStates.g:353:4: (lv_name_1_0= RULE_ID )
            // InternalStates.g:354:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStates.g:370:3: (otherlv_2= '{' ( (lv_initial_3_0= 'initial' ) )? otherlv_4= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStates.g:371:4: otherlv_2= '{' ( (lv_initial_3_0= 'initial' ) )? otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeStateAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalStates.g:375:4: ( (lv_initial_3_0= 'initial' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==19) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalStates.g:376:5: (lv_initial_3_0= 'initial' )
                            {
                            // InternalStates.g:376:5: (lv_initial_3_0= 'initial' )
                            // InternalStates.g:377:6: lv_initial_3_0= 'initial'
                            {
                            lv_initial_3_0=(Token)match(input,19,FOLLOW_14); 

                            						newLeafNode(lv_initial_3_0, grammarAccess.getNodeStateAccess().getInitialInitialKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getNodeStateRule());
                            						}
                            						setWithLastConsumed(current, "initial", true, "initial");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getNodeStateAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleNodeState"


    // $ANTLR start "entryRuleNodeTransition"
    // InternalStates.g:398:1: entryRuleNodeTransition returns [EObject current=null] : iv_ruleNodeTransition= ruleNodeTransition EOF ;
    public final EObject entryRuleNodeTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTransition = null;


        try {
            // InternalStates.g:398:55: (iv_ruleNodeTransition= ruleNodeTransition EOF )
            // InternalStates.g:399:2: iv_ruleNodeTransition= ruleNodeTransition EOF
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
    // InternalStates.g:405:1: ruleNodeTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '{' (otherlv_7= 'edgeweight' ( (lv_edgeweight_8_0= RULE_INT ) ) )? (otherlv_9= 'timeout' ( (lv_timeoutInMilliseconds_10_0= RULE_INT ) ) )? otherlv_11= '}' )? ) ;
    public final EObject ruleNodeTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_edgeweight_8_0=null;
        Token otherlv_9=null;
        Token lv_timeoutInMilliseconds_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalStates.g:411:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '{' (otherlv_7= 'edgeweight' ( (lv_edgeweight_8_0= RULE_INT ) ) )? (otherlv_9= 'timeout' ( (lv_timeoutInMilliseconds_10_0= RULE_INT ) ) )? otherlv_11= '}' )? ) )
            // InternalStates.g:412:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '{' (otherlv_7= 'edgeweight' ( (lv_edgeweight_8_0= RULE_INT ) ) )? (otherlv_9= 'timeout' ( (lv_timeoutInMilliseconds_10_0= RULE_INT ) ) )? otherlv_11= '}' )? )
            {
            // InternalStates.g:412:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '{' (otherlv_7= 'edgeweight' ( (lv_edgeweight_8_0= RULE_INT ) ) )? (otherlv_9= 'timeout' ( (lv_timeoutInMilliseconds_10_0= RULE_INT ) ) )? otherlv_11= '}' )? )
            // InternalStates.g:413:3: otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '{' (otherlv_7= 'edgeweight' ( (lv_edgeweight_8_0= RULE_INT ) ) )? (otherlv_9= 'timeout' ( (lv_timeoutInMilliseconds_10_0= RULE_INT ) ) )? otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeTransitionAccess().getTransitionKeyword_0());
            		
            // InternalStates.g:417:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStates.g:418:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStates.g:418:4: (lv_name_1_0= RULE_ID )
            // InternalStates.g:419:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeTransitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeTransitionAccess().getColonKeyword_2());
            		
            // InternalStates.g:439:3: ( (otherlv_3= RULE_ID ) )
            // InternalStates.g:440:4: (otherlv_3= RULE_ID )
            {
            // InternalStates.g:440:4: (otherlv_3= RULE_ID )
            // InternalStates.g:441:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getNodeTransitionAccess().getFromStateNodeStateCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getNodeTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalStates.g:456:3: ( (otherlv_5= RULE_ID ) )
            // InternalStates.g:457:4: (otherlv_5= RULE_ID )
            {
            // InternalStates.g:457:4: (otherlv_5= RULE_ID )
            // InternalStates.g:458:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTransitionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_5, grammarAccess.getNodeTransitionAccess().getToStateNodeStateCrossReference_5_0());
            				

            }


            }

            // InternalStates.g:469:3: (otherlv_6= '{' (otherlv_7= 'edgeweight' ( (lv_edgeweight_8_0= RULE_INT ) ) )? (otherlv_9= 'timeout' ( (lv_timeoutInMilliseconds_10_0= RULE_INT ) ) )? otherlv_11= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStates.g:470:4: otherlv_6= '{' (otherlv_7= 'edgeweight' ( (lv_edgeweight_8_0= RULE_INT ) ) )? (otherlv_9= 'timeout' ( (lv_timeoutInMilliseconds_10_0= RULE_INT ) ) )? otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getNodeTransitionAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalStates.g:474:4: (otherlv_7= 'edgeweight' ( (lv_edgeweight_8_0= RULE_INT ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==23) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalStates.g:475:5: otherlv_7= 'edgeweight' ( (lv_edgeweight_8_0= RULE_INT ) )
                            {
                            otherlv_7=(Token)match(input,23,FOLLOW_9); 

                            					newLeafNode(otherlv_7, grammarAccess.getNodeTransitionAccess().getEdgeweightKeyword_6_1_0());
                            				
                            // InternalStates.g:479:5: ( (lv_edgeweight_8_0= RULE_INT ) )
                            // InternalStates.g:480:6: (lv_edgeweight_8_0= RULE_INT )
                            {
                            // InternalStates.g:480:6: (lv_edgeweight_8_0= RULE_INT )
                            // InternalStates.g:481:7: lv_edgeweight_8_0= RULE_INT
                            {
                            lv_edgeweight_8_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                            							newLeafNode(lv_edgeweight_8_0, grammarAccess.getNodeTransitionAccess().getEdgeweightINTTerminalRuleCall_6_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeTransitionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"edgeweight",
                            								lv_edgeweight_8_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalStates.g:498:4: (otherlv_9= 'timeout' ( (lv_timeoutInMilliseconds_10_0= RULE_INT ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalStates.g:499:5: otherlv_9= 'timeout' ( (lv_timeoutInMilliseconds_10_0= RULE_INT ) )
                            {
                            otherlv_9=(Token)match(input,24,FOLLOW_9); 

                            					newLeafNode(otherlv_9, grammarAccess.getNodeTransitionAccess().getTimeoutKeyword_6_2_0());
                            				
                            // InternalStates.g:503:5: ( (lv_timeoutInMilliseconds_10_0= RULE_INT ) )
                            // InternalStates.g:504:6: (lv_timeoutInMilliseconds_10_0= RULE_INT )
                            {
                            // InternalStates.g:504:6: (lv_timeoutInMilliseconds_10_0= RULE_INT )
                            // InternalStates.g:505:7: lv_timeoutInMilliseconds_10_0= RULE_INT
                            {
                            lv_timeoutInMilliseconds_10_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                            							newLeafNode(lv_timeoutInMilliseconds_10_0, grammarAccess.getNodeTransitionAccess().getTimeoutInMillisecondsINTTerminalRuleCall_6_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNodeTransitionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"timeoutInMilliseconds",
                            								lv_timeoutInMilliseconds_10_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getNodeTransitionAccess().getRightCurlyBracketKeyword_6_3());
                    			

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
    // InternalStates.g:531:1: entryRuleClientConfiguration returns [EObject current=null] : iv_ruleClientConfiguration= ruleClientConfiguration EOF ;
    public final EObject entryRuleClientConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClientConfiguration = null;


        try {
            // InternalStates.g:531:60: (iv_ruleClientConfiguration= ruleClientConfiguration EOF )
            // InternalStates.g:532:2: iv_ruleClientConfiguration= ruleClientConfiguration EOF
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
    // InternalStates.g:538:1: ruleClientConfiguration returns [EObject current=null] : (otherlv_0= 'Client' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'COOM' ( ( ruleFQN ) ) ) (otherlv_5= 'ClientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleClientConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_transTimeoutInMilliseconds_6_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_componentTransitions_7_0 = null;

        EObject lv_nodeStateAssociations_8_0 = null;

        EObject lv_componentStates_9_0 = null;

        EObject lv_features_10_0 = null;



        	enterRule();

        try {
            // InternalStates.g:544:2: ( (otherlv_0= 'Client' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'COOM' ( ( ruleFQN ) ) ) (otherlv_5= 'ClientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' ) )
            // InternalStates.g:545:2: (otherlv_0= 'Client' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'COOM' ( ( ruleFQN ) ) ) (otherlv_5= 'ClientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' )
            {
            // InternalStates.g:545:2: (otherlv_0= 'Client' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'COOM' ( ( ruleFQN ) ) ) (otherlv_5= 'ClientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' )
            // InternalStates.g:546:3: otherlv_0= 'Client' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'COOM' ( ( ruleFQN ) ) ) (otherlv_5= 'ClientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClientConfigurationAccess().getClientKeyword_0());
            		
            // InternalStates.g:550:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalStates.g:551:4: (lv_name_1_0= ruleFQN )
            {
            // InternalStates.g:551:4: (lv_name_1_0= ruleFQN )
            // InternalStates.g:552:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getClientConfigurationAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.visteon.onoff.States.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getClientConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStates.g:573:3: (otherlv_3= 'COOM' ( ( ruleFQN ) ) )
            // InternalStates.g:574:4: otherlv_3= 'COOM' ( ( ruleFQN ) )
            {
            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getClientConfigurationAccess().getCOOMKeyword_3_0());
            			
            // InternalStates.g:578:4: ( ( ruleFQN ) )
            // InternalStates.g:579:5: ( ruleFQN )
            {
            // InternalStates.g:579:5: ( ruleFQN )
            // InternalStates.g:580:6: ruleFQN
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getClientConfigurationRule());
            						}
            					

            						newCompositeNode(grammarAccess.getClientConfigurationAccess().getCoomRefComponentOnOffManifestCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_20);
            ruleFQN();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalStates.g:595:3: (otherlv_5= 'ClientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStates.g:596:4: otherlv_5= 'ClientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getClientConfigurationAccess().getClientTransitionTimeoutKeyword_4_0());
                    			
                    // InternalStates.g:600:4: ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) )
                    // InternalStates.g:601:5: (lv_transTimeoutInMilliseconds_6_0= RULE_INT )
                    {
                    // InternalStates.g:601:5: (lv_transTimeoutInMilliseconds_6_0= RULE_INT )
                    // InternalStates.g:602:6: lv_transTimeoutInMilliseconds_6_0= RULE_INT
                    {
                    lv_transTimeoutInMilliseconds_6_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

            // InternalStates.g:619:3: ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )*
            loop14:
            do {
                int alt14=5;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    alt14=1;
                    }
                    break;
                case 31:
                    {
                    alt14=2;
                    }
                    break;
                case 18:
                    {
                    alt14=3;
                    }
                    break;
                case 33:
                    {
                    alt14=4;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalStates.g:620:4: ( (lv_componentTransitions_7_0= ruleComponentTransition ) )
            	    {
            	    // InternalStates.g:620:4: ( (lv_componentTransitions_7_0= ruleComponentTransition ) )
            	    // InternalStates.g:621:5: (lv_componentTransitions_7_0= ruleComponentTransition )
            	    {
            	    // InternalStates.g:621:5: (lv_componentTransitions_7_0= ruleComponentTransition )
            	    // InternalStates.g:622:6: lv_componentTransitions_7_0= ruleComponentTransition
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getComponentTransitionsComponentTransitionParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_componentTransitions_7_0=ruleComponentTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"componentTransitions",
            	    							lv_componentTransitions_7_0,
            	    							"com.visteon.onoff.States.ComponentTransition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStates.g:640:4: ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) )
            	    {
            	    // InternalStates.g:640:4: ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) )
            	    // InternalStates.g:641:5: (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation )
            	    {
            	    // InternalStates.g:641:5: (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation )
            	    // InternalStates.g:642:6: lv_nodeStateAssociations_8_0= ruleNodeStateAssociation
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getNodeStateAssociationsNodeStateAssociationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_nodeStateAssociations_8_0=ruleNodeStateAssociation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClientConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nodeStateAssociations",
            	    							lv_nodeStateAssociations_8_0,
            	    							"com.visteon.onoff.States.NodeStateAssociation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStates.g:660:4: ( (lv_componentStates_9_0= ruleComponentState ) )
            	    {
            	    // InternalStates.g:660:4: ( (lv_componentStates_9_0= ruleComponentState ) )
            	    // InternalStates.g:661:5: (lv_componentStates_9_0= ruleComponentState )
            	    {
            	    // InternalStates.g:661:5: (lv_componentStates_9_0= ruleComponentState )
            	    // InternalStates.g:662:6: lv_componentStates_9_0= ruleComponentState
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getComponentStatesComponentStateParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	case 4 :
            	    // InternalStates.g:680:4: ( (lv_features_10_0= ruleFeature ) )
            	    {
            	    // InternalStates.g:680:4: ( (lv_features_10_0= ruleFeature ) )
            	    // InternalStates.g:681:5: (lv_features_10_0= ruleFeature )
            	    {
            	    // InternalStates.g:681:5: (lv_features_10_0= ruleFeature )
            	    // InternalStates.g:682:6: lv_features_10_0= ruleFeature
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getFeaturesFeatureParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop14;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getClientConfigurationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalStates.g:708:1: entryRuleComponentTransition returns [EObject current=null] : iv_ruleComponentTransition= ruleComponentTransition EOF ;
    public final EObject entryRuleComponentTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTransition = null;


        try {
            // InternalStates.g:708:60: (iv_ruleComponentTransition= ruleComponentTransition EOF )
            // InternalStates.g:709:2: iv_ruleComponentTransition= ruleComponentTransition EOF
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
    // InternalStates.g:715:1: ruleComponentTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( ( ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'timeout' ( (lv_timeoutInMilliseconds_4_0= RULE_INT ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleComponentTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_timeoutInMilliseconds_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalStates.g:721:2: ( (otherlv_0= 'Transition' ( ( ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'timeout' ( (lv_timeoutInMilliseconds_4_0= RULE_INT ) ) )? otherlv_5= '}' ) )
            // InternalStates.g:722:2: (otherlv_0= 'Transition' ( ( ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'timeout' ( (lv_timeoutInMilliseconds_4_0= RULE_INT ) ) )? otherlv_5= '}' )
            {
            // InternalStates.g:722:2: (otherlv_0= 'Transition' ( ( ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'timeout' ( (lv_timeoutInMilliseconds_4_0= RULE_INT ) ) )? otherlv_5= '}' )
            // InternalStates.g:723:3: otherlv_0= 'Transition' ( ( ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'timeout' ( (lv_timeoutInMilliseconds_4_0= RULE_INT ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentTransitionAccess().getTransitionKeyword_0());
            		
            // InternalStates.g:727:3: ( ( ruleFQN ) )
            // InternalStates.g:728:4: ( ruleFQN )
            {
            // InternalStates.g:728:4: ( ruleFQN )
            // InternalStates.g:729:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentTransitionAccess().getTransitionTransitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStates.g:747:3: (otherlv_3= 'timeout' ( (lv_timeoutInMilliseconds_4_0= RULE_INT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalStates.g:748:4: otherlv_3= 'timeout' ( (lv_timeoutInMilliseconds_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentTransitionAccess().getTimeoutKeyword_3_0());
                    			
                    // InternalStates.g:752:4: ( (lv_timeoutInMilliseconds_4_0= RULE_INT ) )
                    // InternalStates.g:753:5: (lv_timeoutInMilliseconds_4_0= RULE_INT )
                    {
                    // InternalStates.g:753:5: (lv_timeoutInMilliseconds_4_0= RULE_INT )
                    // InternalStates.g:754:6: lv_timeoutInMilliseconds_4_0= RULE_INT
                    {
                    lv_timeoutInMilliseconds_4_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    						newLeafNode(lv_timeoutInMilliseconds_4_0, grammarAccess.getComponentTransitionAccess().getTimeoutInMillisecondsINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"timeoutInMilliseconds",
                    							lv_timeoutInMilliseconds_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentTransitionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalStates.g:779:1: entryRuleComponentState returns [EObject current=null] : iv_ruleComponentState= ruleComponentState EOF ;
    public final EObject entryRuleComponentState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentState = null;


        try {
            // InternalStates.g:779:55: (iv_ruleComponentState= ruleComponentState EOF )
            // InternalStates.g:780:2: iv_ruleComponentState= ruleComponentState EOF
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
    // InternalStates.g:786:1: ruleComponentState returns [EObject current=null] : (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( (lv_stateDependencies_3_0= ruleStateDependency ) ) | ( (lv_featureDependencies_4_0= ruleFeatureDependency ) ) | ( (lv_transitionDependencies_5_0= ruleTransitionDependency ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleComponentState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_stateDependencies_3_0 = null;

        EObject lv_featureDependencies_4_0 = null;

        EObject lv_transitionDependencies_5_0 = null;



        	enterRule();

        try {
            // InternalStates.g:792:2: ( (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( (lv_stateDependencies_3_0= ruleStateDependency ) ) | ( (lv_featureDependencies_4_0= ruleFeatureDependency ) ) | ( (lv_transitionDependencies_5_0= ruleTransitionDependency ) ) )* otherlv_6= '}' ) )
            // InternalStates.g:793:2: (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( (lv_stateDependencies_3_0= ruleStateDependency ) ) | ( (lv_featureDependencies_4_0= ruleFeatureDependency ) ) | ( (lv_transitionDependencies_5_0= ruleTransitionDependency ) ) )* otherlv_6= '}' )
            {
            // InternalStates.g:793:2: (otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( (lv_stateDependencies_3_0= ruleStateDependency ) ) | ( (lv_featureDependencies_4_0= ruleFeatureDependency ) ) | ( (lv_transitionDependencies_5_0= ruleTransitionDependency ) ) )* otherlv_6= '}' )
            // InternalStates.g:794:3: otherlv_0= 'State' ( ( ruleFQN ) ) otherlv_2= '{' ( ( (lv_stateDependencies_3_0= ruleStateDependency ) ) | ( (lv_featureDependencies_4_0= ruleFeatureDependency ) ) | ( (lv_transitionDependencies_5_0= ruleTransitionDependency ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentStateAccess().getStateKeyword_0());
            		
            // InternalStates.g:798:3: ( ( ruleFQN ) )
            // InternalStates.g:799:4: ( ruleFQN )
            {
            // InternalStates.g:799:4: ( ruleFQN )
            // InternalStates.g:800:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentStateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentStateAccess().getStateStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentStateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStates.g:818:3: ( ( (lv_stateDependencies_3_0= ruleStateDependency ) ) | ( (lv_featureDependencies_4_0= ruleFeatureDependency ) ) | ( (lv_transitionDependencies_5_0= ruleTransitionDependency ) ) )*
            loop16:
            do {
                int alt16=4;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    alt16=1;
                    }
                    break;
                case 30:
                    {
                    alt16=2;
                    }
                    break;
                case 29:
                    {
                    alt16=3;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalStates.g:819:4: ( (lv_stateDependencies_3_0= ruleStateDependency ) )
            	    {
            	    // InternalStates.g:819:4: ( (lv_stateDependencies_3_0= ruleStateDependency ) )
            	    // InternalStates.g:820:5: (lv_stateDependencies_3_0= ruleStateDependency )
            	    {
            	    // InternalStates.g:820:5: (lv_stateDependencies_3_0= ruleStateDependency )
            	    // InternalStates.g:821:6: lv_stateDependencies_3_0= ruleStateDependency
            	    {

            	    						newCompositeNode(grammarAccess.getComponentStateAccess().getStateDependenciesStateDependencyParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_stateDependencies_3_0=ruleStateDependency();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stateDependencies",
            	    							lv_stateDependencies_3_0,
            	    							"com.visteon.onoff.States.StateDependency");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStates.g:839:4: ( (lv_featureDependencies_4_0= ruleFeatureDependency ) )
            	    {
            	    // InternalStates.g:839:4: ( (lv_featureDependencies_4_0= ruleFeatureDependency ) )
            	    // InternalStates.g:840:5: (lv_featureDependencies_4_0= ruleFeatureDependency )
            	    {
            	    // InternalStates.g:840:5: (lv_featureDependencies_4_0= ruleFeatureDependency )
            	    // InternalStates.g:841:6: lv_featureDependencies_4_0= ruleFeatureDependency
            	    {

            	    						newCompositeNode(grammarAccess.getComponentStateAccess().getFeatureDependenciesFeatureDependencyParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_featureDependencies_4_0=ruleFeatureDependency();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"featureDependencies",
            	    							lv_featureDependencies_4_0,
            	    							"com.visteon.onoff.States.FeatureDependency");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStates.g:859:4: ( (lv_transitionDependencies_5_0= ruleTransitionDependency ) )
            	    {
            	    // InternalStates.g:859:4: ( (lv_transitionDependencies_5_0= ruleTransitionDependency ) )
            	    // InternalStates.g:860:5: (lv_transitionDependencies_5_0= ruleTransitionDependency )
            	    {
            	    // InternalStates.g:860:5: (lv_transitionDependencies_5_0= ruleTransitionDependency )
            	    // InternalStates.g:861:6: lv_transitionDependencies_5_0= ruleTransitionDependency
            	    {

            	    						newCompositeNode(grammarAccess.getComponentStateAccess().getTransitionDependenciesTransitionDependencyParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_transitionDependencies_5_0=ruleTransitionDependency();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitionDependencies",
            	    							lv_transitionDependencies_5_0,
            	    							"com.visteon.onoff.States.TransitionDependency");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentStateAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalStates.g:887:1: entryRuleStateDependency returns [EObject current=null] : iv_ruleStateDependency= ruleStateDependency EOF ;
    public final EObject entryRuleStateDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDependency = null;


        try {
            // InternalStates.g:887:56: (iv_ruleStateDependency= ruleStateDependency EOF )
            // InternalStates.g:888:2: iv_ruleStateDependency= ruleStateDependency EOF
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
    // InternalStates.g:894:1: ruleStateDependency returns [EObject current=null] : (otherlv_0= 'depends on State' ( ( ruleFQN ) ) ) ;
    public final EObject ruleStateDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalStates.g:900:2: ( (otherlv_0= 'depends on State' ( ( ruleFQN ) ) ) )
            // InternalStates.g:901:2: (otherlv_0= 'depends on State' ( ( ruleFQN ) ) )
            {
            // InternalStates.g:901:2: (otherlv_0= 'depends on State' ( ( ruleFQN ) ) )
            // InternalStates.g:902:3: otherlv_0= 'depends on State' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDependencyAccess().getDependsOnStateKeyword_0());
            		
            // InternalStates.g:906:3: ( ( ruleFQN ) )
            // InternalStates.g:907:4: ( ruleFQN )
            {
            // InternalStates.g:907:4: ( ruleFQN )
            // InternalStates.g:908:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateDependencyAccess().getStateDependenyStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleStateDependency"


    // $ANTLR start "entryRuleTransitionDependency"
    // InternalStates.g:926:1: entryRuleTransitionDependency returns [EObject current=null] : iv_ruleTransitionDependency= ruleTransitionDependency EOF ;
    public final EObject entryRuleTransitionDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDependency = null;


        try {
            // InternalStates.g:926:61: (iv_ruleTransitionDependency= ruleTransitionDependency EOF )
            // InternalStates.g:927:2: iv_ruleTransitionDependency= ruleTransitionDependency EOF
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
    // InternalStates.g:933:1: ruleTransitionDependency returns [EObject current=null] : (otherlv_0= 'depends on Transition' ( ( ruleFQN ) ) ) ;
    public final EObject ruleTransitionDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalStates.g:939:2: ( (otherlv_0= 'depends on Transition' ( ( ruleFQN ) ) ) )
            // InternalStates.g:940:2: (otherlv_0= 'depends on Transition' ( ( ruleFQN ) ) )
            {
            // InternalStates.g:940:2: (otherlv_0= 'depends on Transition' ( ( ruleFQN ) ) )
            // InternalStates.g:941:3: otherlv_0= 'depends on Transition' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDependencyAccess().getDependsOnTransitionKeyword_0());
            		
            // InternalStates.g:945:3: ( ( ruleFQN ) )
            // InternalStates.g:946:4: ( ruleFQN )
            {
            // InternalStates.g:946:4: ( ruleFQN )
            // InternalStates.g:947:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionDependencyAccess().getTransitionDependenyTransitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleTransitionDependency"


    // $ANTLR start "entryRuleFeatureDependency"
    // InternalStates.g:965:1: entryRuleFeatureDependency returns [EObject current=null] : iv_ruleFeatureDependency= ruleFeatureDependency EOF ;
    public final EObject entryRuleFeatureDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDependency = null;


        try {
            // InternalStates.g:965:58: (iv_ruleFeatureDependency= ruleFeatureDependency EOF )
            // InternalStates.g:966:2: iv_ruleFeatureDependency= ruleFeatureDependency EOF
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
    // InternalStates.g:972:1: ruleFeatureDependency returns [EObject current=null] : (otherlv_0= 'depends on Feature' ( ( ruleFQN ) ) ) ;
    public final EObject ruleFeatureDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalStates.g:978:2: ( (otherlv_0= 'depends on Feature' ( ( ruleFQN ) ) ) )
            // InternalStates.g:979:2: (otherlv_0= 'depends on Feature' ( ( ruleFQN ) ) )
            {
            // InternalStates.g:979:2: (otherlv_0= 'depends on Feature' ( ( ruleFQN ) ) )
            // InternalStates.g:980:3: otherlv_0= 'depends on Feature' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureDependencyAccess().getDependsOnFeatureKeyword_0());
            		
            // InternalStates.g:984:3: ( ( ruleFQN ) )
            // InternalStates.g:985:4: ( ruleFQN )
            {
            // InternalStates.g:985:4: ( ruleFQN )
            // InternalStates.g:986:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureDependencyAccess().getFeatureDependenyFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleFeatureDependency"


    // $ANTLR start "entryRuleNodeStateAssociation"
    // InternalStates.g:1004:1: entryRuleNodeStateAssociation returns [EObject current=null] : iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF ;
    public final EObject entryRuleNodeStateAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStateAssociation = null;


        try {
            // InternalStates.g:1004:61: (iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF )
            // InternalStates.g:1005:2: iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF
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
    // InternalStates.g:1011:1: ruleNodeStateAssociation returns [EObject current=null] : (otherlv_0= 'For' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( ( ruleFQN ) ) ) ;
    public final EObject ruleNodeStateAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStates.g:1017:2: ( (otherlv_0= 'For' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( ( ruleFQN ) ) ) )
            // InternalStates.g:1018:2: (otherlv_0= 'For' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( ( ruleFQN ) ) )
            {
            // InternalStates.g:1018:2: (otherlv_0= 'For' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( ( ruleFQN ) ) )
            // InternalStates.g:1019:3: otherlv_0= 'For' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeStateAssociationAccess().getForKeyword_0());
            		
            // InternalStates.g:1023:3: ( (otherlv_1= RULE_ID ) )
            // InternalStates.g:1024:4: (otherlv_1= RULE_ID )
            {
            // InternalStates.g:1024:4: (otherlv_1= RULE_ID )
            // InternalStates.g:1025:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeStateAssociationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getNodeStateAssociationAccess().getNodeStateNodeStateCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeStateAssociationAccess().getSetKeyword_2());
            		
            // InternalStates.g:1040:3: ( ( ruleFQN ) )
            // InternalStates.g:1041:4: ( ruleFQN )
            {
            // InternalStates.g:1041:4: ( ruleFQN )
            // InternalStates.g:1042:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeStateAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeStateAssociationAccess().getClientStateStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleNodeStateAssociation"


    // $ANTLR start "entryRuleFeature"
    // InternalStates.g:1060:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalStates.g:1060:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalStates.g:1061:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalStates.g:1067:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'States' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' ) ;
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
            // InternalStates.g:1073:2: ( (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'States' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' ) )
            // InternalStates.g:1074:2: (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'States' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' )
            {
            // InternalStates.g:1074:2: (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'States' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' )
            // InternalStates.g:1075:3: otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'States' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
            		
            // InternalStates.g:1079:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStates.g:1080:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStates.g:1080:4: (lv_name_1_0= RULE_ID )
            // InternalStates.g:1081:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getStatesKeyword_3());
            		
            // InternalStates.g:1105:3: ( ( ruleFQN ) )
            // InternalStates.g:1106:4: ( ruleFQN )
            {
            // InternalStates.g:1106:4: ( ruleFQN )
            // InternalStates.g:1107:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureAccess().getFeatureStatesStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:1121:3: (otherlv_5= ',' ( ( ruleFQN ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStates.g:1122:4: otherlv_5= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_5=(Token)match(input,35,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalStates.g:1126:4: ( ( ruleFQN ) )
            	    // InternalStates.g:1127:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:1127:5: ( ruleFQN )
            	    // InternalStates.g:1128:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFeatureRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFeatureAccess().getFeatureStatesStateCrossReference_5_1_0());
            	    					
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

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalStates.g:1151:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalStates.g:1151:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalStates.g:1152:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalStates.g:1158:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalStates.g:1164:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalStates.g:1165:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalStates.g:1165:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalStates.g:1166:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalStates.g:1173:3: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStates.g:1174:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleFQN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000178000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000170000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001820000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000288160000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000280160000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000070020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000002L});

}