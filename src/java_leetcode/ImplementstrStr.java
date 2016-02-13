package java_leetcode;
/**
* @author : gaoweibupt
* Date:2016年2月13日下午8:08:57
*/
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
       if (needle == null || haystack == null)return -1;
    	int i = -1;
    	for (i = 0; i < haystack.length() - needle.length() + 1; i++){
        	boolean flag = true;
        	for (int j = 0; j < needle.length(); j++){
        		if (haystack.charAt(j+i) != needle.charAt(j)){
        			flag = false;
        			break;
        		}
        	}
        	if (flag)return i;
        }
    	return -1;
    }
}
