package Array_Problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(printPascalTriangle(6));
    }

    private static List<List<Integer>> printPascalTriangle(int n) {
        List<List<Integer>> triangle=new ArrayList<>();

        for(int i=0;i<n;i++){
            int num=1;
            List<Integer>currRow=new ArrayList<>();
            for(int j=0;j<=i;j++){
                currRow.add(num);
                num=num*(i-j)/(j+1);
            }
            triangle.add(currRow);
        }
        return  triangle;
    }
}
