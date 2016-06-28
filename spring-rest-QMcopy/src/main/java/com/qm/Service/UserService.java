package com.qm.Service;

import com.qm.model.UserModel;

public interface UserService {
public void addUser(UserModel User);
	
	public UserModel getAuthenticatedUser(String Username, String password);
	
	public UserModel getUser(String Username);
}
