package com.liliang.utility;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

/**
 * 定义所有DAO接口的父接口，用以提供一些通用的方法，并通过泛型实现一些DAO的通用功能 该接口继承自appfuse框架的GenericDao接口
 * 自定义DAO接口是，要继承该DAO，使用示例: UserDao extends BaseDao<User, Integer> { ... }
 * 
 * @author ZXM
 */
public interface BaseDao<T, PK extends Serializable> {
	/**
	 * 获得所有的实体对象
	 * 
	 * @return
	 */
	public List<T> getAll(PK id);

	/**
	 * 根据ID查询指定的对象
	 * 
	 * @param id
	 * @return
	 */
	public T get(PK id);

	/**
	 * 根据ID加载指定的对象
	 * 
	 * @param id
	 * @return
	 */
	public T load(PK id);

	/**
	 * 保存指定的对象
	 * 
	 * @param object
	 * @return
	 */
	public Serializable save(T entity);

	/**
	 * 保存或者更新指定的对象 根据对象hibernate的状态
	 * 
	 * @param entity
	 */
	public void saveOrUpdate(T entity);

	/**
	 * 将一个容器中的所有对象保存或者更新到数据库
	 * 
	 * @param entities
	 */
	public void saveOrUpdateAll(Collection<T> entities);

	/**
	 * 更新指定的对象
	 * 
	 * @param object
	 * @return
	 */
	public void update(T entity);

	/**
	 * 合并指定的对象
	 * 
	 * @param object
	 * @return
	 */
	public T merge(T entity);

	/**
	 * 获取某个持久化类的记录数
	 * 
	 * @author zouxiaoming
	 * @param cls
	 * @return
	 */
	public Long countEntity(Class<T> cls);

	/**
	 * 根据删除指定的对象
	 * 
	 * @param id
	 */
	public void delete(T entity);

	/**
	 * 根据ID删除指定的对象
	 * 
	 * @param id
	 */
	public void removeById(PK id);

	/**
	 * 根据命名参数进行HQL查询
	 * 
	 * @param queryName
	 * @param queryParams
	 * @return
	 */
	public List<T> findByNamedQuery(String queryString, Map<String, Object> queryParams);

	/**
	 * 根据指定的属性名及属性值返回一个对象列表
	 * 
	 * @param entityClass
	 * @param name
	 * @param value
	 * @return
	 */
	public List<T> findByProperty(String name, Object value);

	/**
	 * 根据指定的属性名及属性值取返回一个对象
	 * 
	 * @param entityClass
	 * @param name
	 * @param value
	 * @return
	 */
	public T findUniqueResultByProperty(String name, Object value);

	/**
	 * 根据HQL语句返回包含实体的List
	 * 
	 * @param hql
	 *            查询的HQL语句
	 * @return 返回包含查询所得实体的List
	 */
	public List<T> findByHql(String hql);

	/**
	 * 通过HQL查询数据列表
	 * 
	 * @param hql
	 *            查询的hql语句
	 * @param properties
	 *            需要传入的参数
	 * @return 返回包含查询所得实体的List
	 */
	@SuppressWarnings("rawtypes")
	public List findByHql(final String hql, final Map<String, Object> properties);

	/**
	 * 通过HQL查询数据列表 可以转换成需要的Bean
	 * 
	 * @param hql
	 *            查询的hql语句
	 * @param properties
	 *            需要传入的参数
	 * @param cls
	 *            对查询结果需要转换成的Bean
	 * @return 返回包含查询所得实体的List
	 */
	@SuppressWarnings("rawtypes")
	public List findByHqlResultBean(final String hql, final Class cls, final Map<String, Object> properties);

	/**
	 * 通过SQL查询数据列表
	 * 
	 * @param sql
	 *            查询的sql语句
	 * @return 返回包含查询所得实体的List
	 */
	@SuppressWarnings("rawtypes")
	public List findBySql(String sql);

	/**
	 * 通过SQL查询数据列表
	 * 
	 * @param sql
	 *            查询的sql语句
	 * @param properties
	 *            需要传入的参数
	 * @return 返回包含查询所得实体的List
	 */
	@SuppressWarnings("rawtypes")
	public List findBySql(String sql, Map<String, Object> properties);

