package hibernate;

import hibernate.model.Contact;
import hibernate.service.ContactService;
import hibernate.service.ContactServiceImpl;

import java.util.List;

public class ServiceApp {

	public static void main(String[] args) {

		ContactService contactService = new ContactServiceImpl();

		Contact contact = new Contact("Jiya");
		Contact contact2 = new Contact("Manisha");
		Contact contact3 = new Contact("Riya");

		contactService.save(contact);
		contactService.save(contact2);
		contactService.save(contact3);

		List<Contact> contacts = contactService.loadAll();
		for (Contact c : contacts) {
			System.out.println(c.getName());
		}

	}

}
