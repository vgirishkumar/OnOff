/**
 * generated by Xtext 2.13.0
 */
package com.visteon.onoff.coom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.visteon.onoff.coom.CoomFactory
 * @model kind="package"
 * @generated
 */
public interface CoomPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "coom";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.visteon.com/onoff/Coom";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "coom";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CoomPackage eINSTANCE = com.visteon.onoff.coom.impl.CoomPackageImpl.init();

  /**
   * The meta object id for the '{@link com.visteon.onoff.coom.impl.ComponentOnOffManifestImpl <em>Component On Off Manifest</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visteon.onoff.coom.impl.ComponentOnOffManifestImpl
   * @see com.visteon.onoff.coom.impl.CoomPackageImpl#getComponentOnOffManifest()
   * @generated
   */
  int COMPONENT_ON_OFF_MANIFEST = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_ON_OFF_MANIFEST__NAME = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_ON_OFF_MANIFEST__VERSION = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_ON_OFF_MANIFEST__STATES = 2;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_ON_OFF_MANIFEST__TRANSITIONS = 3;

  /**
   * The number of structural features of the '<em>Component On Off Manifest</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_ON_OFF_MANIFEST_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.visteon.onoff.coom.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visteon.onoff.coom.impl.VersionImpl
   * @see com.visteon.onoff.coom.impl.CoomPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 1;

  /**
   * The feature id for the '<em><b>Major Malue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__MAJOR_MALUE = 0;

  /**
   * The feature id for the '<em><b>Minor Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__MINOR_VALUE = 1;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.visteon.onoff.coom.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visteon.onoff.coom.impl.StateImpl
   * @see com.visteon.onoff.coom.impl.CoomPackageImpl#getState()
   * @generated
   */
  int STATE = 2;

  /**
   * The feature id for the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INITIAL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.visteon.onoff.coom.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.visteon.onoff.coom.impl.TransitionImpl
   * @see com.visteon.onoff.coom.impl.CoomPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = 0;

  /**
   * The feature id for the '<em><b>From State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__FROM_STATE = 1;

  /**
   * The feature id for the '<em><b>To State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TO_STATE = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.visteon.onoff.coom.ComponentOnOffManifest <em>Component On Off Manifest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component On Off Manifest</em>'.
   * @see com.visteon.onoff.coom.ComponentOnOffManifest
   * @generated
   */
  EClass getComponentOnOffManifest();

  /**
   * Returns the meta object for the attribute '{@link com.visteon.onoff.coom.ComponentOnOffManifest#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visteon.onoff.coom.ComponentOnOffManifest#getName()
   * @see #getComponentOnOffManifest()
   * @generated
   */
  EAttribute getComponentOnOffManifest_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.visteon.onoff.coom.ComponentOnOffManifest#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see com.visteon.onoff.coom.ComponentOnOffManifest#getVersion()
   * @see #getComponentOnOffManifest()
   * @generated
   */
  EReference getComponentOnOffManifest_Version();

  /**
   * Returns the meta object for the containment reference list '{@link com.visteon.onoff.coom.ComponentOnOffManifest#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see com.visteon.onoff.coom.ComponentOnOffManifest#getStates()
   * @see #getComponentOnOffManifest()
   * @generated
   */
  EReference getComponentOnOffManifest_States();

  /**
   * Returns the meta object for the containment reference list '{@link com.visteon.onoff.coom.ComponentOnOffManifest#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see com.visteon.onoff.coom.ComponentOnOffManifest#getTransitions()
   * @see #getComponentOnOffManifest()
   * @generated
   */
  EReference getComponentOnOffManifest_Transitions();

  /**
   * Returns the meta object for class '{@link com.visteon.onoff.coom.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see com.visteon.onoff.coom.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link com.visteon.onoff.coom.Version#getMajorMalue <em>Major Malue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Major Malue</em>'.
   * @see com.visteon.onoff.coom.Version#getMajorMalue()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_MajorMalue();

  /**
   * Returns the meta object for the attribute '{@link com.visteon.onoff.coom.Version#getMinorValue <em>Minor Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minor Value</em>'.
   * @see com.visteon.onoff.coom.Version#getMinorValue()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_MinorValue();

  /**
   * Returns the meta object for class '{@link com.visteon.onoff.coom.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see com.visteon.onoff.coom.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link com.visteon.onoff.coom.State#isInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial</em>'.
   * @see com.visteon.onoff.coom.State#isInitial()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Initial();

  /**
   * Returns the meta object for the attribute '{@link com.visteon.onoff.coom.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visteon.onoff.coom.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for class '{@link com.visteon.onoff.coom.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see com.visteon.onoff.coom.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link com.visteon.onoff.coom.Transition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.visteon.onoff.coom.Transition#getName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Name();

  /**
   * Returns the meta object for the reference '{@link com.visteon.onoff.coom.Transition#getFromState <em>From State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From State</em>'.
   * @see com.visteon.onoff.coom.Transition#getFromState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_FromState();

  /**
   * Returns the meta object for the reference '{@link com.visteon.onoff.coom.Transition#getToState <em>To State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To State</em>'.
   * @see com.visteon.onoff.coom.Transition#getToState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_ToState();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CoomFactory getCoomFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.visteon.onoff.coom.impl.ComponentOnOffManifestImpl <em>Component On Off Manifest</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visteon.onoff.coom.impl.ComponentOnOffManifestImpl
     * @see com.visteon.onoff.coom.impl.CoomPackageImpl#getComponentOnOffManifest()
     * @generated
     */
    EClass COMPONENT_ON_OFF_MANIFEST = eINSTANCE.getComponentOnOffManifest();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_ON_OFF_MANIFEST__NAME = eINSTANCE.getComponentOnOffManifest_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_ON_OFF_MANIFEST__VERSION = eINSTANCE.getComponentOnOffManifest_Version();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_ON_OFF_MANIFEST__STATES = eINSTANCE.getComponentOnOffManifest_States();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_ON_OFF_MANIFEST__TRANSITIONS = eINSTANCE.getComponentOnOffManifest_Transitions();

    /**
     * The meta object literal for the '{@link com.visteon.onoff.coom.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visteon.onoff.coom.impl.VersionImpl
     * @see com.visteon.onoff.coom.impl.CoomPackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Major Malue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__MAJOR_MALUE = eINSTANCE.getVersion_MajorMalue();

    /**
     * The meta object literal for the '<em><b>Minor Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__MINOR_VALUE = eINSTANCE.getVersion_MinorValue();

    /**
     * The meta object literal for the '{@link com.visteon.onoff.coom.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visteon.onoff.coom.impl.StateImpl
     * @see com.visteon.onoff.coom.impl.CoomPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__INITIAL = eINSTANCE.getState_Initial();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '{@link com.visteon.onoff.coom.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.visteon.onoff.coom.impl.TransitionImpl
     * @see com.visteon.onoff.coom.impl.CoomPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

    /**
     * The meta object literal for the '<em><b>From State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__FROM_STATE = eINSTANCE.getTransition_FromState();

    /**
     * The meta object literal for the '<em><b>To State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TO_STATE = eINSTANCE.getTransition_ToState();

  }

} //CoomPackage
