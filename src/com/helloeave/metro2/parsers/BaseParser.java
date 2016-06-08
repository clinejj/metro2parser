package com.helloeave.metro2.parsers;

import java.io.DataInputStream;

import com.helloeave.metro2.records.BaseSegment;

public interface BaseParser {

	BaseSegment parseBaseSegment(DataInputStream in) throws ParseException;
}
