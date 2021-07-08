package linkedList;

import org.w3c.dom.Node;

public class LinkedList {




    private class Node{
        private Integer value;
        private Node next;

        public Node (int value){
            this.value =  value;

        }
    }


    private Node first;
    private Node last;

    public Integer getFirst(){
        return first.value;
    }

    public void addLast(int data){
        var node = new Node (data);

        if(first==null){
            first=last=node;
        }else{
            last.next=node;
            last=node;
        }
    }

    void printk(int k) {
        int length = 0;
        Node current = first;

        if (k < 0) {
            System.out.println("Not Applicable");
        } else {
            for (int i = 0; current != last; i++) {
                current = current.next;
                length++;
            }
            current = first;

            //to get kth node from the end we can also say that we want (length-k+1) node from the beginning
            int i = 1;
            if (k <=length) {
                while (i < length - k + 1) {
                    current = current.next;
                    i++;
                }
                System.out.println(current.value);
            } else {
                System.out.println("Not Applicable");
            }

        }
    }

    public void addFirst(int data){
        var node = new Node(data);
        if(first==null){
            first=last=node;
        }else{
            node.next=first;
            first=node;
        }
    }

    public int indexOf(int data){
        int index=0;
        var current = first;

        while (current!=null){
            if (current.value==data){
                return index;
            }
            current=current.next;
            index++;
        }
        return -1;
    }

    public void insertBefore(int item ,int data){

        var node = new Node (data);
        var current=first;
        while (current.next!= null){

            if (current.next.value==item){
                node.next = current.next;
                current.next=node;
                return;
            }

            current=current.next;

        }

    }

    public void insertAfter(int item ,int data){

        var node = new Node (data);
        var current=first;
        while (current.next!= null){

            if (current.value==item){
                node.next = current.next;
                current.next=node;
                return;
            }

            current=current.next;

        }

    }

    public boolean includes (int data){
        return indexOf(data)!=-1;
    }

    public String toString(){
        String newData="";

        var current = first;

        while (current!=null){
            newData+= "{ "+current.value+" } -> ";
            current=current.next;
        }
        newData+="NULL";
        return  newData;
    }

    public LinkedList zipLists(LinkedList b){
        Node current = first;
        if(current.value == 0)return b;
        if(b.first==null) return this;
        zipLists(this.first,b.first);
        return this;
    }
    private void zipLists(Node a, Node b){
        Node firstList = a.next;
        Node secondList = b.next;
        if(firstList == null) return;
        if(secondList == null) return;
        a.next = b;
        b.next = firstList;
        zipLists(firstList,secondList);
    }

    public LinkedList reverseList(LinkedList ll) {
        LinkedList reversed = new LinkedList ();
        Node fisrt = ll.first;
        while (fisrt != null) {
            reversed.insertAfter(fisrt);
            fisrt = fisrt.next;
        }
        return reversed;

    }

//    public void reverseList(Node node) {
//        Node curr = first;
//        Node pre = null;
//        Node incoming = null;
//
//        while (curr != null) {
//            incoming = curr.next;   // store incoming item
//
//            curr.next = pre;        // swap nodes
//            pre = curr;             // increment also pre
//
//            curr = incoming;        // increment current
//        }
//
//        first = pre; // pre is the latest item where
//        // curr is null
//        reverseList(incoming);
//    }
//    Node reverseListRecursive(Node head) {
//        if (head == null) {
//            return null;
//        }
//        if (head.next == null) {
//            return head;
//        }
//        Node node = reverseListRecursive(head.next);
//        head.next=head;
//        head=null;
//        return node;
//    }

//    Node reverseList(Node head) {
//        Node previous = null;
//        Node current = head;
//        while (current != null) {
//            Node nextElement = current.next;
//            current.next=previous;
//            previous = current;
//            current = nextElement;
//        }
//        return previous;
//    }

//    Node reverse(Node node)
//    {
//        Node prev = null;
//        Node current = node;
//        Node next = null;
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        node = prev;
//        return node;
//    }



}