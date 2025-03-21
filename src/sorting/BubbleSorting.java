package sorting;


import Helper_Classes.PrintHelper;

public class BubbleSorting {
    private static void optimizedBubbleSort(int[] arr){
        int swapped=1;
        for(int j=arr.length-1;j>=0 && swapped==1;j--){
            swapped=0;
            for(int i=0;i<=j-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swapped=1;
                }
            }
        }
    }
    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,6,3,7,8,9,0,2,4};
        bubbleSort(arr);
        PrintHelper.printArray(arr);
    }
}
