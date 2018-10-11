package sample_db;

import sample_db.myCollection.MyList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Main {
    public static void main(String[] args){
        MyList<Integer> myList = new MyList<Integer>();
        System.out.println(myList.getSize());

        Integer arr[] = {10, 15};
        MyList<Integer> myList1 = new MyList<Integer>(arr);
        System.out.println(myList1.getSize());

        //throw new NotImplementedException();
    }
}