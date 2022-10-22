import java.util.Scanner;

public class NumberGuessingGame {

	public static void guessTheNumber()
	{
		try (Scanner sc = new Scanner(System.in)) {
			int number = (int)(100 * Math.random());

			System.out.println("Enter the number of trials,you want:");
			int K = sc.nextInt();

			int i, guess;

			System.out.println(
				"A random number is chosen"
				+ " between 1 to 100."
				+ "Guess the number"
				+ " within "+ K +" trials.");

			for (i = 0; i < K; i++) {

				System.out.println("Guess the number:");

				guess = sc.nextInt();

				if (number == guess) {
					System.out.println("Congratulations!"+ " You guessed the number Correctly.");
					break;
				}
				else if (number > guess && i != K) {
					System.out.println(
						"The  number is "
						+ "greater than " + guess);
				}
				else if (number < guess
						&& i != K ) {
					System.out.println(
						"The number is"
						+ " less than " + guess);
				}
			}

			if (i == K) {
				System.out.println(
					"You have exhausted "
					+K+ " trials.");

				System.out.println(
					"The number was " + number);
			}
		}
	}

	
	public static void main(String args[])
	{
		guessTheNumber();
	}
}
