package hibernate.service;

import hibernate.model.Contact;

import java.util.List;

public interface ContactService {
	
	public Contact save(Contact contact);
	
	public Contact load(Long id);
	
	public List<Contact> load(String name);
	
	public List<Contact> loadAll();
	

}
