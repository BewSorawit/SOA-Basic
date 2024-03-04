package th.ac.ku.kps.eng.cpe.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable {
	@JsonProperty("customer_name")
	private String name;

	@JsonProperty("phone_numbers")
	private List<PhoneNumber> phoneNumbers = new ArrayList<>();

	public Customer() {
		super();
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	public Customer(String name, List<PhoneNumber> phoneNumbers) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}

	@JsonProperty("customer_name")
	public String getName() {
		return name;
	}

	@JsonProperty("customer_name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("phone_numbers")
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	@JsonProperty("phone_numbers")
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
}