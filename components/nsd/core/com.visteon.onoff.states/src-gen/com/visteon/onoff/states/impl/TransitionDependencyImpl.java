/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states.impl;

import com.visteon.onoff.states.ComponentTransition;
import com.visteon.onoff.states.StatesPackage;
import com.visteon.onoff.states.TransitionDependency;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.impl.TransitionDependencyImpl#getTransistions <em>Transistions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionDependencyImpl extends MinimalEObjectImpl.Container implements TransitionDependency
{
  /**
   * The cached value of the '{@link #getTransistions() <em>Transistions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransistions()
   * @generated
   * @ordered
   */
  protected EList<ComponentTransition> transistions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionDependencyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StatesPackage.Literals.TRANSITION_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentTransition> getTransistions()
  {
    if (transistions == null)
    {
      transistions = new EObjectResolvingEList<ComponentTransition>(ComponentTransition.class, this, StatesPackage.TRANSITION_DEPENDENCY__TRANSISTIONS);
    }
    return transistions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StatesPackage.TRANSITION_DEPENDENCY__TRANSISTIONS:
        return getTransistions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StatesPackage.TRANSITION_DEPENDENCY__TRANSISTIONS:
        getTransistions().clear();
        getTransistions().addAll((Collection<? extends ComponentTransition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StatesPackage.TRANSITION_DEPENDENCY__TRANSISTIONS:
        getTransistions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StatesPackage.TRANSITION_DEPENDENCY__TRANSISTIONS:
        return transistions != null && !transistions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TransitionDependencyImpl
