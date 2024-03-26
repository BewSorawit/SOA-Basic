package th.ac.ku.kps.eng.cpe.soa.model;
// Generated Mar 21, 2024, 1:12:40 PM by Hibernate Tools 3.6.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private Integer cusId;
	private String name;
	private Set phonenumbers = new HashSet(0);

	public Customer() {
	}

	public Customer(String name, Set phonenumbers) {
		this.name = name;
		this.phonenumbers = phonenumbers;
	}

	public Integer getCusId() {
		return this.cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getPhonenumbers() {
		return this.phonenumbers;
	}

	public void setPhonenumbers(Set phonenumbers) {
		this.phonenumbers = phonenumbers;
	}

}
