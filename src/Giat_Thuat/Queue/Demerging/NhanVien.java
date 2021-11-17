package Giat_Thuat.Queue.Demerging;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class NhanVien {
    private String name;
    private String gender;
    private int age;

    public static final String NU = "Nữ";
    public static final String NAM = "NAM";

    public NhanVien(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
