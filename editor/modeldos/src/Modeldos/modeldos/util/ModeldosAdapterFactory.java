/**
 */
package Modeldos.modeldos.util;

import Modeldos.modeldos.Attributes;
import Modeldos.modeldos.Derived;
import Modeldos.modeldos.FormCreate;
import Modeldos.modeldos.FormUpdate;
import Modeldos.modeldos.Menu;
import Modeldos.modeldos.ModeldosPackage;
import Modeldos.modeldos.NotDerived;
import Modeldos.modeldos.Page;
import Modeldos.modeldos.PresentationUnit;
import Modeldos.modeldos.RelationPUnit;
import Modeldos.modeldos.Relations_Class;
import Modeldos.modeldos.Root;
import Modeldos.modeldos.ViewAdmin;
import Modeldos.modeldos.ViewIndex;
import Modeldos.modeldos.Views;
import Modeldos.modeldos.group;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Modeldos.modeldos.ModeldosPackage
 * @generated
 */
public class ModeldosAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModeldosPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeldosAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModeldosPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeldosSwitch<Adapter> modelSwitch =
		new ModeldosSwitch<Adapter>() {
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseClass(Modeldos.modeldos.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseRelations_Class(Relations_Class object) {
				return createRelations_ClassAdapter();
			}
			@Override
			public Adapter caseAttributes(Attributes object) {
				return createAttributesAdapter();
			}
			@Override
			public Adapter caseDerived(Derived object) {
				return createDerivedAdapter();
			}
			@Override
			public Adapter caseNotDerived(NotDerived object) {
				return createNotDerivedAdapter();
			}
			@Override
			public Adapter caseViews(Views object) {
				return createViewsAdapter();
			}
			@Override
			public Adapter caseFormCreate(FormCreate object) {
				return createFormCreateAdapter();
			}
			@Override
			public Adapter caseFormUpdate(FormUpdate object) {
				return createFormUpdateAdapter();
			}
			@Override
			public Adapter caseViewIndex(ViewIndex object) {
				return createViewIndexAdapter();
			}
			@Override
			public Adapter caseViewAdmin(ViewAdmin object) {
				return createViewAdminAdapter();
			}
			@Override
			public Adapter casePresentationUnit(PresentationUnit object) {
				return createPresentationUnitAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter casegroup(group object) {
				return creategroupAdapter();
			}
			@Override
			public Adapter caseRelationPUnit(RelationPUnit object) {
				return createRelationPUnitAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.Relations_Class <em>Relations Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.Relations_Class
	 * @generated
	 */
	public Adapter createRelations_ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.Attributes
	 * @generated
	 */
	public Adapter createAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.Derived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.Derived
	 * @generated
	 */
	public Adapter createDerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.NotDerived <em>Not Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.NotDerived
	 * @generated
	 */
	public Adapter createNotDerivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.Views
	 * @generated
	 */
	public Adapter createViewsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.FormCreate <em>Form Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.FormCreate
	 * @generated
	 */
	public Adapter createFormCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.FormUpdate <em>Form Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.FormUpdate
	 * @generated
	 */
	public Adapter createFormUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.ViewIndex <em>View Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.ViewIndex
	 * @generated
	 */
	public Adapter createViewIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.ViewAdmin <em>View Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.ViewAdmin
	 * @generated
	 */
	public Adapter createViewAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.PresentationUnit <em>Presentation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.PresentationUnit
	 * @generated
	 */
	public Adapter createPresentationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.group <em>group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.group
	 * @generated
	 */
	public Adapter creategroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modeldos.modeldos.RelationPUnit <em>Relation PUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modeldos.modeldos.RelationPUnit
	 * @generated
	 */
	public Adapter createRelationPUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModeldosAdapterFactory