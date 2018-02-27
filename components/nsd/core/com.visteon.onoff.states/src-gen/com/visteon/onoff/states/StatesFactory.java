/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.visteon.onoff.states.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StatesFactory eINSTANCE = com.visteon.onoff.states.impl.StatesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Node State Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node State Configuration</em>'.
   * @generated
   */
  NodeStateConfiguration createNodeStateConfiguration();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Node State Diagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node State Diagram</em>'.
   * @generated
   */
  NodeStateDiagram createNodeStateDiagram();

  /**
   * Returns a new object of class '<em>Node State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node State</em>'.
   * @generated
   */
  NodeState createNodeState();

  /**
   * Returns a new object of class '<em>Node Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Transition</em>'.
   * @generated
   */
  NodeTransition createNodeTransition();

  /**
   * Returns a new object of class '<em>Client Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Client Configuration</em>'.
   * @generated
   */
  ClientConfiguration createClientConfiguration();

  /**
   * Returns a new object of class '<em>Component Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Transition</em>'.
   * @generated
   */
  ComponentTransition createComponentTransition();

  /**
   * Returns a new object of class '<em>Component State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component State</em>'.
   * @generated
   */
  ComponentState createComponentState();

  /**
   * Returns a new object of class '<em>State Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Dependency</em>'.
   * @generated
   */
  StateDependency createStateDependency();

  /**
   * Returns a new object of class '<em>Transition Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Dependency</em>'.
   * @generated
   */
  TransitionDependency createTransitionDependency();

  /**
   * Returns a new object of class '<em>Feature Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Dependency</em>'.
   * @generated
   */
  FeatureDependency createFeatureDependency();

  /**
   * Returns a new object of class '<em>Node State Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node State Association</em>'.
   * @generated
   */
  NodeStateAssociation createNodeStateAssociation();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StatesPackage getStatesPackage();

} //StatesFactory