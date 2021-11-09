package LuyenTap;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien[] nhanViens = new NhanVien[3];
        nhanViens[0] = new NhanVien("Toàn", 20, "nam", 1);
        nhanViens[1] = new NhanVien("An", 22, "nữ", 2);
        nhanViens[2] = new NhanVien("Nhiên", 24, "nam", 3);
        while(true){
            System.out.println("Menu:");
            System.out.println("1: Hiển thị nhân viên ");
            System.out.println("2:Thêm nhân viên ");
            System.out.println("3: Xóa nhân viên ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    show(nhanViens);break;
                case 2:
                    nhanViens = add(nhanViens);
                    show(nhanViens);
                    break;
                case 3:
                    System.out.println("Nhập id cần xóa: ");
                    int id = sc.nextInt();
                    nhanViens = delete(nhanViens,id);
                    show(nhanViens);
            }
        }

    }

    public static void show(NhanVien[] nhanViens) {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv.toString());
        }
    }

    public static NhanVien[] add(NhanVien[] nhanViens) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        int age = sc.nextInt();
        System.out.println("Nhập giới tính nhân viên: ");
        String sex = sc.next();
        System.out.println("Nhập ID  nhân viên: ");
        int id = sc.nextInt();
        NhanVien nhanVien = new NhanVien(name, age, sex, id);
        NhanVien[] newNV = new NhanVien[nhanViens.length + 1];
        System.arraycopy(nhanViens, 0, newNV, 0, nhanViens.length);
        newNV[newNV.length - 1] = nhanVien;
        return newNV;
    }
    public static NhanVien[] delete(NhanVien[] nhanViens,int id){
        int index=0;
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i].getId() == id) {
                index= i;
            }
        }
        NhanVien[] newNV = new NhanVien[nhanViens.length-1];
        System.arraycopy(nhanViens,0,newNV,0,index);
        System.arraycopy(nhanViens,(index+1),newNV,index,newNV.length-index);
        return newNV;
    }
}
