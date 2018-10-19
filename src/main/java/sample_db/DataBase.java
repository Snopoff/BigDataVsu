package sample_db;

import sample_db.CustomList.CustomList;

public class DataBase {

    private int nums = 1;  //number of columns of the data base
    private CustomList[] list = new CustomList[nums];  //columns of data base
    private CustomList header = new CustomList<String>("ID");

    public DataBase() {
        this.nums = 2;
        this.header.add("Elems");
        System.out.println("Improvised Data Base is created! with " + nums + " columns.");
    }
    public DataBase(int nums) {
        this.nums = nums;
        System.out.println("Improvised Data Base is created!" + nums + " columns.");
    }
    public DataBase(int nums, String[] names) {
        this.nums = nums;
        this.header.add(names);
        System.out.println("Improvised Data Base is created!" + nums + " columns.");
    }

    public void getN(int N) {  //returns an information about first N records
        int length = list[0].length();
        if(N > length) {
            for(int i=0; i<length; i++) {  //for all records
                for(int j=0; j<header.length(); j++) {  //for all elements in a record
                    System.out.println(list[j].get(i) + " ");  //print an element
                }
                System.out.println("\n");
            }
        }
        else {
            for(int i=0; i<N; i++) {  //for first N records
                for(int j=0; j<header.length(); j++) {  //for all elements in a record
                    System.out.println(list[j].get(i) + " ");  //print an element
                };
                System.out.println("\n");
            }
        }
    }

    public void add(String info) {
        
    }
}
