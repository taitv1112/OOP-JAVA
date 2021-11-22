package QuanLi.Controller;

import QuanLi.Model.Person;
import QuanLi.Model.Student;
import QuanLi.PersonManagement;
import QuanLi.StudentComporator;

import java.util.ArrayList;

public class Management implements PersonManagement {
    static ArrayList<Student> students = new ArrayList<>();

    @Override
    public void showPerson() {
        if (!managementPersons.isEmpty()){
            for (int i = 0; i < managementPersons.size(); i++) {
                if(managementPersons.get(i) instanceof  Student){
                    String result = ((Student) managementPersons.get(i)).toString();
                    System.out.println(result);
                }
                else {
                    System.out.println(managementPersons.get(i).toString());
                }

            }
        }

    }

    public Person createPerson(int Type) {
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        if (Type == 1) {
            Person newPerson = new Person(name, age);
            return newPerson;
        } else if (Type == 2) {
            System.out.println("Nhập điểm trung bình");
            double avengerPoint = Double.parseDouble(sc.nextLine());
            Student newStudent = new Student(name, age, avengerPoint);
            return newStudent;
        }
        return null;
    }

    @Override
    public void addPerson(int Type) {
        managementPersons.add(createPerson(Type));
        ;
    }

    public int findIdPerson() {
        System.out.println("Nhập id người cần tìm kiếm:");
        int id = Integer.parseInt(sc.nextLine());
        if (id < 0 || id > managementPersons.size()) {
            System.out.println("Id: " + id + " bạn nhập không tồn tại");
            return id;
        } else {
            for (int i = 0; i < managementPersons.size(); i++) {
                if (id == managementPersons.get(i).getId()) {
                    return i;
                }
            }
        }
        System.out.println("Id: " + id + " bạn nhập không tồn tại");
        return id;
    }

    @Override
    public void findPerson() {
        int index = findIdPerson();
        if (index >= 0 && index < managementPersons.size()) {
            if (managementPersons.get(index) instanceof Student) {
                System.out.println(managementPersons.get(index).toString());
            } else {
                System.out.println(managementPersons.get(index).toString());
            }
        }
    }

    @Override
    public void deletePerson() {
        int index = findIdPerson();
        if (index >= 0 && index < managementPersons.size()) {
            managementPersons.remove(index);
        }
    }

    @Override
    public void edditPerson() {
        int index = findIdPerson();
        if (index >= 0 && index < managementPersons.size()) {
            System.out.println("Nhập tên: ");
            String name = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            int age = Integer.parseInt(sc.nextLine());
            if (managementPersons.get(index) instanceof Student) {
                System.out.println("Nhập điểm trung bình: ");
                double avengerPoint = Double.parseDouble(sc.nextLine());
                ((Student) managementPersons.get(index)).setAll(name, age, avengerPoint);
            } else {
                managementPersons.get(index).setAll(name, age);
            }
        }
    }

    @Override
    public void sortByAveragePoint() {
//        getStudent();
//        managementPersons.removeAll(students);
//        StudentComporator studentComporator = new StudentComporator();
//        students.sort(studentComporator);
//        managementPersons.addAll(students);
//        students.clear();
        StudentComporator studentComporator = new StudentComporator();
        managementPersons.sort(studentComporator);
    }

    public void getStudent() {
        for (int i = 0; i < managementPersons.size(); i++) {
            if (managementPersons.get(i) instanceof Student) students.add((Student) managementPersons.get(i));
        }
    }

    @Override
    public void sumAveragePointAllStudent() {
        getStudent();
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).getAvengerPoint();
        }
        double avenger = sum / students.size();
        System.out.println("Điểm trung bình của sinh viên là: " + avenger);
    }

    public void menu() {
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1: Hiển thị tất cả người ");
            System.out.println("2: Thêm một người vào danh sách ");
            System.out.println("3: Tìm vị trí một người trong danh sách ");
            System.out.println("4: Xoá 1 người trong danh sách theo mã ");
            System.out.println("5: Sửa thông tin của 1 người theo mã ");
            System.out.println("6: Sắp xếp danh sách theo điểm trung bình. ");
            System.out.println("7: Tính tổng điểm trung bình all sinh viên ");
            System.out.println("8: Exit");
            System.out.println("------------------------");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    showPerson();
                    break;
                case 2:
                    subMenu();
                    break;
                case 3:
                    findPerson();
                    break;
                case 4:
                    deletePerson();
                    break;
                case 5:
                    edditPerson();
                    break;
                case 6:
                    sortByAveragePoint();
                    break;
                case 7:
                    sumAveragePointAllStudent();
                    break;
                case 8:
                    System.exit(1);
            }
        }

    }

    public void subMenu() {
        while (true) {
            System.out.println("1: Thêm người ");
            System.out.println("2: Thêm sinh viên ");
            System.out.println("3: Menu ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addPerson(1);
                    break;
                case 2:
                    addPerson(2);
                    break;
                case 3:
                    menu();
            }
        }
    }

}
