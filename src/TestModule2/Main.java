package TestModule2;

import LuyenTap.NhanVien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1.Thêm Nhân Viên ");
            System.out.println("2.Xóa Nhân Viên ");
            System.out.println("3.Hiển Thị Nhân Viên ");
            System.out.println("4.Sửa Nhân Viên ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Staff staff = Controller.createStaff();
                    Controller.addStaff(staff);
                    break;
                case 2:
                    Controller.deleteStaff();
                    break;
                case 3:
                    Controller.showStaff();
                    break;
                case 4:
                    Controller.editStaff();
                    break;
            }
        }

    }
}
