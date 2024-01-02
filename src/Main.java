import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int num1 = in.nextInt();
        if (num1 == 2) {
            System.out.println("The given number is not a prime number!!");
        } else {
            for (int i = 3; i <= num1 / 2; i += 2) {
                if (num1 % i == 0) {
                    System.out.println("The given number is not a prime number!!");
                } else if (i * i > num1) {
                    System.out.println("The given number is a prime number");
                }
            }
        }
    }
}
	
