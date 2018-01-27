package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hi, friend! Please enter the name of your pet dragon.");
		String userEnteredNameOfPet = input.nextLine();
		VirtualPet myPet = new VirtualPet(userEnteredNameOfPet);

		String optionEntered = "";
		boolean gameInput = true;

		System.out.println("Help " + myPet.getNameOfPet()
				+ " become the happiest dragon ever! The higher the levels, the more upset " + myPet.getNameOfPet()
				+ " will get.");

		do {
			System.out.println("Select an option below:");
			System.out.println("Type 1 to feed " + myPet.getNameOfPet() + " tasty little critters.");
			System.out.println("Type 2 to let " + myPet.getNameOfPet() + " drink from the pool of Elven tears.");
			System.out.println("Type 3 to release the fire building inside of " + myPet.getNameOfPet() + ".");
			System.out.println("Type 4 to check " + myPet.getNameOfPet() + "'s current state of existence.");
			System.out.println("Type 5 to quit the game.");
			optionEntered = input.nextLine();
			myPet.tickEffect();
			myPet.killPet();
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
				System.out.println("Goodbye, friend!");
				System.exit(0);
				break;
			default:
				System.out.println(optionEntered + " was not a valid option.  Type a number from 1-5:");

			}

			System.out.println(myPet.toString());
		} while (gameInput = true);

		// default:
		// System.out.println("Thanks for playing!");
		input.close();
	}
}
