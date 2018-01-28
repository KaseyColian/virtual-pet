package virtualpet;

import java.util.concurrent.ThreadLocalRandom;

public class VirtualPet {

	// VirtualPet bobTheDragon = new VirtualPet();
	// instance variables - state of the pet

	private String nameOfPet;
	private int hungerLevel;
	private int thirstLevel;
	private int fireLevel;
	private boolean gameRunning;

	// Constructor = behavior of pet beginningName is parameter
	public VirtualPet(String beginningName) {
		this.nameOfPet = beginningName;
		this.hungerLevel = ThreadLocalRandom.current().nextInt(15, 45);
		this.thirstLevel = ThreadLocalRandom.current().nextInt(20, 50);
		this.fireLevel = ThreadLocalRandom.current().nextInt(10, 50);
		this.gameRunning = true;

	}

	// Getters of Method
	public String getNameOfPet() {
		return nameOfPet;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getFireLevel() {
		return fireLevel;
	}

	public boolean getGameRunning() {
		return gameRunning;
	}

	// Methods
	public void makeTheDragon() {

		System.out.println("                      ^\\    ^     ");
		System.out.println("                     / \\\\  / \\    ");
		System.out.println("                    /.  \\\\/   \\      |\\___/|   ");
		System.out.println("  *----*          //   |  \\\\    \\  __/  O  O\\   ");
		System.out.println("  |   /          / /   |   \\\\    \\_\\/  \\     \\     ");
		System.out.println("/  /\\/          /   /  |    \\\\\\   _\\/    '@___@      ");
		System.out.println("/  /         /    /    |     \\\\ _\\/       |U");
		System.out.println("|  |       /     /     |      \\\\/        |\\");
		System.out.println("\\  |     /_     /      |       \\\\  )   \\ _|_\\");
		System.out.println("\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\\");
		System.out.println("~    ~.           .-~-.|.-*      _        {-,\\");
		System.out.println("\\      ~-. _ .-~                 \\      /\\'\\");
		System.out.println("\\                   }            {   .*\\");
		System.out.println("~.                 '-/        /.-~----.\\");
		System.out.println("~- _             /        >..----.\\\\\\\\");
		System.out.println("~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\\\");

	}

	// kills pet if fire, hunger, or thirst level hits 100.
	public void killPet() {
		if (fireLevel >= 100 || hungerLevel >= 100 || thirstLevel >= 100) {
			System.out.println("You have killed " + nameOfPet
					+ " because you neglected its other needs! Be a better dragon master next time!");
			System.exit(0);
		}
	}

	// tick Method - with time- hunger, thirst, & fire level increase - may trigger
	// kill pet method.
	public void tickEffect() {
		if (fireLevel >= 0 && fireLevel <= 55) {
			fireLevel = fireLevel + 4;
		}
		if (hungerLevel >= 0 && hungerLevel <= 55) {
			hungerLevel = hungerLevel + 4;
		}
		if (thirstLevel >= 0 && thirstLevel <= 55) {
			thirstLevel = thirstLevel + 4;
		} else if (fireLevel > 55 || hungerLevel > 55 || thirstLevel > 55) {
			int randomEffect = ThreadLocalRandom.current().nextInt(1, 6);
			fireLevel = (fireLevel + randomEffect);
			hungerLevel = (hungerLevel + randomEffect);
			thirstLevel = (thirstLevel + randomEffect);
		}

	}
	
	public void setGameRun() { // Creating this in the class in case it needs used more in the future. (Instead
		// of just writing it directly into the app.)1
		boolean gameRunning = this.gameRunning;
		
	}

	// Feeding Method - Hunger goes down, Fire Level goes up
	public void feed() {
		if (hungerLevel - 10 <= 0) {
			hungerLevel = 0;
			makeTheDragon();
			System.out.println(nameOfPet + " is stuffed and cannot fit anymore creatures in its belly!");
		} else {
			hungerLevel = hungerLevel - 10;
			fireLevel = fireLevel + 5;
			System.out.println("Thank you for feeding " + nameOfPet + "!");

		}

	}
	// Set game to Run in Loop while this value is set as true.

	// Watering Dragon - Thirst Level goes does, Fire Level goes down
	public void water() {
		if (thirstLevel - 10 <= 10) {
			thirstLevel = 0;
			makeTheDragon();
			System.out.println(
					nameOfPet + " is full of Elven tears and won't be able to breath flames if it drinks anymore!");
		} else {
			thirstLevel = thirstLevel - 10;
			fireLevel = fireLevel - 5;
			System.out.println(nameOfPet + " says thank you, it was starting to feel parched!");
		}

	}

	public void fire() {
		if (fireLevel - 10 <= 0) {
			fireLevel = 0;
			makeTheDragon();
			System.out.println(nameOfPet + " has huffed and puffed and blew out all its fire!");
		} else {
			fireLevel = fireLevel - 10;
			hungerLevel = hungerLevel + 5;
			thirstLevel = thirstLevel - 5;
			System.out.println(nameOfPet + " says thank you for letting it release some of its pent-up fire!");

		}
	}

	// Amount of Fire needed to be released - Fire Level Goes Down if user selects
	// 2, Thirst Goes Down, Hunger Goes Up

	@Override
	public String toString() {
		return "\n" + nameOfPet + "'s current condition is: " + "\nHunger: " + hungerLevel + "\nThirst: " + thirstLevel
				+ "\nInternal Fire: " + fireLevel + "\n";
	}
}