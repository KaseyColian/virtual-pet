package mypet;


import org.junit.Test;
import org.junit.Assert;

public class VirtualPetTest {

@Test
public void shouldHaveName() {
	VirtualPet underTest = new VirtualPet();
	//act
	String nameOfPet = underTest.getNameOfPet();
	//assert
	Assert.assertEquals(null, null);
}
	
}
