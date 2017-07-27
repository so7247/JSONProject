package com.tacademy.vo;

public class Artist {

	private int artistId;
	private String artistName;
	
	
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	@Override
	public String toString() {
		return "\n\t\tArtist [\n\t\t\tartistId=" + artistId + "\n\t\t\tartistName=" + artistName + "\n\t\t]";
	}
	
	
	
	
}
