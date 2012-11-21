package tests;

public class Test2DArray {

	public static void main(String[] args){
		//int[][] nums = new int[5][5];
		Boolean[][] nums = new Boolean[5][5];
		int[] mask1 = {0, 2, 4, 6, 8};
		Boolean[] mask = {true, true, true, true, true};
		
//		for(int i = 0; i < 5; ++i){
//			for(int j = 0; j < 5; ++j){
//				nums[i][j] = i*j;
//				System.out.print(nums[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < 5; ++i){
			for(int j = 0; j < 5; ++j){
				nums[i][j] = true;
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(mask1.hashCode());
		
		
		
		for(int col = 0; col < 5; ++col){
			//int[] temp = {nums[0][col], nums[1][col], nums[2][col], nums[3][col], nums[4][col]};
			Boolean[] temp = {nums[0][col], nums[1][col], nums[2][col], nums[3][col], nums[4][col]};
			System.out.println(temp.hashCode() + " " + mask.hashCode());
			if(temp == mask)
				System.out.println("YAY");
			else
				System.out.println("NOO");
		}
	}
}