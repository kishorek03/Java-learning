package Number_Problems;

import Helper_Classes.ScannerHelper;

public class SunnyNumber {
    public static void main(String[] args) {
        int [] inputNumbers = ScannerHelper.getInputInts();
        for(int input :inputNumbers){
            sunnyNumber(input);
        }
    }

    public static void sunnyNumber(int inputNumber) {
        double n = inputNumber+1;
        if(Math.sqrt(n)%1==0){
            System.out.println("The given number is a sunny number");}
        else{
            System.out.println("The given number is not a sunny number");
        }

    }
}
