package com.helloeave.metro2.parsers;

import java.io.DataInputStream;

import com.helloeave.metro2.records.BaseSegment;
import com.helloeave.metro2.records.Header;
import com.helloeave.metro2.records.Record;

public class FixedLengthMetroParser implements MetroParser {

	private Record record;
	
	@Override
	public Record parseMetroDataStream(DataInputStream in) {
		record = new Record();
		record.setHeader(parseHeader(in));
		record.setData(parseBaseSegment(in));
		return record;
	}

	private Header parseHeader(DataInputStream in) {
		return null;
	}

	private BaseSegment parseBaseSegment(DataInputStream in) {
		return null;
	}
}
