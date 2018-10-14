package CustomList;

public class Node<T> {
    private T value = null;
    private Node<T> next = null;

    Node(T obj) {
        setValue(obj);
    }
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
