package com.liliang.services.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liliang.dao.users.UsersDao;

@Service("UsersService")
public class UsersServiceImpl implements UsersService {
	
	@Autowired 
	private UsersDao usersDao; 

	@Override
	public  List  getUsersInfo() {
		// TODO Auto-generated method stub
		return usersDao.getUserInfo();
	}

}
