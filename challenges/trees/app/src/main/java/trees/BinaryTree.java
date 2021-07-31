package trees;

import java.util.ArrayList;

public class BinaryTree {
    Node root;
    public ArrayList<Integer> preOrder= new ArrayList<>();
    public ArrayList<Integer> inOrder= new ArrayList<>();
    public ArrayList<Integer> postOrder= new ArrayList<>();

    public void inOrderTraverse(Node node){
        if (node != null){
            inOrderTraverse(node.getLeft()); // traverse left sub tree
            System.out.print(" "+ node.getKey()); // root
            inOrder.add(node.getKey());
            inOrderTraverse(node.getRight()); // traverse right sub tree

        }
    }


    public void postOrderTraverse(Node node){
        if (node != null){
            postOrderTraverse(node.getLeft()); // traverse left sub tree
            postOrderTraverse(node.getRight()); // traverse right sub tree
            System.out.print(" "+ node.getKey()); // root
            postOrder.add(node.getKey());
        }
    }

    public void preOrderTraverse(Node node){
        if (node != null){
            System.out.print(" "+ node.getKey()); // root
            preOrder.add(node.getKey());
            preOrderTraverse(node.getLeft()); // traverse left sub tree
            preOrderTraverse(node.getRight()); // traverse right sub tree
        }
    }

    public ArrayList<Integer> getPreOrder() {
        return preOrder;
    }

    public ArrayList<Integer> getInOrder() {
        return inOrder;
    }

    public ArrayList<Integer> getPostOrder() {
        return postOrder;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int findMax(Node node){
        if (node ==null){
            return Integer.MIN_VALUE;
        }else{
            int current = node.getKey();
            int leftCurrent = findMax(node.getLeft());
            int rightCurrent= findMax(node.getRight());

            if(leftCurrent>current){
                current= leftCurrent;
            }
            if (rightCurrent>current){
                current=rightCurrent;
            }
            return current;
        }
    }
}
