/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states;

import com.visteon.onoff.coom.State;

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
 *   <li>{@link com.visteon.onoff.states.NodeStateAssociation#getNodeState <em>Node State</em>}</li>
 *   <li>{@link com.visteon.onoff.states.NodeStateAssociation#getClientState <em>Client State</em>}</li>
 * </ul>
 *
 * @see com.visteon.onoff.states.StatesPackage#getNodeStateAssociation()
 * @model
 * @generated
 */
public interface NodeStateAssociation extends EObject
{
  /**
   * Returns the value of the '<em><b>Node State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node State</em>' reference.
   * @see #setNodeState(NodeState)
   * @see com.visteon.onoff.states.StatesPackage#getNodeStateAssociation_NodeState()
   * @model
   * @generated
   */
  NodeState getNodeState();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.NodeStateAssociation#getNodeState <em>Node State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node State</em>' reference.
   * @see #getNodeState()
   * @generated
   */
  void setNodeState(NodeState value);

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

} // NodeStateAssociation