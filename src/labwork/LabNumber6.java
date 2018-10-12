package labwork;

import java.util.Random;
import java.util.Scanner;

public class LabNumber6 {

	public static int randomRoll(int sideSelect) {
		Random roll = new Random();
		sideSelect = roll.nextInt(sideSelect) + 1;
		return sideSelect;

	}

	public static void rollTypes(int dieOne, int dieTwo) {

		if (dieOne + dieTwo == 2) {
			System.out.println("\tSnake eyes!");
		} else if (dieOne + dieTwo == 7 || dieOne + dieTwo == 11) {
			System.out.println("\tAll Natural!");
		} else if (dieOne + dieTwo == 12 || dieOne + dieTwo == 3) {
			System.out.println("\tCraps!");
		}
	}

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		String confirm;
		int dieOne, dieTwo;
		int sideSelect;

		System.out.println("Welcome to the Grand Circus Casino!");

		do {
			System.out.println(
					"What type of sided dice would you like to use? (We only have four to six sided-dice at the moment): ");

			sideSelect = num.nextInt();

			while (sideSelect < 4 && sideSelect > 6) {
				System.out.println("You can only pick a four to six-sided die. Please pick a four to six-sided die.");
				sideSelect = num.nextInt();
			}

			dieOne = randomRoll(sideSelect);
			dieTwo = randomRoll(sideSelect);

			System.out.println("Here is the roll. First die lands on: " + dieOne);
			System.out.println("Here is the roll. Second die lands on: " + dieTwo);

			rollTypes(dieOne, dieTwo);

			System.out.println("Would you like to roll again? (Type yes to continue or type any other key to stop)");
			confirm = num.next();

		} while (confirm.equalsIgnoreCase("Yes"));

		System.out.println("Thanks for playing! Come again!");

		num.close();
	}

}
