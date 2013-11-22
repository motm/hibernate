package hibernate.dao;

import hibernate.model.AddressType;

import org.hibernate.Session;

public class AddressTypeDao extends AbstractDao<AddressType> {

	public AddressTypeDao(Session session) {
		this.session = session;
	}

}
