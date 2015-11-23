package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2015年11月20日上午11:15:02
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
    	if (s.length() < numRows || numRows == 1)return s;
    	int num = 0;
    	String result = "";
    	while(num < numRows){
        	boolean flag = true;
    		if (num == 0 || num == numRows - 1){
    			int k = num;
    			while (k < s.length()){
    				result += s.charAt(k);
    				k = k + numRows * 2 - 2;
    			}
    		}
    		else{
    			int k = num;
    			while (k < s.length()){
    				result += s.charAt(k);
    				if (flag){
    					k = k + numRows * 2 - 2 - num * 2;
       				}
    				else{
    					k = k + num * 2;
    				}
    				flag = !flag;
    			}
    		}
    		num++;
    	}
    	return result;
    }
}
