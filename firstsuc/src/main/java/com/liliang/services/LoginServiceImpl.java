package com.liliang.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liliang.dao.LoginDao;
import com.liliang.entity.TFuncdict;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;

	@Override
	public int loginAuth(String name, String password) {
		// TODO Auto-generated method stub
		return loginDao.loginAuth(name, password);
	}

	@Override
	public String logRegister(String name, String password) {
		// TODO Auto-generated method stub
		String temp = null;
		try{
			 temp = loginDao.logRegister(name,password);
		}catch(Exception e){
//			e.printStackTrace();
			temp = e.getMessage();
		}
		
		System.out.println("ssssssssssssssssssssss");
		return temp;
	}

	@Override
	public Set<TFuncdict> getRootMenu(int i) {
		// TODO Auto-generated method stub
		return loginDao.getRootMenu(i);
	}

}
