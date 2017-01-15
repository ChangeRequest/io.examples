package school.lemon.changerequest.java.io.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(
                new FileInputStream("data/inputStreamReaderExample.dat"), "Windows-1250");
        char[] chars = new char[2];
        int read = reader.read(chars);
        System.out.println(String.valueOf(chars));
    }
}
