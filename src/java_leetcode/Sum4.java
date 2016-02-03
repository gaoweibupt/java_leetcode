package java_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
* @author : gaoweibupt
* Date:2016年2月2日下午11:54:33
*/
public class Sum4 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        	List<List<Integer>> result = new ArrayList<>();
        	if (nums.length < 4)return result;
        	Arrays.sort(nums);
        	for (int i = 0; i < nums.length - 3; i++){
        		if (i > 0 && nums[i] == nums[i - 1])continue;
        		for (int j = i + 1; j < nums.length - 2; j++){
        			if (j > i + 1 && nums[j] == nums[j- 1])continue;
        			int sum = target - nums[i] - nums[j];
        			int fast = j + 1;
        			int last = nums.length - 1;
        			while(fast < last){
        				if (nums[fast] + nums[last] == sum){
        					List<Integer> temp = new ArrayList<>();
        					temp.add(nums[i]);
        					temp.add(nums[j]);
        					temp.add(nums[fast]);
        					temp.add(nums[last]);
        					result.add(temp);
        					while (fast < last && nums[fast] == nums[fast + 1])fast++;
        					fast++;
        					while (fast < last && nums[last] == nums[last - 1])last--;
        					last--;
        				}
        				else if (sum < nums[fast] + nums[last])last--;
        				else fast++;
        			}
        		}
        	}
        	return result;
    }
}
