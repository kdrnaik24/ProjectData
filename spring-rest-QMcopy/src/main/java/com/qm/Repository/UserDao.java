package com.qm.Repository;


import com.qm.model.UserModel;

public interface UserDao 
{
	public void addUser(UserModel User);
	
	public UserModel getAuthenticatedUser(String Username, String password);
	
	public UserModel getUser(String Username);
	
	//public List<UserModel> getAllUsers();
	
	//public void deleteUser(String username);
	
	
}
