package java_leetcode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    	for (int i = 0 ; i < nums.length; i++){
    		for (int j = i + 1; j < nums.length; j++){
    			if (nums[i] + nums[j] == target){
    				int[] result = new int[2];
    				result[0] = i + 1;
    				result[1] = j + 1;
    				return result;
    			}
    		}
    	}
    	return null;
    }

}
