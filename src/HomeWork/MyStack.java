package HomeWork;

import LinkedList.MyLinkedList;

public class MyStack<E> {
    private int size;
    private Node<E> top;
    private int countE;

    public MyStack() {
        this.top = null;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "size=" + size +
                ", top=" + top +
                '}';
    }

    public void add(E e) {
        if (top == null) {
            top = new Node<>(e);
            countE++;
        } else {
            Node newNode = new Node(e);
            newNode.next = top;
            top = newNode;
            countE++;
        }
    }

    public E pop() {
        if (!isEmpty()) {
            E element = top.data;
            top = top.next;
            countE--;
            return element;
        }else return null;
    }

    public int size() {
        return countE;
    }

    public boolean isEmpty() {
        return countE == 0;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Danh Sach rong");
        } else {
            Node temp = top;
            for (int i = 0; i < countE; i++) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public E get() {
        E e = top.data;
        return e;
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.show();
        System.out.println("------------");
        stack.pop();
        stack.show();
    }
}
