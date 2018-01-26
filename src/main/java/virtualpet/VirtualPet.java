package virtualpet;

public class VirtualPet {

	// VirtualPet bobTheDragon = new VirtualPet();
	// instance variables

	private String nameOfPet;
	private int hungerLevel;
	private int thirstLevel;
	private int wasteLevel;
	private int boredomLevel;
	private int sicknessLevel;

	// Constructor
	public VirtualPet() {
		this.nameOfPet = "Bob the Dragon";
		this.hungerLevel = 80;
		this.thirstLevel = 70;
		this.wasteLevel = 50;
		this.boredomLevel = 60;
		this.sicknessLevel = 4;
	}

	public VirtualPet(String nameOfPet) {
		this.nameOfPet = nameOfPet;
	}

	// Accessor of Method
	public String getNameOfPet() {
		return nameOfPet;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public int boredomLevel() {
		return boredomLevel;
	}

	public int sicknessLevel() {
		return sicknessLevel;
	}

	public void feed(int amountToFeed) {
		if (hungerLevel<=100){
		hungerLevel++;
		System.out.println("Thank you for feeding " + nameOfPet + "!");
		} else {
			System.out.println(nameOfPet + " cannot fit anymore creatures in his belly!");
		}
	}
	public void water(int amountToWater) {
		if (thirstLevel<=100) {
			thirstLevel++;
			System.out.println("Thank you for the drink!");
		}else {System.out.println(nameOfPet +"is full of water and won't be able to breath flames if he drinks anymore!");
		}
		
		

//	@Override
//	public String toString() {
//		return nameOfPet + "Hunger is: " + hungerLevel + "\nThirst is: " + thirstLevel + "\nWaste is: " + wasteLevel
//				+ "\nBoredom is: " + boredomLevel + "\nSickness is: " + sicknessLevel;
	}
}
