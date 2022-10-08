package Java_100_Program;

public class Factorial {
//	 factorial = 5! = 5*4*3*2*1

	public static void main(String[] args) {
//		int fact=1,number=5;
//		for(int i=1;i<=number;i++) {
//			fact = fact *i;	
//		}
//		System.out.println(fact);
//		
		int n = 5;
		for (int i = 1; i <= n; i++) {
			System.out.println(fact(i));
		}
	}

	private static int fact(int i) {

		if (i <= 1) {
			return i;
		}
		return i*(fact(i-1));

	}

}
