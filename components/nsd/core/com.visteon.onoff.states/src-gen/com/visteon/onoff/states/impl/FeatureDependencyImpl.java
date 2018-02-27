/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states.impl;

import com.visteon.onoff.states.Feature;
import com.visteon.onoff.states.FeatureDependency;
import com.visteon.onoff.states.StatesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.impl.FeatureDependencyImpl#getFeatureDependeny <em>Feature Dependeny</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureDependencyImpl extends MinimalEObjectImpl.Container implements FeatureDependency
{
  /**
   * The cached value of the '{@link #getFeatureDependeny() <em>Feature Dependeny</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureDependeny()
   * @generated
   * @ordered
   */
  protected Feature featureDependeny;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureDependencyImpl()
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
    return StatesPackage.Literals.FEATURE_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getFeatureDependeny()
  {
    if (featureDependeny != null && featureDependeny.eIsProxy())
    {
      InternalEObject oldFeatureDependeny = (InternalEObject)featureDependeny;
      featureDependeny = (Feature)eResolveProxy(oldFeatureDependeny);
      if (featureDependeny != oldFeatureDependeny)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.FEATURE_DEPENDENCY__FEATURE_DEPENDENY, oldFeatureDependeny, featureDependeny));
      }
    }
    return featureDependeny;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetFeatureDependeny()
  {
    return featureDependeny;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureDependeny(Feature newFeatureDependeny)
  {
    Feature oldFeatureDependeny = featureDependeny;
    featureDependeny = newFeatureDependeny;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.FEATURE_DEPENDENCY__FEATURE_DEPENDENY, oldFeatureDependeny, featureDependeny));
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
      case StatesPackage.FEATURE_DEPENDENCY__FEATURE_DEPENDENY:
        if (resolve) return getFeatureDependeny();
        return basicGetFeatureDependeny();
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
      case StatesPackage.FEATURE_DEPENDENCY__FEATURE_DEPENDENY:
        setFeatureDependeny((Feature)newValue);
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
      case StatesPackage.FEATURE_DEPENDENCY__FEATURE_DEPENDENY:
        setFeatureDependeny((Feature)null);
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
      case StatesPackage.FEATURE_DEPENDENCY__FEATURE_DEPENDENY:
        return featureDependeny != null;
    }
    return super.eIsSet(featureID);
  }

} //FeatureDependencyImpl