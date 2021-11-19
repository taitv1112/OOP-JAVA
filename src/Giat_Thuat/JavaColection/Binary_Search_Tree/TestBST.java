package Giat_Thuat.JavaColection.Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(20);
        tree.insert(10);
        tree.insert(16);
        tree.insert(14);
        tree.insert(40);
        tree.insert(30);
        tree.insert(27);
        tree.insert(80);
        tree.insert(50);
        tree.deleteValue(30);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
//        System.out.println("PostOder (sorted): ");
//        tree.postOder();
//        System.out.println("The number of nodes is: " + tree.getSize());

//        Stack stack = new Stack();
////        stack.push(4);
////        System.out.println(stack);
//        Queue queue = new LinkedList();
//        queue.offer(4);
//        queue.offer("abc");
//        System.out.println(queue);


    }
}
