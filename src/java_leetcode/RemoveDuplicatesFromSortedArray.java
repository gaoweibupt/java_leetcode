package java_leetcode;
/**
* @author : gaoweibupt
* Date:2016年2月12日下午7:47:09
*/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)return 0;
        int value = nums[0];
        int pos = 1;
        for (int i = 1; i < nums.length; i++){
        	if (nums[i] != value){
        		nums[pos] = nums[i];
        		pos++;
        		value = nums[i];
        	}
        }
        return pos;
    }
}
