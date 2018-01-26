package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	VirtualPet myPet = new VirtualPet();

	String optionEntered = "";
	
	{System.out.println("Hello, friend! Please help me be better! Select an option below:");
	System.out.println("Type 1 to feed me.");
	System.out.println("Type 2 to give me water.");
	System.out.println("Type 3 to let me use the restroom.");
	System.out.println("Type 4 to play with me.");
	System.out.println("Type 5 to give me my magical health potion.");
	optionEntered = input.nextLine();
	
	if (optionEntered.equals("1")); {
		System.out.println("Thank you for taking care of my belly, I love tasty creatures!");}
		myPet.feed(5);
	
	}
	if (optionEntered.equals("2")); {
		myPet.water(5);
		System.out.println("Thanks for quenching my thirst!");
	}
	
	
	
	
	}
}
