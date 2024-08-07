import java.util.Scanner;

public class TrianglePattern {
    public static void reverseTriangle() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void findRhsTriangle(int inputNumber) {
        for (int i = 0; i < inputNumber; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void findLhsTriangle(int inputNumber) {
        for (int i = 0; i < inputNumber; i++) {
            for (int j = 0; j < 2 * (inputNumber - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void findPyramid(int inputNumber) {
        for (int i = 0; i < inputNumber; i++) {
            for (int j = 0; j < inputNumber - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of rows for the triangle and pyramid patterns: ");
        int inputNumber = in.nextInt();

        System.out.println("\nReverse Triangle Pattern:");
        reverseTriangle();

        System.out.println("\nRight-Hand Side Triangle Pattern:");
        findRhsTriangle(inputNumber);

        System.out.println("\nLeft-Hand Side Triangle Pattern:");
        findLhsTriangle(inputNumber);

        System.out.println("\nPyramid Pattern:");
        findPyramid(inputNumber);
    }
}
