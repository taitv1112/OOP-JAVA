package Giat_Thuat.HowToUseStack;

import java.util.Arrays;
import java.util.Stack;

public class ReciveArrayInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Stack<Integer> stackInt= new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stackInt.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stackInt.pop();
        }
        System.out.println(Arrays.toString(arr));

    }

}
