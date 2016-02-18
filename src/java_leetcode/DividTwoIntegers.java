package java_leetcode;
/**
* @author : gaoweibupt
* Date:2016年2月14日下午12:41:01
*/
public class DividTwoIntegers {
    public int divide(int dividend, int divisor) {
        int siginal = 1;
    	if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)){
        	siginal = -1;
        }
    	if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)){
    		return Integer.MAX_VALUE;
    	}
    	long absDividend = Math.abs((long)dividend);
    	long absDivisor = Math.abs((long)divisor);
    	long result = 0;
    	while (absDividend >= absDivisor){
    		long temp = absDivisor;
    		long count = 1;
    		while (absDividend >= temp){
    			temp = temp << 1;
    			count = count << 1;
    		}
    		temp = temp >> 1;
    		count = count >> 1;
    		result += count;
    		absDividend -= temp;
    	}
    	if (siginal == 1){
    		if (result > Integer.MAX_VALUE)
    			return Integer.MAX_VALUE;
    		else 
    			return (int)result;
    	}
    	else{
    		return (int)(0 - result);
    	}
    }

}
