package JavaIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFileText {
    public static void copyAll(File f1, File f2) {
        try {
            // Copy ban than no
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(f1.isDirectory()){
            // Copy cac tap tin va thu muc con
            File[] mangCon = f1.listFiles();
            for (File file : mangCon) {
                File file_new = new File(f2.getAbsoluteFile()+"/"+file.getName());
                copyAll(file, file_new);
            }
        }
    }

    public static void main(String[] args) {
        File f_0 = new File("C:\\Users\\Lovin\\IdeaProjects\\OOP-JAVA\\src\\JavaIO\\number.txt");
        File f_0_copy = new File("C:\\Users\\Lovin\\IdeaProjects\\OOP-JAVA\\src\\JavaIO\\numberCopy.txt");
        CopyFileText.copyAll(f_0,f_0_copy);
    }
}
