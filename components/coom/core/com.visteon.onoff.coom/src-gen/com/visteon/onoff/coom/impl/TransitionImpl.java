/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.coom.impl;

import com.visteon.onoff.coom.CoomPackage;
import com.visteon.onoff.coom.State;
import com.visteon.onoff.coom.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.coom.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.visteon.onoff.coom.impl.TransitionImpl#getFromState <em>From State</em>}</li>
 *   <li>{@link com.visteon.onoff.coom.impl.TransitionImpl#getToState <em>To State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFromState() <em>From State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromState()
   * @generated
   * @ordered
   */
  protected State fromState;

  /**
   * The cached value of the '{@link #getToState() <em>To State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToState()
   * @generated
   * @ordered
   */
  protected State toState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return CoomPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoomPackage.TRANSITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getFromState()
  {
    if (fromState != null && fromState.eIsProxy())
    {
      InternalEObject oldFromState = (InternalEObject)fromState;
      fromState = (State)eResolveProxy(oldFromState);
      if (fromState != oldFromState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoomPackage.TRANSITION__FROM_STATE, oldFromState, fromState));
      }
    }
    return fromState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetFromState()
  {
    return fromState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromState(State newFromState)
  {
    State oldFromState = fromState;
    fromState = newFromState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoomPackage.TRANSITION__FROM_STATE, oldFromState, fromState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getToState()
  {
    if (toState != null && toState.eIsProxy())
    {
      InternalEObject oldToState = (InternalEObject)toState;
      toState = (State)eResolveProxy(oldToState);
      if (toState != oldToState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoomPackage.TRANSITION__TO_STATE, oldToState, toState));
      }
    }
    return toState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetToState()
  {
    return toState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToState(State newToState)
  {
    State oldToState = toState;
    toState = newToState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoomPackage.TRANSITION__TO_STATE, oldToState, toState));
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
      case CoomPackage.TRANSITION__NAME:
        return getName();
      case CoomPackage.TRANSITION__FROM_STATE:
        if (resolve) return getFromState();
        return basicGetFromState();
      case CoomPackage.TRANSITION__TO_STATE:
        if (resolve) return getToState();
        return basicGetToState();
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
      case CoomPackage.TRANSITION__NAME:
        setName((String)newValue);
        return;
      case CoomPackage.TRANSITION__FROM_STATE:
        setFromState((State)newValue);
        return;
      case CoomPackage.TRANSITION__TO_STATE:
        setToState((State)newValue);
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
      case CoomPackage.TRANSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CoomPackage.TRANSITION__FROM_STATE:
        setFromState((State)null);
        return;
      case CoomPackage.TRANSITION__TO_STATE:
        setToState((State)null);
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
      case CoomPackage.TRANSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CoomPackage.TRANSITION__FROM_STATE:
        return fromState != null;
      case CoomPackage.TRANSITION__TO_STATE:
        return toState != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
