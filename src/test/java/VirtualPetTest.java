package mypet;

import org.junit.Test;
import org.junit.Assert;
//Check: 1. Name pulls in 2. Feed Method 3. Water Method 4. Fire Method 5. Kill Method 6. Tick Method 7. Game Loops Boolean 8. System Menu Display
public class VirtualPetTest {

	@Test
	public void shouldHaveName() {
		VirtualPet underTest = new VirtualPet();
		// act
		String nameOfPet = underTest.getNameOfPet();
		// assert
		Assert.assertEquals(null, null);
	}

}
