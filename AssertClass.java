package Basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {

	@Test
	
	public void basic() {
		
		Assert.assertEquals(false, true);
	}
	
	@Test
	
	public void basic1() {
		Assert.assertNotEquals("Vivek","Singh");
	}
}
