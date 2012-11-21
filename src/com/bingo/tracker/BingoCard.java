package com.bingo.tracker;

public class BingoCard {

	private int ID;
	private Boolean hasBingo; // May not need this
	private Entry[][] nums;
	private Boolean[] mask = {true, true, true, true, true};
	
	
	public BingoCard(int ID, int[][] numbers){
		hasBingo = false;
		this.ID = ID;
		this.nums = new Entry[5][5];
		for(int i = 0; i < 5; ++i)
			for(int j = 0; j < 5; ++j)
				this.nums[i][j] = new Entry(numbers[i][j]);
		// Make sure we don't forget the FREE space
		this.nums[2][2].setCovered();
	}
	
	public int getID(){
		return this.ID;
	}
	
	public void addNumber(int num){
		// This is gross
		// There must be a better way!!!
		int col;
		if(num < 16)
			col = 0;
		else if(num < 31)
			col = 1;
		else if(num < 46)
			col = 2;
		else if(num < 61)
			col = 3;
		else
			col = 4;
		
		for(int i = 0; i < 5; ++i){
			if(nums[i][col].getNum() == num)
				nums[i][col].setCovered();
		}
	}
	
	public Boolean checkForBingo(){
		// Check vertically
		for(int col = 0; col < 5; ++col){
			 Boolean[] temp = {nums[0][col].isCovered(), nums[1][col].isCovered(), 
					 nums[2][col].isCovered(), nums[3][col].isCovered(), nums[4][col].isCovered()};
			 if(temp == mask){
				 hasBingo = true;
				 break;
			 }
		}
		
		return hasBingo;
	}
}
