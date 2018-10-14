import CustomList.CustomList;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {3,1,4};
        CustomList<Integer> list = new CustomList<>(arr);

        list.print();  //[3, 1, 4, ]

        list.add(6);
        list.print();  //[3, 1, 4, 6, ]

        Integer intToRemove = 3;
        list.remove(intToRemove);
        list.print();  //[1, 4, 6, ]

        list.remove(3);
        list.print();  //[3, 1, 4, ]

        list.remove(1);
        list.print();  //[3, 4, 6, ]
    }
}
