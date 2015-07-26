/**
 */
package org.nasdanika.webtest.hub;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.SessionWebSocketServlet.WebSocketContext;
import org.nasdanika.core.Deletable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#getTestResults <em>Test Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#getPageResults <em>Page Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#getActorResults <em>Actor Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#isPublished <em>Published</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession()
 * @model superTypes="org.nasdanika.webtest.hub.Descriptor org.nasdanika.webtest.hub.BreadcrumbsProvider org.nasdanika.webtest.hub.Deletable"
 * @generated
 */
public interface TestSession extends Descriptor, BreadcrumbsProvider, Deletable {
	/**
	 * Returns the value of the '<em><b>Test Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.TestResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Results</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_TestResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestResult> getTestResults();

	/**
	 * Returns the value of the '<em><b>Page Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.PageResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Results</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_PageResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageResult> getPageResults();

	/**
	 * Returns the value of the '<em><b>Actor Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.ActorResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Results</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_ActorResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorResult> getActorResults();

	/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Published</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #setPublished(boolean)
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_Published()
	 * @model
	 * @generated
	 */
	boolean isPublished();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.TestSession#isPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #isPublished()
	 * @generated
	 */
	void setPublished(boolean value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.TestSession#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(int)
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_Progress()
	 * @model
	 * @generated
	 */
	int getProgress();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.TestSession#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(int value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_Timestamp()
	 * @model
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.TestSession#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_Node()
	 * @model
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.TestSession#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextDataType="org.nasdanika.webtest.hub.WebSocketContext<org.nasdanika.cdo.security.LoginPasswordCredentials>"
	 * @generated
	 */
	Map<String, Object> getSummaryRow(WebSocketContext<LoginPasswordCredentials> context) throws Exception;

	interface Totals {
		int getPass();
		int getFail();
		int getError();
		int getPending();
		
		int getActorClasses();
		int getActorMethods();
		int getActorCoverage();
		
		int getPageClasses();
		int getPageMethods();
		int getPageCoverage();
		int getPageElements();
	}
	
	Totals getTotals();

} // TestSession