	/**
	 * 通过SQL查询数据列表 可以转换成需要的Bean
	 * 
	 * @param sql
	 *            查询的sql语句
	 * @param properties
	 *            需要传入的参数
	 * @param cls
	 *            对查询结果需要转换成的Bean
	 * @return 返回包含查询所得实体的List
	 */
	@SuppressWarnings("rawtypes")
	public List findBySqlResultBean(final String sql, final Class cls, final Map<String, Object> properties);

	/**
	 * 通过SQL查询数据列表 自动转换成List<Map<String,Object>>
	 * 
	 * @param sql
	 *            查询的sql语句
	 * @param properties
	 *            需要传入的参数
	 * @return 返回包含查询结果列表
	 */
	@SuppressWarnings({ "rawtypes" })
	public List findBySqlResultMap(final String sql, final Map<String, Object> properties);

	/**
	 * 执行批量更新
	 * 
	 * @param hql
	 *            要执行批量更新的HQL语句
	 * @param params
	 *            参数列表 hql like update User u set u.mobile=18709828223 where
	 *            u.name=? and u.password=? Object[] params={"zhangsan","pass"};
	 * @return
	 */
	public int bulkUpdate(String hql, Object[] params);

	/**
	 * 执行批量更新,没有参数
	 * 
	 * @param hql
	 * @return
	 */
	public int bulkUpdate(String hql);

	/**
	 * 执行批量更新
	 * 
	 * @param hql
	 *            要执行批量更新的HQL语句
	 * @param properties
	 *            参数的key和value对 hql like update User u set u.mobile=18709828223
	 *            where u.name=:name and u.password=:pass
	 *            properties.put("name","zhangsan")
	 *            properties.put("pass","pass")
	 * @return
	 */
	public int bulkUpdate(final String hql, final Map<String, Object> properties);

	/**
	 * 执行批量更新
	 * 
	 * @param sql
	 *            要执行批量更新的SQL语句
	 * @param properties
	 *            参数的key和value对 SQL like update t_user u set
	 *            u.mobile=18709828223 where u.name=:name and u.password=:pass
	 *            properties.put("name","zhangsan")
	 *            properties.put("pass","pass")
	 * @return
	 */
	public int bulkUpdateSql(final String sql, final Map<String, Object> properties);

	/**
	 * 根据HQL语句返回包含实体的自定义分页数据结构PageInfo
	 * 
	 * @param pageIndex
	 *            查询的当前页号，从1开始计数
	 * @param pageSize
	 *            每页所显示的最多记录数
	 * @param hql
	 *            查询的HQL语句，含查询参数
	 * @param params
	 *            hql语句中对应的参数数组
	 * @return 返回当前分页信息的PageInfo对象
	 */
	/*public PageInfo findPageInfoByHql(final int pageIndex, final int pageSize, final String hql,
			final Map<String, Object> properties);*/

	/**
	 * 根据SQL语句返回包含实体的自定义分页数据结构PageInfo
	 * 
	 * @param pageIndex
	 *            查询的当前页号，从1开始计数
	 * @param pageSize
	 *            每页所显示的最多记录数
	 * @param hql
	 *            查询的HQL语句，含查询参数
	 * @param params
	 *            hql语句中对应的参数数组
	 * @return 返回当前分页信息的PageInfo对象
	 */
	/*public PageInfo findPageInfoBySql(final int pageIndex, final int pageSize, final String sql,
			final Map<String, Object> properties);*/

	/**
	 * 根据HQL获取一个唯一的对象
	 * 
	 * @param hql
	 * @param properties
	 * @return
	 * @throws DataAccessException
	 */
	public Object getUniqueBeanResult(final String hql, final Map<String, Object> properties)
			throws DataAccessException;

	/**
	 * 根据SQL获取一个唯一的对象
	 * 
	 * @param sql
	 * @param properties
	 * @return
	 * @throws DataAccessException
	 */
	public Object getUniqueBeanResultBySql(final String sql, final Map<String, Object> properties)
			throws DataAccessException;
	
    /**
     * 保存、更新、删除对象
     * @param entity
     * @param mode save，saveorupdate，delete，update
     * @return
     */
    public Object dealEntity(Object entity, String mode);
    
    /**
     * 通过主键获取对象
     * @param entity
     * @param 
     * @return
     */
    @SuppressWarnings("rawtypes")
    public <S extends Serializable> Object getEntity(Class clazz, S id);
}
