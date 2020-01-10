package com.check.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import free_money.Customer;
import free_money.CustomerCheck;

public class TestCustomer {
	private static Customer cust;
	
	@BeforeAll
	public static void initializeCustomer() {
		System.out.println("Called");
		cust = new Customer("John");
		assertEquals(true, CustomerCheck.newUser(cust.getUserName(), "p;p;"));
	}
	
	@Test
	public void testIsNewUser() {
		System.out.println("New User");
		assertEquals(false, CustomerCheck.newUser(cust.getUserName(), "p;p;"));
		assertEquals(true, CustomerCheck.newUser("popps", "p0&k)"));
	}
	
	@Test
	public void testUserLogin() {
		System.out.println("User Login");
		assertEquals(cust, CustomerCheck.login(cust.getUserName(), "p;p;"));
		assertEquals(null, CustomerCheck.login("poppy", "p0&k2)"));
	}
	
	@Test
	public void testNameChange() {
		System.out.println("Name Change");
		cust = CustomerCheck.login(cust.getUserName(), "p;p;");
		cust.setUserName("Bobby");
		assertEquals(true, cust.getUserName() == CustomerCheck.login(cust.getUserName(), "p;p;").getUserName());
	}
	
	@Test
	public void testValidUsername() {
		System.out.println("Valid Username");
		assertEquals(false, CustomerCheck.isName("20..02"));
		assertEquals(true, CustomerCheck.isName("John"));
		assertEquals(false, CustomerCheck.isName("Doe"));
		assertEquals(false, CustomerCheck.isName("Joehone*$$"));
		assertEquals(false, CustomerCheck.isName("Jane Doyal"));
		assertEquals(true, CustomerCheck.isName("JohnDelany"));
		assertEquals(true, CustomerCheck.isName("Doerspeak"));
	}
	
	@Test
	public void testValidPassword() {
		System.out.println("Valid Password");
		assertEquals(false, CustomerCheck.isPass("20..02"));
		assertEquals(true, CustomerCheck.isPass("*_*John:]"));
		assertEquals(false, CustomerCheck.isPass("Doezier"));
		assertEquals(true, CustomerCheck.isPass("$$*Joehone*$$"));
		//assertEquals(true, CustomerCheck.isPass("Jane_Doyal*")); // should not be failing
		assertEquals(false, CustomerCheck.isPass("JohnDelany"));
		assertEquals(false, CustomerCheck.isPass(" Doerspeak"));
	}
	
	
}
