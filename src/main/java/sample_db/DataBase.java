package sample_db;

public class DataBase {

    private int nums = 1;  //number of columns of the data base
    private CustomList[] list = new CustomList[nums];  //columns of data base
    private CustomList header = new CustomList<String>("ID");

    public DataBase() {
        this.nums += 1;
        this.header.add("Elems");
        System.out.println("Improvised Data Base is created! with " + nums + " columns.");
    }
    public DataBase(int nums) {
        this.nums += nums;
        System.out.println("Improvised Data Base is created!" + nums + " columns.");
    }
    public DataBase(int nums, String[] names) {
        this.nums += nums;
        this.header.add(names);
        System.out.println("Improvised Data Base is created!" + nums + " columns.");
    }

    public String get(int index, String columnName) {
        int columnNum = this.header.indexOfElement(columnName);
        String got = this.list[columnNum].get(index).toString();
        return got;
    }  //get a certain element in String format

    public void printN(int N) {  //returns an information about first N records
        int length = list[0].length();
        if(N > length) {
            for(int i=0; i<length; i++) {  //for all records
                for (Object column : this.header.values()) {  //for all elements in a record
                    System.out.print(this.get(i, column.toString()) + " ");  //print an element
                }
                System.out.print("\n");
            }
        }
        else {
            for(int i=0; i<N; i++) {  //for first N records
                for (Object column : this.header.values()) {  //for all elements in a record
                    System.out.print(this.get(i, column.toString()) + " ");  //print an element
                }
                System.out.println("\n");
            }
        }
    }  //get N records

    public void add(String info) {
        this.list[0].add(this.list[0].length() + 1);  //increment ID value

        String[] data = info.split(" ", nums);

        for(int i=1; i<nums; i++) {
            this.list[i].add((i < data.length) ? data[i] : "NaN");
        }

    }  //add a record

    public void printColumn(String columnName) {
        int columnNum = this.header.indexOfElement(columnName);
        this.list[columnNum].print();
    }  //print certain column values

    public void delete(int index) {
        for(int i=0; i<nums; i++) {
            this.list[i].remove(index);
        }
    }

    public int columnsCount() {
        return this.nums;
    }

    public int recordsCount() { return this.list[0].length(); }
}
