package patterns;

import java.util.Scanner;

public class Pyramidtriangle {
    public static void main(String[] a) {
        for (String i:a
             ) {
            System.out.println(i);

        }
        int inputNumber = scanningNumber();
        findPyramidTriangle(inputNumber);

    }

    public static void findPyramidTriangle(int inputNumber) {
        for (int i = 1; i <= inputNumber; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.println(j);
            }
        }
        System.out.println();
    }

    public static int scanningNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the rows for the triangle : ");
        int inputNumber = in.nextInt();
        return inputNumber;
    }
}
