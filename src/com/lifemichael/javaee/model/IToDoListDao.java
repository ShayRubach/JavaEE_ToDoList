package com.lifemichael.javaee.model;

import java.util.List;

import com.lifemichael.javaee.model.exceptions.ContactException;
import com.lifemichael.javaee.model.exceptions.TaskExceptionHandler;
import com.lifemichael.javaee.model.exceptions.UserExceptionHandler;

/**
 * ToDoList DAO
 * represents the DAO Interface for ToDoList
 */
public interface IToDoListDao {
	
	public User addNewUser(User user) throws UserExceptionHandler;
	
	/**
	 * 
	 * @param String, String
	 * @return User
	 * @throws TaskExceptionHandler
	 */
	public User getUser(String mail, String password) throws UserExceptionHandler;
	
	public void deleteUser (int idUserTodelete) throws UserExceptionHandler;
	
	
	public void addTask(Task task) throws TaskExceptionHandler;
	

	/**
	 * Delete requested Task from database
	 * @param String, Integer
	 * @return void
	 * @throws TaskExceptionHandler
	 */
	public void deleteTask(String userName, int taskID) throws TaskExceptionHandler;
	
	
	/**
	 * Update requested task from database
	 * @param Integer, Task
	 * @return void 
	 * @throws TaskExceptionHandler
	 */
	public void updateTask(int taskID, Task updatedTask) throws TaskExceptionHandler;
	
	/**
	 * Get all Tasks from database
	 * @param Integer 
	 * @return List<Task> 
	 * @throws TaskExceptionHandler
	 */
	public List<Task> getTasks(String userName) throws TaskExceptionHandler;
	
		
	/**
	 * 
	 * @param User
	 * @return User
	 * @throws TaskExceptionHandler
	 */

	public Contact addComment(Contact contact) throws ContactException;
	
	
	/**
	 * Add Task to database
	 * @param Task
	 * @return Integer 
	 * @throws TaskExceptionHandler
	 */

}

