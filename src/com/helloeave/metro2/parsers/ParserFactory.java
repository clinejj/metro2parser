package com.helloeave.metro2.parsers;

import com.helloeave.metro2.parsers.fixed.FixedLengthMetroParser;

public class ParserFactory {

	private Format format;
	
	public ParserFactory(Format format) {
		this.format = format;
	}
	
	public MetroParser getParser() {
		switch (this.format) {
			case FIXED:
				return new FixedLengthMetroParser();
			case VARIABLE:
				return null;
			default:
				return new FixedLengthMetroParser();
		}
	}
	
	public enum Format {
		FIXED,
		VARIABLE
	}
}
