package virtualpet;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hi, friend! Please enter the name of your pet dragon.");
		String userEnteredNameOfPet = input.nextLine();
		VirtualPet myPet = new VirtualPet(userEnteredNameOfPet);

		System.out.println("Help " + myPet.getNameOfPet()
				+ " become the happiest dragon ever! \nThe higher the levels go, the more upset " + myPet.getNameOfPet()
				+ " becomes.\nAnd the more you interact with " + myPet.getNameOfPet()
				+ ", the needier it becomes. Good luck!");

		do {
			System.out.println(myPet.toString());
			myPet.killPet();
			System.out.println("\nSelect an option below:");
			System.out.println("Type 1 to feed " + myPet.getNameOfPet() + " tasty little critters.");
			System.out.println("Type 2 to let " + myPet.getNameOfPet() + " drink from the pool of Elven tears.");
			System.out.println("Type 3 to release the fire igniting inside of " + myPet.getNameOfPet() + ".");
			System.out.println("Type 4 to check on " + myPet.getNameOfPet() + " and see how it's feeling.");
			System.out.println("Type 5 to quit the game.");
			String optionEntered = input.nextLine();
			myPet.tickEffect();

			switch (optionEntered) {
			case "1":
				myPet.feed();
				break;
			case "2":
				myPet.water();
				break;
			case "3":
				myPet.fire();
				break;
			case "4":
				myPet.toString();
				break;
			case "5":
				System.out.println(myPet.getNameOfPet() + " says goodbye, friend!");
				System.exit(0);
				break;
			default:
				System.out.println(
						optionEntered + " is not a valid option.\nEvery incorrect response causes more stress to "
								+ myPet.getNameOfPet() + ", so be careful! \nPlease type a number from 1-5:");

			}

		} while (myPet.getGameRunning());

		input.close();
	}
}
