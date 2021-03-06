/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states;

import com.visteon.onoff.coom.Transition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.ComponentTransition#isEssential <em>Essential</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ComponentTransition#getTransition <em>Transition</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ComponentTransition#getTimeoutInMilliseconds <em>Timeout In Milliseconds</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ComponentTransition#getMaxretries <em>Maxretries</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ComponentTransition#getStateDependency <em>State Dependency</em>}</li>
 *   <li>{@link com.visteon.onoff.states.ComponentTransition#getFeatureDependency <em>Feature Dependency</em>}</li>
 * </ul>
 *
 * @see com.visteon.onoff.states.StatesPackage#getComponentTransition()
 * @model
 * @generated
 */
public interface ComponentTransition extends EObject
{
  /**
   * Returns the value of the '<em><b>Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Essential</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Essential</em>' attribute.
   * @see #setEssential(boolean)
   * @see com.visteon.onoff.states.StatesPackage#getComponentTransition_Essential()
   * @model
   * @generated
   */
  boolean isEssential();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ComponentTransition#isEssential <em>Essential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Essential</em>' attribute.
   * @see #isEssential()
   * @generated
   */
  void setEssential(boolean value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' reference.
   * @see #setTransition(Transition)
   * @see com.visteon.onoff.states.StatesPackage#getComponentTransition_Transition()
   * @model
   * @generated
   */
  Transition getTransition();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ComponentTransition#getTransition <em>Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(Transition value);

  /**
   * Returns the value of the '<em><b>Timeout In Milliseconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeout In Milliseconds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout In Milliseconds</em>' attribute.
   * @see #setTimeoutInMilliseconds(int)
   * @see com.visteon.onoff.states.StatesPackage#getComponentTransition_TimeoutInMilliseconds()
   * @model
   * @generated
   */
  int getTimeoutInMilliseconds();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ComponentTransition#getTimeoutInMilliseconds <em>Timeout In Milliseconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout In Milliseconds</em>' attribute.
   * @see #getTimeoutInMilliseconds()
   * @generated
   */
  void setTimeoutInMilliseconds(int value);

  /**
   * Returns the value of the '<em><b>Maxretries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maxretries</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maxretries</em>' attribute.
   * @see #setMaxretries(int)
   * @see com.visteon.onoff.states.StatesPackage#getComponentTransition_Maxretries()
   * @model
   * @generated
   */
  int getMaxretries();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ComponentTransition#getMaxretries <em>Maxretries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maxretries</em>' attribute.
   * @see #getMaxretries()
   * @generated
   */
  void setMaxretries(int value);

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
   * @see com.visteon.onoff.states.StatesPackage#getComponentTransition_StateDependency()
   * @model containment="true"
   * @generated
   */
  StateDependency getStateDependency();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ComponentTransition#getStateDependency <em>State Dependency</em>}' containment reference.
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
   * @see com.visteon.onoff.states.StatesPackage#getComponentTransition_FeatureDependency()
   * @model containment="true"
   * @generated
   */
  FeatureDependency getFeatureDependency();

  /**
   * Sets the value of the '{@link com.visteon.onoff.states.ComponentTransition#getFeatureDependency <em>Feature Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Dependency</em>' containment reference.
   * @see #getFeatureDependency()
   * @generated
   */
  void setFeatureDependency(FeatureDependency value);

} // ComponentTransition
