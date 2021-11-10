package geometry;

public class TestSquareInterfaceColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("yellow",true,10);
        shapes[1] = new Rectangle(10,20);
        shapes[3] = new Triangle(5,6,7);
        Square square = new Square(10);
        shapes[2] = square;
        Rectangle rectangle = new Rectangle(10,30);
        shapes[4] = rectangle;
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());

        }
        ((Square) shapes[2]).howToColor();
    }

}
