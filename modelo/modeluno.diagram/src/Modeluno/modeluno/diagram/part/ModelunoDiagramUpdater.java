package Modeluno.modeluno.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class ModelunoDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor> getSemanticChildren(
			View view) {
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getMap_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor> getMap_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Modeluno.modeluno.Map modelElement = (Modeluno.modeluno.Map) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasClass().iterator(); it
				.hasNext();) {
			Modeluno.modeluno.Class childElement = (Modeluno.modeluno.Class) it
					.next();
			int visualID = Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
				result.add(new Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedLinks(
			View view) {
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
			return getMap_1000ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
			return getAtributte_4002ContainedLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingLinks(
			View view) {
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
			return getAtributte_4002IncomingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
				.getVisualID(view)) {
		case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID:
			return getAtributte_4002OutgoingLinks(view);
		case Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getMap_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2001ContainedLinks(
			View view) {
		Modeluno.modeluno.Class modelElement = (Modeluno.modeluno.Class) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Atributte_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAtributte_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2001IncomingLinks(
			View view) {
		Modeluno.modeluno.Class modelElement = (Modeluno.modeluno.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Atributte_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAtributte_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getClass_2001OutgoingLinks(
			View view) {
		Modeluno.modeluno.Class modelElement = (Modeluno.modeluno.Class) view
				.getElement();
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Atributte_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getAtributte_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getRelation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_Atributte_4002(
			Modeluno.modeluno.Class container) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		for (Iterator<?> links = container.getHasAtribute().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modeluno.modeluno.Atributte) {
				continue;
			}
			Modeluno.modeluno.Atributte link = (Modeluno.modeluno.Atributte) linkObject;
			if (Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Modeluno.modeluno.Class dst = link.getEsDe();
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					dst,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Atributte_4002,
					Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedTypeModelFacetLinks_Relation_4001(
			Modeluno.modeluno.Class container) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Modeluno.modeluno.Relation) {
				continue;
			}
			Modeluno.modeluno.Relation link = (Modeluno.modeluno.Relation) linkObject;
			if (Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getR2();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Modeluno.modeluno.Class) {
				continue;
			}
			Modeluno.modeluno.Class dst = (Modeluno.modeluno.Class) theTarget;
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					dst,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Relation_4001,
					Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_Atributte_4002(
			Modeluno.modeluno.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getAtributte_EsDe()
					|| false == setting.getEObject() instanceof Modeluno.modeluno.Atributte) {
				continue;
			}
			Modeluno.modeluno.Atributte link = (Modeluno.modeluno.Atributte) setting
					.getEObject();
			if (Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modeluno.modeluno.Class) {
				continue;
			}
			Modeluno.modeluno.Class container = (Modeluno.modeluno.Class) link
					.eContainer();
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					target,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Atributte_4002,
					Modeluno.modeluno.diagram.edit.parts.AtributteEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_4001(
			Modeluno.modeluno.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> result = new LinkedList<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Modeluno.modeluno.ModelunoPackage.eINSTANCE
					.getRelation_R2()
					|| false == setting.getEObject() instanceof Modeluno.modeluno.Relation) {
				continue;
			}
			Modeluno.modeluno.Relation link = (Modeluno.modeluno.Relation) setting
					.getEObject();
			if (Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID != Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Modeluno.modeluno.Class) {
				continue;
			}
			Modeluno.modeluno.Class container = (Modeluno.modeluno.Class) link
					.eContainer();
			result.add(new Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor(
					container,
					target,
					link,
					Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Relation_4001,
					Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<Modeluno.modeluno.diagram.part.ModelunoNodeDescriptor> getSemanticChildren(
				View view) {
			return ModelunoDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getContainedLinks(
				View view) {
			return ModelunoDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getIncomingLinks(
				View view) {
			return ModelunoDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Modeluno.modeluno.diagram.part.ModelunoLinkDescriptor> getOutgoingLinks(
				View view) {
			return ModelunoDiagramUpdater.getOutgoingLinks(view);
		}
	};

}