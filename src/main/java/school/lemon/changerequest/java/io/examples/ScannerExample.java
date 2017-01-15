package school.lemon.changerequest.java.io.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("data/scannerExample.dat"));
        System.out.println(scanner.nextInt() == 1);
        System.out.println(Double.compare(scanner.nextDouble(), 2.0) == 0);
        System.out.println(scanner.nextInt() == -23);
        System.out.println("c".equals(scanner.next()));
        System.out.println(scanner.nextBoolean());
    }
}
