package LinkedList;

public class NodeClass<T> {
    private T data;

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private NodeClass<T> next;

    public NodeClass<T> getNext() {
        return this.next;
    }

    public void setNext(NodeClass<T> next) {
        this.next = next;
    }

    public NodeClass(T v) {
        super();
        data = v;
    }

}
