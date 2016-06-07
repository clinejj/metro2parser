package com.helloeave.metro2.records;

public class Record {

	private Header header;
	private BaseSegment data;
	// private Trailer trailer;
	
	public Header getHeader() {
		return header;
	}
	
	public void setHeader(Header header) {
		this.header = header;
	}
	
	public BaseSegment getData() {
		return data;
	}
	
	public void setData(BaseSegment data) {
		this.data = data;
	}
}
