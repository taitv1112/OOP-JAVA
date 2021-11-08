package geometry;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,1,2);
        System.out.println(triangle.checkSide());
        triangle.setColor("red");
        System.out.println(triangle.toString());


    }
}
