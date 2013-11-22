package hibernate;

import hibernate.model.Address;
import hibernate.model.AddressType;
import hibernate.model.Contact;
import hibernate.service.ContactService;
import hibernate.service.ContactServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ServiceApp {
	
	

	public static void main(String[] args) {
		
//		AddressService addressService = new AddressServiceImpl();
		ContactService contactService = new ContactServiceImpl();	
		
		Address address = new Address();
		address.setStreet("strasse");
		address.setAddressType(AddressType.PRIMARY);
		
		Address address2 = new Address();
		address2.setStreet("strasse");
		address2.setAddressType(AddressType.SECONDARY);
//		addressService.save(address2);
		
		Contact contact = new Contact();
		contact.setName("Jan");
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address);
		addresses.add(address2);
		contact.setAddress(addresses);
		contactService.save(contact);
		
		Contact jan = contactService.load("Jan").get(0);
		System.out.println(jan.getName());
		System.out.println(jan.getAddress().get(0).getStreet());
		System.out.println(jan.getAddress().get(0).getAddressType());
		

	}

}
