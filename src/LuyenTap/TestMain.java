package LuyenTap;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien[] nhanViens = new NhanVien[3];
        nhanViens[0] = new NhanVien("Toàn", 20, "nam");
        nhanViens[1] = new NhanVien("An", 22, "nữ");
        nhanViens[2] = new NhanVien("Nhiên", 24, "nam");
        while(true){
            System.out.println("Menu:");
            System.out.println("1: Hiển thị nhân viên ");
            System.out.println("2:Thêm nhân viên ");
            System.out.println("3: Xóa nhân viên ");
            System.out.println("4: Sửa nhân viên ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Controler.show(nhanViens);break;
                case 2:
                    nhanViens = Controler.add(nhanViens);
                    Controler.show(nhanViens);
                    break;
                case 3:
                    System.out.println("Nhập id cần xóa: ");
                    int id = sc.nextInt();
                    nhanViens = Controler.delete(nhanViens,id);
                    Controler.show(nhanViens);
                case 4:
                    System.out.println("Nhập id cần xóa: ");
                    int ide = sc.nextInt();
                    Controler.editId(nhanViens,ide);
                    Controler.show(nhanViens);
            }
        }

    }


}
