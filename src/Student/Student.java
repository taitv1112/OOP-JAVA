package Student;

import javax.xml.namespace.QName;
import java.util.Arrays;

public class Student {
    static int a = 10;
    private String name="john";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student abc = new Student();
        System.out.println(abc.a);;
    }
}
