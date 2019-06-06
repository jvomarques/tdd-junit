package test;

import org.junit.Test;

import junit.framework.Assert;
import main.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void testNumberIsFizzBuzz() {
		
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String actual = fizzbuzz.converterNumberToFizzBuzz(3);
		String expected = "Fizz";
		
		Assert.assertEquals(expected, actual);
	}
}
