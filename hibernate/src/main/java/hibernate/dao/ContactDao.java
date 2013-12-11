package hibernate.dao;

import hibernate.model.Contact;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ContactDao extends AbstractDao<Contact> {

	public ContactDao(Session session) {
		this.session = session;
	}
	
	@SuppressWarnings("unchecked")
	public List<Contact> load(String name){
		Criteria criteria = session.createCriteria(Contact.class);
		return criteria.add(Restrictions.like("name", name)).list();
	}

	@SuppressWarnings("unchecked")
	public List<Contact> loadAll() {
		Criteria criteria = session.createCriteria(Contact.class);
		return criteria.list();
	}

}
