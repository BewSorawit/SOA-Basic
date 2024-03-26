package com.example.model;
// Generated Mar 26, 2024, 9:45:28 AM by Hibernate Tools 3.6.2.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rental generated by hbm2java
 */
public class Rental implements java.io.Serializable {

	private Integer rentalId;
	private Userrantal userrantalByCusId;
	private Userrantal userrantalByEmpId;
	private Date orderDate;
	private Date dueDate;
	private Date returnDate;
	private String rentStatus;
	private String paymentStatus;
	private Set rentaldetails = new HashSet(0);
	private Set rentaldetails_1 = new HashSet(0);

	public Rental() {
	}

	public Rental(Userrantal userrantalByCusId, Date orderDate, String rentStatus, String paymentStatus) {
		this.userrantalByCusId = userrantalByCusId;
		this.orderDate = orderDate;
		this.rentStatus = rentStatus;
		this.paymentStatus = paymentStatus;
	}

	public Rental(Userrantal userrantalByCusId, Userrantal userrantalByEmpId, Date orderDate, Date dueDate,
			Date returnDate, String rentStatus, String paymentStatus, Set rentaldetails, Set rentaldetails_1) {
		this.userrantalByCusId = userrantalByCusId;
		this.userrantalByEmpId = userrantalByEmpId;
		this.orderDate = orderDate;
		this.dueDate = dueDate;
		this.returnDate = returnDate;
		this.rentStatus = rentStatus;
		this.paymentStatus = paymentStatus;
		this.rentaldetails = rentaldetails;
		this.rentaldetails_1 = rentaldetails_1;
	}

	public Integer getRentalId() {
		return this.rentalId;
	}

	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}

	public Userrantal getUserrantalByCusId() {
		return this.userrantalByCusId;
	}

	public void setUserrantalByCusId(Userrantal userrantalByCusId) {
		this.userrantalByCusId = userrantalByCusId;
	}

	public Userrantal getUserrantalByEmpId() {
		return this.userrantalByEmpId;
	}

	public void setUserrantalByEmpId(Userrantal userrantalByEmpId) {
		this.userrantalByEmpId = userrantalByEmpId;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getRentStatus() {
		return this.rentStatus;
	}

	public void setRentStatus(String rentStatus) {
		this.rentStatus = rentStatus;
	}

	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Set getRentaldetails() {
		return this.rentaldetails;
	}

	public void setRentaldetails(Set rentaldetails) {
		this.rentaldetails = rentaldetails;
	}

	public Set getRentaldetails_1() {
		return this.rentaldetails_1;
	}

	public void setRentaldetails_1(Set rentaldetails_1) {
		this.rentaldetails_1 = rentaldetails_1;
	}

}