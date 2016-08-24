/**
 * 
 */
package com.liliang.services;

import java.util.Set;

import com.liliang.entity.TFuncdict;

/**
 * @author Administrator
 *
 */
public interface LoginService {
	
	public int loginAuth(String name,String password);
	public String logRegister(String name,String password);
	public Set<TFuncdict> getRootMenu(int i);

}
