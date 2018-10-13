package sample_db.myCollection;

public class MyList<T> implements MyIterable<T> {
    private int INITSIZE = 10;
    private Object list[] = new Object[INITSIZE];
    private MyNode head;
    private MyNode tail;
    private int size = 0;

    public MyList() {
        this.INITSIZE = 0;
    }

    public MyList(Object array[]) {
        list = array;
        size = array.length;
    }

    public void add(T t) {
        if (size == list.length) {
            resize(list.length*2);
        }
        list[size] = t;
        size++;
    }

    public void remove(int i) {

    }

    private void resize(int newSize) {
        Object newList[] = new Object[newSize];

        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

    public int getSize() {
        return size;
    }
}