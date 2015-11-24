package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2015年11月24日上午10:44:54
 */
public class ReverseInteger {
    public int reverse(int x) {
        if (x == Integer.MAX_VALUE || x == Integer.MIN_VALUE)return 0;
        int flag = x < 0? -1: 1;
        String xStr = Integer.toString(Math.abs(x));
    	String result = "";
        for (int i = xStr.length() - 1; i >= 0; i--){
        	result += xStr.charAt(i);
        }
        if (result.length() == Integer.toString(Integer.MAX_VALUE).length() && result.compareTo(Integer.toString(Integer.MAX_VALUE)) > 0)return 0;
        return flag * Integer.parseInt(result);
    }
    
    public int reverse1(int x){
    	long y = x;
    	int flag = x < 0? -1: 1;
    	String xStr = Long.toString(Math.abs(y));
    	String result = ""; 
    	for (int i = xStr.length() - 1; i >= 0; i--){
    		result += xStr.charAt(i);
        }
    	long yy = flag * Long.parseLong(result);
    	if (yy > Integer.MAX_VALUE || yy < Integer.MIN_VALUE)return 0;
    	return (int)yy;
    }
}
