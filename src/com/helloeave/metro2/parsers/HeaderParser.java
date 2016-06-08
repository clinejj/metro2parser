package com.helloeave.metro2.parsers;

import java.io.DataInputStream;

import com.helloeave.metro2.records.Header;

public interface HeaderParser {

	Header parseHeader(DataInputStream in) throws ParseException;
}
