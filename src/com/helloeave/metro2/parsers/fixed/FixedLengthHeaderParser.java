package com.helloeave.metro2.parsers.fixed;

import java.io.DataInputStream;

import com.helloeave.metro2.parsers.HeaderParser;
import com.helloeave.metro2.records.Header;

public class FixedLengthHeaderParser implements HeaderParser {

	@Override
	public Header parseHeader(DataInputStream in) {
		return new Header();
	}

}
