package com.example.model;
// Generated Mar 26, 2024, 9:45:28 AM by Hibernate Tools 3.6.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Costume generated by hbm2java
 */
public class Costume implements java.io.Serializable {

	private Integer costumeId;
	private Costumetype costumetype;
	private String costumeName;
	private String status;
	private Set rentaldetails = new HashSet(0);

	public Costume() {
	}

	public Costume(String costumeName, String status) {
		this.costumeName = costumeName;
		this.status = status;
	}

	public Costume(Costumetype costumetype, String costumeName, String status, Set rentaldetails) {
		this.costumetype = costumetype;
		this.costumeName = costumeName;
		this.status = status;
		this.rentaldetails = rentaldetails;
	}

	public Integer getCostumeId() {
		return this.costumeId;
	}

	public void setCostumeId(Integer costumeId) {
		this.costumeId = costumeId;
	}

	public Costumetype getCostumetype() {
		return this.costumetype;
	}

	public void setCostumetype(Costumetype costumetype) {
		this.costumetype = costumetype;
	}

	public String getCostumeName() {
		return this.costumeName;
	}

	public void setCostumeName(String costumeName) {
		this.costumeName = costumeName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getRentaldetails() {
		return this.rentaldetails;
	}

	public void setRentaldetails(Set rentaldetails) {
		this.rentaldetails = rentaldetails;
	}

}
