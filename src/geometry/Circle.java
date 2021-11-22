package geometry;

public class Circle extends Shape implements Resizeable{
    private double radius ;

    public Circle() {
        this.radius =1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius, String color, int radius1) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return Math.PI*2*this.radius;
    }
    @Override
    public String toString() {
        return "A Circle with "+this.radius +"which is a subclass of" +" "+ super.toString() + " Dien Tich= "+getArea();
    }

    @Override
    public void resize(double percent) {
        this.radius= percent * this.radius;
        System.out.println("Kich thước hình đã thay đổi " + percent + " lần."+ getArea());
    }
}
