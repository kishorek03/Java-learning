package Array_Problems;

public class SortArray {
    public static void toSortArray(int[] arr) {
        boolean sorted = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]>arr[i+1]){
                arr[i]^=arr[i+1];
                arr[i+1]^=arr[i];
                arr[i]^=arr[i+1];
                sorted = true;
            }
            if (i == arr.length - 2 && sorted) {
                i = -1;
                sorted = false;
            }
        }
        for (int item : arr) {
            System.out.print(item);
        }

    }

    public static void toSortArray(char[] chars) {
        boolean sorted = false;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i]>chars[i+1]) {
                chars[i]^= chars[i+1];
                chars[i+1]^=chars[i];
                chars[i] ^= chars[i + 1];
                sorted = true;
            }
            if (i == chars.length - 2 && sorted) {
                i = -1;
                sorted = false;
            }
        }
        //for (char item : chars) {
           // System.out.print(item);
        //}

    }


    public static void main(String[] args) {
        int[] arr = {5, 9, 4};
        char[] arr1 = {'e', 'a', 'b', 'I', 'o'};
        toSortArray(arr);
        toSortArray(arr1);

    }
}
