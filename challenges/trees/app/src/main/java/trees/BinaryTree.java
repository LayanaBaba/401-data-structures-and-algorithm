package trees;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class BinaryTree {
    Node root;
    public ArrayList<Integer> preOrder= new ArrayList<>();
    public ArrayList<Integer> inOrder= new ArrayList<>();
    public ArrayList<Integer> postOrder= new ArrayList<>();
    public ArrayList<Integer> levelOreder = new ArrayList<>();

    public BinaryTree()
    {
        root = null;
    }


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

    public ArrayList<Integer> getLevelOreder() {return levelOreder;}

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

    ///////////////////////////////////////////////

    public void printLevelOrder(){
        int h = height(root);
        int i;
        for (i=1; i<=h; i++){printCurrentLevel(root, i);}
    }

    public int height(Node root){
        if (root == null){ return 0;}
        else{
            int lheight = height(root.getLeft());
            int rheight = height(root.getRight());

            if (lheight > rheight){return(lheight+1);}
            else return(rheight+1);
        }
    }

    public void printCurrentLevel (Node root ,int level){
        if (root == null){return;}
        if (level == 1) {
            levelOreder.add(root.getKey());
            System.out.println(levelOreder);
        }
        else if (level > 1){
            printCurrentLevel(root.getLeft(), level-1);
            printCurrentLevel(root.getRight(), level-1);

        }
    }
}
