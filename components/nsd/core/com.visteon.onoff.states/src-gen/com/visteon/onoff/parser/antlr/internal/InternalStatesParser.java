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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'NodeStateDiagram'", "'{'", "'globalEdgeweight'", "'globalTransitionTimeout'", "'}'", "'initial'", "'State'", "'essential'", "'Transition'", "':'", "'->'", "'edgeweight'", "'timeout'", "'Client'", "'coom'", "'clientTransitionTimeout'", "'max-retries'", "'depends on states'", "','", "'depends on transitions'", "'depends in features'", "'For'", "'set'", "'Feature'", "'states'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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

                if ( (LA4_0==26) ) {
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
    // InternalStates.g:213:1: ruleNodeStateDiagram returns [EObject current=null] : ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' ) ;
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
            // InternalStates.g:219:2: ( ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' ) )
            // InternalStates.g:220:2: ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' )
            {
            // InternalStates.g:220:2: ( () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}' )
            // InternalStates.g:221:3: () otherlv_1= 'NodeStateDiagram' otherlv_2= '{' (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )? (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )* otherlv_9= '}'
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
            		
            // InternalStates.g:236:3: (otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStates.g:237:4: otherlv_3= 'globalEdgeweight' ( (lv_gEdgeWeight_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getNodeStateDiagramAccess().getGlobalEdgeweightKeyword_3_0());
                    			
                    // InternalStates.g:241:4: ( (lv_gEdgeWeight_4_0= RULE_INT ) )
                    // InternalStates.g:242:5: (lv_gEdgeWeight_4_0= RULE_INT )
                    {
                    // InternalStates.g:242:5: (lv_gEdgeWeight_4_0= RULE_INT )
                    // InternalStates.g:243:6: lv_gEdgeWeight_4_0= RULE_INT
                    {
                    lv_gEdgeWeight_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            // InternalStates.g:260:3: (otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStates.g:261:4: otherlv_5= 'globalTransitionTimeout' ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeStateDiagramAccess().getGlobalTransitionTimeoutKeyword_4_0());
                    			
                    // InternalStates.g:265:4: ( (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT ) )
                    // InternalStates.g:266:5: (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT )
                    {
                    // InternalStates.g:266:5: (lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT )
                    // InternalStates.g:267:6: lv_gTransitionTimeoutInMilliseconds_6_0= RULE_INT
                    {
                    lv_gTransitionTimeoutInMilliseconds_6_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            // InternalStates.g:284:3: ( ( (lv_nodeStates_7_0= ruleNodeState ) ) | ( (lv_nodeTransitions_8_0= ruleNodeTransition ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=19)) ) {
                    alt7=1;
                }
                else if ( ((LA7_0>=20 && LA7_0<=21)) ) {
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
    // InternalStates.g:340:1: ruleNodeState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' otherlv_4= '}' )? ) ;
    public final EObject ruleNodeState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalStates.g:346:2: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' otherlv_4= '}' )? ) )
            // InternalStates.g:347:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' otherlv_4= '}' )? )
            {
            // InternalStates.g:347:2: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' otherlv_4= '}' )? )
            // InternalStates.g:348:3: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'State' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' otherlv_4= '}' )?
            {
            // InternalStates.g:348:3: ( (lv_initial_0_0= 'initial' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStates.g:349:4: (lv_initial_0_0= 'initial' )
                    {
                    // InternalStates.g:349:4: (lv_initial_0_0= 'initial' )
                    // InternalStates.g:350:5: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(lv_initial_0_0, grammarAccess.getNodeStateAccess().getInitialInitialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeStateAccess().getStateKeyword_1());
            		
            // InternalStates.g:366:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalStates.g:367:4: (lv_name_2_0= RULE_ID )
            {
            // InternalStates.g:367:4: (lv_name_2_0= RULE_ID )
            // InternalStates.g:368:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalStates.g:384:3: (otherlv_3= '{' otherlv_4= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStates.g:385:4: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getNodeStateAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getNodeStateAccess().getRightCurlyBracketKeyword_3_1());
                    			

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
    // InternalStates.g:405:1: ruleNodeTransition returns [EObject current=null] : ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? ) ;
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
            // InternalStates.g:411:2: ( ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? ) )
            // InternalStates.g:412:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? )
            {
            // InternalStates.g:412:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )? )
            // InternalStates.g:413:3: ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )?
            {
            // InternalStates.g:413:3: ( (lv_essential_0_0= 'essential' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStates.g:414:4: (lv_essential_0_0= 'essential' )
                    {
                    // InternalStates.g:414:4: (lv_essential_0_0= 'essential' )
                    // InternalStates.g:415:5: lv_essential_0_0= 'essential'
                    {
                    lv_essential_0_0=(Token)match(input,20,FOLLOW_15); 

                    					newLeafNode(lv_essential_0_0, grammarAccess.getNodeTransitionAccess().getEssentialEssentialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeTransitionRule());
                    					}
                    					setWithLastConsumed(current, "essential", true, "essential");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeTransitionAccess().getTransitionKeyword_1());
            		
            // InternalStates.g:431:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalStates.g:432:4: (lv_name_2_0= RULE_ID )
            {
            // InternalStates.g:432:4: (lv_name_2_0= RULE_ID )
            // InternalStates.g:433:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeTransitionAccess().getColonKeyword_3());
            		
            // InternalStates.g:453:3: ( (otherlv_4= RULE_ID ) )
            // InternalStates.g:454:4: (otherlv_4= RULE_ID )
            {
            // InternalStates.g:454:4: (otherlv_4= RULE_ID )
            // InternalStates.g:455:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTransitionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_4, grammarAccess.getNodeTransitionAccess().getFromStateNodeStateCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getNodeTransitionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalStates.g:470:3: ( (otherlv_6= RULE_ID ) )
            // InternalStates.g:471:4: (otherlv_6= RULE_ID )
            {
            // InternalStates.g:471:4: (otherlv_6= RULE_ID )
            // InternalStates.g:472:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeTransitionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_6, grammarAccess.getNodeTransitionAccess().getToStateNodeStateCrossReference_6_0());
            				

            }


            }

            // InternalStates.g:483:3: (otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStates.g:484:4: otherlv_7= '{' (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )? (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )? otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getNodeTransitionAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalStates.g:488:4: (otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalStates.g:489:5: otherlv_8= 'edgeweight' ( (lv_edgeweight_9_0= RULE_INT ) )
                            {
                            otherlv_8=(Token)match(input,24,FOLLOW_9); 

                            					newLeafNode(otherlv_8, grammarAccess.getNodeTransitionAccess().getEdgeweightKeyword_7_1_0());
                            				
                            // InternalStates.g:493:5: ( (lv_edgeweight_9_0= RULE_INT ) )
                            // InternalStates.g:494:6: (lv_edgeweight_9_0= RULE_INT )
                            {
                            // InternalStates.g:494:6: (lv_edgeweight_9_0= RULE_INT )
                            // InternalStates.g:495:7: lv_edgeweight_9_0= RULE_INT
                            {
                            lv_edgeweight_9_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

                    // InternalStates.g:512:4: (otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==25) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalStates.g:513:5: otherlv_10= 'timeout' ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) )
                            {
                            otherlv_10=(Token)match(input,25,FOLLOW_9); 

                            					newLeafNode(otherlv_10, grammarAccess.getNodeTransitionAccess().getTimeoutKeyword_7_2_0());
                            				
                            // InternalStates.g:517:5: ( (lv_timeoutInMilliseconds_11_0= RULE_INT ) )
                            // InternalStates.g:518:6: (lv_timeoutInMilliseconds_11_0= RULE_INT )
                            {
                            // InternalStates.g:518:6: (lv_timeoutInMilliseconds_11_0= RULE_INT )
                            // InternalStates.g:519:7: lv_timeoutInMilliseconds_11_0= RULE_INT
                            {
                            lv_timeoutInMilliseconds_11_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

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
    // InternalStates.g:545:1: entryRuleClientConfiguration returns [EObject current=null] : iv_ruleClientConfiguration= ruleClientConfiguration EOF ;
    public final EObject entryRuleClientConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClientConfiguration = null;


        try {
            // InternalStates.g:545:60: (iv_ruleClientConfiguration= ruleClientConfiguration EOF )
            // InternalStates.g:546:2: iv_ruleClientConfiguration= ruleClientConfiguration EOF
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
    // InternalStates.g:552:1: ruleClientConfiguration returns [EObject current=null] : (otherlv_0= 'Client' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'coom' ( ( ruleFQN ) ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' ) ;
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
            // InternalStates.g:558:2: ( (otherlv_0= 'Client' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'coom' ( ( ruleFQN ) ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' ) )
            // InternalStates.g:559:2: (otherlv_0= 'Client' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'coom' ( ( ruleFQN ) ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' )
            {
            // InternalStates.g:559:2: (otherlv_0= 'Client' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'coom' ( ( ruleFQN ) ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}' )
            // InternalStates.g:560:3: otherlv_0= 'Client' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' (otherlv_3= 'coom' ( ( ruleFQN ) ) ) (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )? ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClientConfigurationAccess().getClientKeyword_0());
            		
            // InternalStates.g:564:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalStates.g:565:4: (lv_name_1_0= ruleFQN )
            {
            // InternalStates.g:565:4: (lv_name_1_0= ruleFQN )
            // InternalStates.g:566:5: lv_name_1_0= ruleFQN
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

            otherlv_2=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getClientConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStates.g:587:3: (otherlv_3= 'coom' ( ( ruleFQN ) ) )
            // InternalStates.g:588:4: otherlv_3= 'coom' ( ( ruleFQN ) )
            {
            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getClientConfigurationAccess().getCoomKeyword_3_0());
            			
            // InternalStates.g:592:4: ( ( ruleFQN ) )
            // InternalStates.g:593:5: ( ruleFQN )
            {
            // InternalStates.g:593:5: ( ruleFQN )
            // InternalStates.g:594:6: ruleFQN
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getClientConfigurationRule());
            						}
            					

            						newCompositeNode(grammarAccess.getClientConfigurationAccess().getCoomRefComponentOnOffManifestCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_21);
            ruleFQN();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalStates.g:609:3: (otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStates.g:610:4: otherlv_5= 'clientTransitionTimeout' ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getClientConfigurationAccess().getClientTransitionTimeoutKeyword_4_0());
                    			
                    // InternalStates.g:614:4: ( (lv_transTimeoutInMilliseconds_6_0= RULE_INT ) )
                    // InternalStates.g:615:5: (lv_transTimeoutInMilliseconds_6_0= RULE_INT )
                    {
                    // InternalStates.g:615:5: (lv_transTimeoutInMilliseconds_6_0= RULE_INT )
                    // InternalStates.g:616:6: lv_transTimeoutInMilliseconds_6_0= RULE_INT
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

            // InternalStates.g:633:3: ( ( (lv_componentTransitions_7_0= ruleComponentTransition ) ) | ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) ) | ( (lv_componentStates_9_0= ruleComponentState ) ) | ( (lv_features_10_0= ruleFeature ) ) )*
            loop15:
            do {
                int alt15=5;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==17||(LA15_1>=19 && LA15_1<=21)||(LA15_1>=32 && LA15_1<=34)||LA15_1==36) ) {
                        alt15=3;
                    }


                    }
                    break;
                case 20:
                case 21:
                    {
                    alt15=1;
                    }
                    break;
                case 34:
                    {
                    alt15=2;
                    }
                    break;
                case 19:
                case 32:
                case 33:
                    {
                    alt15=3;
                    }
                    break;
                case 36:
                    {
                    alt15=4;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalStates.g:634:4: ( (lv_componentTransitions_7_0= ruleComponentTransition ) )
            	    {
            	    // InternalStates.g:634:4: ( (lv_componentTransitions_7_0= ruleComponentTransition ) )
            	    // InternalStates.g:635:5: (lv_componentTransitions_7_0= ruleComponentTransition )
            	    {
            	    // InternalStates.g:635:5: (lv_componentTransitions_7_0= ruleComponentTransition )
            	    // InternalStates.g:636:6: lv_componentTransitions_7_0= ruleComponentTransition
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getComponentTransitionsComponentTransitionParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    // InternalStates.g:654:4: ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) )
            	    {
            	    // InternalStates.g:654:4: ( (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation ) )
            	    // InternalStates.g:655:5: (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation )
            	    {
            	    // InternalStates.g:655:5: (lv_nodeStateAssociations_8_0= ruleNodeStateAssociation )
            	    // InternalStates.g:656:6: lv_nodeStateAssociations_8_0= ruleNodeStateAssociation
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getNodeStateAssociationsNodeStateAssociationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    // InternalStates.g:674:4: ( (lv_componentStates_9_0= ruleComponentState ) )
            	    {
            	    // InternalStates.g:674:4: ( (lv_componentStates_9_0= ruleComponentState ) )
            	    // InternalStates.g:675:5: (lv_componentStates_9_0= ruleComponentState )
            	    {
            	    // InternalStates.g:675:5: (lv_componentStates_9_0= ruleComponentState )
            	    // InternalStates.g:676:6: lv_componentStates_9_0= ruleComponentState
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getComponentStatesComponentStateParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    // InternalStates.g:694:4: ( (lv_features_10_0= ruleFeature ) )
            	    {
            	    // InternalStates.g:694:4: ( (lv_features_10_0= ruleFeature ) )
            	    // InternalStates.g:695:5: (lv_features_10_0= ruleFeature )
            	    {
            	    // InternalStates.g:695:5: (lv_features_10_0= ruleFeature )
            	    // InternalStates.g:696:6: lv_features_10_0= ruleFeature
            	    {

            	    						newCompositeNode(grammarAccess.getClientConfigurationAccess().getFeaturesFeatureParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop15;
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
    // InternalStates.g:722:1: entryRuleComponentTransition returns [EObject current=null] : iv_ruleComponentTransition= ruleComponentTransition EOF ;
    public final EObject entryRuleComponentTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTransition = null;


        try {
            // InternalStates.g:722:60: (iv_ruleComponentTransition= ruleComponentTransition EOF )
            // InternalStates.g:723:2: iv_ruleComponentTransition= ruleComponentTransition EOF
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
    // InternalStates.g:729:1: ruleComponentTransition returns [EObject current=null] : ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? otherlv_8= '}' ) ;
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
            // InternalStates.g:735:2: ( ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? otherlv_8= '}' ) )
            // InternalStates.g:736:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            {
            // InternalStates.g:736:2: ( ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? otherlv_8= '}' )
            // InternalStates.g:737:3: ( (lv_essential_0_0= 'essential' ) )? otherlv_1= 'Transition' ( ( ruleFQN ) ) otherlv_3= '{' (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )? (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )? otherlv_8= '}'
            {
            // InternalStates.g:737:3: ( (lv_essential_0_0= 'essential' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStates.g:738:4: (lv_essential_0_0= 'essential' )
                    {
                    // InternalStates.g:738:4: (lv_essential_0_0= 'essential' )
                    // InternalStates.g:739:5: lv_essential_0_0= 'essential'
                    {
                    lv_essential_0_0=(Token)match(input,20,FOLLOW_15); 

                    					newLeafNode(lv_essential_0_0, grammarAccess.getComponentTransitionAccess().getEssentialEssentialKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentTransitionRule());
                    					}
                    					setWithLastConsumed(current, "essential", true, "essential");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTransitionAccess().getTransitionKeyword_1());
            		
            // InternalStates.g:755:3: ( ( ruleFQN ) )
            // InternalStates.g:756:4: ( ruleFQN )
            {
            // InternalStates.g:756:4: ( ruleFQN )
            // InternalStates.g:757:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentTransitionAccess().getTransitionTransitionCrossReference_2_0());
            				
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentTransitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalStates.g:775:3: (otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalStates.g:776:4: otherlv_4= 'timeout' ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentTransitionAccess().getTimeoutKeyword_4_0());
                    			
                    // InternalStates.g:780:4: ( (lv_timeoutInMilliseconds_5_0= RULE_INT ) )
                    // InternalStates.g:781:5: (lv_timeoutInMilliseconds_5_0= RULE_INT )
                    {
                    // InternalStates.g:781:5: (lv_timeoutInMilliseconds_5_0= RULE_INT )
                    // InternalStates.g:782:6: lv_timeoutInMilliseconds_5_0= RULE_INT
                    {
                    lv_timeoutInMilliseconds_5_0=(Token)match(input,RULE_INT,FOLLOW_24); 

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

            // InternalStates.g:799:3: (otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalStates.g:800:4: otherlv_6= 'max-retries' ( (lv_maxretries_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentTransitionAccess().getMaxRetriesKeyword_5_0());
                    			
                    // InternalStates.g:804:4: ( (lv_maxretries_7_0= RULE_INT ) )
                    // InternalStates.g:805:5: (lv_maxretries_7_0= RULE_INT )
                    {
                    // InternalStates.g:805:5: (lv_maxretries_7_0= RULE_INT )
                    // InternalStates.g:806:6: lv_maxretries_7_0= RULE_INT
                    {
                    lv_maxretries_7_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalStates.g:831:1: entryRuleComponentState returns [EObject current=null] : iv_ruleComponentState= ruleComponentState EOF ;
    public final EObject entryRuleComponentState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentState = null;


        try {
            // InternalStates.g:831:55: (iv_ruleComponentState= ruleComponentState EOF )
            // InternalStates.g:832:2: iv_ruleComponentState= ruleComponentState EOF
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
    // InternalStates.g:838:1: ruleComponentState returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleComponentState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_stateDependencies_4_0 = null;

        EObject lv_featureDependencies_5_0 = null;

        EObject lv_transitionDependencies_6_0 = null;



        	enterRule();

        try {
            // InternalStates.g:844:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalStates.g:845:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalStates.g:845:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) ) )+ {...}?) ) )
            // InternalStates.g:846:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalStates.g:846:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) ) )+ {...}?) )
            // InternalStates.g:847:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getComponentStateAccess().getUnorderedGroup());
            			
            // InternalStates.g:850:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) ) )+ {...}?)
            // InternalStates.g:851:5: ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) ) )+ {...}?
            {
            // InternalStates.g:851:5: ( ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=4;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA21_1 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 2) ) {
                        alt21=3;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA21_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 0) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA21_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 1) ) {
                        alt21=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA21_5 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 2) ) {
                        alt21=3;
                    }


                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalStates.g:852:3: ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) )
            	    {
            	    // InternalStates.g:852:3: ({...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) ) )
            	    // InternalStates.g:853:4: {...}? => ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalStates.g:853:108: ( ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) ) )
            	    // InternalStates.g:854:5: ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalStates.g:857:8: ({...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? ) )
            	    // InternalStates.g:857:9: {...}? => (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "true");
            	    }
            	    // InternalStates.g:857:18: (otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )? )
            	    // InternalStates.g:857:19: otherlv_1= 'State' ( ( ruleFQN ) ) otherlv_3= '{' ( (lv_stateDependencies_4_0= ruleStateDependency ) )?
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getComponentStateAccess().getStateKeyword_0_0());
            	    							
            	    // InternalStates.g:861:8: ( ( ruleFQN ) )
            	    // InternalStates.g:862:9: ( ruleFQN )
            	    {
            	    // InternalStates.g:862:9: ( ruleFQN )
            	    // InternalStates.g:863:10: ruleFQN
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getComponentStateRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getComponentStateAccess().getStateStateCrossReference_0_1_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    ruleFQN();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,14,FOLLOW_25); 

            	    								newLeafNode(otherlv_3, grammarAccess.getComponentStateAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalStates.g:881:8: ( (lv_stateDependencies_4_0= ruleStateDependency ) )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==30) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalStates.g:882:9: (lv_stateDependencies_4_0= ruleStateDependency )
            	            {
            	            // InternalStates.g:882:9: (lv_stateDependencies_4_0= ruleStateDependency )
            	            // InternalStates.g:883:10: lv_stateDependencies_4_0= ruleStateDependency
            	            {

            	            										newCompositeNode(grammarAccess.getComponentStateAccess().getStateDependenciesStateDependencyParserRuleCall_0_3_0());
            	            									
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
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentStateAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStates.g:906:3: ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) )
            	    {
            	    // InternalStates.g:906:3: ({...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) ) )
            	    // InternalStates.g:907:4: {...}? => ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalStates.g:907:108: ( ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) ) )
            	    // InternalStates.g:908:5: ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalStates.g:911:8: ({...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) ) )
            	    // InternalStates.g:911:9: {...}? => ( (lv_featureDependencies_5_0= ruleFeatureDependency ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "true");
            	    }
            	    // InternalStates.g:911:18: ( (lv_featureDependencies_5_0= ruleFeatureDependency ) )
            	    // InternalStates.g:911:19: (lv_featureDependencies_5_0= ruleFeatureDependency )
            	    {
            	    // InternalStates.g:911:19: (lv_featureDependencies_5_0= ruleFeatureDependency )
            	    // InternalStates.g:912:9: lv_featureDependencies_5_0= ruleFeatureDependency
            	    {

            	    									newCompositeNode(grammarAccess.getComponentStateAccess().getFeatureDependenciesFeatureDependencyParserRuleCall_1_0());
            	    								
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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentStateAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStates.g:934:3: ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) )
            	    {
            	    // InternalStates.g:934:3: ({...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) ) )
            	    // InternalStates.g:935:4: {...}? => ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalStates.g:935:108: ( ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) ) )
            	    // InternalStates.g:936:5: ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getComponentStateAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalStates.g:939:8: ({...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' ) )
            	    // InternalStates.g:939:9: {...}? => ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentState", "true");
            	    }
            	    // InternalStates.g:939:18: ( ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}' )
            	    // InternalStates.g:939:19: ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )? otherlv_7= '}'
            	    {
            	    // InternalStates.g:939:19: ( (lv_transitionDependencies_6_0= ruleTransitionDependency ) )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==32) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalStates.g:940:9: (lv_transitionDependencies_6_0= ruleTransitionDependency )
            	            {
            	            // InternalStates.g:940:9: (lv_transitionDependencies_6_0= ruleTransitionDependency )
            	            // InternalStates.g:941:10: lv_transitionDependencies_6_0= ruleTransitionDependency
            	            {

            	            										newCompositeNode(grammarAccess.getComponentStateAccess().getTransitionDependenciesTransitionDependencyParserRuleCall_2_0_0());
            	            									
            	            pushFollow(FOLLOW_14);
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
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,17,FOLLOW_26); 

            	    								newLeafNode(otherlv_7, grammarAccess.getComponentStateAccess().getRightCurlyBracketKeyword_2_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentStateAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentStateAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleComponentState", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentStateAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getComponentStateAccess().getUnorderedGroup());
            			

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
    // InternalStates.g:979:1: entryRuleStateDependency returns [EObject current=null] : iv_ruleStateDependency= ruleStateDependency EOF ;
    public final EObject entryRuleStateDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDependency = null;


        try {
            // InternalStates.g:979:56: (iv_ruleStateDependency= ruleStateDependency EOF )
            // InternalStates.g:980:2: iv_ruleStateDependency= ruleStateDependency EOF
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
    // InternalStates.g:986:1: ruleStateDependency returns [EObject current=null] : (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) ;
    public final EObject ruleStateDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStates.g:992:2: ( (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) )
            // InternalStates.g:993:2: (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            {
            // InternalStates.g:993:2: (otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            // InternalStates.g:994:3: otherlv_0= 'depends on states' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDependencyAccess().getDependsOnStatesKeyword_0());
            		
            // InternalStates.g:998:3: ( ( ruleFQN ) )
            // InternalStates.g:999:4: ( ruleFQN )
            {
            // InternalStates.g:999:4: ( ruleFQN )
            // InternalStates.g:1000:5: ruleFQN
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

            // InternalStates.g:1014:3: (otherlv_2= ',' ( ( ruleFQN ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalStates.g:1015:4: otherlv_2= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStateDependencyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStates.g:1019:4: ( ( ruleFQN ) )
            	    // InternalStates.g:1020:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:1020:5: ( ruleFQN )
            	    // InternalStates.g:1021:6: ruleFQN
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
    // $ANTLR end "ruleStateDependency"


    // $ANTLR start "entryRuleTransitionDependency"
    // InternalStates.g:1040:1: entryRuleTransitionDependency returns [EObject current=null] : iv_ruleTransitionDependency= ruleTransitionDependency EOF ;
    public final EObject entryRuleTransitionDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDependency = null;


        try {
            // InternalStates.g:1040:61: (iv_ruleTransitionDependency= ruleTransitionDependency EOF )
            // InternalStates.g:1041:2: iv_ruleTransitionDependency= ruleTransitionDependency EOF
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
    // InternalStates.g:1047:1: ruleTransitionDependency returns [EObject current=null] : (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) ;
    public final EObject ruleTransitionDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStates.g:1053:2: ( (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) )
            // InternalStates.g:1054:2: (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            {
            // InternalStates.g:1054:2: (otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            // InternalStates.g:1055:3: otherlv_0= 'depends on transitions' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDependencyAccess().getDependsOnTransitionsKeyword_0());
            		
            // InternalStates.g:1059:3: ( ( ruleFQN ) )
            // InternalStates.g:1060:4: ( ruleFQN )
            {
            // InternalStates.g:1060:4: ( ruleFQN )
            // InternalStates.g:1061:5: ruleFQN
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

            // InternalStates.g:1075:3: (otherlv_2= ',' ( ( ruleFQN ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalStates.g:1076:4: otherlv_2= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTransitionDependencyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStates.g:1080:4: ( ( ruleFQN ) )
            	    // InternalStates.g:1081:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:1081:5: ( ruleFQN )
            	    // InternalStates.g:1082:6: ruleFQN
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
    // $ANTLR end "ruleTransitionDependency"


    // $ANTLR start "entryRuleFeatureDependency"
    // InternalStates.g:1101:1: entryRuleFeatureDependency returns [EObject current=null] : iv_ruleFeatureDependency= ruleFeatureDependency EOF ;
    public final EObject entryRuleFeatureDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDependency = null;


        try {
            // InternalStates.g:1101:58: (iv_ruleFeatureDependency= ruleFeatureDependency EOF )
            // InternalStates.g:1102:2: iv_ruleFeatureDependency= ruleFeatureDependency EOF
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
    // InternalStates.g:1108:1: ruleFeatureDependency returns [EObject current=null] : (otherlv_0= 'depends in features' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) ;
    public final EObject ruleFeatureDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStates.g:1114:2: ( (otherlv_0= 'depends in features' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* ) )
            // InternalStates.g:1115:2: (otherlv_0= 'depends in features' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            {
            // InternalStates.g:1115:2: (otherlv_0= 'depends in features' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )* )
            // InternalStates.g:1116:3: otherlv_0= 'depends in features' ( ( ruleFQN ) ) (otherlv_2= ',' ( ( ruleFQN ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureDependencyAccess().getDependsInFeaturesKeyword_0());
            		
            // InternalStates.g:1120:3: ( ( ruleFQN ) )
            // InternalStates.g:1121:4: ( ruleFQN )
            {
            // InternalStates.g:1121:4: ( ruleFQN )
            // InternalStates.g:1122:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureDependencyAccess().getFeaturesFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStates.g:1136:3: (otherlv_2= ',' ( ( ruleFQN ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalStates.g:1137:4: otherlv_2= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFeatureDependencyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalStates.g:1141:4: ( ( ruleFQN ) )
            	    // InternalStates.g:1142:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:1142:5: ( ruleFQN )
            	    // InternalStates.g:1143:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFeatureDependencyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFeatureDependencyAccess().getFeaturesFeatureCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    ruleFQN();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalStates.g:1162:1: entryRuleNodeStateAssociation returns [EObject current=null] : iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF ;
    public final EObject entryRuleNodeStateAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStateAssociation = null;


        try {
            // InternalStates.g:1162:61: (iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF )
            // InternalStates.g:1163:2: iv_ruleNodeStateAssociation= ruleNodeStateAssociation EOF
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
    // InternalStates.g:1169:1: ruleNodeStateAssociation returns [EObject current=null] : (otherlv_0= 'For' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( ( ruleFQN ) ) ) ;
    public final EObject ruleNodeStateAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStates.g:1175:2: ( (otherlv_0= 'For' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( ( ruleFQN ) ) ) )
            // InternalStates.g:1176:2: (otherlv_0= 'For' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( ( ruleFQN ) ) )
            {
            // InternalStates.g:1176:2: (otherlv_0= 'For' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( ( ruleFQN ) ) )
            // InternalStates.g:1177:3: otherlv_0= 'For' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'set' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeStateAssociationAccess().getForKeyword_0());
            		
            // InternalStates.g:1181:3: ( (otherlv_1= RULE_ID ) )
            // InternalStates.g:1182:4: (otherlv_1= RULE_ID )
            {
            // InternalStates.g:1182:4: (otherlv_1= RULE_ID )
            // InternalStates.g:1183:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeStateAssociationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getNodeStateAssociationAccess().getNodeStateNodeStateCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeStateAssociationAccess().getSetKeyword_2());
            		
            // InternalStates.g:1198:3: ( ( ruleFQN ) )
            // InternalStates.g:1199:4: ( ruleFQN )
            {
            // InternalStates.g:1199:4: ( ruleFQN )
            // InternalStates.g:1200:5: ruleFQN
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
    // InternalStates.g:1218:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalStates.g:1218:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalStates.g:1219:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalStates.g:1225:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' ) ;
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
            // InternalStates.g:1231:2: ( (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' ) )
            // InternalStates.g:1232:2: (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' )
            {
            // InternalStates.g:1232:2: (otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}' )
            // InternalStates.g:1233:3: otherlv_0= 'Feature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
            		
            // InternalStates.g:1237:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStates.g:1238:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStates.g:1238:4: (lv_name_1_0= RULE_ID )
            // InternalStates.g:1239:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getStatesKeyword_3());
            		
            // InternalStates.g:1263:3: ( ( ruleFQN ) )
            // InternalStates.g:1264:4: ( ruleFQN )
            {
            // InternalStates.g:1264:4: ( ruleFQN )
            // InternalStates.g:1265:5: ruleFQN
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

            // InternalStates.g:1279:3: (otherlv_5= ',' ( ( ruleFQN ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalStates.g:1280:4: otherlv_5= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_5=(Token)match(input,31,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalStates.g:1284:4: ( ( ruleFQN ) )
            	    // InternalStates.g:1285:5: ( ruleFQN )
            	    {
            	    // InternalStates.g:1285:5: ( ruleFQN )
            	    // InternalStates.g:1286:6: ruleFQN
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
            	    break loop25;
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
    // InternalStates.g:1309:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalStates.g:1309:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalStates.g:1310:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalStates.g:1316:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalStates.g:1322:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalStates.g:1323:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalStates.g:1323:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalStates.g:1324:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalStates.g:1331:3: (kw= '.' this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==38) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalStates.g:1332:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,38,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003F8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000017103A0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000017003A0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000022020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000003400A0002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000003000A0002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000002L});

}
