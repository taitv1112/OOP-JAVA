package JavaIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn chứa tập tin cần coppy: ");
        String filePath1 = sc.nextLine();
        System.out.println("Nhập đường dẫn chứa tập tin cần coppy tới: ");
        String filePath2 = sc.nextLine();
        File f_0 = new File(filePath1);
        File f_0_copy = new File(filePath2);
        CopyFile.copyAll(f_0,f_0_copy);
        System.out.println("coppy ok");
    }
}
