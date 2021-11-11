package PointAndMoveablePoint;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(10,10,5,5);
        System.out.println(moveablePoint.toString());
        for (int i = 0; i < 5; i++) {
            moveablePoint.move(moveablePoint);
            System.out.println();
            System.out.println(moveablePoint.move(moveablePoint));
        }





    }
}
