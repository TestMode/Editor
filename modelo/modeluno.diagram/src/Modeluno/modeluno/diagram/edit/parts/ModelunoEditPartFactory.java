package Modeluno.modeluno.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ModelunoEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(view)) {

			case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.MapEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewAdminEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewAdminTitleEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewAdminTitleEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.AdminEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.AdminEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.AdminNameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.AdminNameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewIndexEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewIndexTitleEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewIndexTitleEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewInputEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewInputTitleEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewInputTitleEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ListViewEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ListViewEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ListViewNameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ListViewNameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ClassEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.DeleteEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.DeleteEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.DeleteNameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.DeleteNameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedAnameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.Attribute_Not_DerivedAnameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.PageEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.PageEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.PageTitleEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.PageTitleEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewAttributeEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewAttributeTitleEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewAttributeTitleEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeTitleEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewUpdateAttributeTitleEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.Attribute_DerivedAnameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.UpdateAttributeEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.UpdateAttributeNameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.UpdateAttributeNameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectTitleEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewUpdateObjectTitleEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ViewNameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ViewNameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.CreateEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.CreateEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.CreateNameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.CreateNameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.UpdateObjectEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.UpdateObjectNameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.UpdateObjectNameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.RelationClassEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.RelationServiceEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.RelationViewEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.RelationAttributeEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
