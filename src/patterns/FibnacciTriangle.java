package patterns;

public class FibnacciTriangle {
    public static void main(String[] args) {
        fibonacciTriangle(5);
    }

    private static void fibonacciTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int n1 = 0;
            int n2 = 1;
            System.out.print(n2 + " ");
            for (int j = 1; j < i; j++) {
                int n3 = n1 + n2;
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
            }
            System.out.println();
        }
    }
}
