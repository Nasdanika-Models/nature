/**
 */
package org.nasdanika.models.nature.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.nature.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.nature.NaturePackage
 * @generated
 */
public class NatureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NaturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureSwitch() {
		if (modelPackage == null) {
			modelPackage = NaturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NaturePackage.LIVING_BEING: {
				LivingBeing livingBeing = (LivingBeing)theEObject;
				T result = caseLivingBeing(livingBeing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.BIOME: {
				Biome biome = (Biome)theEObject;
				T result = caseBiome(biome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.FOREST: {
				Forest forest = (Forest)theEObject;
				T result = caseForest(forest);
				if (result == null) result = caseBiome(forest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.FOOD: {
				Food food = (Food)theEObject;
				T result = caseFood(food);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.ANIMAL: {
				Animal<?> animal = (Animal<?>)theEObject;
				T result = caseAnimal(animal);
				if (result == null) result = caseLivingBeing(animal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.PLANT: {
				Plant plant = (Plant)theEObject;
				T result = casePlant(plant);
				if (result == null) result = caseLivingBeing(plant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.GRASS: {
				Grass grass = (Grass)theEObject;
				T result = caseGrass(grass);
				if (result == null) result = casePlant(grass);
				if (result == null) result = caseFood(grass);
				if (result == null) result = caseLivingBeing(grass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.HARE: {
				Hare hare = (Hare)theEObject;
				T result = caseHare(hare);
				if (result == null) result = caseAnimal(hare);
				if (result == null) result = caseFood(hare);
				if (result == null) result = caseLivingBeing(hare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.FOX: {
				Fox fox = (Fox)theEObject;
				T result = caseFox(fox);
				if (result == null) result = caseAnimal(fox);
				if (result == null) result = caseLivingBeing(fox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Living Being</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Living Being</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivingBeing(LivingBeing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiome(Biome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForest(Forest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Food</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Food</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFood(Food object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <F extends Food> T caseAnimal(Animal<F> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlant(Plant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrass(Grass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHare(Hare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFox(Fox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NatureSwitch
