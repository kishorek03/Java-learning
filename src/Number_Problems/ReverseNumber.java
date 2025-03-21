package Number_Problems;

import Helper_Classes.ScannerHelper;

public class ReverseNumber {
    public static void main(String[] args) {
        int[] inputNumbers = ScannerHelper.getInputInts();
        reversingNumber(inputNumbers);
    }

    public static void reversingNumber(int[] inputNumbers) {
        for (int inputNumber : inputNumbers) {
            int number = inputNumber;
            int reverse = 0;
            while (number != 0) {
                int result = number % 10;
                reverse = reverse * 10 + result;
                number /= 10;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }
    }
    public int duplicateArray(int [] arr){
        if(arr.length==0)return 0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]) {
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
}
