package java_leetcode;
/**
* @author : gaoweibupt
* Date:2016年2月12日下午8:06:43
*/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)return 0;
        int pos = 0;
        for (int i = 0; i < nums.length; i++){
        	if (nums[i] != val){
        		nums[pos] = nums[i];
        		pos++;
        	}
        }
        return pos;
    }
}
