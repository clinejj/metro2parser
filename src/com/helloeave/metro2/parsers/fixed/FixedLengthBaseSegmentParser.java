package com.helloeave.metro2.parsers.fixed;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Date;

import com.helloeave.metro2.parsers.BaseParser;
import com.helloeave.metro2.parsers.ParseException;
import com.helloeave.metro2.records.BaseSegment;

public class FixedLengthBaseSegmentParser extends AbstractFixedLengthParser implements BaseParser {

	private byte[] blockDescriptorWord  			= new byte[4];	// 4 - 1-4 each block - N
	private byte[] recordDescriptorWord			= new byte[4];	// 4 - 1-4 each record - N
	private byte[] processingIndicator			= new byte[1];	// 1 - 5 - N
	private byte[] timestamp				= new byte[14];	// 14 - 6-19 - N
	private byte[] correctionIndicator			= new byte[1];	// 1 - 20 - N
	private byte[] idNumber					= new byte[20];	// 20 - 21-40 - AN
	private byte[] cycleIdentifier				= new byte[2];	// 2 - 41-42 - AN
	private byte[] consumerAccountNumber			= new byte[30];	// 30 - 43-72 - AN
	private byte[] portfolioType				= new byte[1];	// 1 - 73 - AN
	private byte[] accountType				= new byte[2];	// 2 - 74-75 - AN
	private byte[] dateOpened				= new byte[8];	// 8 - 76-83 - N
	private byte[] creditLimit				= new byte[9];	// 9 - 84-92 - N
	private byte[] highestCreditOrLoan			= new byte[9];	// 9 - 93-101 - N
	private byte[] termsDuration				= new byte[3];	// 3 - 102-104 - AN
	private byte[] termsFrequency				= new byte[1];	// 1 - 105 - AN
	private byte[] scheduledMonthlyPayment			= new byte[9];	// 9 - 106-114 - N
	private byte[] actualPayment				= new byte[9];	// 9 - 115-123 - N
	private byte[] accountStatus				= new byte[2];	// 2 - 124-125 - AN
	private byte[] paymentRating				= new byte[1];	// 1 - 126 - AN
	private byte[] paymentHistoryProfile			= new byte[24];	// 24 - 127-150 - AN
	private byte[] specialComment				= new byte[2];	// 2 - 151-152 - AN
	private byte[] complianceConditionCode			= new byte[2];	// 2 - 153-154 - AN
	private byte[] currentBalance				= new byte[9];	// 9 - 155-163 - N
	private byte[] amountPastDue				= new byte[9];	// 9 - 164-172 - N
	private byte[] chargeOffAmount				= new byte[9];	// 9 - 173-181 - N
	private byte[] billingDate				= new byte[8];	// 8 - 182-189 - N
	private byte[] fcraCompliance				= new byte[8];	// 8 - 190-197 - N
	private byte[] dateClosed				= new byte[8];	// 8 - 198-205 - N
	private byte[] dateLastPayment				= new byte[8];	// 8 - 206-213 - N
	private byte[] blankFill				= new byte[17];	// 17 - 214-230 - AN
	private byte[] consumerTxnType				= new byte[1];	// 1 - 231 - AN
	private byte[] surname					= new byte[25];	// 25 - 232-256 - AN
	private byte[] firstName				= new byte[20];	// 20 - 257-276 - AN
	private byte[] middleName				= new byte[20];	// 20 - 277-296 - AN
	private byte[] generationCode				= new byte[1];	// 1 - 297 - AN
	private byte[] socialSecurityNumber			= new byte[9];	// 9 - 298-306 - N
	private byte[] dateOfBirth				= new byte[8];	// 8 - 307-314 - N
	private byte[] telephoneNumber				= new byte[10];	// 10 - 315-324 - N
	private byte[] ecoaCode					= new byte[1];	// 1 - 325 - AN
	private byte[] consumerInformationIndicator		= new byte[2];	// 2 - 326-327 - AN
	private byte[] countryCode				= new byte[2];	// 2 - 328-329 - AN
	private byte[] firstLineAddress				= new byte[32];	// 32 - 330-361 - AN
	private byte[] secondLineAddress			= new byte[32];	// 32 - 362-393 - AN
	private byte[] city					= new byte[20];	// 20 - 394-413 - AN
	private byte[] state					= new byte[2];	// 2 - 414-415 - AN
	private byte[] postalCode				= new byte[9];	// 9 - 416-424 - AN
	private byte[] addressIndicator				= new byte[1];	// 1 - 425 - AN
	private byte[] residenceCode				= new byte[1];	// 1 - 426 - AN
	
	private BaseSegment segment = new BaseSegment();
	
