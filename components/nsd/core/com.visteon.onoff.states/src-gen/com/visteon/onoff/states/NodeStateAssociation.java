/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states;

import com.visteon.onoff.coom.State;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node State Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.NodeStateAssociation#getNodeStateType <em>Node State Type</em>}</li>
 *   <li>{@link com.visteon.onoff.states.NodeStateAssociation#getClientState <em>Client State</em>}</li>
 *   <li>{@link com.visteon.onoff.states.NodeStateAssociation#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see com.visteon.onoff.states.StatesPackage#getNodeStateAssociation()
 * @model
 * @generated
 */
public interface NodeStateAssociation extends EObject
{
  /**
   * Returns the value of the '<em><b>Node State Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.visteon.onoff.states.NodeStateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node State Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node State Type</em>' attribute.
   * @see com.visteon.onoff.states.NodeStateType
   * @see #setNodeStateType(NodeStateType)
   * @see com.visteon.onoff.states.StatesPackage#getNodeStateAssociation_NodeStateType()
   * @model
   * @generated
   */
  NodeStateType getNodeStateType();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.NodeStateAssociation#getNodeStateType <em>Node State Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node State Type</em>' attribute.
   * @see com.visteon.onoff.states.NodeStateType
   * @see #getNodeStateType()
   * @generated
   */
  void setNodeStateType(NodeStateType value);

  /**
   * Returns the value of the '<em><b>Client State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Client State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client State</em>' reference.
   * @see #setClientState(State)
   * @see com.visteon.onoff.states.StatesPackage#getNodeStateAssociation_ClientState()
   * @model
   * @generated
   */
  State getClientState();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.NodeStateAssociation#getClientState <em>Client State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client State</em>' reference.
   * @see #getClientState()
   * @generated
   */
  void setClientState(State value);

  /**
   * Returns the value of the '<em><b>States</b></em>' reference list.
   * The list contents are of type {@link com.visteon.onoff.states.NodeState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' reference list.
   * @see com.visteon.onoff.states.StatesPackage#getNodeStateAssociation_States()
   * @model
   * @generated
   */
  EList<NodeState> getStates();

} // NodeStateAssociation
