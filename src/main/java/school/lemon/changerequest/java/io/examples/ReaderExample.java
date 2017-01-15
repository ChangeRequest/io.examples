package school.lemon.changerequest.java.io.examples;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        char[] input = new char[5];
        int read = reader.read(input);
        System.out.println(String.format("I've read %d chars. Input was: %s",
                read, String.valueOf(input)));
    }
}
