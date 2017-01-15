package school.lemon.changerequest.java.io.examples;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class FileFilterExample {
    public static void main(String[] args) {
        File path = new File("data", "fileFilter");
        if (path.isDirectory()) {
            System.out.println(Arrays.toString(path.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().endsWith("java");
                }
            })));
        }
    }
}
