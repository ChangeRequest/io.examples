package school.lemon.changerequest.java.io.examples;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("data/printWriterExample.dat");
        pw.printf("It's easy to use formatted %s now!", "string");
        pw.println();
        pw.flush();
        pw.close();
    }
}
