package school.lemon.changerequest.java.io.examples;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data/bufferedWriter.dat");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        for (int i = 0; i < 10; i++) {
            bw.write("String #" + i);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
