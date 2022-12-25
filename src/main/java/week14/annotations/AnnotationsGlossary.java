package week14.annotations;

public class AnnotationsGlossary {


    /** ANNOTATIONS - a form of metadata
     * provide data about an instruction
     * that IS NOT part of instruction itself
     */

    /** USAGE
     * - starting with @ -> @Override
     * - can include elements -> @SuppressWarnings(value = "unchecked")
     * - if there is only one element - name can be omitted -> @SuppressWarnings("unchecked")
     * - if there is no element -> parenthesis can be omitted -> @Override
     * - many annotations can be used to replace comments in code -> custom @ClassInfo
     */

    /** Annotation Types used by Java - java.lang
     * @Override - checks if signature is the same as in parent class
     * @Deprecated - marks that something should not be used anymore
     * @SuppressWarnings - suppress specific warnings from the compiler
     * @FunctionInterface - enforces that only an abstract method exists
     */

    /** Annotation Types used by others (meta-annotations) - java.lang.annotations
     * @Retention - specifies how the marked annotation is stored: source, class, runtime
     * @Documented - specifies elements should be documented using JavaDoc tool
     * @Inherited - indicates that the annotation can be inherited from the super class
     * @Repeatable - can be applied more than once to the same declaration or type use
     * @Target - restrict what kind of Java elements the annotation can be applied to
     *         - ElementType.ANNOTATION_TYPE - applicable only to other annotations
     *         - ElementType. CONSTRUCTOR - applicable only to a constructor
     *         - ElementType.FIELD -
     *         - ElementType.LOCAL_VARIABLE
     *         - ElementType.METHOD -
     *         - ElementType.PARAMETER -
     *         - ElementType.TYPE - to all elements of a class
     */
}
