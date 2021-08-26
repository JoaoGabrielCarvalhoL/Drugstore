package br.com.carv.drugstore.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.carv.drugstore.util.HibernateUtil;

public class AbstractDao<Entity> {
	
	private Class<Entity> originClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao() {
		this.originClass = (Class<Entity>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public void save(Entity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null; 
		
		try {
			
			transaction = session.beginTransaction();
			session.save(entity); 
			transaction.commit();
			
		}catch (RuntimeException error) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw error; 
		} finally {
			session.close(); 
		}
	}
	
	public List<Entity> toList() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			@SuppressWarnings("deprecation")
			Criteria query = session.createCriteria(originClass);
			@SuppressWarnings("unchecked")
			List<Entity> result = query.list();
			return result;
			
		} catch (RuntimeException error) {
			throw error;
		}finally {
			session.close();
		}
	}
	
	public Entity findById(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		
		try {
			@SuppressWarnings("deprecation")
			Criteria query = session.createCriteria(originClass);
			query.add(Restrictions.idEq(id));
			
			@SuppressWarnings("unchecked")
			Entity entity = (Entity) query.uniqueResult();
			return entity;
			
			
		} catch (RuntimeException error) {
			throw error;
		}finally {
			session.close();
		}
	}
	
	public void deleteEntity(Entity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			session.delete(entity);
			transaction.commit();
			
		} catch (RuntimeException error) {
			throw error;
		}finally {
			session.close();
			
		}
	}
	
	public void updateEntity(Entity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			session.update(entity);
			transaction.commit();
			
		} catch (RuntimeException error) {
			throw error;
		}finally {
			session.close();
		}
	}
}
