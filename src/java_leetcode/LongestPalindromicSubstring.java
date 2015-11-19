package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2015年11月18日下午3:04:39
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String palind = "";
        for (int i = 0; i < s.length(); i++){
        	String x = getPalindrome(s, i, i);
        	String y = getPalindrome(s, i, i + 1);
        	if (palind.length() < x.length()){
        		palind = x;
        	}
        	if (palind.length() < y.length()){
        		palind = y;
        	}
        }
        return palind;
    }
    
    public String getPalindrome(String s, int k, int m){
    	int i = 0;
    	if (m >= s.length() || k < 0)return "";
    	while (s.charAt(k - i) == s.charAt(m + i)){
    		i++;
    		if (m + i >= s.length() || k - i < 0){
    			break;
    		}
    	}
    	return s.substring(k - i + 1, m + i); 
    }
}
