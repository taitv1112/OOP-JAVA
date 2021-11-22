package Giat_Thuat.HowToUseStack;

public class GenericStackClient {
    public static void main(String[] args) {
//        System.out.println("1. Stack of integers");
//        stackOfIntegers();
//        System.out.println("\n2. Stack of Strings");
//        stackOfIStrings();
        MyGenericStack<String> stack = new MyGenericStack<>();

        System.out.println(stack.size());
        stack.push("anh");
        stack.push("den");
        stack.push("day");
        System.out.println();

        System.out.println("Element show: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
    }

}
