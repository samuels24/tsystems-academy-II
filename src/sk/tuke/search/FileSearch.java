package sk.file.search;

import java.io.File;
import java.io.FilenameFilter;

public class FileSearch {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\A200145092\\Desktop\\Git\\tsystems-academy-II\\");
     //   System.out.println(f.getAbsoluteFile());
        File[] matchingFiles = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                System.out.println(get.FileName());
                return name.startsWith("pokus") && name.endsWith("txt");

            }

        });
    }
}