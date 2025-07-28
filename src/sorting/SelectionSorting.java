package sorting;

import Helper_Classes.PrintHelper;

public class SelectionSorting {
    public static void selectionSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last= arr.length-1-i;
            int maxIndex=getIndex(arr, last);
            swap(arr,maxIndex,last);
        }
    }

    private static int getIndex(int[] arr, int last) {
        int max= 0;
        for(int j = 0; j<last; j++){
            if(arr[max]<arr[j]){
                max=j;
            }
        }
        return max;
    }
    private static void swap(int[]arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 7, 8, 9, 0, 2, 4};
        selectionSort(arr);
        PrintHelper.printArray(arr);
    }
}
