package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2015年11月18日上午10:19:51
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
    	if (s == null || s.equals(""))return 0;
    	int length = 1;
    	for (int i = 0, j = 0; j < s.length(); j++){
    		for (int k = i; k < j; k++){
    			if (s.charAt(j) == s.charAt(k)){
    				i = k + 1;
    				break;
    			}
    		}
    		if (j - i + 1> length){
    			length = j - i + 1;
    		}
    	}
    	return length;
    }
}
