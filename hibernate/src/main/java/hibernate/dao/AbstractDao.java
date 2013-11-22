package hibernate.dao;

import java.lang.reflect.ParameterizedType;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

abstract class AbstractDao<T> {
	
	protected Session session;
	private Class<T> type;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public T save(T object) {
		session.beginTransaction();
		Transaction transaction = null;
		try {
			transaction = session.getTransaction();
			session.save(object);
			transaction.commit();
			return object;
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			return null;
		} finally {
			
		}
	}

	@SuppressWarnings("unchecked")
	public T load(Long id) {
			return (T) session.load(type, id);
	}

}
