package com.helloeave.metro2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.helloeave.metro2.parsers.MetroParser;
import com.helloeave.metro2.parsers.ParserFactory;
import com.helloeave.metro2.records.Record;

public class MetroParserProgram {
	
	public static void main(String[] args) {
		String filename = args[0];
		if (filename == null || "".equals(filename)) {
			return;
		}
		
		DataInputStream in = null;
		Record record = null;
		try {
			in = new DataInputStream(new FileInputStream(filename));
			MetroParser parser = new ParserFactory(ParserFactory.Format.FIXED).getParser();
			record = parser.parseMetroDataStream(in);
			in.close();
		} catch (FileNotFoundException e) {
			System.err.println("Could not find file \"" + filename);
		} catch (IOException e) {
			System.err.println("IO Exception closing \"" + filename);
		}
		
		if (record != null) {
			System.out.println(record);
		}
	}
}
