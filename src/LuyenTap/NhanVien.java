package LuyenTap;

import java.util.Scanner;

public class NhanVien {
    private int id;
    private String name;
    private int age;
    private String sex;


    public NhanVien() {
    }

    public NhanVien(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public NhanVien(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = idnumber++;
    }
public static int idnumber=0;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setAll(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                '}';
    }
}
