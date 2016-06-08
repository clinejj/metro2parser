package com.helloeave.metro2.records;

import java.util.Date;

public class Header {
	
	private Integer blockDescriptorWord;
	private Integer recordDescriptorWord;
	private String recordId;
	private String cycleNumber;
	private String innovisProgramId;
	private String equifaxProgramId;
	private String experianProgramId;
	private String transunionProgramId;
	private Date activityDate;
	private Date createdDate;
	private Date programDate;
	private Date programRevisionDate;
	private String reporterName;
	private String reporterAddress;
	private String reporterPhoneNumber;
	private String softwareVendorName;
	private String softwareVersionNumber;
	
	public Integer getBlockDescriptorWord() {
		return blockDescriptorWord;
	}
	
	public void setBlockDescriptorWord(Integer blockDescriptorWord) {
		this.blockDescriptorWord = blockDescriptorWord;
	}
	
	public Integer getRecordDescriptorWord() {
		return recordDescriptorWord;
	}
	
	public void setRecordDescriptorWord(Integer recordDescriptorWord) {
		this.recordDescriptorWord = recordDescriptorWord;
	}
	
	public String getRecordId() {
		return recordId;
	}
	
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	
	public String getCycleNumber() {
		return cycleNumber;
	}
	
	public void setCycleNumber(String cycleNumber) {
		this.cycleNumber = cycleNumber;
	}
	
	public String getInnovisProgramId() {
		return innovisProgramId;
	}
	
	public void setInnovisProgramId(String innovisProgramId) {
		this.innovisProgramId = innovisProgramId;
	}
	
	public String getEquifaxProgramId() {
		return equifaxProgramId;
	}
	
	public void setEquifaxProgramId(String equifaxProgramId) {
		this.equifaxProgramId = equifaxProgramId;
	}
	
	public String getExperianProgramId() {
		return experianProgramId;
	}
	
	public void setExperianProgramId(String experianProgramId) {
		this.experianProgramId = experianProgramId;
	}
	
	public String getTransunionProgramId() {
		return transunionProgramId;
	}
	
	public void setTransunionProgramId(String transunionProgramId) {
		this.transunionProgramId = transunionProgramId;
	}
	
	public Date getActivityDate() {
		return activityDate;
	}
	
	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Date getProgramDate() {
		return programDate;
	}
	
	public void setProgramDate(Date programDate) {
		this.programDate = programDate;
	}
	
	public Date getProgramRevisionDate() {
		return programRevisionDate;
	}
	
	public void setProgramRevisionDate(Date programRevisionDate) {
		this.programRevisionDate = programRevisionDate;
	}
	
	public String getReporterName() {
		return reporterName;
	}
	
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}
	
	public String getReporterAddress() {
		return reporterAddress;
	}
	
	public void setReporterAddress(String reporterAddress) {
		this.reporterAddress = reporterAddress;
	}
	
	public String getReporterPhoneNumber() {
		return reporterPhoneNumber;
	}
	
	public void setReporterPhoneNumber(String reporterPhoneNumber) {
		this.reporterPhoneNumber = reporterPhoneNumber;
	}
	
	public String getSoftwareVendorName() {
		return softwareVendorName;
	}
	
	public void setSoftwareVendorName(String softwareVendorName) {
		this.softwareVendorName = softwareVendorName;
	}
	
	public String getSoftwareVersionNumber() {
		return softwareVersionNumber;
	}
	
	public void setSoftwareVersionNumber(String softwareVersionNumber) {
		this.softwareVersionNumber = softwareVersionNumber;
	}
}
