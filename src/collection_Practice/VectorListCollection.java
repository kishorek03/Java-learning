package collection_Practice;

import java.util.Vector;

public class VectorListCollection {
    public static void main(String[] args) {
        Vector<String>vector=new Vector<>();


        vector.add("Apple");
        vector.add("Banana");
        vector.add("Pine Apple");
        String Fruit= vector.get(2);

        vector.remove(0);

        for (String item: vector){
            System.out.println(item);
        }

    }
}
