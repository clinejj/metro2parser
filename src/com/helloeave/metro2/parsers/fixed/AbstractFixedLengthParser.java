package com.helloeave.metro2.parsers.fixed;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractFixedLengthParser {
	
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MMddYYYY");
	public static final DateFormat DATE_TIME_FORMAT = new SimpleDateFormat("MMddYYYYHHmmss");
	private static final String EBCDIC_ENCODING = "ibm500";
	
	
	protected Integer parseInteger(byte[] b) {
		return ByteBuffer.wrap(b).getInt();
	}
	
	protected String parseString(byte[] b) throws UnsupportedEncodingException {
		return new String(b, EBCDIC_ENCODING);
	}
	
	protected Date parseDate(byte[] b) throws ParseException, UnsupportedEncodingException {
		return DATE_FORMAT.parse(parseString(b));
	}
	
	protected Date parseDateTime(byte[] b) throws UnsupportedEncodingException, ParseException {
		return DATE_TIME_FORMAT.parse(parseString(b));
	}
}
