import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Mastermind {
	static int bull;
	static int cow;

	public static int getCow() {
		return cow;
	}

	public static void setCow(int cow) {
		Mastermind.cow = cow;
	}

	public static int getBull() {
		return bull;
	}

	public static void setBull(int bull) {
		Mastermind.bull = bull;
	}

	private static int[] generateUniqueCode() {
		Set<Integer> digits = new HashSet<>();
		Random random = new Random();
		int number;
		while (digits.size() < 4) {
			number = random.nextInt(8) + 1;
			digits.add(number);
		}
		int[] array = new int[digits.size()];
		int j = 0;
		for (int i : digits) {
			array[j++] = i;
		}
		return array;
	}

	private static void getBullsAndCows(int[] userGuess, int[] computerNumber) {
		int bulls = 0;
		int cows = 0;

		for (int i = 0; i < 4; i++) {
			if (computerNumber[i] == userGuess[i]) { 
				bulls++;
			} else {
				for (int j = 0; j < 4; j++) {
					if (computerNumber[i] == userGuess[j]) {
						cows++;
						break;
					}
				}
			}
		}
		setBull(bulls);
		setCow(cows);
	}

	public static void main(String[] args) {
		System.out.println("WELCOME to the MASTERMIND GAME!!!");
		Scanner scanner = new Scanner(System.in);

		int[] computerNumber = generateUniqueCode();
		//System.out.println(Arrays.toString(computerNumber));

		System.out.println("You have 10 chances to guess the 4 digit number.");

		System.out.println("Enter your name:-");
		String playerName = scanner.nextLine();

		boolean playerWon = false;

		ArrayList<String> attemptsList = new ArrayList<>();

		for (int attempt = 0; attempt < 10; attempt++) {
			System.out.print("Attempt " + (attempt + 1) + ": Enter your 4-digit guess: ");
			String input = scanner.nextLine();

			// Check if the user input is valid
			if (!input.matches("\\d{4}")) {
				System.out.println("Invalid input. Please enter a 4-digit number.");
				continue;
			}

			int[] userGuess = new int[4];
			for (int i = 0; i < 4; i++) {
				userGuess[i] = input.charAt(i) - '0';
			}

			getBullsAndCows(userGuess, computerNumber);

			if (getBull() == 4) {
				playerWon = true;
				break;
			}

			ArrayList<String> feedbackList = new ArrayList<>();
			for (int i = 0; i < getBull(); i++) {
				feedbackList.add("Bull");
			}
			for (int i = 0; i < getCow(); i++) {
				feedbackList.add("Cow");
			}

			Collections.shuffle(feedbackList);
			String feedback = String.join(", ", feedbackList);
			feedback = feedback.isEmpty() ? "No Bull, No Cow" : feedback;

			String attemptResult = input + " - " + feedback;
			attemptsList.add(attemptResult);

			for (String result : attemptsList) {
				System.out.println(result);
			}
		}

		if (playerWon) {
			System.out.println(playerName + " won! 🎉🎉🥳🥳");
		} else {
			System.out.println("Sorry, you lost. The correct number was " + Arrays.toString(computerNumber));
		}
	}

}
