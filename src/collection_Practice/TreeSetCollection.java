package collection_Practice;

import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        TreeSet<Integer> tree=new TreeSet<>();

        tree.add(54);
        tree.add(342);
        tree.add(4930);
        tree.add(3);
        tree.add(43);

        for (Integer item:tree ){
            System.out.print(item+"->");
        }
    }
}
