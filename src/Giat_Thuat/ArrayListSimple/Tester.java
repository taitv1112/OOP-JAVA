package Giat_Thuat.ArrayListSimple;

public class Tester {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Chẳng  ");
        list.add("thể");
        list.add("thiếu ");
        list.add("em");
        list.add("lenovo",1);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("chẳng"));
        System.out.println(clone.contains("em"));
        print(list.getData());
        System.out.println(list.indexOf("em"));
        System.out.println(list.indexOf("có"));
        list.remove(1);

        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }
    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}