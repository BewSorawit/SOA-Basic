package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber implements Serializable {
	@JsonProperty("number")
	private String name;

	public PhoneNumber() {
		super();
	}

	public PhoneNumber(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}