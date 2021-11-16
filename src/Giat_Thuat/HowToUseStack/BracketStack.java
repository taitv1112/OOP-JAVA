package Giat_Thuat.HowToUseStack;

import java.util.Scanner;
import java.util.Stack;

public class BracketStack {
     static String bracketLeft = "(";
     static String bracketright = ")";
    static Stack<String> stackBracket = new Stack<String>();
    public static void main(String[] args) {
        Stack<String> stackBracket = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biểu thức toán học: ");
        String expressionMath = sc.nextLine();
        System.out.println(checkBracket(expressionMath));
    }
    public static boolean checkBracket(String expressionMath){
        String[] arr = expressionMath.split("");
        for (String sym:arr ){
            if(bracketLeft.equals(sym)){
                stackBracket.push(sym);
            }else if(bracketright.equals(sym)){
                if(stackBracket.isEmpty()){
                    return false;
                }else {
                        bracketLeft=stackBracket.pop();
                }
            }

        }
        return true;

    }
}
