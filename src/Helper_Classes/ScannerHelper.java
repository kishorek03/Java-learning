package Helper_Classes;

import java.util.Scanner;

public class ScannerHelper {
    public static Scanner in = new Scanner(System.in);

    public static int[] getRandomInts() {
        int[] randomNums = new int[10];
        for (int i = 0; i < 10; i++) {
             randomNums[i]=(int)(Math.random()*10);
        }
        PrintHelper.printArray(randomNums);
        return randomNums;
    }
    public static int[] getInputInts() {
        int numberOfInputs =0;
        System.out.println("Please enter the number of inputs required: ");
        do {
            numberOfInputs= in.nextInt();
        } while (validateInputInt(numberOfInputs));
        int[] inputNums = new int[numberOfInputs];

        for (int i = 0; i < numberOfInputs; ++i) {
            System.out.println(" Please provide integer number: "+(i+1));
            inputNums[i] = in.nextInt();
        }
        return inputNums;
    }

    public static String getString() {
        System.out.println(" Please provide a text : ");
        return in.nextLine();
    }

    public static boolean validateInputInt(int var0) {
        if (var0 < 1) {
            System.out.println(" The inputNumbers is invalid!! please try again with valid number :");
            return true;
        } else {
            return false;
        }
    }
}