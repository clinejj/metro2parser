package com.helloeave.models.account;

import java.util.Date;
import java.util.List;

import com.helloeave.models.address.BorrowerAddress;

public class Account {

	// Assumed unchanging fields (meaning these would not change for a given report)
	private long id;
	private String identificationNumber;
	private String consumerAccountNumber;
	private String portfolioType;				// Should be an enum
	private String accountType;
	private int lenderId;
	private int originalLenderId;
	private List<Integer> borrowerId;
	private Date dateOpened;
	
	// Below fields that would be modified when a new report comes in with latest information.
	// There could be an argument that these shouldn't be replicated in the account, and rather
	// look them up in the latest report. I think when it comes to storing the data in a datastore
	// that's a good argument, since the information could be combined in a JOIN and there are
	// good concerns about write frequencies between the accounts and reports. I think below
	// structure would make sense for application level data models.
	private BorrowerAddress borrowerAddress;
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
	private Date billingDate;
	private Date fcraComplianceDate;
	private Date dateClosed;
	private Date dateOfLastPayment;
	private String ecoaCode;					// Should be an enum
	private String consumerInformationIndicator;
	private List<CreditReport> reports;
}
