package Metawebdesign.metawebdesign.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class PageEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Metawebdesign.metawebdesign.diagram.edit.policies.PageItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new PageFigure();
	}

	/**
	 * @generated
	 */
	public PageFigure getPrimaryShape() {
		return (PageFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.PageTitleEditPart) {
			((Metawebdesign.metawebdesign.diagram.edit.parts.PageTitleEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePageTitleFigure());
			return true;
		}
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.PageCompartmentCajonPageEditPart) {
			IFigure pane = getPrimaryShape().getFigureCajonPage();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((Metawebdesign.metawebdesign.diagram.edit.parts.PageCompartmentCajonPageEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.PageTitleEditPart) {
			return true;
		}
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.PageCompartmentCajonPageEditPart) {
			IFigure pane = getPrimaryShape().getFigureCajonPage();
			pane.remove(((Metawebdesign.metawebdesign.diagram.edit.parts.PageCompartmentCajonPageEditPart) childEditPart)
					.getFigure());
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
		super.addChildVisual(childEditPart, -1);
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
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.PageCompartmentCajonPageEditPart) {
			return getPrimaryShape().getFigureCajonPage();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry
				.getType(Metawebdesign.metawebdesign.diagram.edit.parts.PageTitleEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PageFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCajonPage;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePageTitleFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePageRolViewFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePageContent_HTMLFigure;

		/**
		 * @generated
		 */
		public PageFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePageTitleFigure = new WrappingLabel();

			fFigurePageTitleFigure.setText("<...>");

			this.add(fFigurePageTitleFigure, BorderLayout.TOP);

			fFigurePageRolViewFigure = new WrappingLabel();

			fFigurePageRolViewFigure.setText("<...>");

			this.add(fFigurePageRolViewFigure);

			fFigurePageContent_HTMLFigure = new WrappingLabel();

			fFigurePageContent_HTMLFigure.setText("<...>");

			this.add(fFigurePageContent_HTMLFigure);

			fFigureCajonPage = new RectangleFigure();

			this.add(fFigureCajonPage, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCajonPage() {
			return fFigureCajonPage;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePageTitleFigure() {
			return fFigurePageTitleFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePageRolViewFigure() {
			return fFigurePageRolViewFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePageContent_HTMLFigure() {
			return fFigurePageContent_HTMLFigure;
		}

	}

}
