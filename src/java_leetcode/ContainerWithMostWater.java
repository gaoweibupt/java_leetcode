package java_leetcode;
/**
* @author : gaoweibupt@gmail.com
* Date: 2015年11月28日下午12:23:54
*/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j){
        	int hh = 0;
        	hh = (Math.min(height[i], height[j]) * (j - i));
        	if (hh > max){
        		max = hh;
        	}
        	if (height[i] > height[j]){
        		j--;
        	}
        	else{
        		i++;
        	}
        }
        return max;
    }
}
