package LinkedList;

public abstract class MyAbstractList<E> implements MyList<E> {
    protected int size = 0; // The size of the last

    /** Create a default list */ // Khởi tạo lớp mặc định
    protected MyAbstractList() {
    }

    /** Create a list from an array of objects */
    //Tạo danh sách từ một mảng đối tượng
    protected MyAbstractList(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    @Override /** Add a new element at the end of this list */
    //Thêm một phần tử mới vào cuối danh sách này
    public void add(E e) {
        add(size, e);
    }

    @Override /** Return true if this list doesn't contain any elements */
    //Trả về true nếu danh sách này không chứa bất kỳ phần tử nào
    public boolean isEmpty() {
        return size == 0;
    }

    @Override /** Return the number of elements in this list */
    //Trả về số phần tử trong danh sách này
    public int size() {
        return size;
    }

    @Override /** Remove the first occurence of the element e
     *	from this list. Shift any subsequent elements to the left.
     *  Return true if the element is removed. */
    //Loại bỏ sự xuất hiện đầu tiên của phần tử e
    //      * từ danh sách này. Di chuyển bất kỳ phần tử tiếp theo nào sang trái.
    //      * Trả về true nếu phần tử bị loại bỏ.
    public boolean remove(E e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        }
        else
            return false;
    }
}