package com.temp.mavenTestNGProject;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelloWorld {
	@Test
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();

		Assert.assertNotNull(email);
		AssertJUnit.assertEquals(email, "feedback@yoursite.com");

}
}