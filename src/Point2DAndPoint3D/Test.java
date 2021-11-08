package Point2DAndPoint3D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(1,3,8);
        System.out.println(point3D);
        point3D.setXYZ(1,7,8);
        System.out.println(point3D.toString());

    }

}
