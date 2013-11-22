package hibernate;

import hibernate.dao.AddressDao;
import hibernate.model.Address;
import hibernate.util.HibernateUtil;

import org.hibernate.Session;

public class DaoApp {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		AddressDao addressDao = new AddressDao(session);
		Address address = new Address();
		address.setStreet("strasse");
		Address savedObject = addressDao.save(address);
		Address loadedObject = addressDao.load(savedObject.getId());
		System.out.println(loadedObject.getStreet());
		
		session.close();
	}

}
