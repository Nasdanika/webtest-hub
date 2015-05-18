/**
 */
package org.nasdanika.webtest.hub;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Table;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.webtest.performance.TimingBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getScreenshots <em>Screenshots</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getBeforeTiming <em>Before Timing</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getBeforeScreenshot <em>Before Screenshot</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getAfterTiming <em>After Timing</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getAfterScreenshot <em>After Screenshot</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getFailure <em>Failure</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getError <em>Error</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getFinish <em>Finish</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.OperationResult#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult()
 * @model superTypes="org.nasdanika.webtest.hub.Descriptor org.nasdanika.webtest.hub.BreadcrumbsProvider"
 * @generated
 */
public interface OperationResult extends Descriptor, BreadcrumbsProvider {
	/**
	 * Returns the value of the '<em><b>Screenshots</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.Screenshot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screenshots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenshots</em>' reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_Screenshots()
	 * @model
	 * @generated
	 */
	EList<Screenshot> getScreenshots();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.OperationResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationResult> getChildren();

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_OperationName()
	 * @model
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.OperationResult#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_Arguments()
	 * @model
	 * @generated
	 */
	EList<String> getArguments();

	/**
	 * Returns the value of the '<em><b>Before Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Timing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Timing</em>' reference.
	 * @see #setBeforeTiming(TimingBase)
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_BeforeTiming()
	 * @model
	 * @generated
	 */
	TimingBase getBeforeTiming();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.OperationResult#getBeforeTiming <em>Before Timing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Timing</em>' reference.
	 * @see #getBeforeTiming()
	 * @generated
	 */
	void setBeforeTiming(TimingBase value);

	/**
	 * Returns the value of the '<em><b>Before Screenshot</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.webtest.hub.Screenshot#getBeforeOperations <em>Before Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Screenshot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Screenshot</em>' reference.
	 * @see #setBeforeScreenshot(Screenshot)
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_BeforeScreenshot()
	 * @see org.nasdanika.webtest.hub.Screenshot#getBeforeOperations
	 * @model opposite="beforeOperations"
	 * @generated
	 */
	Screenshot getBeforeScreenshot();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.OperationResult#getBeforeScreenshot <em>Before Screenshot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Screenshot</em>' reference.
	 * @see #getBeforeScreenshot()
	 * @generated
	 */
	void setBeforeScreenshot(Screenshot value);

	/**
	 * Returns the value of the '<em><b>After Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Timing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Timing</em>' reference.
	 * @see #setAfterTiming(TimingBase)
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_AfterTiming()
	 * @model
	 * @generated
	 */
	TimingBase getAfterTiming();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.OperationResult#getAfterTiming <em>After Timing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Timing</em>' reference.
	 * @see #getAfterTiming()
	 * @generated
	 */
	void setAfterTiming(TimingBase value);

	/**
	 * Returns the value of the '<em><b>After Screenshot</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.webtest.hub.Screenshot#getAfterOperations <em>After Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Screenshot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Screenshot</em>' reference.
	 * @see #setAfterScreenshot(Screenshot)
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_AfterScreenshot()
	 * @see org.nasdanika.webtest.hub.Screenshot#getAfterOperations
	 * @model opposite="afterOperations"
	 * @generated
	 */
	Screenshot getAfterScreenshot();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.OperationResult#getAfterScreenshot <em>After Screenshot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Screenshot</em>' reference.
	 * @see #getAfterScreenshot()
	 * @generated
	 */
	void setAfterScreenshot(Screenshot value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' containment reference.
	 * @see #setFailure(org.nasdanika.webtest.hub.Throwable)
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_Failure()
	 * @model containment="true"
	 * @generated
	 */
	org.nasdanika.webtest.hub.Throwable getFailure();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.OperationResult#getFailure <em>Failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' containment reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(org.nasdanika.webtest.hub.Throwable value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference.
	 * @see #setError(org.nasdanika.webtest.hub.Throwable)
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_Error()
	 * @model containment="true"
	 * @generated
	 */
	org.nasdanika.webtest.hub.Throwable getError();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.OperationResult#getError <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' containment reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(org.nasdanika.webtest.hub.Throwable value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(long)
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_Start()
	 * @model
	 * @generated
	 */
	long getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.OperationResult#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(long value);

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish</em>' attribute.
	 * @see #setFinish(long)
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_Finish()
	 * @model
	 * @generated
	 */
	long getFinish();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.OperationResult#getFinish <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' attribute.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(long value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.webtest.hub.OperationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.webtest.hub.OperationStatus
	 * @see #setStatus(OperationStatus)
	 * @see org.nasdanika.webtest.hub.HubPackage#getOperationResult_Status()
	 * @model
	 * @generated
	 */
	OperationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.OperationResult#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.webtest.hub.OperationStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(OperationStatus value);

	/**
	 * Generates report row
	 * @param htmlFactory
	 * @param methodTable
	 */
	void genRow(HttpServletRequestContext context, Table methodTable) throws Exception;
	
	Object getIcon(HTMLFactory htmlFactory) throws Exception;

	void genRows(HTMLFactory htmlFactory, Table methodTable, Object carouselId, List<Screenshot> screenshots, int indent) throws Exception;

} // OperationResult
