package collection_Practice;

import java.util.Arrays;
import java.util.LinkedList;
public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer>linkedlist= new LinkedList<>();


        linkedlist.add(3342);
        linkedlist.add(353);
        linkedlist.add(35);
        linkedlist.add(356);

        int []arr={linkedlist.get(0),linkedlist.get(1),linkedlist.get(2)};
        System.out.println(Arrays.toString(arr));

        for (Integer item: linkedlist){
            System.out.println(item);
        }
    }
}
