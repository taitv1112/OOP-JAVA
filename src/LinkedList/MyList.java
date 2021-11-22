package LinkedList;

public interface MyList<E> extends java.lang.Iterable<E> {
    /** Add a new element at the end of this list */
    // thêm 1 phần tử ở cuối danh sách
    public void add(E e);

    // thêm 1 phần tử ở vị trí index trong danh sách
    /** Add a new element at the specified index in this list */
    public void add(int index, E e);

    // xóa tất cả phần tử trong danh sách
    /** Clear the list */
    public void clear();
    // trả về true nếu phần tử tồn tại trong danh sách
    /** Return true if this list contains the element */
    public boolean contains(E e);

//	Lấy 1 phần tử trong danh sách tại vị trí index
    /** Return the element from this list at the specified index */
    public E get(int index);

//	lấy ra vị trí của phần tử trong danh sách
    /** Return the index of the first matching element in this list.
     *  Return -1 if no match. */
    public int indexOf(E e);
//
//	kiểm tra độ dài của danh sách
    /** Return true if this list doesn't contain any elements */
    public boolean isEmpty();

//	trả về vị trí của phần tử duyệt từ cuối danh sách
    /** Return the index of the last matching element in this list
     * Return -1 if no match. */
    public int lastIndexOf(E e);

//	xóa phần tử khỏi danh sách
    /** Remove the first occurrence of the element e from this list.
     *  Shift any subsequent elements to the left.
     *  Return true if the element is removed. */
    public boolean remove(E e);

//
//	Xóa phần tử ở vị trí được chỉ định trong danh sách này.
//* Di chuyển bất kỳ phần tử tiếp theo nào sang trái
//* Trả lại phần tử đã bị xóa khỏi danh sách.
    /** Remove the element at the specified postion in this list.
     *  Shift any subsequent element to the left
     *  Return the element that was removed from the list. */
    public E remove(int index);

//	sửa phần tử tại vị trí index
    /** Replace the element at the specified position in this list
     * with the specified element and return the old element. */
    public Object set(int index, E e);

//	trả về số lượng các phần tử có trong danh sách
    /** Return the number of elements in this list */
    public int size();

/// ** Thêm các phần tử trong Danh sách khác vào danh sách này.
//* Trả về true nếu danh sách này thay đổi do lệnh gọi * /
    /** Adds the elements in otherList to this list.
     * Returns true if this list changed as a result of the call */
    public boolean addAll(MyList<E> otherList);
/// ** Xóa tất cả các phần tử trong Danh sách khác khỏi danh sách này *
// Trả về true nếu danh sách này thay đổi do kết quả của lệnh gọi * /
    /** Removes all the elemants in otherList from this list
     * Returns true if this list changed as a result of the call */
    public boolean removeAll(MyList<E> otherList);

//	/ ** Giữ lại các phần tử trong danh sách này cũng có trong OtherList
//* Trả về true nếu danh sách này thay đổi do lệnh gọi * /
    /** Retains the elements in this list that are also in otherList
     * Returns true if this list changed as a result of the call */
    public boolean retainAll(MyList<E> otherList);
}
