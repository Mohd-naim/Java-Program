package Java_100_Program;

public class ComparisonOfThreeNumber {

	public static void main(String[] args) {
		int firstNumber = 200, secNumber = 140, thirdNumber = 50;

		if (firstNumber > secNumber) {
			if (firstNumber > thirdNumber) {
				System.out.println(firstNumber + " is the largest number");
			} else {
				System.out.println(thirdNumber + " is the lagest number");
			}

		} else if (secNumber > thirdNumber) {
			System.out.println(secNumber + " is the largest number");

		} else {
			System.out.println(thirdNumber + "is the largest number");
		}

	}

}
