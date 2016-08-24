package com.liliang.dao.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.liliang.entity.TUsers;
import com.liliang.utility.Impl.BaseDaoImpl;

@Repository("UsersDao")
public class UsersDaoImpl extends BaseDaoImpl<Object> implements UsersDao {

	@Override
	public List getUserInfo() {
		// TODO Auto-generated method stub
		String hql = "from TUsers";
		List<Object> list = getListByHQL(hql);
		List<TUsers> rlist = new ArrayList<TUsers>();
		return list;
	}

}
