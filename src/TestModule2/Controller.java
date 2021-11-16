package TestModule2;

import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    static Staff[] staffs = new Staff[0];
    static Scanner sc = new Scanner(System.in);

    public static Staff createStaff() {
        System.out.println("Nhập tên nhân viên: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Nhập số điện thoại nhân viên: ");
        int phoneNumbers = sc.nextInt();
        System.out.println("Nhập địa chỉ của nhân viên: ");
        sc.nextLine();
        String address = sc.nextLine();
        Staff staff = new Staff(name, phoneNumbers, address);
        return staff;
    }

    public static void addStaff(Staff staff) {
        Staff[] newStaffs = new Staff[staffs.length + 1];
        System.arraycopy(staffs, 0, newStaffs, 0, staffs.length);
        newStaffs[staffs.length] = staff;
        staffs = newStaffs;
    }

    public static void deleteStaff() {
        System.out.println("Nhập id nhân viên cần xóa");
        int id = sc.nextInt();
        int index = -1;
        if (checkIdInStaff(id) >= 0) {
            index = checkIdInStaff(id);
            Staff[] newStaff = new Staff[staffs.length - 1];
            System.arraycopy(staffs, 0, newStaff, 0, index);
            System.arraycopy(staffs, (index + 1), newStaff, index, newStaff.length - index);
            staffs = newStaff;
        } else {
            System.out.println("id: " + id + " bạn nhập không tồn tại.");
        }
    }

    public static int checkIdInStaff(int id) {

        for (int i = 0; i < staffs.length; i++) {
            if (id == staffs[i].getId()) {
                return i;
            }
        }
        return 0;
    }

    public static void showStaff() {
        for (Staff nv : staffs) {
            System.out.println(nv.toString());
        }
    }

    public static void editStaff() {
        System.out.println("Nhập id nhân viên cần sửa");
        int id = sc.nextInt();
        int index = -1;
        if (checkIdInStaff(id) >= 0) {
            index = checkIdInStaff(id);
            System.out.println("Nhập tên nhân viên: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Nhập số điện thoại nhân viên: ");
            int phoneNumbers = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập địa chỉ của nhân viên: ");
            sc.nextLine();
            String address = sc.nextLine();
            staffs[index].setAll(name, phoneNumbers, address);
        } else {
            System.out.println("id: " + id + " bạn nhập không tồn tại.");
        }
    }

    public static void menu() {
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
