package trees.KAryTree;

public class KNode {
    public KNode[] children;
    int data;
//    KNode children[];

    public KNode(int n, int data){
        children = new KNode[n];
        this.data = data;
    }

    public KNode[] getChildren() {
        return children;
    }

    public int getData() {
        return data;
    }

    public void setChildren(KNode[] children) {
        this.children = children;
    }

    public void setData(int data) {
        this.data = data;
    }
}
