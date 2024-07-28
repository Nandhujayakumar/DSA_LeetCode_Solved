
//i/p : [2,5,4,9,6]   target = 10

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int compliment = target -  nums[i];
				
				if (compliment == nums[j] ) {
					return new int[] {i , j};
				}
						
				}
		}
		throw new IllegalArgumentException("No match found");
        
    }

}
