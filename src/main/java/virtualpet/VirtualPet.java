package virtualpet;

public class VirtualPet {

	// VirtualPet bobTheDragon = new VirtualPet();
	// instance variables - state of the pet

	private String nameOfPet;
	private int hungerLevel;
	private int thirstLevel;
	private int fireLevel;
//	private int boredomLevel;
//	private int sicknessLevel;

	// Constructor = behavior of pet beginningName is parameter
	public VirtualPet(String beginningName) {
		this.nameOfPet = beginningName;
		this.hungerLevel = 20;
		this.thirstLevel = 20;
		this.fireLevel = 20;
		// this.boredomLevel = 60;
		// this.sicknessLevel = 5;
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
	//
	// public int getboredomLevel() {
	// return boredomLevel;
	// }
	//
	// public int getsicknessLevel() {
	// return sicknessLevel;
	// }

	// Methods

	// Feeding Method - Hunger goes down, Fire Level goes up
	public void feed() {
		if (hungerLevel < 100) {
			hungerLevel=hungerLevel-10;
			fireLevel=fireLevel+5;
			System.out.println("Thank you for feeding " + nameOfPet + "!");

		} else {
			System.out.println(nameOfPet + " cannot fit anymore creatures in his belly!");
		}

	}

	// Watering Dragon - Thirst Level goes does, Fire Level goes down
	public void water(int amountToWater) {
		if (thirstLevel <= 100) {
			thirstLevel--;
			fireLevel--;
			System.out.println("Thank you for the drink!");
		} else {
			System.out.println(nameOfPet + "is full of water and won't be able to breath flames if he drinks anymore!");
		}

	}

	// Amount of Fire needed to be released - Fire Level Goes Down
	public void fire(int amountOfFire) {
		if (fireLevel <= 0) {
			System.out.println("I don't have any fire to exhale!");
		} else {
			fireLevel = fireLevel - 5;
			hungerLevel = hungerLevel + 3;
			thirstLevel = thirstLevel - 5;

			System.out.println("Thank you for relieving me of my fire! I feel much better now!");
		}
	}

	// kills pet if fire, hunger, or thirst level hits 100.
	public void killPet() {
		if (fireLevel >= 100 || hungerLevel >= 100 || thirstLevel >= 100) {
			System.out.println("You have killed " + nameOfPet + " because you neglected its needs! Be better!");
			System.exit(0);
		}
	}

	// tick Method - with time- hunger, thirst, & fire level increase
	public void timeEffect() {
		fireLevel=fireLevel+20;
		hungerLevel++;
		thirstLevel++;
	}

	public void overallStatus() {
		System.out.println("");
	}

	@Override
	public String toString() {
		return nameOfPet + " is now feeling: " + "\nHunger: " + hungerLevel + "\nThirst: " + thirstLevel
				+ "\nInternal Fire: " + fireLevel + "\n\n";
	}
}