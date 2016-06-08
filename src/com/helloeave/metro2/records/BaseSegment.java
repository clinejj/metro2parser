package com.helloeave.metro2.records;

import java.util.Date;

public class BaseSegment {
	
	private Integer blockDescriptorWord;  		// 4 - 1-4 each block - N
	private Integer recordDescriptorWord;		// 4 - 1-4 each record - N
	private Integer processingIndicator;		// 1 - 5 - N
	private Date timestamp;						// 14 - 6-19 - N
	private Integer correctionIndicator;		// 1 - 20 - N
	private String idNumber;					// 20 - 21-40 - AN
	private String cycleIdentifier;				// 2 - 41-42 - AN
	private String consumerAccountNumber;		// 30 - 43-72 - AN
	private String portfolioType;				// 1 - 73 - AN
	private String accountType;					// 2 - 74-75 - AN
	private Date dateOpened;					// 8 - 76-83 - N
	private Integer creditLimit;				// 9 - 84-92 - N
	private Integer highestCreditOrLoan;		// 9 - 93-101 - N
	private String termsDuration;				// 3 - 102-104 - AN
	private String termsFrequency;				// 1 - 105 - AN
	private Integer scheduledMonthlyPayment;	// 9 - 106-114 - N
	private Integer actualPayment;				// 9 - 115-123 - N
	private String accountStatus;				// 2 - 124-125 - AN
	private String paymentRating;				// 1 - 126 - AN
	private String paymentHistoryProfile;		// 24 - 127-150 - AN
	private String specialComment;				// 2 - 151-152 - AN
	private String complianceConditionCode;		// 2 - 153-154 - AN
	private Integer currentBalance;				// 9 - 155-163 - N
	private Integer amountPastDue;				// 9 - 164-172 - N
	private Integer chargeOffAmount;			// 9 - 173-181 - N
	private Date billingDate;					// 8 - 182-189 - N
	private Date fcraCompliance;				// 8 - 190-197 - N
	private Date dateClosed;					// 8 - 198-205 - N
	private Date dateLastPayment;				// 8 - 206-213 - N
	// Blank fill									17 - 214-230 - AN
	private String consumerTxnType;				// 1 - 231 - AN
	private String surname;						// 25 - 232-256 - AN
	private String firstName;					// 20 - 257-276 - AN
	private String middleName;					// 20 - 277-296 - AN
	private String generationCode;				// 1 - 297 - AN
	private String socialSecurityNumber;		// 9 - 298-306 - N
	private Date dateOfBirth;					// 8 - 307-314 - N
	private String telephoneNumber;				// 10 - 315-324 - N
	private String ecoaCode;					// 1 - 325 - AN
	private String consumerInformationIndicator;// 2 - 326-327 - AN
	private String countryCode;					// 2 - 328-329 - AN
	private String firstLineAddress;			// 32 - 330-361 - AN
	private String secondLineAddress;			// 32 - 362-393 - AN
	private String city;						// 20 - 394-413 - AN
	private String state;						// 2 - 414-415 - AN
	private String postalCode;					// 9 - 416-424 - AN
	private String addressIndicator;			// 1 - 425 - AN
	private String residenceCode;				// 1 - 426 - AN
	
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
