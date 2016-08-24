package com.liliang.dao;

import java.util.Set;

import com.liliang.entity.TFuncdict;

public interface LoginDao {

	public int loginAuth(String name,String password);
	public String logRegister(String name,String password);
	public Set<TFuncdict> getRootMenu(int i);
}
