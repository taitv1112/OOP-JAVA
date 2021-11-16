package Giat_Thuat.HowToUseStack;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackSoDu = new Stack<>();
        System.out.println("Nhập một số nguyên dương từ bàn phím");
        int number = sc.nextInt();
        while (number > 0) {
            int soDu = number % 2;
            stackSoDu.push(soDu);
            number = number / 2;
        }
        System.out.println(" Số nhị phân là: ");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop());
        }
    }
}
