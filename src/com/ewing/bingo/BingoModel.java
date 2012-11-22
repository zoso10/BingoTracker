package com.ewing.bingo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BingoModel {

	private HashMap<BingoCard, String> cards;
	private AtomicInteger currentID;
	private List<Integer> calledNums;
	
	public BingoModel(){
		cards = new HashMap<BingoCard, String>();
		currentID = new AtomicInteger();
		calledNums = new LinkedList<Integer>();
	}
	
	public void addCard(BingoCard c){
		cards.put(c, currentID.toString());
	}
	
	public String getCurrentID(){
		return String.valueOf(currentID.getAndIncrement());
	}
	
	public void callNumber(int num){
		calledNums.add(num);
		for(BingoCard c : cards.keySet()){
			c.callNumber(num);
		}
	}
	
	public String checkForBingo(){
		for(BingoCard c : cards.keySet()){
			if(c.hasBingo()){
				return cards.get(c);
			}
		}
		return "";
	}
}
