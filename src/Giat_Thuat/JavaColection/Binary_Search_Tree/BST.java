package Giat_Thuat.JavaColection.Binary_Search_Tree;

import Giat_Thuat.LinkedListPractice.Linked_List_Bro.DualLinkedList;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /* xác định vị trí nút cha */
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    public void postOder(TreeNode<E> root) {
        if (root == null) return;
        postOder(root.left);
        postOder(root.right);
        System.out.println(root.element);
    }

    public void postOder() {
        postOder(root);
    }

    public TreeNode<E> search(TreeNode<E> root, E value) {
        if (root == null) return root;
        if (root.element == value) {
            return root;
        } else if (root.element.compareTo(value) < 0) {
            return search(root.right, value);
        }
        return search(root.left, value);

    }

    void deleteValue(E value) { root = deleteRec(root, value); }

    TreeNode<E> deleteRec(TreeNode<E> root, E value)
    {
        if (root == null)
            return root;
        if (value.compareTo(root.element)<0)
            root.left = deleteRec(root.left, value);
        else if (value.compareTo(root.element)>0)
            root.right = deleteRec(root.right, value);
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.element = minValue(root.right);
            root.right = deleteRec(root.right, root.element);
        }
        return root;
    }
    public E minValue(TreeNode<E> root) {
        E min = root.element;
        while (root.left != null) {
            min = root.left.element;
            root = root.left;
        }
        return min;
    }
}
