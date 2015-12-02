package java_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2015年12月2日上午9:54:52
 */
public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	if (nums == null ||nums.length < 3)return result;
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length - 2; i++){
    		if(i > 0 && nums[i] == nums[i - 1]) continue;
    		int front = i + 1;
    		int end = nums.length - 1;
    		int temp = 0 - nums[i];
    		while(end > front){
    			if (nums[end] + nums[front] > temp){
    				end--;
    			}
    			else if (nums[end] + nums[front] < temp){
    				front++;
    			}
    			else{
    				List<Integer> list = new ArrayList<>();
    				list.add(nums[i]);
    				list.add(nums[front]);
    				list.add(nums[end]);
    				result.add(list);
    				while (front  < end && nums[front] == nums[front+1])front++;
    				while (end > front && nums[end] == nums[end-1])end--;
    				front++;end--;
    			}
    		}
    	}
    	return result;
    }
}
