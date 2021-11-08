package PointAndMoveablePoint;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(6,8,5,5);
        moveablePoint.move(moveablePoint);
        System.out.println(moveablePoint.move(moveablePoint));
        moveablePoint.setSpeed(20,30);
        System.out.println(moveablePoint.move(moveablePoint));
        Point point = new Point(10,10);
        moveablePoint.getXY();
        System.out.println(Arrays.toString(moveablePoint.getXY()));
        System.out.println(moveablePoint.toString() );

    }
}
