package com.helloeave.metro2.parsers;

import java.io.IOException;

public class ParseException extends IOException {

	public ParseException(String msg) {
		super(msg);
	}
	
	public ParseException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
