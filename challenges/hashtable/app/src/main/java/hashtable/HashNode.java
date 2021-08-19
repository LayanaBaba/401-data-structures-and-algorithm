package hashtable;

public class HashNode<k, v> {
    k key;
    v value;

    final int hashCode;

    // for a linked list chain
    HashNode<k, v> next;

    public HashNode(k key, v value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }

    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }

    public int getHashCode() {
        return hashCode;
    }

    public HashNode<k, v> getNext() {
        return next;
    }
}