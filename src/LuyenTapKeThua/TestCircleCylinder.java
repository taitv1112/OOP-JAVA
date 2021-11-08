package LuyenTapKeThua;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5,"red");
        Circle circle2 = new Circle(10,"yellow");

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        Cylinder cylinder1 = new Cylinder(5,"yellow",10);
        System.out.println(cylinder1.toString());
        Cylinder cylinder2 = new Cylinder(circle1.getRadius(),circle1.getColor());
        System.out.println(cylinder2.toString());

    }
}
