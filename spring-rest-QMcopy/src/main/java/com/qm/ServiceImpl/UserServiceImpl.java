package com.qm.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.Populator.UserPopulator;
import com.qm.Repository.impl.UserDaoImpl;
import com.qm.Service.UserService;
import com.qm.dto.UserDto;
import com.qm.model.UserModel;

@Service
public class UserServiceImpl implements UserService
{
	
	@Autowired
	UserDaoImpl userdao;
	@Autowired
	UserPopulator pops;
	@Override
	public void addUser(UserModel User) {
		
		UserDto user=new UserDto();
		pops.populate(user, User);
		userdao.addUser(User);
		
	}
	@Override
	public UserModel getAuthenticatedUser(String Username, String password) {
		return userdao.getAuthenticatedUser(Username, password);
	}
	@Override
	public UserModel getUser(String Username) {
	return userdao.getUser(Username);
	}
	
	
	
	

}
