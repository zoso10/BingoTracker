package com.ewing.bingo;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class BingoModel {

	private HashMap<BingoCard, String> cards;
	private AtomicInteger currentID;
	
	public BingoModel(){
		cards = new HashMap<BingoCard, String>();
		currentID = new AtomicInteger();
	}
	
	public void addCard(BingoCard c){
		cards.put(c, currentID.toString());
	}
	
	public String getCurrentID(){
		return String.valueOf(currentID.getAndIncrement());
	}
}
