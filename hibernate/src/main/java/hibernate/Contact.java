package hibernate;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * Model class for Contact
 */
@Entity
public class Contact implements Serializable {
	
	private static final long serialVersionUID = -7376809874547102466L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer contactId;
	@Column(nullable=true)
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="jc2")
	private List<Address> address;

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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

}