package geometry;

import java.util.Arrays;

public class ComparableRectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(9,10);
        Rectangle rectangle2 = new Rectangle(6,10);
        Rectangle rectangle3 = new Rectangle(19,10);
        Rectangle[] rectangles = {rectangle1,rectangle2,rectangle3};
        System.out.println("Array old ");
        for (Rectangle r:rectangles) {
            System.out.println(r.toString());

        }
        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);
        System.out.println("Array sort");
        for (Rectangle r:rectangles) {
            System.out.println(r.toString());

        }


    }
}
