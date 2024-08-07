import java.util.Scanner;

public class RighttrianglePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the rows for the triangle : ");
        int inputNumber = in.nextInt();
        findRhsTriangle(inputNumber);
        findLhsTriangle(inputNumber);
    }

    public static void findRhsTriangle(int inputNumber) {
        for (int i = 0; i < inputNumber; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
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
}








