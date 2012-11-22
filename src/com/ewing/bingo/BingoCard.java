package com.ewing.bingo;

import java.util.Arrays;

public class BingoCard {

	private Entry[][] nums;
	
	/*
	 * The Default Constructor gets a 2D array of integers and creates the Entries
	 */
	public BingoCard(int[][] numbers){
		this.nums = new Entry[5][5];
		for(int i = 0; i < 5; ++i)
			for(int j = 0; j < 5; ++j)
				this.nums[i][j] = new Entry(numbers[i][j]);
		// Don't forget the FREE space
		this.nums[2][2].cover();
	}
	
	// Number is called so we check to see if the card contains it
	//  if it does then we cover that Entry
	public void callNumber(int num){
		int col = (num-1)/15;
		for(int i = 0; i < 5; ++i)
			if(nums[i][col].getNum() == num)
				nums[i][col].cover();
		
	}
	
	public Boolean hasBingo(){
		// There's gotta be a more clever way to do this...
		
		// Check vertically
		for(int col = 0; col < 5; ++col){
			Boolean[] temp = {nums[0][col].isCovered(), nums[1][col].isCovered(), 
					nums[2][col].isCovered(), nums[3][col].isCovered(), 
					nums[4][col].isCovered()};
			if(!Arrays.asList(temp).contains(false))
				return Boolean.TRUE;
		}
		
		// Check horizontally
		for(int row = 0; row < 5; ++row){
			Boolean[] temp = {nums[row][0].isCovered(), nums[row][1].isCovered(),
					nums[row][2].isCovered(), nums[row][3].isCovered(),
					nums[row][4].isCovered()};
			if(!Arrays.asList(temp).contains(false))
				return Boolean.TRUE;
		}
		
		// Check upper left diagonal
		Boolean[] temp1 = {nums[0][0].isCovered(), nums[1][1].isCovered(),
				nums[2][2].isCovered(), nums[3][3].isCovered(), nums[4][4].isCovered()};
		if(!Arrays.asList(temp1).contains(false))
			return Boolean.TRUE;
		
		// Check upper right diagonal
		Boolean[] temp2 = {nums[0][4].isCovered(), nums[1][3].isCovered(), 
				nums[2][2].isCovered(),nums[3][1].isCovered(), 
				nums[4][0].isCovered()};
		if(!Arrays.asList(temp2).contains(false))
			return Boolean.TRUE;
		
		return Boolean.FALSE;
	}
}
