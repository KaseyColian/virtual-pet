package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	VirtualPet myPet = new VirtualPet();

	String optionEntered = "";
	
	System.out.println("Hello, friend! Please help me be better! Select an option below:");
	System.out.println("Type 1 to feed me tasty little critters.");
	System.out.println("Type 2 to give me my beverage of choice.");
	System.out.println("Type 3 to let me relieve myself of the fire building up inside of me.");
	System.out.println("Type 4 to play with me.");
	System.out.println("Type 5 to give me my magical health potion.");
	System.out.println("Type 6 to check on my status and put me to bed.");
	optionEntered = input.nextLine();
	
	
	//Consider switch instead of if/else.
//	if (optionEntered.equals("1")) {
//		System.out.println("Thank you for taking care of my belly, I love tasty creatures!");
//		myPet.feed(5);
//	
//	}else if (optionEntered.equals("2")) {
//		myPet.water(5);
//		System.out.println("Thanks for quenching my thirst!");
//	}else if (optionEntered.equals("3")){
//		myPet.fire(5);
//	}

	//Trying switch for menu items:
	
	switch (optionEntered) {
	case "1":
		myPet.feed(+5);
	case "2":
		myPet.water(+5);
	case "3":
		myPet.fire(-10);
		break;
	default:	
		System.out.println("Thanks for playing!");
	}
	
	System.out.println();
	
	}
	
}
