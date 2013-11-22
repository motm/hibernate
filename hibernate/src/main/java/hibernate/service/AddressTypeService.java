package hibernate.service;


import hibernate.model.AddressType;

public interface AddressTypeService {
	
	public AddressType save(AddressType address);
	
	public AddressType load(Long id);	

}
