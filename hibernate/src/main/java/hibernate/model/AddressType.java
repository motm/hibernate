package hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public enum AddressType {
	
	PRIMARY(1L, "primaray"),
	SECONDARY(2L, "secondary"),
	UNKNOWN(3L, "unknown");
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ordinal;
	
	@Column(name="value")
	private String value;
	
	AddressType(Long ordinal, String value) {
		this.ordinal = ordinal;
		this.value = value;
	}
	
	public Long getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(Long ordinal) {
		this.ordinal = ordinal;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
