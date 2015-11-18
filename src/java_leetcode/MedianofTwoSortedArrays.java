package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2015年11月18日上午11:05:28
 * 返回值要从int 转型为 double
 */
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1.length + nums2.length) % 2 == 1){
        	return getk(nums1, 0, nums2, 0, (nums1.length + nums2.length + 1) / 2);
        }else{
        	return (getk(nums1, 0, nums2, 0, (nums1.length + nums2.length) / 2) + getk(nums1, 0, nums2, 0, (nums1.length + nums2.length ) / 2 + 1)) / 2.0;
        }
    }
    
    /**
     * 找到两个数组中的第k个数, k从1开始记
     * */
    public int getk(int[] anums, int astart, int[] bnums, int bstart, int k){
    	if (astart > anums.length -1)return bnums[bstart + k -1];
    	if (bstart > bnums.length -1)return anums[astart + k - 1];
    	if (k == 1)return Math.min(anums[astart], bnums[bstart]);
    	int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
    	if (astart + k / 2 - 1 < anums.length) aMid = anums[astart + k / 2 - 1];
    	if (bstart + k / 2 - 1 < bnums.length) bMid = bnums[bstart + k / 2 - 1];
    	if (aMid < bMid){
    		return getk(anums, astart + k / 2, bnums, bstart, k - k / 2);
    	}else{
    		return getk(anums, astart, bnums, bstart + k / 2, k - k / 2);
    	}
    }
}
