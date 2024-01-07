/**
 */
package org.nasdanika.models.nature.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.nature.Fox;
import org.nasdanika.models.nature.Hare;
import org.nasdanika.models.nature.NaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fox</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FoxImpl extends AnimalImpl<Hare> implements Fox {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NaturePackage.Literals.FOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setGenericAttribute(Hare newGenericAttribute) {
		super.setGenericAttribute(newGenericAttribute);
	}
	
	@Override
	public void eats(Hare food) {
		System.out.println("Yum, tasty!");
	}

} //FoxImpl
