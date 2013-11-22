package hibernate.service;

import hibernate.dao.ContactDao;
import hibernate.model.Contact;
import hibernate.util.HibernateUtil;

import java.util.List;

import org.hibernate.Session;

public class ContactServiceImpl implements ContactService {
	
	private ContactDao contactDao;
	
	public ContactServiceImpl(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		contactDao = new ContactDao(session);
	}


	@Override
	public List<Contact> load(String name) {
		return contactDao.load(name);
	}


	@Override
	public Contact save(Contact contact) {
		return contactDao.save(contact);
	}


	@Override
	public Contact load(Long id) {
		return contactDao.load(id);
	}




}
