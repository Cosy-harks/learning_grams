package com.check.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import free_money.Account;
import free_money.AccountCheck;

class TestAccount {
	
	private static Account acct;
	
	@BeforeAll
	public static void initializeAccount() {
		System.out.println("Called");
		acct = new Account(123.1);
		acct.setNamed("savings");
	}
	
	@Test
	public void testIsNum() {
		assertEquals(false, AccountCheck.isNum("20..02"));
		assertEquals(true, AccountCheck.isNum("20.02"));
		assertEquals(false, AccountCheck.isNum("20.20.02"));
	}
	
	@Test
	public void testAccountToString() {
		System.out.println(acct.toString());
		assertEquals("AccountNumber: 1594876324876520\nnamed: savings\nBalance: $123.10", acct.toString());
	}
	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
