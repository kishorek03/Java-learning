import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();


        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Pine Apple");

        String Fruit = arrayList.get(1);

        arrayList.remove("Apple");
        for(String item:arrayList){
            System.out.println(item);
        }

    }
}
