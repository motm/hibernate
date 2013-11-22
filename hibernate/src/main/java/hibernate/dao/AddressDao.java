package hibernate.dao;

import hibernate.model.Address;

import org.hibernate.Session;

public class AddressDao extends AbstractDao<Address> {

	public AddressDao(Session session) {
		this.session = session;
	}

}
