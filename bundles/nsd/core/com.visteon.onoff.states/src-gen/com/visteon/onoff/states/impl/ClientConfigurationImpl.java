/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.states.impl;

import com.visteon.onoff.coom.ComponentOnOffManifest;

import com.visteon.onoff.states.ClientConfiguration;
import com.visteon.onoff.states.ComponentState;
import com.visteon.onoff.states.ComponentTransition;
import com.visteon.onoff.states.Feature;
import com.visteon.onoff.states.NodeStateAssociation;
import com.visteon.onoff.states.StatesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.visteon.onoff.states.impl.ClientConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.visteon.onoff.states.impl.ClientConfigurationImpl#getCoomRef <em>Coom Ref</em>}</li>
 *   <li>{@link com.visteon.onoff.states.impl.ClientConfigurationImpl#getTransTimeoutInMilliseconds <em>Trans Timeout In Milliseconds</em>}</li>
 *   <li>{@link com.visteon.onoff.states.impl.ClientConfigurationImpl#getComponentTransitions <em>Component Transitions</em>}</li>
 *   <li>{@link com.visteon.onoff.states.impl.ClientConfigurationImpl#getNodeStateAssociations <em>Node State Associations</em>}</li>
 *   <li>{@link com.visteon.onoff.states.impl.ClientConfigurationImpl#getComponentStates <em>Component States</em>}</li>
 *   <li>{@link com.visteon.onoff.states.impl.ClientConfigurationImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientConfigurationImpl extends MinimalEObjectImpl.Container implements ClientConfiguration
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
   * The cached value of the '{@link #getCoomRef() <em>Coom Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoomRef()
   * @generated
   * @ordered
   */
  protected ComponentOnOffManifest coomRef;

  /**
   * The default value of the '{@link #getTransTimeoutInMilliseconds() <em>Trans Timeout In Milliseconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransTimeoutInMilliseconds()
   * @generated
   * @ordered
   */
  protected static final int TRANS_TIMEOUT_IN_MILLISECONDS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTransTimeoutInMilliseconds() <em>Trans Timeout In Milliseconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransTimeoutInMilliseconds()
   * @generated
   * @ordered
   */
  protected int transTimeoutInMilliseconds = TRANS_TIMEOUT_IN_MILLISECONDS_EDEFAULT;

  /**
   * The cached value of the '{@link #getComponentTransitions() <em>Component Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentTransitions()
   * @generated
   * @ordered
   */
  protected EList<ComponentTransition> componentTransitions;

  /**
   * The cached value of the '{@link #getNodeStateAssociations() <em>Node State Associations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeStateAssociations()
   * @generated
   * @ordered
   */
  protected EList<NodeStateAssociation> nodeStateAssociations;

  /**
   * The cached value of the '{@link #getComponentStates() <em>Component States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentStates()
   * @generated
   * @ordered
   */
  protected EList<ComponentState> componentStates;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClientConfigurationImpl()
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
    return StatesPackage.Literals.CLIENT_CONFIGURATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.CLIENT_CONFIGURATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentOnOffManifest getCoomRef()
  {
    if (coomRef != null && coomRef.eIsProxy())
    {
      InternalEObject oldCoomRef = (InternalEObject)coomRef;
      coomRef = (ComponentOnOffManifest)eResolveProxy(oldCoomRef);
      if (coomRef != oldCoomRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.CLIENT_CONFIGURATION__COOM_REF, oldCoomRef, coomRef));
      }
    }
    return coomRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentOnOffManifest basicGetCoomRef()
  {
    return coomRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoomRef(ComponentOnOffManifest newCoomRef)
  {
    ComponentOnOffManifest oldCoomRef = coomRef;
    coomRef = newCoomRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.CLIENT_CONFIGURATION__COOM_REF, oldCoomRef, coomRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTransTimeoutInMilliseconds()
  {
    return transTimeoutInMilliseconds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransTimeoutInMilliseconds(int newTransTimeoutInMilliseconds)
  {
    int oldTransTimeoutInMilliseconds = transTimeoutInMilliseconds;
    transTimeoutInMilliseconds = newTransTimeoutInMilliseconds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.CLIENT_CONFIGURATION__TRANS_TIMEOUT_IN_MILLISECONDS, oldTransTimeoutInMilliseconds, transTimeoutInMilliseconds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentTransition> getComponentTransitions()
  {
    if (componentTransitions == null)
    {
      componentTransitions = new EObjectContainmentEList<ComponentTransition>(ComponentTransition.class, this, StatesPackage.CLIENT_CONFIGURATION__COMPONENT_TRANSITIONS);
    }
    return componentTransitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeStateAssociation> getNodeStateAssociations()
  {
    if (nodeStateAssociations == null)
    {
      nodeStateAssociations = new EObjectContainmentEList<NodeStateAssociation>(NodeStateAssociation.class, this, StatesPackage.CLIENT_CONFIGURATION__NODE_STATE_ASSOCIATIONS);
    }
    return nodeStateAssociations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentState> getComponentStates()
  {
    if (componentStates == null)
    {
      componentStates = new EObjectContainmentEList<ComponentState>(ComponentState.class, this, StatesPackage.CLIENT_CONFIGURATION__COMPONENT_STATES);
    }
    return componentStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature>(Feature.class, this, StatesPackage.CLIENT_CONFIGURATION__FEATURES);
    }
    return features;
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
      case StatesPackage.CLIENT_CONFIGURATION__COMPONENT_TRANSITIONS:
        return ((InternalEList<?>)getComponentTransitions()).basicRemove(otherEnd, msgs);
      case StatesPackage.CLIENT_CONFIGURATION__NODE_STATE_ASSOCIATIONS:
        return ((InternalEList<?>)getNodeStateAssociations()).basicRemove(otherEnd, msgs);
      case StatesPackage.CLIENT_CONFIGURATION__COMPONENT_STATES:
        return ((InternalEList<?>)getComponentStates()).basicRemove(otherEnd, msgs);
      case StatesPackage.CLIENT_CONFIGURATION__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
      case StatesPackage.CLIENT_CONFIGURATION__NAME:
        return getName();
      case StatesPackage.CLIENT_CONFIGURATION__COOM_REF:
        if (resolve) return getCoomRef();
        return basicGetCoomRef();
      case StatesPackage.CLIENT_CONFIGURATION__TRANS_TIMEOUT_IN_MILLISECONDS:
        return getTransTimeoutInMilliseconds();
      case StatesPackage.CLIENT_CONFIGURATION__COMPONENT_TRANSITIONS:
        return getComponentTransitions();
      case StatesPackage.CLIENT_CONFIGURATION__NODE_STATE_ASSOCIATIONS:
        return getNodeStateAssociations();
      case StatesPackage.CLIENT_CONFIGURATION__COMPONENT_STATES:
        return getComponentStates();
      case StatesPackage.CLIENT_CONFIGURATION__FEATURES:
        return getFeatures();
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
      case StatesPackage.CLIENT_CONFIGURATION__NAME:
        setName((String)newValue);
        return;
      case StatesPackage.CLIENT_CONFIGURATION__COOM_REF:
        setCoomRef((ComponentOnOffManifest)newValue);
        return;
      case StatesPackage.CLIENT_CONFIGURATION__TRANS_TIMEOUT_IN_MILLISECONDS:
        setTransTimeoutInMilliseconds((Integer)newValue);
        return;
      case StatesPackage.CLIENT_CONFIGURATION__COMPONENT_TRANSITIONS:
        getComponentTransitions().clear();
        getComponentTransitions().addAll((Collection<? extends ComponentTransition>)newValue);
        return;
      case StatesPackage.CLIENT_CONFIGURATION__NODE_STATE_ASSOCIATIONS:
        getNodeStateAssociations().clear();
        getNodeStateAssociations().addAll((Collection<? extends NodeStateAssociation>)newValue);
        return;
      case StatesPackage.CLIENT_CONFIGURATION__COMPONENT_STATES:
        getComponentStates().clear();
        getComponentStates().addAll((Collection<? extends ComponentState>)newValue);
        return;
      case StatesPackage.CLIENT_CONFIGURATION__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
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
      case StatesPackage.CLIENT_CONFIGURATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StatesPackage.CLIENT_CONFIGURATION__COOM_REF:
        setCoomRef((ComponentOnOffManifest)null);
        return;
      case StatesPackage.CLIENT_CONFIGURATION__TRANS_TIMEOUT_IN_MILLISECONDS:
        setTransTimeoutInMilliseconds(TRANS_TIMEOUT_IN_MILLISECONDS_EDEFAULT);
        return;
      case StatesPackage.CLIENT_CONFIGURATION__COMPONENT_TRANSITIONS:
        getComponentTransitions().clear();
        return;
      case StatesPackage.CLIENT_CONFIGURATION__NODE_STATE_ASSOCIATIONS:
        getNodeStateAssociations().clear();
        return;
      case StatesPackage.CLIENT_CONFIGURATION__COMPONENT_STATES:
        getComponentStates().clear();
        return;
      case StatesPackage.CLIENT_CONFIGURATION__FEATURES:
        getFeatures().clear();
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
      case StatesPackage.CLIENT_CONFIGURATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StatesPackage.CLIENT_CONFIGURATION__COOM_REF:
        return coomRef != null;
      case StatesPackage.CLIENT_CONFIGURATION__TRANS_TIMEOUT_IN_MILLISECONDS:
        return transTimeoutInMilliseconds != TRANS_TIMEOUT_IN_MILLISECONDS_EDEFAULT;
      case StatesPackage.CLIENT_CONFIGURATION__COMPONENT_TRANSITIONS:
        return componentTransitions != null && !componentTransitions.isEmpty();
      case StatesPackage.CLIENT_CONFIGURATION__NODE_STATE_ASSOCIATIONS:
        return nodeStateAssociations != null && !nodeStateAssociations.isEmpty();
      case StatesPackage.CLIENT_CONFIGURATION__COMPONENT_STATES:
        return componentStates != null && !componentStates.isEmpty();
      case StatesPackage.CLIENT_CONFIGURATION__FEATURES:
        return features != null && !features.isEmpty();
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
    result.append(", transTimeoutInMilliseconds: ");
    result.append(transTimeoutInMilliseconds);
    result.append(')');
    return result.toString();
  }

} //ClientConfigurationImpl
