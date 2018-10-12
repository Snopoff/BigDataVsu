package sample_db;

import com.google.common.collect.HashMultimap;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinList linList = new LinList(4);
        linList.addNext(8);
        linList.addNext(5);
        linList.addNext(2);
        linList.addNext(3);
        linList.print();
        linList.delete(3);
        linList.print();
    }
}
