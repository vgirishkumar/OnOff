/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node State Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.NodeStateConfiguration#getNsd <em>Nsd</em>}</li>
 *   <li>{@link com.visteon.onoff.states.NodeStateConfiguration#getClientConfig <em>Client Config</em>}</li>
 * </ul>
 *
 * @see com.visteon.onoff.states.StatesPackage#getNodeStateConfiguration()
 * @model
 * @generated
 */
public interface NodeStateConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Nsd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nsd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nsd</em>' containment reference.
   * @see #setNsd(NodeStateDiagram)
   * @see com.visteon.onoff.states.StatesPackage#getNodeStateConfiguration_Nsd()
   * @model containment="true"
   * @generated
   */
  NodeStateDiagram getNsd();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.NodeStateConfiguration#getNsd <em>Nsd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nsd</em>' containment reference.
   * @see #getNsd()
   * @generated
   */
  void setNsd(NodeStateDiagram value);

  /**
   * Returns the value of the '<em><b>Client Config</b></em>' containment reference list.
   * The list contents are of type {@link com.visteon.onoff.states.ClientConfiguration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Client Config</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client Config</em>' containment reference list.
   * @see com.visteon.onoff.states.StatesPackage#getNodeStateConfiguration_ClientConfig()
   * @model containment="true"
   * @generated
   */
  EList<ClientConfiguration> getClientConfig();

} // NodeStateConfiguration
