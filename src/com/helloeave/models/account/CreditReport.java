package com.helloeave.models.account;

import java.util.Date;
import java.util.List;

import com.helloeave.models.address.BorrowerAddress;

public class CreditReport {

	private int reporterId;
	private int borrwerId;
	private Date timestamp;
	private Date createdDate;
	private String cycleNumber;
	private int correctionIndicator;
	// Would include below two fields if they are something that can change
	// private String portfolioType;
	// private String accountType;
	private List<BorrowerAddress> borrowerAddress;
	private Date dateOpened;
	private long creditLimit;
	private long highestCreditOrOriginalLoan;
	private String termsDuration;				// Should be an enum
	private String termsFrequency;				// Should be an enum
	private int scheduledMonthlyPaymentAmount;
	private int actualPaymentAmount;
	private String accountStatus;				// Should be an enum
	private String paymentRating;				// Should be an enum
	private List<String> paymentHistory;		// Would be list of enum of the payment ratings
	private String specialComment;
	private String complianceConditionCode;		// Should be an enum
	private long currentBalance;
	private long amountPastDue;
	private long originalChargeOffAmount;
	private Date billingDate;
	private Date fcraComplianceDate;
	private Date dateClosed;
	private Date dateOfLastPayment;
	private String consumerTransactionType;		// Should be an enum
	private String ecoaCode;					// Should be an enum
	private String consumerInformationIndicator;
}
