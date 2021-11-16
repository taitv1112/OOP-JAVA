package Giat_Thuat.Queue.Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queuePalindrome =new LinkedList<>();
        Stack<String> stackPalindrome = new Stack<>();
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stackPalindrome.push(str.charAt(i)+"");
        }
        for (int i = 0; i < str.length(); i++) {
            queuePalindrome.offer(str.charAt(i)+"");
        }
        if(stackPalindrome.toString().equals(queuePalindrome.toString())){
            System.out.println("Chuỗi vừa nhập là chuỗi Palindrome: " +str);
        }else {
            System.out.println("Chuỗi vừa nhập không phải chuỗi Palindrome: " +str);
        }


    }
}
