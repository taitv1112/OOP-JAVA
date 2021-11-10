package LuyenTap;

import java.util.Arrays;
import java.util.Scanner;

public class Controler {
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
        NhanVien nhanVien = new NhanVien(name, age, sex);
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
    public static NhanVien[] arraysSortID(NhanVien[] nhanViens){
        NhanVienComparator nhanVienComparator = new NhanVienComparator();
        Arrays.sort(nhanViens,nhanVienComparator);
        return nhanViens;
    }
    public static NhanVien[] editId(NhanVien[] nhanViens,int id){
        int index = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            if(nhanViens[i].getId()==id){
                index = i;
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        int age = sc.nextInt();
        System.out.println("Nhập giới tính nhân viên: ");
        String sex = sc.next();
        nhanViens[index].setAll(name,age,sex);
        return nhanViens;
    }
}
