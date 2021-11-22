package QuanLi;

import QuanLi.Model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public interface PersonManagement {
    ArrayList<Person> managementPersons = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
     void showPerson();
     void addPerson(int Type);
     void findPerson();
     void deletePerson();
     void edditPerson();
     void sortByAveragePoint();
     void sumAveragePointAllStudent();

}



//Có thuộc tính: ArrayList người
//Có các chức năng:
//-   Hiển thị tất cả người
//-   Thêm một người vào danh sách
//-   Tìm vị trí một người trong danh sách
//-   Xoá 1 người trong danh sách theo mã
//-   Sửa thông tin của 1 người theo mã
//- Sắp xếp danh sách theo điểm trung bình.
//- Tính tổng điểm