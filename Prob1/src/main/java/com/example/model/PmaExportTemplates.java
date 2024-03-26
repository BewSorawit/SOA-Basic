package com.example.model;
// Generated Mar 26, 2024, 9:45:28 AM by Hibernate Tools 3.6.2.Final

/**
 * PmaExportTemplates generated by hbm2java
 */
public class PmaExportTemplates implements java.io.Serializable {

	private Integer id;
	private String username;
	private String exportType;
	private String templateName;
	private String templateData;

	public PmaExportTemplates() {
	}

	public PmaExportTemplates(String username, String exportType, String templateName, String templateData) {
		this.username = username;
		this.exportType = exportType;
		this.templateName = templateName;
		this.templateData = templateData;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getExportType() {
		return this.exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateData() {
		return this.templateData;
	}

	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

}
