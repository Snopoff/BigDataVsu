package CustomList;

public class CustomList<T> {
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    public CustomList(T obj) {
        Node node = new Node<>(obj);  //Create a node with given object
        this.head = node;  //set the head of list to this object
        this.tail = head;  //set also the tail because the given object is the 1st element of the list
        this.size++;  //increase the size of list
    }

    public CustomList(T[] arr) {
        Node node = new Node<>(arr[0]);  //create a node for the elements of given array and set it to the 1st element
        this.head = node;
        this.tail = node;
        this.size++;

        for(int i=1; i<arr.length; i++) {

            node = new Node<>(arr[i]);  //get the new element of array

            this.tail.setNext(node);  //set a reference for the given element for the last node
            this.tail = node;  //set given element as the last one

            this.size++;  //increase the size

        }

    }

    public void add(T obj) {
        Node<T> node = new  Node<>(obj);  //Create a node with given object

        tail.setNext(node);  //set a reference for the last node to the new element
        tail = node;  //set new element as the last one in list

        size++;  //increase the size
    }

    public boolean contains(T obj) {
        Node node = this.head;

        while(node != null) {  //while it's still in the list
            if(node.getValue().equals(obj))  //if the given element is equals to an element in list, return true
                return true;
            else
                node = node.getNext();  //go forward
        }

        return false;
    }

    public int length() {
        return size;
    }

    public T get(int index) {
        Node<T> node = this.head;
        if(index < size && index >= 0) {  //since our index has to be an integer in [0,size)
            int ind = 0;
            while (ind < index) {
                ind++;  //else increment to keep looking for
                node = node.getNext();
            }
        }
        else
            throw new IndexOutOfBoundsException("Wrong index.");  //if index is out of bounds, throw an exception
        return node.getValue();
    }

    public void remove(T obj) {
        Node node = this.head;
        Node prev = null;

        while(node != null) {
            if (node.getValue().equals(obj) && prev == null){ this.head.setNext(this.head.getNext()); this.size--; }  //1st element

            if(node.getValue().equals(obj) && node.getNext() == null){ this.tail = prev; this.size--; }  //last element

            if(node.getValue().equals(obj)) { prev = node.getNext(); this.size--; }  //not 1st and not last element

            prev = node;
            node = node.getNext();

        }

    }

    public void remove(int index) {
        Node<T> node = this.head;
        Node<T> prev = null;
        if(index < size && index >= 0) {  //since our index has to be an integer in [0,size)
            int ind = 0;
            while (ind < index) {
                ind++;  //else increment to keep looking for
                prev = node;
                node = node.getNext();
            }
            if(index == 0) { this.head = this.head.getNext(); this.size--; }
            else if (index == this.size-1) { this.tail = prev; this.size--; }
            else if (ind == index) { prev = node.getNext(); this.size--; }
        }
        else
            throw new IndexOutOfBoundsException("Wrong index.");  //if index is out of bounds, throw an exception
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void print() {
        System.out.print("[");
        Node node = this.head;
        while(node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
        System.out.println("]");
    }
}
