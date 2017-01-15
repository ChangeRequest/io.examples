package school.lemon.changerequest.java.io.examples;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        os.write("Some handy message".getBytes(), 5, 5);
    }
}
