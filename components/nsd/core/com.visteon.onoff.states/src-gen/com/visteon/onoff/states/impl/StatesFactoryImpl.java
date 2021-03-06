/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states.impl;

import com.visteon.onoff.states.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StatesFactory init()
  {
    try
    {
      StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
      if (theStatesFactory != null)
      {
        return theStatesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StatesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case StatesPackage.NODE_STATE_CONFIGURATION: return createNodeStateConfiguration();
      case StatesPackage.NODE_STATE_DIAGRAM: return createNodeStateDiagram();
      case StatesPackage.NODE_STATE: return createNodeState();
      case StatesPackage.NODE_TRANSITION: return createNodeTransition();
      case StatesPackage.CLIENT_CONFIGURATION: return createClientConfiguration();
      case StatesPackage.COMPONENT_TRANSITION: return createComponentTransition();
      case StatesPackage.COMPONENT_STATE: return createComponentState();
      case StatesPackage.STATE_DEPENDENCY: return createStateDependency();
      case StatesPackage.TRANSITION_DEPENDENCY: return createTransitionDependency();
      case StatesPackage.FEATURE_DEPENDENCY: return createFeatureDependency();
      case StatesPackage.NODE_STATE_ASSOCIATION: return createNodeStateAssociation();
      case StatesPackage.COMPONENT_FEATURE: return createComponentFeature();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case StatesPackage.NODE_STATE_TYPE:
        return createNodeStateTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case StatesPackage.NODE_STATE_TYPE:
        return convertNodeStateTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeStateConfiguration createNodeStateConfiguration()
  {
    NodeStateConfigurationImpl nodeStateConfiguration = new NodeStateConfigurationImpl();
    return nodeStateConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeStateDiagram createNodeStateDiagram()
  {
    NodeStateDiagramImpl nodeStateDiagram = new NodeStateDiagramImpl();
    return nodeStateDiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeState createNodeState()
  {
    NodeStateImpl nodeState = new NodeStateImpl();
    return nodeState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTransition createNodeTransition()
  {
    NodeTransitionImpl nodeTransition = new NodeTransitionImpl();
    return nodeTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClientConfiguration createClientConfiguration()
  {
    ClientConfigurationImpl clientConfiguration = new ClientConfigurationImpl();
    return clientConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentTransition createComponentTransition()
  {
    ComponentTransitionImpl componentTransition = new ComponentTransitionImpl();
    return componentTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentState createComponentState()
  {
    ComponentStateImpl componentState = new ComponentStateImpl();
    return componentState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDependency createStateDependency()
  {
    StateDependencyImpl stateDependency = new StateDependencyImpl();
    return stateDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDependency createTransitionDependency()
  {
    TransitionDependencyImpl transitionDependency = new TransitionDependencyImpl();
    return transitionDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureDependency createFeatureDependency()
  {
    FeatureDependencyImpl featureDependency = new FeatureDependencyImpl();
    return featureDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeStateAssociation createNodeStateAssociation()
  {
    NodeStateAssociationImpl nodeStateAssociation = new NodeStateAssociationImpl();
    return nodeStateAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentFeature createComponentFeature()
  {
    ComponentFeatureImpl componentFeature = new ComponentFeatureImpl();
    return componentFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeStateType createNodeStateTypeFromString(EDataType eDataType, String initialValue)
  {
    NodeStateType result = NodeStateType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNodeStateTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatesPackage getStatesPackage()
  {
    return (StatesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StatesPackage getPackage()
  {
    return StatesPackage.eINSTANCE;
  }

} //StatesFactoryImpl
