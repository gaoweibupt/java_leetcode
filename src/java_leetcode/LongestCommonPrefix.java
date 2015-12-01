package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2015年12月1日上午9:38:58
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 0)return result;
        for (int j = 0; j < strs[0].length(); j++)
        {
        	char s = strs[0].charAt(j);
        	for (int i = 0; i < strs.length; i++){
        		if (strs[i].length() == j){
        			return result;
        		}
        		if (strs[i].charAt(j) != s){
        			return result;
        		}
        	}
        	result += s;
        }
        return result;
    }
}
