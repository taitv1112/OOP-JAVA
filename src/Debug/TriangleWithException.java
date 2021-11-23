package Debug;

import Debug.IllegalTriangleException;
import Debug.Triangle;

import java.util.Scanner;

public class TriangleWithException {

    public static void main(String[] args) throws IllegalTriangleException {

        Scanner input = new Scanner(System.in);

        // create triangle
        Triangle triangle = new Triangle();
        boolean done = false;
        double side1 = 1.0;
        double side2 = 1.0;
        double side3 = 1.0;

        System.out.println("Enter three sides: ");

        while (!done) {
            side1 = input.nextDouble();
            side2 = input.nextDouble();
            side3 = input.nextDouble();
            triangle = new Triangle(side1, side2, side3);
            done = true;
        }


    }

}