package hibernate.service;

import hibernate.dao.AddressDao;
import hibernate.model.Address;
import hibernate.util.HibernateUtil;

import org.hibernate.Session;

public class AddressServiceImpl implements AddressService {
	
	private AddressDao addressDao;
	
	public AddressServiceImpl(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		addressDao = new AddressDao(session);
	}

	@Override
	public Address save(Address address) {
		return addressDao.save(address);
	}

}
