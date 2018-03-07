package com.lifemichael.javaee.utests;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runners.JUnit4;

import com.lifemichael.javaee.controller.*;
import com.lifemichael.javaee.model.HibernateToDoListDAO;

public class ControllerTest<Junit> extends TestCase {

	AppController todo = new AppController();
	
	@Test
	public void testSingelton()
	{
		if (todo == null)
		{
			fail("cant create sever!");

		}
				
	}
	
	@Test
	public void testVerification()
	{
		
		//expected con to be true
		boolean con;
		con = todo.verification("check", "check2");
		assertEquals(true, con);
		
	}
	
	@Test
	public void testvalidtionCheck()
	{
		//expected con to be false
		boolean con = todo.validtionCheck("123");
		assertEquals(false,con);
		
	}
}
