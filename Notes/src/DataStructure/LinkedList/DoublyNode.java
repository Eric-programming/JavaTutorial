package DataStructure.LinkedList;

public class DoublyNode<T> {
    private T data;
    private DoublyNode<T> nextDoublyNode;
    private DoublyNode<T> previousDoublyNode;

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyNode<T> getNextDoublyNode() {
        return this.nextDoublyNode;
    }

    public void setNextDoublyNode(DoublyNode<T> nextDoublyNode) {
        this.nextDoublyNode = nextDoublyNode;
    }

    public DoublyNode<T> getPreviousDoublyNode() {
        return this.previousDoublyNode;
    }

    public void setPreviousDoublyNode(DoublyNode<T> previousDoublyNode) {
        this.previousDoublyNode = previousDoublyNode;
    }

    public DoublyNode(T v) {
        super();
        data = v;
    }
}