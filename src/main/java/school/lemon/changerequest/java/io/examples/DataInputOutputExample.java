package school.lemon.changerequest.java.io.examples;

import java.io.*;

public class DataInputOutputExample {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("data/dataOutputExample.dat"));
        dos.writeInt(1);
        dos.writeDouble(2.0);
        dos.writeBoolean(false);
        dos.writeChar('b');
        dos.writeUTF(" message");
        dos.flush();
        dos.close();
        DataInputStream dis = new DataInputStream(
                new FileInputStream("data/dataOutputExample.dat"));
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        System.out.println(dis.readUTF());
        dis.close();
    }
}
