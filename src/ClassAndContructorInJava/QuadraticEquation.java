package ClassAndContructorInJava;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c, delta, r1, r2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        this.delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        if (this.delta >= 0) {
            r1 = ((-this.b + Math.sqrt(this.delta) / 2 * this.a));
            return r1;
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (this.delta >= 0) {
            r2 = ((-this.b - Math.sqrt(this.delta)) / 2 * this.a);
            return r2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if(a == 0 && b==0 && c==0){
            System.out.println("phuong trinh co vo so nghiem");
        }else if(a != 0) {
            System.out.println(quadraticEquation.getDiscriminant());
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());

        }

    }
}
