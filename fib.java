package test;
import java.util.Scanner;
public class fib {
	public static int fibonacci(int n) {
		if (n <= 1) {
		return n;
		} else {
		return fibonacci(n - 1) + fibonacci(n - 2);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = scanner.nextInt();
		System.out.println("Fibonacci sequence up to " + n + " terms:");

		for (int i = 0; i < n; i++) {
		System.out.print(fibonacci(i) + " ");

		}

		scanner.close();
	}

}
