/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states.impl;

import com.visteon.onoff.coom.State;

import com.visteon.onoff.states.ComponentState;
import com.visteon.onoff.states.FeatureDependency;
import com.visteon.onoff.states.StateDependency;
import com.visteon.onoff.states.StatesPackage;
import com.visteon.onoff.states.TransitionDependency;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.impl.ComponentStateImpl#getState <em>State</em>}</li>
 *   <li>{@link com.visteon.onoff.states.impl.ComponentStateImpl#getStateDependency <em>State Dependency</em>}</li>
 *   <li>{@link com.visteon.onoff.states.impl.ComponentStateImpl#getFeatureDependency <em>Feature Dependency</em>}</li>
 *   <li>{@link com.visteon.onoff.states.impl.ComponentStateImpl#getTransitionDependency <em>Transition Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentStateImpl extends MinimalEObjectImpl.Container implements ComponentState
{
  /**
   * The cached value of the '{@link #getState() <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state;

  /**
   * The cached value of the '{@link #getStateDependency() <em>State Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateDependency()
   * @generated
   * @ordered
   */
  protected StateDependency stateDependency;

  /**
   * The cached value of the '{@link #getFeatureDependency() <em>Feature Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureDependency()
   * @generated
   * @ordered
   */
  protected FeatureDependency featureDependency;

  /**
   * The cached value of the '{@link #getTransitionDependency() <em>Transition Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionDependency()
   * @generated
   * @ordered
   */
  protected TransitionDependency transitionDependency;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentStateImpl()
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
    return StatesPackage.Literals.COMPONENT_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getState()
  {
    if (state != null && state.eIsProxy())
    {
      InternalEObject oldState = (InternalEObject)state;
      state = (State)eResolveProxy(oldState);
      if (state != oldState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.COMPONENT_STATE__STATE, oldState, state));
      }
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(State newState)
  {
    State oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.COMPONENT_STATE__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDependency getStateDependency()
  {
    return stateDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStateDependency(StateDependency newStateDependency, NotificationChain msgs)
  {
    StateDependency oldStateDependency = stateDependency;
    stateDependency = newStateDependency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesPackage.COMPONENT_STATE__STATE_DEPENDENCY, oldStateDependency, newStateDependency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateDependency(StateDependency newStateDependency)
  {
    if (newStateDependency != stateDependency)
    {
      NotificationChain msgs = null;
      if (stateDependency != null)
        msgs = ((InternalEObject)stateDependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatesPackage.COMPONENT_STATE__STATE_DEPENDENCY, null, msgs);
      if (newStateDependency != null)
        msgs = ((InternalEObject)newStateDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatesPackage.COMPONENT_STATE__STATE_DEPENDENCY, null, msgs);
      msgs = basicSetStateDependency(newStateDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.COMPONENT_STATE__STATE_DEPENDENCY, newStateDependency, newStateDependency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureDependency getFeatureDependency()
  {
    return featureDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureDependency(FeatureDependency newFeatureDependency, NotificationChain msgs)
  {
    FeatureDependency oldFeatureDependency = featureDependency;
    featureDependency = newFeatureDependency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesPackage.COMPONENT_STATE__FEATURE_DEPENDENCY, oldFeatureDependency, newFeatureDependency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureDependency(FeatureDependency newFeatureDependency)
  {
    if (newFeatureDependency != featureDependency)
    {
      NotificationChain msgs = null;
      if (featureDependency != null)
        msgs = ((InternalEObject)featureDependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatesPackage.COMPONENT_STATE__FEATURE_DEPENDENCY, null, msgs);
      if (newFeatureDependency != null)
        msgs = ((InternalEObject)newFeatureDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatesPackage.COMPONENT_STATE__FEATURE_DEPENDENCY, null, msgs);
      msgs = basicSetFeatureDependency(newFeatureDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.COMPONENT_STATE__FEATURE_DEPENDENCY, newFeatureDependency, newFeatureDependency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDependency getTransitionDependency()
  {
    return transitionDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransitionDependency(TransitionDependency newTransitionDependency, NotificationChain msgs)
  {
    TransitionDependency oldTransitionDependency = transitionDependency;
    transitionDependency = newTransitionDependency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesPackage.COMPONENT_STATE__TRANSITION_DEPENDENCY, oldTransitionDependency, newTransitionDependency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitionDependency(TransitionDependency newTransitionDependency)
  {
    if (newTransitionDependency != transitionDependency)
    {
      NotificationChain msgs = null;
      if (transitionDependency != null)
        msgs = ((InternalEObject)transitionDependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatesPackage.COMPONENT_STATE__TRANSITION_DEPENDENCY, null, msgs);
      if (newTransitionDependency != null)
        msgs = ((InternalEObject)newTransitionDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatesPackage.COMPONENT_STATE__TRANSITION_DEPENDENCY, null, msgs);
      msgs = basicSetTransitionDependency(newTransitionDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.COMPONENT_STATE__TRANSITION_DEPENDENCY, newTransitionDependency, newTransitionDependency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StatesPackage.COMPONENT_STATE__STATE_DEPENDENCY:
        return basicSetStateDependency(null, msgs);
      case StatesPackage.COMPONENT_STATE__FEATURE_DEPENDENCY:
        return basicSetFeatureDependency(null, msgs);
      case StatesPackage.COMPONENT_STATE__TRANSITION_DEPENDENCY:
        return basicSetTransitionDependency(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case StatesPackage.COMPONENT_STATE__STATE:
        if (resolve) return getState();
        return basicGetState();
      case StatesPackage.COMPONENT_STATE__STATE_DEPENDENCY:
        return getStateDependency();
      case StatesPackage.COMPONENT_STATE__FEATURE_DEPENDENCY:
        return getFeatureDependency();
      case StatesPackage.COMPONENT_STATE__TRANSITION_DEPENDENCY:
        return getTransitionDependency();
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
      case StatesPackage.COMPONENT_STATE__STATE:
        setState((State)newValue);
        return;
      case StatesPackage.COMPONENT_STATE__STATE_DEPENDENCY:
        setStateDependency((StateDependency)newValue);
        return;
      case StatesPackage.COMPONENT_STATE__FEATURE_DEPENDENCY:
        setFeatureDependency((FeatureDependency)newValue);
        return;
      case StatesPackage.COMPONENT_STATE__TRANSITION_DEPENDENCY:
        setTransitionDependency((TransitionDependency)newValue);
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
      case StatesPackage.COMPONENT_STATE__STATE:
        setState((State)null);
        return;
      case StatesPackage.COMPONENT_STATE__STATE_DEPENDENCY:
        setStateDependency((StateDependency)null);
        return;
      case StatesPackage.COMPONENT_STATE__FEATURE_DEPENDENCY:
        setFeatureDependency((FeatureDependency)null);
        return;
      case StatesPackage.COMPONENT_STATE__TRANSITION_DEPENDENCY:
        setTransitionDependency((TransitionDependency)null);
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
      case StatesPackage.COMPONENT_STATE__STATE:
        return state != null;
      case StatesPackage.COMPONENT_STATE__STATE_DEPENDENCY:
        return stateDependency != null;
      case StatesPackage.COMPONENT_STATE__FEATURE_DEPENDENCY:
        return featureDependency != null;
      case StatesPackage.COMPONENT_STATE__TRANSITION_DEPENDENCY:
        return transitionDependency != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentStateImpl
