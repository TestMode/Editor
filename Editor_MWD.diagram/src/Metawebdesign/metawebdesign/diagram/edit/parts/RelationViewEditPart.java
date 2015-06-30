package Metawebdesign.metawebdesign.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RelationViewEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public RelationViewEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Metawebdesign.metawebdesign.diagram.edit.policies.RelationViewItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewNameEditPart) {
			((Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureRelationViewNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.RelationViewNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ViewsHasRelationViewFigure();
	}

	/**
	 * @generated
	 */
	public ViewsHasRelationViewFigure getPrimaryShape() {
		return (ViewsHasRelationViewFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ViewsHasRelationViewFigure extends PolylineConnectionEx {

		private WrappingLabel fFigureRelationViewNameFigure;
		
		/**
		 * @generated
		 */
		public ViewsHasRelationViewFigure() {

			setTargetDecoration(createTargetDecoration());
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			fFigureRelationViewNameFigure = new WrappingLabel();
			fFigureRelationViewNameFigure.setText("<...>");
			this.add(fFigureRelationViewNameFigure);
		}
		
		/**
		 * @generated
		 */
		public WrappingLabel getFigureRelationViewNameFigure() {
			return fFigureRelationViewNameFigure;
		}
		
		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
