package virtualpet;

public class VirtualPet {

	// VirtualPet bobTheDragon = new VirtualPet();
	// instance variables
	
	public String getStatus;
	public int hungerLevel;
	public int thirstLevel;
	public int wasteLevel;
	public int boredomLevel;
	public int sicknessLevel;

	// Constructor

	public VirtualPet(int hungerLevel, int thirstLevel, int wasteLevel, int boredomLevel, int sicknessLevel) {
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.wasteLevel = wasteLevel;
		this.boredomLevel = boredomLevel;
		this.sicknessLevel = sicknessLevel;}
		
		//Accessor of Method
	public String getStatus() {
		return getStatus;
	}
	
	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getWasteLevel(){
		return wasteLevel;
	}

	public int boredomLevel(){
		return boredomLevel;
}
	public int sicknessLevel() {
		return sicknessLevel;
		
	}
	public String toStatus() {
		return "Hunger is: " + hungerLevel + "\nThirst is: " + thirstLevel + "\nWaste is: " + wasteLevel + "\nBoredom is: " + boredomLevel + "\nSickness is: " + sicknessLevel;
	}
	}

}

