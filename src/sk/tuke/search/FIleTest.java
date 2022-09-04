package sk.file.search;

import java.io.File;

public class FIleTest {
    public static void main(String[] args) {
        var file = new File(".");
        System.out.println(file.getAbsoluteFile());
        for (var f : file.listFiles()){
            if (f.isDirectory())
            System.out.println("["+f.getName()+"]");
            else
                System.out.println(f.getName());
        }
    }
}
