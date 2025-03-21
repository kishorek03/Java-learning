public class Recursion {
    public static void main(String[] args) {
        System.out.println(countZeros(50420));
    }

    static int countZeros(int n){
        return helper(n,0);
    }
    private static int helper(int n, int c) {
        if (n == 0) return c;
        int rem = n % 10;
        return (rem == 0) ? helper(n / 10, c + 1) : helper(n / 10, c);

    }

}
