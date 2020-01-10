package com.business.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.business.Prime;

public class PrimeTest {
	
	private static Prime prime;
	@BeforeClass
	public static void initializePrime() {
		System.out.println("Called");
		prime = new Prime();
	}
	@Test
	public void testIsPrime() {
		try {
			assertEquals(false, prime.isPrime(4));
		}catch(NullPointerException e) {
			fail("Exception wasn't handled");
		}
	}

}
