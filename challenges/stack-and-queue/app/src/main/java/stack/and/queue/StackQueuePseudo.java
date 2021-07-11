package stack.and.queue;

public class StackQueuePseudo<T> {
    Stack<T> stack = new Stack<>();
    public int size;

    public void enqueue(T value){
        stack.push(value);
        size++;
    }


    public String dequeue(){
        while(size>=2){
            stack.pop();
            size--;
        }

        return stack.toString();
    }
    public String toStringStack() {
        Node<T> current = stack.top;

        String values = "";

        while (current!=null){

            values+=current.value+" --> ";
            current=current.next;
        }
        values+="Null";
        return values.toString();
    }

    public String toStringStack2() {
        Node<T> current = stack.top;

        String values = "";

        while (current!=null){

            values+=current.value;

            current=current.next;
        }

        return values.toString();
    }

}
