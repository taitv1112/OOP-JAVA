package Giat_Thuat.Queue;

//Bước 2: Tạo lớp MyLinkedListQueue
public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    //    Bước 3: Cài đặt phương thức trong lớp MyLinkedListQueue
    //
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
//    Bước 4: Cài đặt phương thức trong lớp MyLinkedListQueue

    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }

}
