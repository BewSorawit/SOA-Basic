package com.example.model;
// Generated Mar 26, 2024, 9:45:28 AM by Hibernate Tools 3.6.2.Final

/**
 * PmaFavorite generated by hbm2java
 */
public class PmaFavorite implements java.io.Serializable {

	private String username;
	private String tables;

	public PmaFavorite() {
	}

	public PmaFavorite(String username, String tables) {
		this.username = username;
		this.tables = tables;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTables() {
		return this.tables;
	}

	public void setTables(String tables) {
		this.tables = tables;
	}

}
