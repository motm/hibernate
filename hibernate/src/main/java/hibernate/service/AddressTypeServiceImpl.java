package hibernate.service;

import hibernate.dao.AddressTypeDao;
import hibernate.model.AddressType;
import hibernate.util.HibernateUtil;

import org.hibernate.Session;

public class AddressTypeServiceImpl implements AddressTypeService {
	
	private AddressTypeDao addressTypeDao;
	
	public AddressTypeServiceImpl(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		addressTypeDao = new AddressTypeDao(session);
	}

	@Override
	public AddressType save(AddressType address) {
		return addressTypeDao.save(address);
	}

	@Override
	public AddressType load(Long id) {
		return addressTypeDao.load(id);
	}

}
