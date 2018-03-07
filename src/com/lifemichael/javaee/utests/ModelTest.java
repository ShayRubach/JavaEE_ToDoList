package com.lifemichael.javaee.utests;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.junit.Test;

import com.lifemichael.javaee.controller.AppController;
import com.lifemichael.javaee.model.HibernateToDoListDAO;
import com.lifemichael.javaee.model.Task;
import com.lifemichael.javaee.model.User;
import com.lifemichael.javaee.model.exceptions.TaskExceptionHandler;
import com.lifemichael.javaee.model.exceptions.UserExceptionHandler;

import antlr.collections.List;
import junit.framework.TestCase;

public class ModelTest <Junit> extends TestCase {

	@Test
	public void testAddNewUser() throws UserExceptionHandler {
		
		String boolString;
		boolean con = false;
		User test = new User ("test1@mail.com", "123456", "shlomi", "shlush");
		HibernateToDoListDAO.getInstance().addNewUser(test);
		User bool = HibernateToDoListDAO.getInstance().getUser("test1@mail.com", "123456");
		
		boolString = bool.getMail();
		
		if (boolString.equals(test.getMail()))
		{
			con = true;
		}
			
		assertEquals(true, con);	
		HibernateToDoListDAO.getInstance().deleteUser(bool.getUserID());
	}

	@Test
	public void testaddTask() throws TaskExceptionHandler
	{
		boolean con = false;
		Task task = new Task ("Check_user", "check", "Check insertion", "done");
		HibernateToDoListDAO.getInstance().addTask(task);
		java.util.List<Task> tasks = HibernateToDoListDAO.getInstance().getTasks("Check_user");
		java.util.Iterator i =(Iterator)tasks.iterator();
		
		while (i.hasNext())
		{
			if (tasks.iterator().next().getTitle().equals("check"))
			{
				con=true;
				break;
			}
		}

		assertEquals(true, con);	
	}


}
