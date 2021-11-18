package Giat_Thuat.JavaColection.Binary_Search_Tree;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(27);
        tree.insert(14);
        tree.insert(10);
        tree.insert(19);
        tree.insert(35);
        tree.insert(31);
        tree.insert(42);

        //traverse tree
//        System.out.println("Inorder (sorted): ");
////        tree.inorder();
        System.out.println("PostOder (sorted): ");
        tree.postOder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
