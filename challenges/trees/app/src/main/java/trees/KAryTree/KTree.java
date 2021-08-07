package trees.KAryTree;

import trees.BinarySearchTree;

import java.util.ArrayList;

public class KTree {
//           public static class Node {
//        int data;
//        Node children[];
//
//        public Node(int n, int data){
//            children = new Node[n];
//            this.data = data;
//        }
//    }
public ArrayList<String> ktreeArray = new ArrayList<>();

    public ArrayList<String> getKtreeArray() {
        return ktreeArray;
    }

    public void setKtreeArray(ArrayList<String> ktreeArray) {
        this.ktreeArray = ktreeArray;
    }

    void inorder(KNode node){
        if (node == null){ return;}

        int total = node.children.length;
         String str="";
        for (int i = 0; i < total - 1; i++)
            inorder(node.children[i]);
        if ( node.data% 15==0){
            System.out.println("FizzBuzz "+node.data );
            str="FizzBuzz ";
        }else if(node.data%5==0) {
            System.out.println("Buzz " +node.data);
            str="Buzz ";
        }else if(node.data%3==0){
            System.out.println("Fizz "+node.data);
            str="Fizz ";
        }else{
            System.out.println(node.data +" The value is not divisible by 3 or 5 ");
            str=" The value is not divisible by 3 or 5 ";
        }
        ktreeArray.add(str);
        inorder(node.children[total - 1]);
    }


    public  void main(String[] args){
        int n = 3;
        KNode root = new KNode(n, 1);
        root.children[0] = new KNode(n, 2);
        root.children[1] = new KNode(n, 3);
        root.children[2] = new KNode(n, 4);
        root.children[0].children[0] = new KNode(n, 5);
        root.children[0].children[1] = new KNode(n, 6);
        root.children[0].children[2] = new KNode(n, 15);

        inorder(root);
    }

}
