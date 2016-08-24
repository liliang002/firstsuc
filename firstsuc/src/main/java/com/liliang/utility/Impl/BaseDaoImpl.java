/**
 * 
 */
package com.liliang.utility.Impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.liliang.common.GenericsUtil;
import com.liliang.utility.BaseDao;

/**
 * @author Administrator
 * @param <T>
 *
 */
public class BaseDaoImpl<T,PK extends Serializable> extends HibernateDaoSupport implements BaseDao<T,PK> {
	protected Logger log = Logger.getLogger(getClass());
    protected Class<?> entityClass;
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public Session getSession(){
    	return sessionFactory.getCurrentSession();
    }
    
    public BaseDaoImpl(){
    	this.entityClass = GenericsUtil.getSuperClassGenricType(getClass());
    }
    
	@Override
	public List<T> getAll(PK id) {
//		 return (List<T>) super.getHibernateTemplate().loadAll(this.entityClass);
		return (List<T>) getSession().get(this.entityClass, id);
	}

	@Override
	public T get(PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T load(PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable save(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdateAll(Collection<T> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T merge(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countEntity(Class<T> cls) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeById(PK id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> findByNamedQuery(String queryString,
			Map<String, Object> queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByProperty(String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findUniqueResultByProperty(String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByHql(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findByHql(String hql, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findByHqlResultBean(String hql, Class cls,
			Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findBySql(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findBySql(String sql, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findBySqlResultBean(String sql, Class cls,
			Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findBySqlResultMap(String sql, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int bulkUpdate(String hql, Object[] params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int bulkUpdate(String hql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int bulkUpdate(String hql, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int bulkUpdateSql(String sql, Map<String, Object> properties) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getUniqueBeanResult(String hql, Map<String, Object> properties)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getUniqueBeanResultBySql(String sql,
			Map<String, Object> properties) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object dealEntity(Object entity, String mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Serializable> Object getEntity(Class clazz, S id) {
		// TODO Auto-generated method stub
		return null;
	}

}
