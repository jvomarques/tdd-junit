package test;

import org.junit.Test;

import junit.framework.Assert;
import main.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void testNumberIsntFizzAndBuzz() {
		
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String actual = fizzbuzz.converterNumberToFizzBuzz(1);
		String expected = "1";
		
		Assert.assertEquals(expected, actual);
	}
}
