package Java_100_Program;

public class Fabonacci {

	// Fibonacci series : 0 1 1 2 3 5 8 11

	public static void main(String[] args) {
		//fibonacci series up to n numbers
		int n = 10;
		int first = 0, sec = 1, third;
		System.out.println(first + "\n" + sec);
		for (int i = 0; i <= n; i++) {
			third = first + sec;
			System.out.println(third);
			first = sec;
			sec = third;
		}
	}

}
