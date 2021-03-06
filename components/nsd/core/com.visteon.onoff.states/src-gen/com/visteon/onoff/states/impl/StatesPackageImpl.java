/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states.impl;

import com.visteon.onoff.coom.CoomPackage;

import com.visteon.onoff.states.ClientConfiguration;
import com.visteon.onoff.states.ComponentFeature;
import com.visteon.onoff.states.ComponentState;
import com.visteon.onoff.states.ComponentTransition;
import com.visteon.onoff.states.FeatureDependency;
import com.visteon.onoff.states.NodeState;
import com.visteon.onoff.states.NodeStateAssociation;
import com.visteon.onoff.states.NodeStateConfiguration;
import com.visteon.onoff.states.NodeStateDiagram;
import com.visteon.onoff.states.NodeStateType;
import com.visteon.onoff.states.NodeTransition;
import com.visteon.onoff.states.StateDependency;
import com.visteon.onoff.states.StatesFactory;
import com.visteon.onoff.states.StatesPackage;
import com.visteon.onoff.states.TransitionDependency;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesPackageImpl extends EPackageImpl implements StatesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeStateConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeStateDiagramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeTransitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clientConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentTransitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeStateAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nodeStateTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.visteon.onoff.states.StatesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StatesPackageImpl()
  {
    super(eNS_URI, StatesFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StatesPackage init()
  {
    if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

    // Obtain or create and register package
    StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CoomPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theStatesPackage.createPackageContents();

    // Initialize created meta-data
    theStatesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStatesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
    return theStatesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeStateConfiguration()
  {
    return nodeStateConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeStateConfiguration_Nsd()
  {
    return (EReference)nodeStateConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeStateConfiguration_ClientConfigs()
  {
    return (EReference)nodeStateConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeStateDiagram()
  {
    return nodeStateDiagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeStateDiagram_GEdgeWeight()
  {
    return (EAttribute)nodeStateDiagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeStateDiagram_GTransitionTimeoutInMilliseconds()
  {
    return (EAttribute)nodeStateDiagramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeStateDiagram_States()
  {
    return (EReference)nodeStateDiagramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeStateDiagram_Transitions()
  {
    return (EReference)nodeStateDiagramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeState()
  {
    return nodeStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeState_Initial()
  {
    return (EAttribute)nodeStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeState_Exit()
  {
    return (EAttribute)nodeStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeState_Name()
  {
    return (EAttribute)nodeStateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeTransition()
  {
    return nodeTransitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTransition_Essential()
  {
    return (EAttribute)nodeTransitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTransition_Name()
  {
    return (EAttribute)nodeTransitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeTransition_FromState()
  {
    return (EReference)nodeTransitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeTransition_ToState()
  {
    return (EReference)nodeTransitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTransition_Edgeweight()
  {
    return (EAttribute)nodeTransitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTransition_TimeoutInMilliseconds()
  {
    return (EAttribute)nodeTransitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClientConfiguration()
  {
    return clientConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClientConfiguration_Name()
  {
    return (EAttribute)clientConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClientConfiguration_CoomRef()
  {
    return (EReference)clientConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClientConfiguration_Process()
  {
    return (EAttribute)clientConfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClientConfiguration_TransTimeoutInMilliseconds()
  {
    return (EAttribute)clientConfigurationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClientConfiguration_Transitions()
  {
    return (EReference)clientConfigurationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClientConfiguration_States()
  {
    return (EReference)clientConfigurationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClientConfiguration_Features()
  {
    return (EReference)clientConfigurationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClientConfiguration_NodeStateAssociations()
  {
    return (EReference)clientConfigurationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentTransition()
  {
    return componentTransitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentTransition_Essential()
  {
    return (EAttribute)componentTransitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentTransition_Transition()
  {
    return (EReference)componentTransitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentTransition_TimeoutInMilliseconds()
  {
    return (EAttribute)componentTransitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentTransition_Maxretries()
  {
    return (EAttribute)componentTransitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentTransition_StateDependency()
  {
    return (EReference)componentTransitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentTransition_FeatureDependency()
  {
    return (EReference)componentTransitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentState()
  {
    return componentStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentState_State()
  {
    return (EReference)componentStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentState_StateDependency()
  {
    return (EReference)componentStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentState_FeatureDependency()
  {
    return (EReference)componentStateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentState_TransitionDependency()
  {
    return (EReference)componentStateEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateDependency()
  {
    return stateDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateDependency_States()
  {
    return (EReference)stateDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionDependency()
  {
    return transitionDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDependency_Transistions()
  {
    return (EReference)transitionDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureDependency()
  {
    return featureDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureDependency_Features()
  {
    return (EReference)featureDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeStateAssociation()
  {
    return nodeStateAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeStateAssociation_NodeStateType()
  {
    return (EAttribute)nodeStateAssociationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeStateAssociation_ClientState()
  {
    return (EReference)nodeStateAssociationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeStateAssociation_States()
  {
    return (EReference)nodeStateAssociationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentFeature()
  {
    return componentFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentFeature_Name()
  {
    return (EAttribute)componentFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentFeature_States()
  {
    return (EReference)componentFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNodeStateType()
  {
    return nodeStateTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatesFactory getStatesFactory()
  {
    return (StatesFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    nodeStateConfigurationEClass = createEClass(NODE_STATE_CONFIGURATION);
    createEReference(nodeStateConfigurationEClass, NODE_STATE_CONFIGURATION__NSD);
    createEReference(nodeStateConfigurationEClass, NODE_STATE_CONFIGURATION__CLIENT_CONFIGS);

    nodeStateDiagramEClass = createEClass(NODE_STATE_DIAGRAM);
    createEAttribute(nodeStateDiagramEClass, NODE_STATE_DIAGRAM__GEDGE_WEIGHT);
    createEAttribute(nodeStateDiagramEClass, NODE_STATE_DIAGRAM__GTRANSITION_TIMEOUT_IN_MILLISECONDS);
    createEReference(nodeStateDiagramEClass, NODE_STATE_DIAGRAM__STATES);
    createEReference(nodeStateDiagramEClass, NODE_STATE_DIAGRAM__TRANSITIONS);

    nodeStateEClass = createEClass(NODE_STATE);
    createEAttribute(nodeStateEClass, NODE_STATE__INITIAL);
    createEAttribute(nodeStateEClass, NODE_STATE__EXIT);
    createEAttribute(nodeStateEClass, NODE_STATE__NAME);

    nodeTransitionEClass = createEClass(NODE_TRANSITION);
    createEAttribute(nodeTransitionEClass, NODE_TRANSITION__ESSENTIAL);
    createEAttribute(nodeTransitionEClass, NODE_TRANSITION__NAME);
    createEReference(nodeTransitionEClass, NODE_TRANSITION__FROM_STATE);
    createEReference(nodeTransitionEClass, NODE_TRANSITION__TO_STATE);
    createEAttribute(nodeTransitionEClass, NODE_TRANSITION__EDGEWEIGHT);
    createEAttribute(nodeTransitionEClass, NODE_TRANSITION__TIMEOUT_IN_MILLISECONDS);

    clientConfigurationEClass = createEClass(CLIENT_CONFIGURATION);
    createEAttribute(clientConfigurationEClass, CLIENT_CONFIGURATION__NAME);
    createEReference(clientConfigurationEClass, CLIENT_CONFIGURATION__COOM_REF);
    createEAttribute(clientConfigurationEClass, CLIENT_CONFIGURATION__PROCESS);
    createEAttribute(clientConfigurationEClass, CLIENT_CONFIGURATION__TRANS_TIMEOUT_IN_MILLISECONDS);
    createEReference(clientConfigurationEClass, CLIENT_CONFIGURATION__TRANSITIONS);
    createEReference(clientConfigurationEClass, CLIENT_CONFIGURATION__STATES);
    createEReference(clientConfigurationEClass, CLIENT_CONFIGURATION__FEATURES);
    createEReference(clientConfigurationEClass, CLIENT_CONFIGURATION__NODE_STATE_ASSOCIATIONS);

    componentTransitionEClass = createEClass(COMPONENT_TRANSITION);
    createEAttribute(componentTransitionEClass, COMPONENT_TRANSITION__ESSENTIAL);
    createEReference(componentTransitionEClass, COMPONENT_TRANSITION__TRANSITION);
    createEAttribute(componentTransitionEClass, COMPONENT_TRANSITION__TIMEOUT_IN_MILLISECONDS);
    createEAttribute(componentTransitionEClass, COMPONENT_TRANSITION__MAXRETRIES);
    createEReference(componentTransitionEClass, COMPONENT_TRANSITION__STATE_DEPENDENCY);
    createEReference(componentTransitionEClass, COMPONENT_TRANSITION__FEATURE_DEPENDENCY);

    componentStateEClass = createEClass(COMPONENT_STATE);
    createEReference(componentStateEClass, COMPONENT_STATE__STATE);
    createEReference(componentStateEClass, COMPONENT_STATE__STATE_DEPENDENCY);
    createEReference(componentStateEClass, COMPONENT_STATE__FEATURE_DEPENDENCY);
    createEReference(componentStateEClass, COMPONENT_STATE__TRANSITION_DEPENDENCY);

    stateDependencyEClass = createEClass(STATE_DEPENDENCY);
    createEReference(stateDependencyEClass, STATE_DEPENDENCY__STATES);

    transitionDependencyEClass = createEClass(TRANSITION_DEPENDENCY);
    createEReference(transitionDependencyEClass, TRANSITION_DEPENDENCY__TRANSISTIONS);

    featureDependencyEClass = createEClass(FEATURE_DEPENDENCY);
    createEReference(featureDependencyEClass, FEATURE_DEPENDENCY__FEATURES);

    nodeStateAssociationEClass = createEClass(NODE_STATE_ASSOCIATION);
    createEAttribute(nodeStateAssociationEClass, NODE_STATE_ASSOCIATION__NODE_STATE_TYPE);
    createEReference(nodeStateAssociationEClass, NODE_STATE_ASSOCIATION__CLIENT_STATE);
    createEReference(nodeStateAssociationEClass, NODE_STATE_ASSOCIATION__STATES);

    componentFeatureEClass = createEClass(COMPONENT_FEATURE);
    createEAttribute(componentFeatureEClass, COMPONENT_FEATURE__NAME);
    createEReference(componentFeatureEClass, COMPONENT_FEATURE__STATES);

    // Create enums
    nodeStateTypeEEnum = createEEnum(NODE_STATE_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    CoomPackage theCoomPackage = (CoomPackage)EPackage.Registry.INSTANCE.getEPackage(CoomPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(nodeStateConfigurationEClass, NodeStateConfiguration.class, "NodeStateConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeStateConfiguration_Nsd(), this.getNodeStateDiagram(), null, "nsd", null, 0, 1, NodeStateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeStateConfiguration_ClientConfigs(), this.getClientConfiguration(), null, "clientConfigs", null, 0, -1, NodeStateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeStateDiagramEClass, NodeStateDiagram.class, "NodeStateDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeStateDiagram_GEdgeWeight(), ecorePackage.getEInt(), "gEdgeWeight", null, 0, 1, NodeStateDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeStateDiagram_GTransitionTimeoutInMilliseconds(), ecorePackage.getEInt(), "gTransitionTimeoutInMilliseconds", null, 0, 1, NodeStateDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeStateDiagram_States(), this.getNodeState(), null, "states", null, 0, -1, NodeStateDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeStateDiagram_Transitions(), this.getNodeTransition(), null, "transitions", null, 0, -1, NodeStateDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeStateEClass, NodeState.class, "NodeState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeState_Initial(), ecorePackage.getEBoolean(), "initial", null, 0, 1, NodeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeState_Exit(), ecorePackage.getEBoolean(), "exit", null, 0, 1, NodeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeState_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeTransitionEClass, NodeTransition.class, "NodeTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeTransition_Essential(), ecorePackage.getEBoolean(), "essential", null, 0, 1, NodeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTransition_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeTransition_FromState(), this.getNodeState(), null, "fromState", null, 0, 1, NodeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeTransition_ToState(), this.getNodeState(), null, "toState", null, 0, 1, NodeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTransition_Edgeweight(), ecorePackage.getEInt(), "edgeweight", null, 0, 1, NodeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTransition_TimeoutInMilliseconds(), ecorePackage.getEInt(), "timeoutInMilliseconds", null, 0, 1, NodeTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clientConfigurationEClass, ClientConfiguration.class, "ClientConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClientConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClientConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClientConfiguration_CoomRef(), theCoomPackage.getComponentOnOffManifest(), null, "coomRef", null, 0, 1, ClientConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClientConfiguration_Process(), ecorePackage.getEString(), "process", null, 0, 1, ClientConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClientConfiguration_TransTimeoutInMilliseconds(), ecorePackage.getEInt(), "transTimeoutInMilliseconds", null, 0, 1, ClientConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClientConfiguration_Transitions(), this.getComponentTransition(), null, "transitions", null, 0, -1, ClientConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClientConfiguration_States(), this.getComponentState(), null, "states", null, 0, -1, ClientConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClientConfiguration_Features(), this.getComponentFeature(), null, "features", null, 0, -1, ClientConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClientConfiguration_NodeStateAssociations(), this.getNodeStateAssociation(), null, "nodeStateAssociations", null, 0, -1, ClientConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentTransitionEClass, ComponentTransition.class, "ComponentTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentTransition_Essential(), ecorePackage.getEBoolean(), "essential", null, 0, 1, ComponentTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentTransition_Transition(), theCoomPackage.getTransition(), null, "transition", null, 0, 1, ComponentTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentTransition_TimeoutInMilliseconds(), ecorePackage.getEInt(), "timeoutInMilliseconds", null, 0, 1, ComponentTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentTransition_Maxretries(), ecorePackage.getEInt(), "maxretries", null, 0, 1, ComponentTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentTransition_StateDependency(), this.getStateDependency(), null, "stateDependency", null, 0, 1, ComponentTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentTransition_FeatureDependency(), this.getFeatureDependency(), null, "featureDependency", null, 0, 1, ComponentTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentStateEClass, ComponentState.class, "ComponentState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentState_State(), theCoomPackage.getState(), null, "state", null, 0, 1, ComponentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentState_StateDependency(), this.getStateDependency(), null, "stateDependency", null, 0, 1, ComponentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentState_FeatureDependency(), this.getFeatureDependency(), null, "featureDependency", null, 0, 1, ComponentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentState_TransitionDependency(), this.getTransitionDependency(), null, "transitionDependency", null, 0, 1, ComponentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateDependencyEClass, StateDependency.class, "StateDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateDependency_States(), this.getComponentState(), null, "states", null, 0, -1, StateDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionDependencyEClass, TransitionDependency.class, "TransitionDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionDependency_Transistions(), this.getComponentTransition(), null, "transistions", null, 0, -1, TransitionDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureDependencyEClass, FeatureDependency.class, "FeatureDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureDependency_Features(), this.getComponentFeature(), null, "features", null, 0, -1, FeatureDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeStateAssociationEClass, NodeStateAssociation.class, "NodeStateAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeStateAssociation_NodeStateType(), this.getNodeStateType(), "nodeStateType", null, 0, 1, NodeStateAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeStateAssociation_ClientState(), theCoomPackage.getState(), null, "clientState", null, 0, 1, NodeStateAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeStateAssociation_States(), this.getNodeState(), null, "states", null, 0, -1, NodeStateAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentFeatureEClass, ComponentFeature.class, "ComponentFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentFeature_States(), theCoomPackage.getState(), null, "states", null, 0, -1, ComponentFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(nodeStateTypeEEnum, NodeStateType.class, "NodeStateType");
    addEEnumLiteral(nodeStateTypeEEnum, NodeStateType.NORMAL_STATE);
    addEEnumLiteral(nodeStateTypeEEnum, NodeStateType.SYNC_STATE);
    addEEnumLiteral(nodeStateTypeEEnum, NodeStateType.REQ_STATE);

    // Create resource
    createResource(eNS_URI);
  }

} //StatesPackageImpl
