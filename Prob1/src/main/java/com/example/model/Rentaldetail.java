package com.example.model;
// Generated Mar 26, 2024, 9:45:28 AM by Hibernate Tools 3.6.2.Final

/**
 * Rentaldetail generated by hbm2java
 */
public class Rentaldetail implements java.io.Serializable {

	private Integer rdId;
	private Costume costume;
	private Rental rental;

	public Rentaldetail() {
	}

	public Rentaldetail(Costume costume, Rental rental) {
		this.costume = costume;
		this.rental = rental;
	}

	public Integer getRdId() {
		return this.rdId;
	}

	public void setRdId(Integer rdId) {
		this.rdId = rdId;
	}

	public Costume getCostume() {
		return this.costume;
	}

	public void setCostume(Costume costume) {
		this.costume = costume;
	}

	public Rental getRental() {
		return this.rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

}
