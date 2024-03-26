package com.example.model;
// Generated Mar 26, 2024, 9:45:28 AM by Hibernate Tools 3.6.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Branches generated by hbm2java
 */
public class Branches implements java.io.Serializable {

	private String branchId;
	private String branchName;
	private String branchAddress;
	private Set userses = new HashSet(0);
	private Set shiftses = new HashSet(0);
	private Set fcdetailses = new HashSet(0);

	public Branches() {
	}

	public Branches(String branchId, String branchName, String branchAddress) {
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
	}

	public Branches(String branchId, String branchName, String branchAddress, Set userses, Set shiftses,
			Set fcdetailses) {
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
		this.userses = userses;
		this.shiftses = shiftses;
		this.fcdetailses = fcdetailses;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return this.branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

	public Set getShiftses() {
		return this.shiftses;
	}

	public void setShiftses(Set shiftses) {
		this.shiftses = shiftses;
	}

	public Set getFcdetailses() {
		return this.fcdetailses;
	}

	public void setFcdetailses(Set fcdetailses) {
		this.fcdetailses = fcdetailses;
	}

}