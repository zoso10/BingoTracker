package com.ewing.bingo;

public class Entry {

	private int num;
	private Boolean isCovered;
	
	public Entry(int num){
		this.num = num;
		isCovered = false;
	}
	
	public void cover(){
		isCovered = true;
	}
	
	public Boolean isCovered(){
		return isCovered;
	}
	
	public int getNum(){
		return num;
	}
}