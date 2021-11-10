package ClassAndContructorInJava;

public class    Fan {
    final int SLOW =1,MEDIUM=2, FAST=3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private  String color = "blue";
    public Fan(){

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //  Nếu quạt đang ở trạng thái on, phương thức trả về speed, color, và radius với chuỗi “fan is on”.
    //  Nếu quạt không ở trạng thái on, phương thức trả về color, radius với chuỗi “fan is off”.
    public String toString(){
        if(this.on){
            String onFan =  "Fan is on "+ "Tốc độ "+this.speed + " Màu " + this.color + " Bán kính " +radius ;
            return onFan  ;
        }else {
            String offFan =  "Fan is off "+  " Màu " + this.color + " Bán kính " +radius ;
            return offFan  ;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setColor("blue");
        fan2.setRadius(5);
        System.out.println(fan2.toString());

    }
}
