/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states.util;

import com.visteon.onoff.states.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.visteon.onoff.states.StatesPackage
 * @generated
 */
public class StatesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StatesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = StatesPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case StatesPackage.NODE_STATE_CONFIGURATION:
      {
        NodeStateConfiguration nodeStateConfiguration = (NodeStateConfiguration)theEObject;
        T result = caseNodeStateConfiguration(nodeStateConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.NODE_STATE_DIAGRAM:
      {
        NodeStateDiagram nodeStateDiagram = (NodeStateDiagram)theEObject;
        T result = caseNodeStateDiagram(nodeStateDiagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.NODE_STATE:
      {
        NodeState nodeState = (NodeState)theEObject;
        T result = caseNodeState(nodeState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.NODE_TRANSITION:
      {
        NodeTransition nodeTransition = (NodeTransition)theEObject;
        T result = caseNodeTransition(nodeTransition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.CLIENT_CONFIGURATION:
      {
        ClientConfiguration clientConfiguration = (ClientConfiguration)theEObject;
        T result = caseClientConfiguration(clientConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.COMPONENT_TRANSITION:
      {
        ComponentTransition componentTransition = (ComponentTransition)theEObject;
        T result = caseComponentTransition(componentTransition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.COMPONENT_STATE:
      {
        ComponentState componentState = (ComponentState)theEObject;
        T result = caseComponentState(componentState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.STATE_DEPENDENCY:
      {
        StateDependency stateDependency = (StateDependency)theEObject;
        T result = caseStateDependency(stateDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.TRANSITION_DEPENDENCY:
      {
        TransitionDependency transitionDependency = (TransitionDependency)theEObject;
        T result = caseTransitionDependency(transitionDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.FEATURE_DEPENDENCY:
      {
        FeatureDependency featureDependency = (FeatureDependency)theEObject;
        T result = caseFeatureDependency(featureDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.NODE_STATE_ASSOCIATION:
      {
        NodeStateAssociation nodeStateAssociation = (NodeStateAssociation)theEObject;
        T result = caseNodeStateAssociation(nodeStateAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StatesPackage.COMPONENT_FEATURE:
      {
        ComponentFeature componentFeature = (ComponentFeature)theEObject;
        T result = caseComponentFeature(componentFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node State Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node State Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeStateConfiguration(NodeStateConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node State Diagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node State Diagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeStateDiagram(NodeStateDiagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeState(NodeState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeTransition(NodeTransition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Client Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Client Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClientConfiguration(ClientConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentTransition(ComponentTransition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentState(ComponentState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateDependency(StateDependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionDependency(TransitionDependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureDependency(FeatureDependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node State Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node State Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeStateAssociation(NodeStateAssociation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentFeature(ComponentFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //StatesSwitch
