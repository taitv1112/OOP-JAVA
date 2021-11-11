package ListSimple;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    final int DEFAULT_CAPACITY = 10;
private Object elements[];



    public MyList (){
        elements = new Object[DEFAULT_CAPACITY];
    }
    //Mục đích: Tăng gấp đôi kích thước mảng chứa các phần tử
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //Mục đích: thêm một phần tử vào cuối của danh sách
    //
    //Tham số đầu vào: phần tử cần thêm vào danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDEFAULT_CAPACITY() {
        return DEFAULT_CAPACITY;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
