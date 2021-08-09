package trees;

public class BinarySearchTree {
    Node root;

    public void add(int key){
        if (root == null) {
            root = new Node(key);

        }else{
            Node current = root;
            addTraverse(current,key);
//            traverseRight(current,key);
//            traverseLeft(current,key);

        }
    }

//    public int oddSum(Node current) {
//        int sum = 0;
//        if (current != null) {
//
//            if (!(current.getKey() % 2 == 0)) {
//                sum += current.getKey();
//                sum += oddSum(current.getRight());
//                sum += oddSum(current.getLeft());
//            }
//
//        }
//        return sum;
//    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int sumOdd(Node node){
        if (node ==null){
            return 0;
        }else{
            int current = node.getKey();
            int leftCurrent = sumOdd(node.getLeft());
            int rightCurrent= sumOdd(node.getRight());
            int sumLeft=0;
            int sumRight= 0 ;
            int sum = current ;

            if(leftCurrent%2 !=0){
                sumLeft += leftCurrent;
            }
            if(rightCurrent%2 !=0){
                sumRight += rightCurrent;
            }
            sum += sumLeft+ sumRight;
            return sum;
        }
    }

    public boolean containsNode(int key) {
//        Node current= root;
        return containsNodeRecursive(root, key);
    }

    private boolean containsNodeRecursive(Node current, int key) {
        if (current == null) {
            return false;
        }
        if (key == current.getKey()) {
            return true;
        }
        return key < current.getKey()
                ? containsNodeRecursive(current.getLeft(), key)
                : containsNodeRecursive(current.getRight(), key);
    }


    private void addTraverse(Node current, int key){
        if (key> current.getKey()){
            if(current.getRight() == null ){
                current.setRight(new Node (key));
                return;
            }
            current = current.getRight();

        }else{
            if(current.getLeft()==null){
                current.setLeft(new Node(key));
                return;
            }
            current = current.getLeft();
        }
        addTraverse(current,key);
    }

//    private void traverseRight(Node current , int key){
//        if (key> current.getKey()){
//            if(current.getRight() == null ){
//                current.setRight(new Node (key));
//                return;
//            }
//            current = current.getRight();
//            traverseRight(current,key);
//        }else{
//            if(current.getLeft()==null){
//                current.setLeft(new Node(key));
//                return;
//            }
//            current = current.getLeft();
//            traverseLeft(current,key);
//        }
//    }

//    private void traverseLeft(Node current , int key){
//        if (key< current.getKey()){
//            if(current.getLeft() == null ){
//                current.setLeft(new Node (key));
//                return;
//            }
//            current = current.getLeft();
//            traverseLeft(current,key);
//        }else{
//            if(current.getRight()==null){
//                current.setRight(new Node(key));
//                return;
//            }
//            current = current.getRight();
//            traverseRight(current,key);
//        }
//    }

}
