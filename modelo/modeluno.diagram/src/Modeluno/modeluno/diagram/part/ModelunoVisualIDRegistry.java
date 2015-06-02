package Modeluno.modeluno.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ModelunoVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "modeluno.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Modeluno.modeluno.diagram.edit.parts.MapEditPart.MODEL_ID
					.equals(view.getType())) {
				return Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				Modeluno.modeluno.diagram.part.ModelunoDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getMap().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Modeluno.modeluno.Map) domainElement)) {
			return Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getModelID(containerView);
		if (!Modeluno.modeluno.diagram.edit.parts.MapEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (Modeluno.modeluno.diagram.edit.parts.MapEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getViewAdmin()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getAdmin()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getViewIndex()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getViewInput()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getListView()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getClass_()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getDelete()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAttribute_Not_Derived().isSuperTypeOf(
							domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getPage()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getViewAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getViewUpdateAttribute().isSuperTypeOf(
							domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAttribute_Derived().isSuperTypeOf(
							domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getUpdateAttribute().isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getViewUpdateObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getView()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getCreate()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID;
			}
			if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getUpdateObject()
					.isSuperTypeOf(domainElement.eClass())) {
				return Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getModelID(containerView);
		if (!Modeluno.modeluno.diagram.edit.parts.MapEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (Modeluno.modeluno.diagram.edit.parts.MapEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.ViewAdminTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.AdminNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.ViewIndexTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.ViewInputTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.ListViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.DeleteNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedAnameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.PageTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.ViewAttributeTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.UpdateAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.ViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.CreateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
			if (Modeluno.modeluno.diagram.edit.parts.UpdateObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getRelationClass()
				.isSuperTypeOf(domainElement.eClass())) {
			return Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID;
		}
		if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getRelationService()
				.isSuperTypeOf(domainElement.eClass())) {
			return Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID;
		}
		if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getRelationView()
				.isSuperTypeOf(domainElement.eClass())) {
			return Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID;
		}
		if (Modeluno.modeluno.ModelunoPackage.eINSTANCE.getRelationAttribute()
				.isSuperTypeOf(domainElement.eClass())) {
			return Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Modeluno.modeluno.Map element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return false;
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
		case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
