package com.helloeave.metro2.parsers;

import java.io.DataInputStream;

public interface MetroParser {

	void parseMetroDataStream(DataInputStream in);
}
