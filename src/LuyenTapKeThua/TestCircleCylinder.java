package LuyenTapKeThua;

import geometry.Circle;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5,"red", 10);
       Circle circle2 = new Circle(10,"yellow", 10);

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        Circle cylinder1 = new Circle(5,"yellow",10);
        System.out.println(cylinder1.toString());
        Circle cylinder2 = new Circle(circle1.getRadius(),circle1.getColor(), 10);
        System.out.println(cylinder2.toString());

    }
}
