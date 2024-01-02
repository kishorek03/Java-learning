import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Pyramidtriangle {
    public static void main(String[] args) {
        int inputNumber = scanningNumber();
        findPyramidTriangle(inputNumber);

    }

    public static void findPyramidTriangle(int inputNumber) {
        for (int i = 0; i <= inputNumber; i++) {
            for (int j = 0; j <= inputNumber - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*  ");
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
