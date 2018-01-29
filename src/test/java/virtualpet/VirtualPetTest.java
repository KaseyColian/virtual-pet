package virtualpet;

import org.junit.Test;
import org.junit.Assert;

//Check: 1. Name pulls in 2. Feed Method 3. Water Method 4. Fire Method 5. Kill Method 6. Tick Method 7. Game Loops Boolean 8. System Menu Display
public class VirtualPetTest {

	@Test
	// Testing that getNameOfPet will pull user data. Checked user data of "bob"
	// against result of "mister" and test failed. Changed to "bob" in
	// VirtualPet("bob") and Assert.assertequals(nameOfPet, bob)
	//Test failed. Test passed. Test complete.
	public void shouldHaveName() {
		VirtualPet underTest = new VirtualPet("bob");
		// act
		String nameOfPet = underTest.getNameOfPet();
		// assert
		Assert.assertEquals(nameOfPet, "bob");
	}

}
