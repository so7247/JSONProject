package com.tacademy.vo;

import java.util.ArrayList;

public class Melon {
	private int manuid;
	private int count;
	private int page;
	private int totalPages;
	private String rankDay;
	private String rankHour;
	private ArrayList<Song> song = new ArrayList<Song>();
	
	
	
	
	public int getManuid() {
		return manuid;
	}
	public void setManuid(int manuid) {
		this.manuid = manuid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public String getRankDay() {
		return rankDay;
	}
	public void setRankDay(String rankDay) {
		this.rankDay = rankDay;
	}
	public String getRankHour() {
		return rankHour;
	}
	public void setRankHour(String rankHour) {
		this.rankHour = rankHour;
	}
	public ArrayList<Song> getSong() {
		return song;
	}
	public void setSong(ArrayList<Song> song) {
		this.song = song;
	}
	@Override
	public String toString() {
		return "Melon [\n\tmanuid=" + manuid + "\n\tcount=" + count + "\n\tpage=" + page + "\n\ttotalPages=" + totalPages
				+ "\n\trankDay=" + rankDay + "\n\trankHour=" + rankHour + "\n\tsong=" + song + "\n]";
	}
	
	
}
