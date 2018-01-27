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

	// Constructor = behavior of pet beginningName is parameter
	public VirtualPet(String beginningName) {
		this.nameOfPet = beginningName;
		this.hungerLevel = 60;
		this.thirstLevel = 70;
		this.fireLevel = 45;
		this.boredomLevel = 60;
		this.sicknessLevel = 5;	
	}

//	public VirtualPet(String nameOfPet) {
//		this.nameOfPet = nameOfPet;
//	}

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
//	public int getboredomLevel() {
//		return boredomLevel;
//	}
//
//	public int getsicknessLevel() {
//		return sicknessLevel;
//	}
	
	//Methods

	
	
	
	
//Feeding Method - Hunger goes does, Fire Level goes up
	public void feed(int amountToFeed) {
		if (hungerLevel <= 100) {
			hungerLevel--;
			fireLevel++;
			System.out.println("Thank you for feeding " + nameOfPet + "!");
		} else {
			System.out.println(nameOfPet + " cannot fit anymore creatures in his belly!");
		}
	
	}
	
	//Watering Dragon - Thirst Level goes does, Fire Level goes down
	public void water(int amountToWater) {
		if (thirstLevel <= 100) {
			thirstLevel--;
			fireLevel--;
			System.out.println("Thank you for the drink!");
		} else {
			System.out.println(nameOfPet + "is full of water and won't be able to breath flames if he drinks anymore!");
		}
	
	}
	
	//Amount of Fire needed to be released - Fire Level Goes Down
public void fire (int amountOfFire) {
	if (fireLevel <=0) {
		System.out.println("I don't have any fire to exhale!");
	}else {
		fireLevel--;
		System.out.println("Thank you for relieving me of my fire! I feel much better now!");
		}
}

//tick Method - with time- hunger, thirst, & fire level increase	
	private void timeEffect(int timeBringsChange) {
		fireLevel++;
		hungerLevel++;
		thirstLevel++;
	}


	public void overallStatus () {
		System.out.println("");
	}
	
	
 
		 @Override
		 public String toString() {
			return nameOfPet + "'s overall status is currently: \nHunger: " + hungerLevel + "\nThirst: " +
				 thirstLevel + "\nWaste: " + fireLevel
		 + "\nBoredom: " + boredomLevel + "\nSickness: " + sicknessLevel;}
}