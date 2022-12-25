package week9.example1;

import java.io.FileNotFoundException;

public class MyCustomResource implements AutoCloseable {

    @Override
    public void close() throws FileNotFoundException {
        // closing operation implementation
    }
}
