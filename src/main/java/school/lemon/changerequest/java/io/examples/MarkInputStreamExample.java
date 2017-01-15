package school.lemon.changerequest.java.io.examples;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkInputStreamExample {
    public static void main(String[] args) throws IOException {
        String sentence = "This is very long sentence";
        InputStream is = new ByteArrayInputStream(sentence.getBytes());
        StringBuilder result = new StringBuilder();
        is.mark(0);
        readFiveBytes(is, result);
        is.reset();
        readFiveBytes(is, result);
        System.out.println(result.toString());
    }

    private static void readFiveBytes(InputStream is, StringBuilder result) throws IOException {
        for (int i = 0; i < 5; i++) {
            result.append((char) is.read());
        }
        result.append('\n');
    }
}
