package sample_db;

public class Main {
    public static void main(String[] args) {

    }

    public void testList() {
        Integer[] arr = {3,1,4};
        CustomList<Integer> list = new CustomList(arr);

        list.print();  //[3, 1, 4, ]

        list.add(6);
        list.print();  //[3, 1, 4, 6, ]

        list.add(arr);
        list.print();  //[3, 1, 4, 6, 3, 1, 4]


        System.out.println(list.indexOfElement(1));  //1

        Object[] got = list.values();

        for(int i=0; i<got.length; i++) {
            System.out.print(got[i].toString() + " ");  //3, 1, 4, 6, 3, 1, 4
        }
        System.out.println();

        list.change(3, 100);
        System.out.println("Changed = " + list.get(3));  //Changed = 100
        list.change(3, 6);  //Change back

        Integer intToRemove = 3;
        list.remove(intToRemove);
        list.print();  //[1, 4, 6, 1, 4]

        list.remove(3);
        list.print();  //[1, 4, 6, 4]

        list.remove(1);
        list.print();  //[1, 6, 4]
    }
}
