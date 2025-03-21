import Helper_Classes.PrintHelper;
import Helper_Classes.ScannerHelper;

import java.util.*;

public class NearestSmallerElement {
    public static int[]prevSmaller(int[] A) {
        Stack<Integer> st=new Stack<>();
        int[]arr=new int[A.length];
        for (int i = 0; i <A.length ; i++) {
            while (!st.isEmpty() && st.peek() >= A[i] ){
                st.pop();
            }
            if (!st.isEmpty()){
                arr[i]=st.peek();
            }else {
                arr[i]=-1;
            }
            st.push(A[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] A= ScannerHelper.getInputInts();
        PrintHelper.printArray(prevSmaller(A));
    }
}
