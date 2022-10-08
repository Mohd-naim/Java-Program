package Java_100_Program;

public class FibonacciByRecursion {

	static int fib(int i) {
		if (i <= 1) {
			return i;
		}

		return fib(i - 1) + fib(i - 2);

	}

	public static void main(String[] args) {

		int n = 100;

		for (int i = 0; i <= n; i++) {
			System.out.println(fib(i));
		}

	}

}
