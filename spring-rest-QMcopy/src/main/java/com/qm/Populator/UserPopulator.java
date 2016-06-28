package com.qm.Populator;

import org.springframework.stereotype.Component;

import com.qm.dto.UserDto;
import com.qm.model.UserModel;

@Component
public class UserPopulator {

	public void populate(UserDto userdto,UserModel usermodel )
	{
		userdto.setPassword(usermodel.getPassword());
		userdto.setType(usermodel.getType());
		userdto.setUsername(usermodel.getUsername());
	}
	
	public void populate(UserModel usermodel,UserDto userdto)
	{
		usermodel.setPassword(userdto.getPassword());
		usermodel.setType(userdto.getType());
		usermodel.setUsername(userdto.getUsername());
	}
	
}
