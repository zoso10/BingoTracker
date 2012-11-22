package tests;

import com.ewing.bingo.*;

public class BingoTester {

	public static void main(String[] args){
		int[][] nums = {{1,2,3,4,5},
						{10,11,12,13,14},
						{6,21,22,23,24},
						{15,31,32,33,34},
						{3,41,42,43,44}};
		// Just checking...
		for(int[] rows : nums){
			System.out.print(rows[0] + " ");
			System.out.print(rows[1] + " ");
			System.out.print(rows[2] + " ");
			System.out.print(rows[3] + " ");
			System.out.print(rows[4] + " ");
			System.out.println();
		}
		
		BingoCard card = new BingoCard(nums);
		card.callNumber(10);
		card.callNumber(1);
		card.callNumber(15);
		card.callNumber(3);
		card.callNumber(6);
		card.callNumber(2);
		
		System.out.println(card.hasBingo());
		
		
		// 1D array -> 2D array
		int[] stuff = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		for(int i = 0; i < 6; ++i){
			for(int j = 0; j < 2; ++j){
				System.out.print(stuff[i*2 + j] + " ");
			}
			System.out.println();
		}
	}
}