	private DataInputStream in;
	
	@Override
	public BaseSegment parseBaseSegment(DataInputStream in) throws ParseException {
		this.in = in;
		this.segment.setBlockDescriptorWord(parseBlockDescriptorWord());
		this.segment.setRecordDescriptorWord(parseRecordDescriptorWord());
		this.segment.setProcessingIndicator(parseProcessingIndicator());
		this.segment.setTimestamp(parseTimestamp());
		this.segment.setCorrectionIndicator(parseCorrectionIndicator());
		this.segment.setIdNumber(parseIdNumber());
		this.segment.setCycleIdentifier(parsecCycleIdentifier());
		this.segment.setConsumerAccountNumber(parseConsumerAccountNumber());
		this.segment.setPortfolioType(parsePortfolioType());
		this.segment.setAccountType(parseAccountType());
		this.segment.setDateOpened(parseDateOpened());
		this.segment.setCreditLimit(parseCreditLimit());
		this.segment.setHighestCreditOrLoan(parseHighestCreditOrLoan());
		this.segment.setTermsDuration(parseTermsDuration());
		this.segment.setTermsFrequency(parseTermsFrequency());
		this.segment.setScheduledMonthlyPayment(parseScheduledMonthlyPayment());
		this.segment.setActualPayment(parseActualPayment());
		this.segment.setAccountStatus(parseAccountStatus());
		this.segment.setPaymentRating(parsePaymentRating());
		this.segment.setPaymentHistoryProfile(parsePaymentHistoryProfile());
		this.segment.setSpecialComment(parseSpecialComment());
		this.segment.setComplianceConditionCode(parseComplianceConditionCode());
		this.segment.setCurrentBalance(parseCurrentBalance());
		this.segment.setAmountPastDue(parseAmountPastDue());
		this.segment.setChargeOffAmount(parseChargeOffAmount());
		this.segment.setBillingDate(parseBillingDate());
		this.segment.setFcraCompliance(parseFcraCompliance());
		this.segment.setDateClosed(parseDateClosed());
		this.segment.setDateLastPayment(parseDateLastPayment());
		parseReserved();
		this.segment.setConsumerTxnType(parseConsumerTxnType());
		this.segment.setSurname(parseSurname());
		this.segment.setFirstName(parseFirstName());
		this.segment.setMiddleName(parseMiddleName());
		this.segment.setGenerationCode(parseGenerationCode());
		this.segment.setSocialSecurityNumber(parseSocialSecurityNumber());
		this.segment.setDateOfBirth(parseDateOfBirth());
		this.segment.setTelephoneNumber(parseTelephoneNumber());
		this.segment.setEcoaCode(parseEcoaCode());
		this.segment.setConsumerInformationIndicator(parseConsumerInformationIndicator());
		this.segment.setCountryCode(parseCountryCode());
		this.segment.setFirstLineAddress(parseFirstLineAddress());
		this.segment.setSecondLineAddress(parseSecondLineAddress());
		this.segment.setCity(parseCity());
		this.segment.setState(parseState());
		this.segment.setPostalCode(parsePostalCode());
		this.segment.setAddressIndicator(parseAddressIndicator());
		this.segment.setResidenceCode(parseResidenceCode());
		return this.segment;
	}

	private Integer parseBlockDescriptorWord() throws BaseSegmentParseException {
		try {
			in.readFully(this.blockDescriptorWord);
			return parseInteger(this.blockDescriptorWord);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing block descriptor word", e);
		}
	}

	private Integer parseRecordDescriptorWord() throws BaseSegmentParseException {
		try {
			in.readFully(this.recordDescriptorWord);
			return parseInteger(this.recordDescriptorWord);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing record description word", e);
		}
	}

	private Integer parseProcessingIndicator() throws BaseSegmentParseException {
		try {
			in.readFully(this.processingIndicator);
			return parseInteger(this.processingIndicator);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing processing indicator", e);
		}
	}

	private Date parseTimestamp() throws BaseSegmentParseException {
		try {
			in.readFully(this.timestamp);
			return parseDateTime(this.timestamp);
		} catch (IOException | java.text.ParseException e) {
			throw new BaseSegmentParseException("Error parsing timestamp", e);
		}
	}

	private Integer parseCorrectionIndicator() throws BaseSegmentParseException {
		try {
			in.readFully(this.correctionIndicator);
			return parseInteger(this.correctionIndicator);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing correction indicator", e);
		}
	}

	private String parseIdNumber() throws BaseSegmentParseException {
		try {
			in.readFully(this.idNumber);
			return parseString(this.idNumber);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing ID number", e);
		}
	}

