package com.helloeave.metro2.records;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Header {
	
	public static final DateFormat DATE_FORMAT = new SimpleDateFormat("MMddYYYY");
	
	// Comments represent LEN - Position - Technique
	private Integer blockDescriptorWord;  		// 4 - 1-4 each block - N
	private Integer recordDescriptorWord;		// 4 - 1-4 each record - N
	private String recordId;					// 6 - 5-10 - AN
	private String cycleNumber;					// 2 - 11-12 - AN
	private String innovisProgramId;			// 10 - 13-22 - AN
	private String equifaxProgramId;			// 10 - 23-32 - AN
	private String experianProgramId;			// 5 - 33-37 - AN
	private String transunionProgramId;			// 10 - 38-47 - AN
	private Date activityDate;					// 8 - 48-55 - N
	private Date createdDate;					// 8 - 56-63 - N
	private Date programDate;					// 8 - 64-71 - N
	private Date programRevisionDate;			// 8 - 72-79 - N
	private String reporterName;				// 40 - 80-119 - AN
	private String reporterAddress;				// 96 - 120-215 - AN
	private String reporterPhoneNumber;			// 10 - 216-225 - N
	private String softwareVendorName;			// 40 - 226-265 - AN
	private String softwareVersionNumber;		// 5 - 266-270 - AN
	// Blank fill									156 - 271-426 - AN
	
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
