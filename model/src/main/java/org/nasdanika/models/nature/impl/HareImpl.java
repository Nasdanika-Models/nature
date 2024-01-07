/**
 */
package org.nasdanika.models.nature.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.nature.Grass;
import org.nasdanika.models.nature.Hare;
import org.nasdanika.models.nature.NaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hare</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HareImpl extends AnimalImpl<Grass> implements Hare {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NaturePackage.Literals.HARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setGenericAttribute(Grass newGenericAttribute) {
		super.setGenericAttribute(newGenericAttribute);
	}

} //HareImpl
