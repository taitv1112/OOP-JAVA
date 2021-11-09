package geometry;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle("yellow", true, 10);
        circles[1] = new ComparableCircle("red", true, 10);
        circles[2] = new ComparableCircle("indigo", true, 10);

//        System.out.println("Pre-sorted:");
//        for (ComparableCircle circle : circles) {
//            System.out.println(circle);
//        }
//
//        Arrays.sort(circles);
//
//        System.out.println("After-sorted:");
//        for (ComparableCircle circle : circles) {
//            System.out.println(circle);
//        }
//        circles[0].resize(100);
//        circles[1].resize(20);
//        circles[2].resize(50);
//        System.out.println("After-resize:");
//        for (ComparableCircle circle : circles) {
//            System.out.println(circle);
//        }
//        Circle circle = new Circle("yellow",true,3);
//        System.out.println(circle.getRadius() + " dien tich " + circle.getArea());
//        circle.resize(20);
//        System.out.println(circle.getRadius() + " dien tich " + circle.getArea());
        Triangle triangle = new Triangle(4,5,6);
        System.out.println(triangle.getArea());
        triangle.resize(10);
        System.out.println(triangle.getArea());


    }
}
