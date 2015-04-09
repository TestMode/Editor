package Modeluno.modeluno.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ClassItemSemanticEditPolicy
		extends
		Modeluno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassItemSemanticEditPolicy() {
		super(
				Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(incomingLink) == Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(incomingLink) == Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(outgoingLink) == Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(outgoingLink) == Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Atributte_4002 == req
				.getElementType()) {
			return getGEFWrapper(new Modeluno.modeluno.diagram.edit.commands.AtributteCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Relation_4001 == req
				.getElementType()) {
			return getGEFWrapper(new Modeluno.modeluno.diagram.edit.commands.RelationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Atributte_4002 == req
				.getElementType()) {
			return getGEFWrapper(new Modeluno.modeluno.diagram.edit.commands.AtributteCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Relation_4001 == req
				.getElementType()) {
			return getGEFWrapper(new Modeluno.modeluno.diagram.edit.commands.RelationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
			return getGEFWrapper(new Modeluno.modeluno.diagram.edit.commands.AtributteReorientCommand(
					req));
		case Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getGEFWrapper(new Modeluno.modeluno.diagram.edit.commands.RelationReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}