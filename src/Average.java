import java.time.LocalDate;
import java.util.Scanner;
import java.io.*;

class fibonacci {

	static int fib(int n){
		int f[] = new int[n + 2];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}

	public static void main(String args[])
	{
		int N = 10;
		for (int i = 0; i < N; i++)
			System.out.print(fib(i) + " ");
		LocalDate date= LocalDate.now();
		System.out.println(date);
	}
}