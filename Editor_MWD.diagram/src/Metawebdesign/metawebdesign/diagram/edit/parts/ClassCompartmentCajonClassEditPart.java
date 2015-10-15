package Metawebdesign.metawebdesign.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class ClassCompartmentCajonClassEditPart extends ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7003;

	/**
	 * @generated
	 */
	public ClassCompartmentCajonClassEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Metawebdesign.metawebdesign.diagram.part.Messages.ClassCompartmentCajonClassEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Metawebdesign.metawebdesign.diagram.edit.policies.ClassCompartmentCajonClassItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new Metawebdesign.metawebdesign.diagram.edit.policies.ClassCompartmentCajonClassCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
<<<<<<< HEAD:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/parts/ClassCompartmentCajonClassEditPart.java
			if (type == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_3007) {
				return this;
			}
			if (type == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3005) {
				return this;
			}
			if (type == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3006) {
=======
			if (type == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Derived_3005) {
				return this;
			}
			if (type == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.NotDerived_3006) {
				return this;
			}
			if (type == Metawebdesign.metawebdesign.diagram.providers.MetaWebDesignElementTypes.Constraint_3007) {
>>>>>>> 695e9e7e90f5aebcde04a16e3acfc70b4e09bc98:Editor_MWD.diagram/src/Metawebdesign/metawebdesign/diagram/edit/parts/ClassCompartmentCajonClassEditPart.java
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
