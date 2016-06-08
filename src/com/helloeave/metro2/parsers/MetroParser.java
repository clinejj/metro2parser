package com.helloeave.metro2.parsers;

import java.io.DataInputStream;

import com.helloeave.metro2.records.Record;

public interface MetroParser {

	Record parseMetroDataStream(DataInputStream in) throws ParseException;
}
