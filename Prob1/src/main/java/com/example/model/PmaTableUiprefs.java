package com.example.model;
// Generated Mar 26, 2024, 9:45:28 AM by Hibernate Tools 3.6.2.Final

import java.util.Date;

/**
 * PmaTableUiprefs generated by hbm2java
 */
public class PmaTableUiprefs implements java.io.Serializable {

	private PmaTableUiprefsId id;
	private String prefs;
	private Date lastUpdate;

	public PmaTableUiprefs() {
	}

	public PmaTableUiprefs(PmaTableUiprefsId id, String prefs, Date lastUpdate) {
		this.id = id;
		this.prefs = prefs;
		this.lastUpdate = lastUpdate;
	}

	public PmaTableUiprefsId getId() {
		return this.id;
	}

	public void setId(PmaTableUiprefsId id) {
		this.id = id;
	}

	public String getPrefs() {
		return this.prefs;
	}

	public void setPrefs(String prefs) {
		this.prefs = prefs;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}