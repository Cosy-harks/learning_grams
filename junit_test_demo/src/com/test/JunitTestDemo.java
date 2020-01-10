package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTestDemo {
	@BeforeClass
	public static void onceExecutedBeforeAny() {
		System.out.println("Before Class");
	}
	
	@Before
	public void executedBeforeAnyMethod() {
		System.out.println("Before each Method of class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@After
	public  void afterMethod() {
		System.out.println("After each Method of class");
	}
	
	@Test
	public void testHello() {
		String s = "hello";
		assertEquals("hello", s);
	}
	
	@Test
	public void testSum() {
		int res = 12+7;
		assertEquals(19, res);
	}
	
	@Ignore
	public void iAmIgnore() {
		System.out.println("I am ignore");
	}
	
}
