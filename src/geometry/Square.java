package geometry;

public class Square extends Rectangle implements Colorable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled,side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public  void setSide(double side){
        setWidth(side);
        setHeight(side);
    }


    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "+super.toString() + " Dien Tich= "+getArea();
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
