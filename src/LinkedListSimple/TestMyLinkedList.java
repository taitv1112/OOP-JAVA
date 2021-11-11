package LinkedListSimple;
//Tạo lớp TestMyLinkedList chứa hàm main
//Tạo đối tượng thuộc lớp MyLinkedList.
//
//Lần lượt gọi các phương thức addFist(), add(), printList() chạy ứng dụng quan sát kết quả.
public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.add(4,9);
        ll.add(4,10);
        ll.printList();
    }
}
