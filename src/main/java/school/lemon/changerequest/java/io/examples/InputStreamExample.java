package school.lemon.changerequest.java.io.examples;

import java.io.IOException;
import java.io.InputStream;


public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        byte[] input = new byte[5];
        int read = is.read(input);
        System.out.println(String.format("I've read %d bytes. Input was: %s",
                read, new String(input)));
    }
}
