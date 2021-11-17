package Giat_Thuat.JavaColection.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Menu");
            System.out.println("1.ArrayList");
            System.out.println("2.LinkedList");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:ProductManagerArrayList.menu();
                case 2:ProductManagerLinkedList.menu();
            }

        }

    }
}
