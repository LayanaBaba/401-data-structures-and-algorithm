package linkedList;

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
}
