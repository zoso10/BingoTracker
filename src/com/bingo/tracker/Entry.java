package com.bingo.tracker;

public class Entry {

	private int num;
	private Boolean isCovered;
	
	public Entry(int num){
		this.num = num;
		isCovered = false; // Obviously when you create an entry it won't be covered
	}
	
	public void setCovered(){
		isCovered = true;
	}
	
	public Boolean isCovered(){
		return this.isCovered;
	}
	
	// No need to set the num, it will never change
	public int getNum(){
		return this.num;
	}
}