	private String parsecCycleIdentifier() throws BaseSegmentParseException {
		try {
			in.readFully(this.cycleIdentifier);
			return parseString(this.cycleIdentifier);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing cycle identifier", e);
		}
	}

	private String parseConsumerAccountNumber() throws BaseSegmentParseException {
		try {
			in.readFully(this.consumerAccountNumber);
			return parseString(this.consumerAccountNumber);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing consumer account number", e);
		}
	}

	private String parsePortfolioType() throws BaseSegmentParseException {
		try {
			in.readFully(this.portfolioType);
			return parseString(this.portfolioType);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing portfolio type", e);
		}
	}

	private String parseAccountType() throws BaseSegmentParseException {
		try {
			in.readFully(this.accountType);
			return parseString(this.accountType);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing account type", e);
		}
	}

	private Date parseDateOpened() throws BaseSegmentParseException {
		try {
			in.readFully(this.dateOpened);
			return parseDate(this.dateOpened);
		} catch (IOException | java.text.ParseException e) {
			throw new BaseSegmentParseException("Error parsing date opened", e);
		}
	}

	private Integer parseCreditLimit() throws BaseSegmentParseException {
		try {
			in.readFully(this.creditLimit);
			return parseInteger(this.creditLimit);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing credit limit", e);
		}
	}

	private Integer parseHighestCreditOrLoan() throws BaseSegmentParseException {
		try {
			in.readFully(this.highestCreditOrLoan);
			return parseInteger(this.highestCreditOrLoan);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing highest credit or loan", e);
		}
	}

	private String parseTermsDuration() throws BaseSegmentParseException {
		try {
			in.readFully(this.termsDuration);
			return parseString(this.termsDuration);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing terms duration", e);
		}
	}

	private String parseTermsFrequency() throws BaseSegmentParseException {
		try {
			in.readFully(this.termsFrequency);
			return parseString(this.termsFrequency);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing terms frequency", e);
		}
	}

	private Integer parseScheduledMonthlyPayment() throws BaseSegmentParseException {
		try {
			in.readFully(this.scheduledMonthlyPayment);
			return parseInteger(this.scheduledMonthlyPayment);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing scheduled monthly payment amount", e);
		}
	}

	private Integer parseActualPayment() throws BaseSegmentParseException {
		try {
			in.readFully(this.actualPayment);
			return parseInteger(this.actualPayment);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing actual payment", e);
		}
	}

	private String parseAccountStatus() throws BaseSegmentParseException {
		try {
			in.readFully(this.accountStatus);
			return parseString(this.accountStatus);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing account status", e);
		}
	}

	private String parsePaymentRating() throws BaseSegmentParseException {
		try {
			in.readFully(this.paymentRating);
			return parseString(this.paymentRating);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing payment rating", e);
		}
	}

	private String parsePaymentHistoryProfile() throws BaseSegmentParseException {
		try {
			in.readFully(this.paymentHistoryProfile);
			return parseString(this.paymentHistoryProfile);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing payment history profile", e);
		}
	}

	private String parseSpecialComment() throws BaseSegmentParseException {
		try {
			in.readFully(this.specialComment);
			return parseString(this.specialComment);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing special comment", e);
		}
	}

	private String parseComplianceConditionCode() throws BaseSegmentParseException {
		try {
			in.readFully(this.complianceConditionCode);
			return parseString(this.complianceConditionCode);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing compliance condition code", e);
		}
	}

	private Integer parseCurrentBalance() throws BaseSegmentParseException {
		try {
			in.readFully(this.currentBalance);
			return parseInteger(this.currentBalance);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing current balance", e);
		}
	}

	private Integer parseAmountPastDue() throws BaseSegmentParseException {
		try {
			in.readFully(this.amountPastDue);
			return parseInteger(this.amountPastDue);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing amount past due", e);
		}
	}

	private Integer parseChargeOffAmount() throws BaseSegmentParseException {
		try {
			in.readFully(this.chargeOffAmount);
			return parseInteger(this.chargeOffAmount);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing charge off amount", e);
		}
	}

	private Date parseBillingDate() throws BaseSegmentParseException {
		try {
			in.readFully(this.billingDate);
			return parseDate(this.billingDate);
		} catch (IOException | java.text.ParseException e) {
			throw new BaseSegmentParseException("Error parsing billing date", e);
		}
	}

	private Date parseFcraCompliance() throws BaseSegmentParseException {
		try {
			in.readFully(this.fcraCompliance);
			return parseDate(this.fcraCompliance);
		} catch (IOException | java.text.ParseException e) {
			throw new BaseSegmentParseException("Error parsing FCRA compliance date", e);
		}
	}

