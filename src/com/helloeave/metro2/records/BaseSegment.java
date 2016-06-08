package com.helloeave.metro2.records;

import java.util.Date;

public class BaseSegment {
	
	private Integer blockDescriptorWord;
	private Integer recordDescriptorWord;
	private Integer processingIndicator;
	private Date timestamp;
	private Integer correctionIndicator;
	private String idNumber;
	private String cycleIdentifier;
	private String consumerAccountNumber;
	private String portfolioType;
	private String accountType;
	private Date dateOpened;
	private Integer creditLimit;
	private Integer highestCreditOrLoan;
	private String termsDuration;
	private String termsFrequency;
	private Integer scheduledMonthlyPayment;
	private Integer actualPayment;
	private String accountStatus;
	private String paymentRating;
	private String paymentHistoryProfile;
	private String specialComment;
	private String complianceConditionCode;
	private Integer currentBalance;
	private Integer amountPastDue;
	private Integer chargeOffAmount;
	private Date billingDate;
	private Date fcraCompliance;
	private Date dateClosed;
	private Date dateLastPayment;
	private String consumerTxnType;
	private String surname;
	private String firstName;
	private String middleName;
	private String generationCode;
	private String socialSecurityNumber;
	private Date dateOfBirth;
	private String telephoneNumber;
	private String ecoaCode;
	private String consumerInformationIndicator;
	private String countryCode;
	private String firstLineAddress;
	private String secondLineAddress;
	private String city;
	private String state;
	private String postalCode;
	private String addressIndicator;
	private String residenceCode;
	
	public String getAccountStatus() {
		return accountStatus;
	}
	
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

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

	public Integer getProcessingIndicator() {
		return processingIndicator;
	}

	public void setProcessingIndicator(Integer processingIndicator) {
		this.processingIndicator = processingIndicator;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getCorrectionIndicator() {
		return correctionIndicator;
	}

	public void setCorrectionIndicator(Integer correctionIndicator) {
		this.correctionIndicator = correctionIndicator;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getCycleIdentifier() {
		return cycleIdentifier;
	}

	public void setCycleIdentifier(String cycleIdentifier) {
		this.cycleIdentifier = cycleIdentifier;
	}

	public String getConsumerAccountNumber() {
		return consumerAccountNumber;
	}

	public void setConsumerAccountNumber(String consumerAccountNumber) {
		this.consumerAccountNumber = consumerAccountNumber;
	}

	public String getPortfolioType() {
		return portfolioType;
	}

	public void setPortfolioType(String portfolioType) {
		this.portfolioType = portfolioType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getDateOpened() {
		return dateOpened;
	}

	public void setDateOpened(Date dateOpened) {
		this.dateOpened = dateOpened;
	}

	public Integer getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Integer creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Integer getHighestCreditOrLoan() {
		return highestCreditOrLoan;
	}

	public void setHighestCreditOrLoan(Integer highestCreditOrLoan) {
		this.highestCreditOrLoan = highestCreditOrLoan;
	}

	public String getTermsDuration() {
		return termsDuration;
	}

	public void setTermsDuration(String termsDuration) {
		this.termsDuration = termsDuration;
	}

	public String getTermsFrequency() {
		return termsFrequency;
	}

	public void setTermsFrequency(String termsFrequency) {
		this.termsFrequency = termsFrequency;
	}

	public Integer getScheduledMonthlyPayment() {
		return scheduledMonthlyPayment;
	}

	public void setScheduledMonthlyPayment(Integer scheduledMonthlyPayment) {
		this.scheduledMonthlyPayment = scheduledMonthlyPayment;
	}

	public Integer getActualPayment() {
		return actualPayment;
	}

	public void setActualPayment(Integer actualPayment) {
		this.actualPayment = actualPayment;
	}

	public String getPaymentRating() {
		return paymentRating;
	}

	public void setPaymentRating(String paymentRating) {
		this.paymentRating = paymentRating;
	}

	public String getPaymentHistoryProfile() {
		return paymentHistoryProfile;
	}

	public void setPaymentHistoryProfile(String paymentHistoryProfile) {
		this.paymentHistoryProfile = paymentHistoryProfile;
	}

	public String getSpecialComment() {
		return specialComment;
	}

	public void setSpecialComment(String specialComment) {
		this.specialComment = specialComment;
	}

	public String getComplianceConditionCode() {
		return complianceConditionCode;
	}

	public void setComplianceConditionCode(String complianceConditionCode) {
		this.complianceConditionCode = complianceConditionCode;
	}

	public Integer getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Integer currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Integer getAmountPastDue() {
		return amountPastDue;
	}

	public void setAmountPastDue(Integer amountPastDue) {
		this.amountPastDue = amountPastDue;
	}

	public Integer getChargeOffAmount() {
		return chargeOffAmount;
	}

	public void setChargeOffAmount(Integer chargeOffAmount) {
		this.chargeOffAmount = chargeOffAmount;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public Date getFcraCompliance() {
		return fcraCompliance;
	}

	public void setFcraCompliance(Date fcraCompliance) {
		this.fcraCompliance = fcraCompliance;
	}

	public Date getDateClosed() {
		return dateClosed;
	}

	public void setDateClosed(Date dateClosed) {
		this.dateClosed = dateClosed;
	}

	public Date getDateLastPayment() {
		return dateLastPayment;
	}

	public void setDateLastPayment(Date dateLastPayment) {
		this.dateLastPayment = dateLastPayment;
	}

	public String getConsumerTxnType() {
		return consumerTxnType;
	}

	public void setConsumerTxnType(String consumerTxnType) {
		this.consumerTxnType = consumerTxnType;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getGenerationCode() {
		return generationCode;
	}

	public void setGenerationCode(String generationCode) {
		this.generationCode = generationCode;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEcoaCode() {
		return ecoaCode;
	}

	public void setEcoaCode(String ecoaCode) {
		this.ecoaCode = ecoaCode;
	}

	public String getConsumerInformationIndicator() {
		return consumerInformationIndicator;
	}

	public void setConsumerInformationIndicator(String consumerInformationIndicator) {
		this.consumerInformationIndicator = consumerInformationIndicator;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getFirstLineAddress() {
		return firstLineAddress;
	}

	public void setFirstLineAddress(String firstLineAddress) {
		this.firstLineAddress = firstLineAddress;
	}

	public String getSecondLineAddress() {
		return secondLineAddress;
	}

	public void setSecondLineAddress(String secondLineAddress) {
		this.secondLineAddress = secondLineAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddressIndicator() {
		return addressIndicator;
	}

	public void setAddressIndicator(String addressIndicator) {
		this.addressIndicator = addressIndicator;
	}

	public String getResidenceCode() {
		return residenceCode;
	}

	public void setResidenceCode(String residenceCode) {
		this.residenceCode = residenceCode;
	}
	
}
