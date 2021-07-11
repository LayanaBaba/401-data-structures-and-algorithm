package stack.and.queue;

public class Stack<T> {
    public Node<T> top;


    public void push (T value){
        Node<T> node = new Node<>(value);

//        System.out.println(node.value);
        node.next=top;
        top=node;

    }

    public String pop() {
        if (top == null) {
            return "Empty Stack.";
        } else {
            Node<T> temp = top;
            T value = temp.value;
            top = top.next;
            temp.next = null;
            return value.toString();
        }
    }

    public String peek(){
        if(top==null){
            return "Empty Stack.";
        }else{
            return top.value.toString();
        }
    }

    public boolean isEmpty(){
        return top==null;
    }

    @Override
    public String toString() {
        Node<T> current = top;

        String values = "";

        while (current!=null){
            values+=current.value+" --> ";
            current=current.next;
        }
        values+="Null";
        return values;
    }
}