	private Date parseDateClosed() throws BaseSegmentParseException {
		try {
			in.readFully(this.dateClosed);
			return parseDate(this.dateClosed);
		} catch (IOException | java.text.ParseException e) {
			throw new BaseSegmentParseException("Error parsing date closed", e);
		}
	}

	private Date parseDateLastPayment() throws BaseSegmentParseException {
		try {
			in.readFully(this.dateLastPayment);
			return parseDate(this.dateLastPayment);
		} catch (IOException | java.text.ParseException e) {
			throw new BaseSegmentParseException("Error parsing date of last payment", e);
		}
	}

	private void parseReserved() throws BaseSegmentParseException {
		try {
			in.readFully(this.blankFill);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing reserved", e);
		}
	}

	private String parseConsumerTxnType() throws BaseSegmentParseException {
		try {
			in.readFully(this.consumerTxnType);
			return parseString(this.consumerTxnType);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing consumer transaction type", e);
		}
	}

	private String parseSurname() throws BaseSegmentParseException {
		try {
			in.readFully(this.surname);
			return parseString(this.surname);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing surname", e);
		}
	}

	private String parseFirstName() throws BaseSegmentParseException {
		try {
			in.readFully(this.firstName);
			return parseString(this.firstName);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing first name", e);
		}
	}

	private String parseMiddleName() throws BaseSegmentParseException {
		try {
			in.readFully(this.middleName);
			return parseString(this.middleName);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing middle name", e);
		}
	}

	private String parseGenerationCode() throws BaseSegmentParseException {
		try {
			in.readFully(this.generationCode);
			return parseString(this.generationCode);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing generation code", e);
		}
	}

	private String parseSocialSecurityNumber() throws BaseSegmentParseException {
		try {
			in.readFully(this.socialSecurityNumber);
			return parseString(this.socialSecurityNumber);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing social security number", e);
		}
	}

	private Date parseDateOfBirth() throws BaseSegmentParseException {
		try {
			in.readFully(this.dateOfBirth);
			return parseDate(this.dateOfBirth);
		} catch (IOException | java.text.ParseException e) {
			throw new BaseSegmentParseException("Error parsing date of birth", e);
		}
	}

	private String parseTelephoneNumber() throws BaseSegmentParseException {
		try {
			in.readFully(this.telephoneNumber);
			return parseString(this.telephoneNumber);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing telephone number", e);
		}
	}

	private String parseEcoaCode() throws BaseSegmentParseException {
		try {
			in.readFully(this.ecoaCode);
			return parseString(this.ecoaCode);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing ECOA code", e);
		}
	}

	private String parseConsumerInformationIndicator() throws BaseSegmentParseException {
		try {
			in.readFully(this.consumerInformationIndicator);
			return parseString(this.consumerInformationIndicator);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing consumer information indicator", e);
		}
	}

	private String parseCountryCode() throws BaseSegmentParseException {
		try {
			in.readFully(this.countryCode);
			return parseString(this.countryCode);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing country code", e);
		}
	}

	private String parseFirstLineAddress() throws BaseSegmentParseException {
		try {
			in.readFully(this.firstLineAddress);
			return parseString(this.firstLineAddress);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing first line address", e);
		}
	}

	private String parseSecondLineAddress() throws BaseSegmentParseException {
		try {
			in.readFully(this.secondLineAddress);
			return parseString(this.secondLineAddress);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing second line address", e);
		}
	}

	private String parseCity() throws BaseSegmentParseException {
		try {
			in.readFully(this.city);
			return parseString(this.city);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing city", e);
		}
	}

	private String parseState() throws BaseSegmentParseException {
		try {
			in.readFully(this.state);
			return parseString(this.state);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing state", e);
		}
	}

	private String parsePostalCode() throws BaseSegmentParseException {
		try {
			in.readFully(this.postalCode);
			return parseString(this.postalCode);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing postal code", e);
		}
	}

	private String parseAddressIndicator() throws BaseSegmentParseException {
		try {
			in.readFully(this.addressIndicator);
			return parseString(this.addressIndicator);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing address indicator", e);
		}
	}

	private String parseResidenceCode() throws BaseSegmentParseException {
		try {
			in.readFully(this.residenceCode);
			return parseString(this.residenceCode);
		} catch (IOException e) {
			throw new BaseSegmentParseException("Error parsing residence code", e);
		}
	}

	public class BaseSegmentParseException extends ParseException {
		
		public BaseSegmentParseException(String msg) {
			super(msg);
		}
		
		public BaseSegmentParseException(String msg, Throwable cause) {
			super(msg, cause);
		}
	}
}
