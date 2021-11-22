package Giat_Thuat.ArrayListSimple;

public class Tester {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Chẳng  ");
//        list.add("thể");
//        list.add("thiếu ");
//        list.add("em");
        list.add("mot",1);
        list.add("ba",2);
        list.add("hai",3);
        list.add("bon",4);
//        print(list.getelements());
////        list.remove(2);
//        print(list.getelements());
////        list.clear();
////        print(list.getelements());
//        System.out.println(list.indexOf("hai"));

        MyList<String> clone = list.clone();
//        print(clone.getelements());
//        System.out.println(clone.contains("bon"));
//        System.out.println(list.contains("bon"));

        System.out.println(clone.get(3));

//        System.out.println(clone.size());
//        clone.clear();
//        System.out.println(clone.size());
//        print(clone.getelements());

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