package Point2DAndPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = super.getXY()[0];
        arr[1] = super.getXY()[1];
        arr[3] = this.z;
        return arr;
    }

    @Override
    public String toString() {
        return"Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" +z+'}';
    }
}