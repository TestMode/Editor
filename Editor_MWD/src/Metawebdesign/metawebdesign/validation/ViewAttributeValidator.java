/**
 *
 * $Id$
 */
package Metawebdesign.metawebdesign.validation;

import Metawebdesign.metawebdesign.Attributes;
import Metawebdesign.metawebdesign.typeHorizontalPosition;
import Metawebdesign.metawebdesign.typePresentation;
import Metawebdesign.metawebdesign.typeViewAttribute;

/**
 * A sample validator interface for {@link Metawebdesign.metawebdesign.ViewAttribute}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ViewAttributeValidator {
	boolean validate();

	boolean validateGetAttribute(Attributes value);
	boolean validateTypePresentation(typePresentation value);
	boolean validateName(String value);
	boolean validatePositionHorizontal(typeHorizontalPosition value);
	boolean validatePostionVertical(int value);
	boolean validateFrom(typeViewAttribute value);
}
