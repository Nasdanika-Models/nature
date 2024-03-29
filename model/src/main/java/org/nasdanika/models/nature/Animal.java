/**
 */
package org.nasdanika.models.nature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nature.Animal#getGenericAttribute <em>Generic Attribute</em>}</li>
 *   <li>{@link org.nasdanika.models.nature.Animal#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.nature.NaturePackage#getAnimal()
 * @model abstract="true"
 * @generated
 */
public interface Animal<F extends Food> extends LivingBeing {
	/**
	 * Returns the value of the '<em><b>Generic Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Attribute</em>' attribute.
	 * @see #setGenericAttribute(Food)
	 * @see org.nasdanika.models.nature.NaturePackage#getAnimal_GenericAttribute()
	 * @model
	 * @generated
	 */
	F getGenericAttribute();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.nature.Animal#getGenericAttribute <em>Generic Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Attribute</em>' attribute.
	 * @see #getGenericAttribute()
	 * @generated
	 */
	void setGenericAttribute(F value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.nature.NaturePackage#getAnimal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.nature.Animal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eats(F food);

} // Animal
