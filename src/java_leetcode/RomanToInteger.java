package java_leetcode;
/**
* @author : gaoweibupt@gmail.com
* Date: 2015年11月28日下午6:58:05
*/
public class RomanToInteger {
    public int romanToInt(String s) {
    	int num = 0;
    	boolean flag[] = {false,false,false};
    	for (int i = 0; i < s.length(); i++){
    		if (s.charAt(i) == 'M'){
    			num += 1000;
    			if (flag[0]){num -= 200; flag[0] = false;}
    		}
    		else if (s.charAt(i) == 'C'){
    			flag[0] = true;
    			num += 100;
    			if (flag[1]){num -= 20; flag[1] = false;}
    		}
    		else if (s.charAt(i) == 'D'){
    			if (flag[0]){num -= 200;}
    			num += 500;
    		}
    		else if (s.charAt(i) == 'X'){
    			flag[1] = true;
    			num += 10;
    			if (flag[2]){num -= 2; flag[2] = false;}
    		}
    		else if (s.charAt(i) == 'L'){
    			if (flag[1]){num -= 20;}
    			num += 50;
    		}
    		else if (s.charAt(i) == 'I'){
    			flag[2] = true;
    			num += 1;
    		}
    		else if (s.charAt(i) == 'V'){
    			if (flag[2]){num -= 2; flag[2] = false;}
    			num += 5;
    		}
    	}
    	return num;
    }
}
