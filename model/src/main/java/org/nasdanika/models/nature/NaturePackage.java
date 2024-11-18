/**
 */
package org.nasdanika.models.nature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.nature.NatureFactory
 * @model kind="package"
 * @generated
 */
public interface NaturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/nature";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nature";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NaturePackage eINSTANCE = org.nasdanika.models.nature.impl.NaturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nature.LivingBeing <em>Living Being</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nature.LivingBeing
	 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getLivingBeing()
	 * @generated
	 */
	int LIVING_BEING = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_BEING__COLOR = 0;

	/**
	 * The number of structural features of the '<em>Living Being</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_BEING_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Communicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_BEING___COMMUNICATE = 0;

	/**
	 * The number of operations of the '<em>Living Being</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_BEING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nature.impl.BiomeImpl <em>Biome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nature.impl.BiomeImpl
	 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getBiome()
	 * @generated
	 */
	int BIOME = 1;

	/**
	 * The feature id for the '<em><b>Living Beings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOME__LIVING_BEINGS = 0;

	/**
	 * The number of structural features of the '<em>Biome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Biome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nature.impl.ForestImpl <em>Forest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nature.impl.ForestImpl
	 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getForest()
	 * @generated
	 */
	int FOREST = 2;

	/**
	 * The feature id for the '<em><b>Living Beings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREST__LIVING_BEINGS = BIOME__LIVING_BEINGS;

	/**
	 * The number of structural features of the '<em>Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREST_FEATURE_COUNT = BIOME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREST_OPERATION_COUNT = BIOME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nature.Food <em>Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nature.Food
	 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getFood()
	 * @generated
	 */
	int FOOD = 3;

	/**
	 * The number of structural features of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nature.impl.AnimalImpl <em>Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nature.impl.AnimalImpl
	 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getAnimal()
	 * @generated
	 */
	int ANIMAL = 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__COLOR = LIVING_BEING__COLOR;

	/**
	 * The feature id for the '<em><b>Generic Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__GENERIC_ATTRIBUTE = LIVING_BEING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__NAME = LIVING_BEING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Eaten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__EATEN = LIVING_BEING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_FEATURE_COUNT = LIVING_BEING_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Communicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL___COMMUNICATE = LIVING_BEING___COMMUNICATE;

	/**
	 * The operation id for the '<em>Eats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL___EATS__FOOD = LIVING_BEING_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_OPERATION_COUNT = LIVING_BEING_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nature.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nature.impl.PlantImpl
	 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__COLOR = LIVING_BEING__COLOR;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = LIVING_BEING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Communicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___COMMUNICATE = LIVING_BEING___COMMUNICATE;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = LIVING_BEING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nature.impl.GrassImpl <em>Grass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nature.impl.GrassImpl
	 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getGrass()
	 * @generated
	 */
	int GRASS = 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRASS__COLOR = PLANT__COLOR;

	/**
	 * The number of structural features of the '<em>Grass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRASS_FEATURE_COUNT = PLANT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Communicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRASS___COMMUNICATE = PLANT___COMMUNICATE;

	/**
	 * The number of operations of the '<em>Grass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRASS_OPERATION_COUNT = PLANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nature.impl.HareImpl <em>Hare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nature.impl.HareImpl
	 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getHare()
	 * @generated
	 */
	int HARE = 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE__COLOR = ANIMAL__COLOR;

	/**
	 * The feature id for the '<em><b>Generic Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE__GENERIC_ATTRIBUTE = ANIMAL__GENERIC_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE__NAME = ANIMAL__NAME;

	/**
	 * The feature id for the '<em><b>Eaten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE__EATEN = ANIMAL__EATEN;

	/**
	 * The number of structural features of the '<em>Hare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Communicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE___COMMUNICATE = ANIMAL___COMMUNICATE;

	/**
	 * The operation id for the '<em>Eats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE___EATS__FOOD = ANIMAL___EATS__FOOD;

	/**
	 * The number of operations of the '<em>Hare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE_OPERATION_COUNT = ANIMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nature.impl.FoxImpl <em>Fox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nature.impl.FoxImpl
	 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getFox()
	 * @generated
	 */
	int FOX = 8;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX__COLOR = ANIMAL__COLOR;

	/**
	 * The feature id for the '<em><b>Generic Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX__GENERIC_ATTRIBUTE = ANIMAL__GENERIC_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX__NAME = ANIMAL__NAME;

	/**
	 * The feature id for the '<em><b>Eaten</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX__EATEN = ANIMAL__EATEN;

	/**
	 * The number of structural features of the '<em>Fox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Eats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX___EATS__FOOD = ANIMAL___EATS__FOOD;

	/**
	 * The operation id for the '<em>Communicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX___COMMUNICATE = ANIMAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX_OPERATION_COUNT = ANIMAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nature.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nature.Color
	 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 9;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nature.LivingBeing <em>Living Being</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Being</em>'.
	 * @see org.nasdanika.models.nature.LivingBeing
	 * @generated
	 */
	EClass getLivingBeing();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nature.LivingBeing#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.nature.LivingBeing#getColor()
	 * @see #getLivingBeing()
	 * @generated
	 */
	EAttribute getLivingBeing_Color();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.nature.LivingBeing#communicate() <em>Communicate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Communicate</em>' operation.
	 * @see org.nasdanika.models.nature.LivingBeing#communicate()
	 * @generated
	 */
	EOperation getLivingBeing__Communicate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nature.Biome <em>Biome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biome</em>'.
	 * @see org.nasdanika.models.nature.Biome
	 * @generated
	 */
	EClass getBiome();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.nature.Biome#getLivingBeings <em>Living Beings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Living Beings</em>'.
	 * @see org.nasdanika.models.nature.Biome#getLivingBeings()
	 * @see #getBiome()
	 * @generated
	 */
	EReference getBiome_LivingBeings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nature.Forest <em>Forest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forest</em>'.
	 * @see org.nasdanika.models.nature.Forest
	 * @generated
	 */
	EClass getForest();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nature.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food</em>'.
	 * @see org.nasdanika.models.nature.Food
	 * @generated
	 */
	EClass getFood();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nature.Animal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animal</em>'.
	 * @see org.nasdanika.models.nature.Animal
	 * @generated
	 */
	EClass getAnimal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nature.Animal#getGenericAttribute <em>Generic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Attribute</em>'.
	 * @see org.nasdanika.models.nature.Animal#getGenericAttribute()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_GenericAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nature.Animal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.nature.Animal#getName()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.nature.Animal#getEaten <em>Eaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eaten</em>'.
	 * @see org.nasdanika.models.nature.Animal#getEaten()
	 * @see #getAnimal()
	 * @generated
	 */
	EReference getAnimal_Eaten();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.nature.Animal#eats(org.nasdanika.models.nature.Food) <em>Eats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eats</em>' operation.
	 * @see org.nasdanika.models.nature.Animal#eats(org.nasdanika.models.nature.Food)
	 * @generated
	 */
	EOperation getAnimal__Eats__Food();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nature.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see org.nasdanika.models.nature.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nature.Grass <em>Grass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grass</em>'.
	 * @see org.nasdanika.models.nature.Grass
	 * @generated
	 */
	EClass getGrass();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nature.Hare <em>Hare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hare</em>'.
	 * @see org.nasdanika.models.nature.Hare
	 * @generated
	 */
	EClass getHare();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nature.Fox <em>Fox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fox</em>'.
	 * @see org.nasdanika.models.nature.Fox
	 * @generated
	 */
	EClass getFox();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.nature.Fox#communicate() <em>Communicate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Communicate</em>' operation.
	 * @see org.nasdanika.models.nature.Fox#communicate()
	 * @generated
	 */
	EOperation getFox__Communicate();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.nature.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see org.nasdanika.models.nature.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NatureFactory getNatureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nature.LivingBeing <em>Living Being</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nature.LivingBeing
		 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getLivingBeing()
		 * @generated
		 */
		EClass LIVING_BEING = eINSTANCE.getLivingBeing();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_BEING__COLOR = eINSTANCE.getLivingBeing_Color();

		/**
		 * The meta object literal for the '<em><b>Communicate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIVING_BEING___COMMUNICATE = eINSTANCE.getLivingBeing__Communicate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nature.impl.BiomeImpl <em>Biome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nature.impl.BiomeImpl
		 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getBiome()
		 * @generated
		 */
		EClass BIOME = eINSTANCE.getBiome();

		/**
		 * The meta object literal for the '<em><b>Living Beings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIOME__LIVING_BEINGS = eINSTANCE.getBiome_LivingBeings();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nature.impl.ForestImpl <em>Forest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nature.impl.ForestImpl
		 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getForest()
		 * @generated
		 */
		EClass FOREST = eINSTANCE.getForest();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nature.Food <em>Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nature.Food
		 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getFood()
		 * @generated
		 */
		EClass FOOD = eINSTANCE.getFood();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nature.impl.AnimalImpl <em>Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nature.impl.AnimalImpl
		 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getAnimal()
		 * @generated
		 */
		EClass ANIMAL = eINSTANCE.getAnimal();

		/**
		 * The meta object literal for the '<em><b>Generic Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__GENERIC_ATTRIBUTE = eINSTANCE.getAnimal_GenericAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__NAME = eINSTANCE.getAnimal_Name();

		/**
		 * The meta object literal for the '<em><b>Eaten</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMAL__EATEN = eINSTANCE.getAnimal_Eaten();

		/**
		 * The meta object literal for the '<em><b>Eats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANIMAL___EATS__FOOD = eINSTANCE.getAnimal__Eats__Food();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nature.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nature.impl.PlantImpl
		 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nature.impl.GrassImpl <em>Grass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nature.impl.GrassImpl
		 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getGrass()
		 * @generated
		 */
		EClass GRASS = eINSTANCE.getGrass();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nature.impl.HareImpl <em>Hare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nature.impl.HareImpl
		 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getHare()
		 * @generated
		 */
		EClass HARE = eINSTANCE.getHare();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nature.impl.FoxImpl <em>Fox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nature.impl.FoxImpl
		 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getFox()
		 * @generated
		 */
		EClass FOX = eINSTANCE.getFox();

		/**
		 * The meta object literal for the '<em><b>Communicate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOX___COMMUNICATE = eINSTANCE.getFox__Communicate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nature.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nature.Color
		 * @see org.nasdanika.models.nature.impl.NaturePackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

	}

} //NaturePackage
