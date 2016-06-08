package com.helloeave.metro2.parsers;

public class ParseException extends Exception {

	public ParseException(String msg) {
		super(msg);
	}
	
	public ParseException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
