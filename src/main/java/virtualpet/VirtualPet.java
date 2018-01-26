package virtualpet;

public class VirtualPet {

	// VirtualPet bobTheDragon = new VirtualPet();
	// instance variables - state of the pet

	private String nameOfPet;
	private int hungerLevel;
	private int thirstLevel;
	private int fireLevel;
	private int boredomLevel;
	private int sicknessLevel;

	// Constructor = behavior of pet
	public VirtualPet() {
		this.nameOfPet = "Bob the Dragon";
		this.hungerLevel = 80;
		this.thirstLevel = 70;
		this.fireLevel = 50;
		this.boredomLevel = 60;
		this.sicknessLevel = 4;
		
	}

	public VirtualPet(String nameOfPet) {
		this.nameOfPet = nameOfPet;
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

	public int getboredomLevel() {
		return boredomLevel;
	}

	public int getsicknessLevel() {
		return sicknessLevel;
	}

	public void feed(int amountToFeed) {
		if (hungerLevel <= 100) {
			hungerLevel++;
			fireLevel++;
			System.out.println("Thank you for feeding " + nameOfPet + "!");
		} else {
			System.out.println(nameOfPet + " cannot fit anymore creatures in his belly!");
		}
	}

	public void water(int amountToWater) {
		if (thirstLevel <= 100) {
			thirstLevel++;
			System.out.println("Thank you for the drink!");
		} else {
			System.out.println(nameOfPet + "is full of water and won't be able to breath flames if he drinks anymore!");
		}
		}
	
public void fire (int amountOfFire) {
	if (fireLevel <=0) {
		System.out.println("I don't have any fire to exhale!");
	}else {
		fireLevel--;
		System.out.println("Thank you for relieving me of my fire! I feel much better now!");}

	

//		 @Override
//		 public String toString(getStatus); {
//		 return nameOfPet + "Hunger is: " + hungerLevel + "\nThirst is: " +
//		 thirstLevel + "\nWaste is: " + fireLevel
//		 + "\nBoredom is: " + boredomLevel + "\nSickness is: " + sicknessLevel;
}		 
}