package school.lemon.changerequest.java.io.examples;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) throws IOException {
        Writer writer = new OutputStreamWriter(System.out);
        writer.write("Some handy message", 5, 5);
        writer.flush();
    }
}
