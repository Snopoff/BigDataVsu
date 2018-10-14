import CustomList.CustomList;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {3,1,4};
        CustomList<Integer> list = new CustomList<>(arr);
        list.print();
        list.add(6);
        list.print();
        Integer intToRemove = 3;
        list.remove(intToRemove);
        list.print();
    }
}
