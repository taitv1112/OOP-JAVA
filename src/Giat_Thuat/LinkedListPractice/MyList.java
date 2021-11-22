package Giat_Thuat.LinkedListPractice;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public interface MyList<E> extends Iterable<E> {
    void add(E var1);

    void add(int var1, E var2);

    void clear();

    boolean contains(E var1);

    E get(int var1);

    int indexOf(E var1);

    boolean isEmpty();

    int lastIndexOf(E var1);

    boolean remove(E var1);

    E remove(int var1);

    Object set(int var1, E var2);

    int size();
}
