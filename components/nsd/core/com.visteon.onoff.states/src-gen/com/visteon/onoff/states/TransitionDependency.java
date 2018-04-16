/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.TransitionDependency#getTransistions <em>Transistions</em>}</li>
 * </ul>
 *
 * @see com.visteon.onoff.states.StatesPackage#getTransitionDependency()
 * @model
 * @generated
 */
public interface TransitionDependency extends EObject
{
  /**
   * Returns the value of the '<em><b>Transistions</b></em>' reference list.
   * The list contents are of type {@link com.visteon.onoff.states.ComponentTransition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transistions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transistions</em>' reference list.
   * @see com.visteon.onoff.states.StatesPackage#getTransitionDependency_Transistions()
   * @model
   * @generated
   */
  EList<ComponentTransition> getTransistions();

} // TransitionDependency
