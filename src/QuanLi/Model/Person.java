package QuanLi.Model;

public class Person {
    private int id;
    private String name;
    private int age;
    private static int idNumber;

    public Person( String name, int age) {
        this.id = idNumber++;
        this.name = name;
        this.age = age;
    }
    public void setAll( String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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


    @Override
    public String toString() {
        return "Person{" +
                "id=" +id+
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
