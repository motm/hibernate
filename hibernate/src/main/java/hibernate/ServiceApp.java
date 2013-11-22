package hibernate;

import hibernate.model.Address;
import hibernate.model.AddressType;
import hibernate.model.Contact;
import hibernate.service.AddressTypeService;
import hibernate.service.AddressTypeServiceImpl;
import hibernate.service.ContactService;
import hibernate.service.ContactServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ServiceApp {

	public static void main(String[] args) {

		// AddressService addressService = new AddressServiceImpl();

		// Already exists in DB
		AddressTypeService addressTypeService = new AddressTypeServiceImpl();
		addressTypeService.save(AddressType.PRIMARY);
		addressTypeService.save(AddressType.SECONDARY);
		addressTypeService.save(AddressType.UNKNOWN);
		//

		ContactService contactService = new ContactServiceImpl();

		Address address = new Address();
		address.setStreet("strasse");
//		address.setAddressType(AddressType.PRIMARY);
		AddressType primary = addressTypeService.load(AddressType.PRIMARY.getOrdinal());
		address.setAddressType(primary);

		Address address2 = new Address();
		address2.setStreet("strasse");
//		address2.setAddressType(AddressType.SECONDARY);
		// addressService.save(address2);
		AddressType seondary = addressTypeService.load(AddressType.SECONDARY.getOrdinal());
		address2.setAddressType(seondary);

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
