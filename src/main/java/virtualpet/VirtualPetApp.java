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

		// Consider switch instead of if/else.
		// if (optionEntered.equals("1")) {
		// System.out.println("Thank you for taking care of my belly, I love tasty
		// creatures!");
		// myPet.feed(5);
		//
		// }else if (optionEntered.equals("2")) {
		// myPet.water(5);
		// System.out.println("Thanks for quenching my thirst!");
		// }else if (optionEntered.equals("3")){
		// myPet.fire(5);
		// }

		// Trying switch for menu items:
		// do {myPet.timeEffect()}
		do {
			System.out.println(
					"Help " + myPet.getNameOfPet() + " be the happiest dragon ever! Select an option below:");
			System.out.println("Type 1 to feed me tasty little critters.");
			System.out.println("Type 2 to give me my beverage of choice.");
			System.out.println("Type 3 to let me relieve myself of the fire building up inside of me.");
			System.out.println("Type 4 to check my current state of existence.");
			System.out.println("Type 5 to quit the game.");
			optionEntered = input.nextLine();
			
			switch (optionEntered) {
			case "1":
				myPet.feed(2);
				break;
			case "2":
				myPet.water(+5);
				break;
			case "3":
				myPet.fire(1);
				break;
			case "4":
				myPet.toString();
				break;
			case "5":
				System.out.println("Goodbye, friend!");
				System.exit(0);
			}
			System.out.println(myPet.toString());
		} while (gameInput = true);
		// default:
		// System.out.println("Thanks for playing!");

	}
}
