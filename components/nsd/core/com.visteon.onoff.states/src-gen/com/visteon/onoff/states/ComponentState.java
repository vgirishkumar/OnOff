/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states;

import com.visteon.onoff.coom.State;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.ComponentState#getState <em>State</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ComponentState#getStateDependency <em>State Dependency</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ComponentState#getFeatureDependency <em>Feature Dependency</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ComponentState#getTransitionDependency <em>Transition Dependency</em>}</li>
 * </ul>
 *
 * @see com.visteon.onoff.states.StatesPackage#getComponentState()
 * @model
 * @generated
 */
public interface ComponentState extends EObject
{
  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see com.visteon.onoff.states.StatesPackage#getComponentState_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ComponentState#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

  /**
   * Returns the value of the '<em><b>State Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Dependency</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Dependency</em>' containment reference.
   * @see #setStateDependency(StateDependency)
   * @see com.visteon.onoff.states.StatesPackage#getComponentState_StateDependency()
   * @model containment="true"
   * @generated
   */
  StateDependency getStateDependency();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ComponentState#getStateDependency <em>State Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Dependency</em>' containment reference.
   * @see #getStateDependency()
   * @generated
   */
  void setStateDependency(StateDependency value);

  /**
   * Returns the value of the '<em><b>Feature Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Dependency</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Dependency</em>' containment reference.
   * @see #setFeatureDependency(FeatureDependency)
   * @see com.visteon.onoff.states.StatesPackage#getComponentState_FeatureDependency()
   * @model containment="true"
   * @generated
   */
  FeatureDependency getFeatureDependency();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ComponentState#getFeatureDependency <em>Feature Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Dependency</em>' containment reference.
   * @see #getFeatureDependency()
   * @generated
   */
  void setFeatureDependency(FeatureDependency value);

  /**
   * Returns the value of the '<em><b>Transition Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition Dependency</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition Dependency</em>' containment reference.
   * @see #setTransitionDependency(TransitionDependency)
   * @see com.visteon.onoff.states.StatesPackage#getComponentState_TransitionDependency()
   * @model containment="true"
   * @generated
   */
  TransitionDependency getTransitionDependency();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ComponentState#getTransitionDependency <em>Transition Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition Dependency</em>' containment reference.
   * @see #getTransitionDependency()
   * @generated
   */
  void setTransitionDependency(TransitionDependency value);

} // ComponentState
