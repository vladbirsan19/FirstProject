package week10;



public class IOGlossary {

    /**
     * Low-level streams
     *     InputStream - more generic
     *     OutputStream - more generic
     *     FileInputStream - more specific (files)
     *     FileOutputStream
     */

    // input = read
    // output = write

    /**
     * High-level streams
     *      PrintStream - System.out
     *      PrintWriter - pretty similar to PrintStream
     *      BufferedReader -> Reader -> InputStreamReader -> InputStream (low-level)
     *                               -> FileReader
     *      BufferedWriter -> Writer -> OutputStreamWriter -> OutputStream (low-level)
     *                               -> FileWriter
     *      ObjectInputStream  - when we deal with object instances (serialization)
     *      ObjectOutputStream - when we deal with object instances (deserialization)
     *      DataInputStream - old classes
     *      DataOutputStream - old classes
     */


    /**
     * java.nio.Path   - interface(contract)
     *         .Paths  - Utility (factory) class that creates Path objects based on OS
     *         .Files
     * java.io.File (legacy)
     */


}

