package Modeldos.modeldos.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class RelationClassReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public RelationClassReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Modeldos.modeldos.RelationClass) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Modeldos.modeldos.Views && newEnd instanceof Modeldos.modeldos.Views)) {
			return false;
		}
		if (getLink().getFromClass().size() != 1) {
			return false;
		}
		Modeldos.modeldos.Class target = (Modeldos.modeldos.Class) getLink()
				.getFromClass().get(0);
		return Modeldos.modeldos.diagram.edit.policies.ModeldosBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationClass_4001(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Modeldos.modeldos.Class && newEnd instanceof Modeldos.modeldos.Class)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Modeldos.modeldos.Views)) {
			return false;
		}
		Modeldos.modeldos.Views source = (Modeldos.modeldos.Views) getLink()
				.eContainer();
		return Modeldos.modeldos.diagram.edit.policies.ModeldosBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelationClass_4001(getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getHasRelationClass().remove(getLink());
		getNewSource().getHasRelationClass().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getFromClass().remove(getOldTarget());
		getLink().getFromClass().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Modeldos.modeldos.RelationClass getLink() {
		return (Modeldos.modeldos.RelationClass) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Modeldos.modeldos.Views getOldSource() {
		return (Modeldos.modeldos.Views) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modeldos.modeldos.Views getNewSource() {
		return (Modeldos.modeldos.Views) newEnd;
	}

	/**
	 * @generated
	 */
	protected Modeldos.modeldos.Class getOldTarget() {
		return (Modeldos.modeldos.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modeldos.modeldos.Class getNewTarget() {
		return (Modeldos.modeldos.Class) newEnd;
	}
}
