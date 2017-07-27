package com.tacademy.vo;

import java.util.ArrayList;

public class Song {
	
	private int songId;
	private String songName;
	private ArrayList<Artist> artist = new ArrayList<Artist>();
	private int albumId;
	private String albumName;
	private int curretRank;
	private int pastRank;
	private int playTime;
	private String issueDate;
	private boolean isTitleSong;
	private boolean isHitSong;
	private boolean isAdult;
	private boolean isFree;
	
	
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public ArrayList<Artist> getArtist() {
		return artist;
	}
	public void setArtist(ArrayList<Artist> artist) {
		this.artist = artist;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public int getCurretRank() {
		return curretRank;
	}
	public void setCurretRank(int curretRank) {
		this.curretRank = curretRank;
	}
	public int getPastRank() {
		return pastRank;
	}
	public void setPastRank(int pastRank) {
		this.pastRank = pastRank;
	}
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public boolean isTitleSong() {
		return isTitleSong;
	}
	public void setTitleSong(boolean isTitleSong) {
		this.isTitleSong = isTitleSong;
	}
	public boolean isHitSong() {
		return isHitSong;
	}
	public void setHitSong(boolean isHitSong) {
		this.isHitSong = isHitSong;
	}
	public boolean isAdult() {
		return isAdult;
	}
	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}
	public boolean isFree() {
		return isFree;
	}
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	@Override
	public String toString() {
		return "\tSong [\n\t\tsongId=" + songId + "\n\t\tsongName=" + songName + "\n\t\tartist=" + artist + "\n\t\talbumId=" + albumId
				+ "\n\t\talbumName=" + albumName + "\n\t\tcurretRank=" + curretRank + "\n\t\tpastRank=" + pastRank + "\n\t\tplayTime="
				+ playTime + "\n\t\tissueDate=" + issueDate + "\n\t\tisTitleSong=" + isTitleSong + "\n\t\tisHitSong=" + isHitSong
				+ "\n\t\tisAdult=" + isAdult + "\n\t\tisFree=" + isFree + "\n\t]";
	}
	

	
	
}
