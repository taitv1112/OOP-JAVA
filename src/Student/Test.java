package Student;

public class Test {
    static int a= 10;
    public static void main(String[] args) {
        MyClass o = new MyClass();
        ChuNhat cn = new ChuNhat(1, 1);
        o.method(cn);
        System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
    }
}
