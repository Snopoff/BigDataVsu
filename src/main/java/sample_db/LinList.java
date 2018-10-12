package sample_db;

public class LinList {
   // private LinList prev;
    private LinList next;
    private int size = 1;
    private int value;



    public LinList(int value) {
        this.value = value;
    }

    public void addNext(int val) {
        LinList tmp = this;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.setNext(new LinList(val));
        size++;
    }

    public void print() {
        System.out.print("[");
        LinList tmp = this;
        while (size !=0) {
            System.out.print(tmp.value);
            tmp = tmp.next;
            size--;
        }
        System.out.print("]");
    }

    public void delete(int val)
    {
        LinList tmp = this;
        int i =1;
      while (i != (val-1))
      {
          tmp = next;
          i++;
      }
      next = tmp.next.next;
      size--;
    }

//    public LinList getPrev() {
//        return prev;
//    }

    //public void setPrev(LinList prev) {
//        this.prev = prev;
//    }

    public LinList getNext() {
        return next;
    }

    public void setNext(LinList next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
