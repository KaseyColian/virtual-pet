package virtualpet;

public class VirtualPet {

	// VirtualPet bobTheDragon = new VirtualPet();
	// instance variables - state of the pet

	private String nameOfPet;
	private int hungerLevel;
	private int thirstLevel;
	private int fireLevel;

	// Constructor = behavior of pet beginningName is parameter
	public VirtualPet(String beginningName) {
		this.nameOfPet = beginningName;
		this.hungerLevel = 20;
		this.thirstLevel = 20;
		this.fireLevel = 20;

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

	// Methods
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
		if (fireLevel >= 0 || hungerLevel >= 0 || thirstLevel >= 0) {
			fireLevel = fireLevel + 4;
			hungerLevel = hungerLevel + 4;
			thirstLevel = thirstLevel + 4;
		}

	}

	// Feeding Method - Hunger goes down, Fire Level goes up
	public void feed() {
		if (hungerLevel - 10 <= 0) {
			hungerLevel = 0;
			System.out.println(nameOfPet + " is stuffed and cannot fit anymore creatures in its belly!");
		} else {
			hungerLevel = hungerLevel - 10;
			fireLevel = fireLevel + 5;
			System.out.println("Thank you for feeding " + nameOfPet + "!");

		}

	}

	// Watering Dragon - Thirst Level goes does, Fire Level goes down
	public void water() {
		if (thirstLevel - 10 <= 10) {
			thirstLevel = 0;
			System.out.println(
					nameOfPet + " is full of Elven tears and won't be able to breath flames if it drinks anymore!");
		} else {
			thirstLevel = thirstLevel - 10;
			fireLevel = fireLevel - 5;
			System.out.println(nameOfPet + " says thank you, it was starting to feel parched!");
		}

	}

	// Amount of Fire needed to be released - Fire Level Goes Down if user selects
	// 2, Thirst Goes Down, Hunger Goes Up
	public void fire() {
		if (fireLevel - 10 <= 0) {
			fireLevel = 0;
			System.out.println(nameOfPet + " has huffed and puffed and blew out all its fire!");
		} else {
			fireLevel = fireLevel - 10;
			hungerLevel = hungerLevel + 5;
			thirstLevel = thirstLevel - 5;
			System.out.println("Thank you for relieving me of my fire, I feel much better now!");

		}
	}

	@Override
	public String toString() {
		return "\n" + nameOfPet + " is now feeling: " + "\nHunger: " + hungerLevel + "\nThirst: " + thirstLevel
				+ "\nInternal Fire: " + fireLevel + "\n";
	}
}