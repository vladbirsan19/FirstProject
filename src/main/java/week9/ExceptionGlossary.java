package week9;

public class ExceptionGlossary {

    /**
     * Throwable (parent for all "exceptions")
     *      Error - program does not have any change to recover from errors - do not handle them !
     *          OutOfMemoryError - when the JVM does not have enough RAM memory
     *          StackOverflowError - when the Stack memory fills up
     *          ... & others
     *      Exception
     *         {
     *         IOException
     *              FileNotFoundException
     *              .... & others
     *         SqlException
     *         MyCustomCheckedException
     *         ... & others
     *         } -> checked exceptions (by the compiler)
     *
     *         RuntimeException (unchecked)
     *              NullPointerException - when there is no instance created
     *              InputMismatchException
     *              IllegalArgumentException
     *              ArithmeticException - when there's a mathematical problem
     *              ArrayIndexOutOfBoundsException - when array size is smaller than the used index
     *              NumberFormatException
     *              UnsupportedOperationException - encountered when operation is not implemented
     *              ... & others
     */

    /**
     *  try - catch syntax
     *  try - multi catch syntax (2 forms)
     *  try - catch - finally
     *  throw syntax - manual throw the exception
     *  throws syntax
     *  try - with - resources
     *  AutoClosable
     */

    /**
     * custom exceptions (checked & runtime(unchecked))
     */
}
