package virtualpet;

import java.util.concurrent.ThreadLocalRandom;

public class VirtualPet {

	// instance variables = state of the pet

	private String nameOfPet;
	private boolean gameRunning;
	private int hungerLevel;
	private int thirstLevel;
	private int fireLevel;

	// constructor = behavior of pet beginningName is parameter
	public VirtualPet(String beginningName) {
		this.nameOfPet = beginningName;
		this.gameRunning = true;
		this.hungerLevel = ThreadLocalRandom.current().nextInt(15, 45);
		this.thirstLevel = ThreadLocalRandom.current().nextInt(20, 50);
		this.fireLevel = ThreadLocalRandom.current().nextInt(10, 50);

	}

	// Getters of Method
	public boolean getGameRunning() {
		return gameRunning;
	}

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

	// Methods

	// Set game to Run in Loop while this value is set as true.
	// Creating this in the class in case it needs used more in the future. (Instead
	// of just writing it directly into the App.)
	public void setGameRun() {
		boolean gameRunning = this.gameRunning;

	}

	// Make The Dragon Method = will print out ASCII after either hungerLevel,
	// thirstLevel, or fireLevel reach 0. Game continues as normal after image
	// displayed.
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

	// Kill Method = Kills pet and ends game if hungerLevel, thirstLevel, or
	// fireLevel reach 100.
	public void killPet() {
		if (fireLevel >= 100 || hungerLevel >= 100 || thirstLevel >= 100) {
			System.out.println("You have killed " + nameOfPet
					+ " because you neglected its other needs! Be a better dragon master next time!");
			System.exit(0);
		}
	}

	// Tick Method = with each optionEntered:hungerLevel increase, thirstLevel
	// increase, & fireLevel increase. May trigger
	// kill pet method if hungerLevel, thirstLevel, or fireLevel reaches 100.
	// tickEffect becomes a random amount with bounds after certain levels reached.
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

	// Feed Method - hungerLevel goes down, fireLevel goes up. makeTheDRagon
	// method called if hungerLevel=0.
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

	// Watering Method - thirstLevel goes does, fireLevel goes down. makeThDragon
	// method called if thirstLevel=0.
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

	// Fire Method - fireLevel goes down, thirstLevel goes down, hungerLevel goes
	// up. makeTheDragon method called if fireLevel=0.
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

	// toString Method = Will print out all current levels when user selects option.
	// Also called at the beginning of each loop (will display each turn).
	// This method counts towards effects used in Tick Method.
	@Override
	public String toString() {
		return "\n" + nameOfPet + "'s current condition is: " + "\nHunger: " + hungerLevel + "\nThirst: " + thirstLevel
				+ "\nInternal Fire: " + fireLevel + "\n";
	}
}