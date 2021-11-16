package Giat_Thuat.HowToUseStack;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    //    Bước 2: Cài đặt phương thức push()
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    //    Bước 3: Cài đặt phương thức pop()
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    //Bước 4: Cài đặt phương thức size()
    public int size() {
        return index;
    }

    //    Bước 5: Cài đặt phương thức isEmpty()
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
    //Bước 6: Cài đặt phương thức isFull()
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

//    Bước 7: Cài đặt lớp StackClient chứa phương thức main để thực thi ứng dụng

    public static void main(String[] as) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}



