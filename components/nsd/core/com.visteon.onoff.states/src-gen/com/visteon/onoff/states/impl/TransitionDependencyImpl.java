/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states.impl;

import com.visteon.onoff.coom.Transition;

import com.visteon.onoff.states.StatesPackage;
import com.visteon.onoff.states.TransitionDependency;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.impl.TransitionDependencyImpl#getTransitionDependeny <em>Transition Dependeny</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionDependencyImpl extends MinimalEObjectImpl.Container implements TransitionDependency
{
  /**
   * The cached value of the '{@link #getTransitionDependeny() <em>Transition Dependeny</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionDependeny()
   * @generated
   * @ordered
   */
  protected Transition transitionDependeny;

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
  public Transition getTransitionDependeny()
  {
    if (transitionDependeny != null && transitionDependeny.eIsProxy())
    {
      InternalEObject oldTransitionDependeny = (InternalEObject)transitionDependeny;
      transitionDependeny = (Transition)eResolveProxy(oldTransitionDependeny);
      if (transitionDependeny != oldTransitionDependeny)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.TRANSITION_DEPENDENCY__TRANSITION_DEPENDENY, oldTransitionDependeny, transitionDependeny));
      }
    }
    return transitionDependeny;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition basicGetTransitionDependeny()
  {
    return transitionDependeny;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitionDependeny(Transition newTransitionDependeny)
  {
    Transition oldTransitionDependeny = transitionDependeny;
    transitionDependeny = newTransitionDependeny;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TRANSITION_DEPENDENCY__TRANSITION_DEPENDENY, oldTransitionDependeny, transitionDependeny));
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
      case StatesPackage.TRANSITION_DEPENDENCY__TRANSITION_DEPENDENY:
        if (resolve) return getTransitionDependeny();
        return basicGetTransitionDependeny();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StatesPackage.TRANSITION_DEPENDENCY__TRANSITION_DEPENDENY:
        setTransitionDependeny((Transition)newValue);
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
      case StatesPackage.TRANSITION_DEPENDENCY__TRANSITION_DEPENDENY:
        setTransitionDependeny((Transition)null);
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
      case StatesPackage.TRANSITION_DEPENDENCY__TRANSITION_DEPENDENY:
        return transitionDependeny != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionDependencyImpl