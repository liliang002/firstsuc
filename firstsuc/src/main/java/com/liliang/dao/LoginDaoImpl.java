package com.liliang.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.liliang.entity.TFuncdict;
import com.liliang.entity.TUsers;
import com.liliang.utility.Impl.BaseDaoImpl;


@Repository("LoginDao")
@SuppressWarnings("rawtypes")
public class LoginDaoImpl extends BaseDaoImpl<Object> implements LoginDao {

	@Override
	public int loginAuth(String name, String password) {
		// TODO Auto-generated method stub
		String sql = "select count(*) from t_users where user_name = ? and password = ?";
		List tt = getListBySQL(sql, name, password);
		if (tt.size() == 0 || tt == null) {
			return 0;
		} else {
			int count = Integer.parseInt(tt.get(0).toString());
			return count;
		}
	}

	@Override
	public String logRegister(String userName, String password) {
		// TODO Auto-generated method stub
//	  Transaction tx = getSession().beginTransaction();
	  TUsers tUsers = new TUsers(); 
	  tUsers.setUserName(userName);
	  tUsers.setPassword(password);
	  save(tUsers);
//	  tx.commit();
	  throw   new RuntimeException("success");
//		return "success";
	}

	@Override
	public Set<TFuncdict> getRootMenu(int i) {
		// TODO Auto-generated method stub
		
		String hql = " from TFuncdict where parentId = ?";
		List tt = getListByHQL(hql,i);
//		Set<TFuncdict> temp = (Set<TFuncdict>)tt;
		Set<TFuncdict> set = new LinkedHashSet(tt);
		return   set;
	}

}
