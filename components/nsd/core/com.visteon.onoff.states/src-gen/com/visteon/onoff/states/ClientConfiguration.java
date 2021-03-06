/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states;

import com.visteon.onoff.coom.ComponentOnOffManifest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.ClientConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ClientConfiguration#getCoomRef <em>Coom Ref</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ClientConfiguration#getProcess <em>Process</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ClientConfiguration#getTransTimeoutInMilliseconds <em>Trans Timeout In Milliseconds</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ClientConfiguration#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ClientConfiguration#getStates <em>States</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ClientConfiguration#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ClientConfiguration#getNodeStateAssociations <em>Node State Associations</em>}</li>
 * </ul>
 *
 * @see com.visteon.onoff.states.StatesPackage#getClientConfiguration()
 * @model
 * @generated
 */
public interface ClientConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.visteon.onoff.states.StatesPackage#getClientConfiguration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ClientConfiguration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Coom Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coom Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coom Ref</em>' reference.
   * @see #setCoomRef(ComponentOnOffManifest)
   * @see com.visteon.onoff.states.StatesPackage#getClientConfiguration_CoomRef()
   * @model
   * @generated
   */
  ComponentOnOffManifest getCoomRef();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ClientConfiguration#getCoomRef <em>Coom Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coom Ref</em>' reference.
   * @see #getCoomRef()
   * @generated
   */
  void setCoomRef(ComponentOnOffManifest value);

  /**
   * Returns the value of the '<em><b>Process</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' attribute.
   * @see #setProcess(String)
   * @see com.visteon.onoff.states.StatesPackage#getClientConfiguration_Process()
   * @model
   * @generated
   */
  String getProcess();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ClientConfiguration#getProcess <em>Process</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' attribute.
   * @see #getProcess()
   * @generated
   */
  void setProcess(String value);

  /**
   * Returns the value of the '<em><b>Trans Timeout In Milliseconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trans Timeout In Milliseconds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trans Timeout In Milliseconds</em>' attribute.
   * @see #setTransTimeoutInMilliseconds(int)
   * @see com.visteon.onoff.states.StatesPackage#getClientConfiguration_TransTimeoutInMilliseconds()
   * @model
   * @generated
   */
  int getTransTimeoutInMilliseconds();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ClientConfiguration#getTransTimeoutInMilliseconds <em>Trans Timeout In Milliseconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trans Timeout In Milliseconds</em>' attribute.
   * @see #getTransTimeoutInMilliseconds()
   * @generated
   */
  void setTransTimeoutInMilliseconds(int value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link com.visteon.onoff.states.ComponentTransition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see com.visteon.onoff.states.StatesPackage#getClientConfiguration_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<ComponentTransition> getTransitions();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link com.visteon.onoff.states.ComponentState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see com.visteon.onoff.states.StatesPackage#getClientConfiguration_States()
   * @model containment="true"
   * @generated
   */
  EList<ComponentState> getStates();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link com.visteon.onoff.states.ComponentFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see com.visteon.onoff.states.StatesPackage#getClientConfiguration_Features()
   * @model containment="true"
   * @generated
   */
  EList<ComponentFeature> getFeatures();

  /**
   * Returns the value of the '<em><b>Node State Associations</b></em>' containment reference list.
   * The list contents are of type {@link com.visteon.onoff.states.NodeStateAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node State Associations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node State Associations</em>' containment reference list.
   * @see com.visteon.onoff.states.StatesPackage#getClientConfiguration_NodeStateAssociations()
   * @model containment="true"
   * @generated
   */
  EList<NodeStateAssociation> getNodeStateAssociations();

} // ClientConfiguration
