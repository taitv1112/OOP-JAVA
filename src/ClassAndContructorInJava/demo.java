import java.util.Arrays;
import java.util.Scanner;

public class demo {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap number :");
//        int number = input.nextInt();
//            boolean check = true;
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    check = false;
//                    break;
//                }
//            }
//            if (check) {
//                System.out.println("SNT");
//            } else  {
//                System.out.println("Ko phai SNT");
//            }
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = (int) (Math.random()*9+1);
//        int num = -1;
//        while (num!=number){
//            System.out.println("Vui long nhap so");
//            num = input.nextInt();
//            if(num<number){
//                System.out.println("Lon hon");
//            } else if (num>number){
//                System.out.println("Nho hon");
//            } else {
//                System.out.println("Ban da doan dung");
//                System.exit(-2);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Ax^2+Bx+C=0");
//        System.out.println("A :");
//        int A = input.nextInt();
//        System.out.println("B :");
//        int B = input.nextInt();
//        System.out.println("C :");
//        int C = input.nextInt();
//        double D = B*B-4*A*C;
//        if(D<0){
//            System.out.println("Vo nghiem");
//        } else if(D==0) {
//            System.out.println("Nghiem la :"+((-1*B)/(2*A)));
//        } else {
//            System.out.println("Nghiem 1 la : " + ((-B+Math.sqrt(D))/(2*A)));
//            System.out.println("Nghiem 2 la : "+ ((-B-Math.sqrt(D))/(2*A)));
//        }
//    }

    public static void main(String[] args) {
        int[] arr1 = {8,9};
        int[] arr2 = {1,2,3,4,5,6,7};
        int[] arr3 = new int[6];
        int index = 2;
        System.arraycopy(arr2,0,arr3,0,index);
        System.arraycopy(arr2,(index+1),arr3,index,arr3.length-index);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr2));

    }
}