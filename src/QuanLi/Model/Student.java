package QuanLi.Model;

import QuanLi.Model.Person;

//Tạo lớp Học viên kế thừa lớp Người và có thêm thuộc tính điểm trung bình.
public class Student extends Person {
    private double avengerPoint;


    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, double avengerPoint) {
        super(name, age);
        this.avengerPoint = avengerPoint;
    }
    public void setAll(String name, int age, double avengerPoint){
        this.setName(name);
        this.setAge(age);
        this.avengerPoint = avengerPoint;
    }
    public double getAvengerPoint() {
        return avengerPoint;
    }

    public void setAvengerPoint(double avengerPoint) {
        this.avengerPoint = avengerPoint;
    }

    @Override
    public String toString() {
        return "Student{"+
                "id="+getId()+
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                "avengerPoint=" + avengerPoint +
                '}';
    }
}
