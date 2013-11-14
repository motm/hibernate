package hibernate;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Model class for Contact
 */
@Entity
public class Contact implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7376809874547102466L;
	
	private Integer contactId;
	private String name;

	public Contact() {

	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}