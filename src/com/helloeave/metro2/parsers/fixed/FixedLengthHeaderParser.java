package com.helloeave.metro2.parsers.fixed;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Date;

import com.helloeave.metro2.parsers.HeaderParser;
import com.helloeave.metro2.parsers.ParseException;
import com.helloeave.metro2.records.Header;

public class FixedLengthHeaderParser extends AbstractFixedLengthParser implements HeaderParser {
	
	private byte[] blockDescriptorWord 		= new byte[4];  	// 4 - 1-4 each block - N
	private byte[] recordDescriptorWord 	= new byte[4];		// 4 - 1-4 each record - N
	private byte[] recordId 				= new byte[6];		// 6 - 5-10 - AN
	private byte[] cycleNumber 				= new byte[2];		// 2 - 11-12 - AN
	private byte[] innovisProgramId 		= new byte[10];		// 10 - 13-22 - AN
	private byte[] equifaxProgramId	 		= new byte[10];		// 10 - 23-32 - AN
	private byte[] experianProgramId		= new byte[5];		// 5 - 33-37 - AN
	private byte[] transunionProgramId		= new byte[10];		// 10 - 38-47 - AN
	private byte[] activityDate				= new byte[8];		// 8 - 48-55 - N
	private byte[] createdDate				= new byte[8];		// 8 - 56-63 - N
	private byte[] programDate				= new byte[8];		// 8 - 64-71 - N
	private byte[] programRevisionDate		= new byte[8];		// 8 - 72-79 - N
	private byte[] reporterName				= new byte[40];		// 40 - 80-119 - AN
	private byte[] reporterAddress			= new byte[96];		// 96 - 120-215 - AN
	private byte[] reporterPhoneNumber		= new byte[10];		// 10 - 216-225 - N
	private byte[] softwareVendorName		= new byte[40];		// 40 - 226-265 - AN
	private byte[] softwareVersionNumber	= new byte[5];		// 5 - 266-270 - AN
	private byte[] blankFill				= new byte[156];	// 156 - 271-426 - AN									
	
	private Header header = new Header();
	
	private DataInputStream in;
	
	@Override
	public Header parseHeader(DataInputStream in) throws HeaderParseException {
		this.in = in;
		this.header.setBlockDescriptorWord(parseDescriptorWord());
		this.header.setRecordDescriptorWord(parseRecordDescriptorWord());
		this.header.setRecordId(parseRecordId());
		this.header.setCycleNumber(parseCycleNumber());
		this.header.setInnovisProgramId(parseInnovisProgramId());
		this.header.setEquifaxProgramId(parseEquifaxProgramId());
		this.header.setExperianProgramId(parseExperianProgramId());
		this.header.setTransunionProgramId(parseTransunionProgramId());
		this.header.setActivityDate(parseActivityDate());
		this.header.setCreatedDate(parseCreatedDate());
		this.header.setProgramDate(parseProgramDate());
		this.header.setProgramRevisionDate(parseProgramRevisionDate());
		this.header.setReporterName(parseReporterName());
		this.header.setReporterAddress(parseReporterAddress());
		this.header.setReporterPhoneNumber(parseReporterPhoneNumber());
		this.header.setSoftwareVendorName(parseSoftwareVendorName());
		this.header.setSoftwareVersionNumber(parseSoftwareVersionNumber());
		parseBlankFill();
		return this.header;
	}

	private Integer parseDescriptorWord() throws HeaderParseException {
		try {
			in.readFully(this.blockDescriptorWord);
			return parseInteger(this.blockDescriptorWord);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing block descriptor word", e);
		}
	}
	
	private Integer parseRecordDescriptorWord() throws HeaderParseException {
		try {
			in.readFully(this.recordDescriptorWord);
			return parseInteger(this.recordDescriptorWord);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing record descriptor word", e);
		}
	}
	
	private String parseRecordId() throws HeaderParseException {
		try {
			in.readFully(this.recordId);
			return parseString(this.recordId);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing record ID", e);
		}
	}

	private String parseCycleNumber() throws HeaderParseException {
		try {
			in.readFully(this.cycleNumber);
			return parseString(this.cycleNumber);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing cycle number", e);
		}
	}

	private String parseInnovisProgramId() throws HeaderParseException {
		try {
			in.readFully(this.innovisProgramId);
			return parseString(this.innovisProgramId);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing Innovis Program ID", e);
		}
	}

	private String parseEquifaxProgramId() throws HeaderParseException {
		try {
			in.readFully(this.equifaxProgramId);
			return parseString(this.equifaxProgramId);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing Equifax Program ID", e);
		}
	}

	private String parseExperianProgramId() throws HeaderParseException {
		try {
			in.readFully(this.experianProgramId);
			return parseString(this.experianProgramId);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing Experian Program ID", e);
		}
	}

	private String parseTransunionProgramId() throws HeaderParseException {
		try {
			in.readFully(this.transunionProgramId);
			return parseString(this.transunionProgramId);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing TransUnion Program ID", e);
		}
	}

	private Date parseActivityDate() throws HeaderParseException {
		try {
			in.readFully(this.activityDate);
			return parseDate(this.activityDate);
		} catch (IOException | java.text.ParseException e) {
			throw new HeaderParseException("Error parsing activity date", e);
		}
	}

	private Date parseCreatedDate() throws HeaderParseException {
		try {
			in.readFully(this.createdDate);
			return parseDate(this.createdDate);
		} catch (IOException | java.text.ParseException e) {
			throw new HeaderParseException("Error parsing created date", e);
		}
	}

	private Date parseProgramDate() throws HeaderParseException {
		try {
			in.readFully(this.programDate);
			return parseDate(this.programDate);
		} catch (IOException | java.text.ParseException e) {
			throw new HeaderParseException("Error parsing program date", e);
		}
	}

	private Date parseProgramRevisionDate() throws HeaderParseException {
		try {
			in.readFully(this.programRevisionDate);
			return parseDate(this.programRevisionDate);
		} catch (IOException | java.text.ParseException e) {
			throw new HeaderParseException("Error parsing program revision date", e);
		}
	}

	private String parseReporterName() throws HeaderParseException {
		try {
			in.readFully(this.reporterName);
			return parseString(this.reporterName);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing reporter name", e);
		}
	}

	private String parseReporterAddress() throws HeaderParseException {
		try {
			in.readFully(this.reporterAddress);
			return parseString(this.reporterAddress);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing reporter address", e);
		}
	}

	private String parseReporterPhoneNumber() throws HeaderParseException {
		try {
			in.readFully(this.reporterPhoneNumber);
			return parseString(this.reporterPhoneNumber);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing reporter phone number", e);
		}
	}

	private String parseSoftwareVendorName() throws HeaderParseException {
		try {
			in.readFully(this.softwareVendorName);
			return parseString(this.softwareVendorName);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing software vendor name", e);
		}
	}

	private String parseSoftwareVersionNumber() throws HeaderParseException {
		try {
			in.readFully(this.softwareVersionNumber);
			return parseString(this.softwareVersionNumber);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing software version number", e);
		}
	}

	private void parseBlankFill() throws HeaderParseException {
		try {
			in.readFully(this.blankFill);
		} catch (IOException e) {
			throw new HeaderParseException("Error parsing blank fill", e);
		}
	}

	public class HeaderParseException extends ParseException {
		
		public HeaderParseException(String msg) {
			super(msg);
		}
		
		public HeaderParseException(String msg, Throwable cause) {
			super(msg, cause);
		}
	}

}
