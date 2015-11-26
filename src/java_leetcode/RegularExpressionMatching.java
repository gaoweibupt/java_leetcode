package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2015年11月25日上午10:11:46
 */
public class RegularExpressionMatching {
//    public boolean isMatch(String s, String p) {
//    	char[] ss = s.toCharArray();
//    	char[] pp = p.toCharArray();
//    	return recursive(ss, 0, pp, 0);
//    }
//    
//    boolean recursive(char[] s, int i, char[] p, int j){
//    	if (i == s.length && j == p.length)return true;
//    	if (j == p.length)return false;
//    	//j之后的第二位  且检测j 不越界
//    	if (j < p.length -1 && p[j+1] == '*'){
//    		//p 向后移两位是否相等，如果不等则s向后移一位
//    		return recursive(s, i, p, j+2) || i < s.length && matches(s[i], p[j]) && recursive(s, i+1, p, j);
//    	}
//    	else{
//    		//第二位不是*， 第一位相等则检测下一位
//    		return  i < s.length && matches(s[i], p[j]) && recursive(s,i+1, p, j+1);
//    	}
//    }
//    
//    boolean matches(char c, char d){
//    	if (d == '.')return true;
//    	else return c == d;
//    }
    
    //p要完全匹配s
    public boolean isMatch(String s, String p){
    	if (p.length() == 0)return s.length() == 0;
    	else{
    		//p.length() > 1
    		if (p.length() > 1 && p.charAt(1) == '*'){
    			
    			if (isMatch(s, p.substring(2)))return true;
    			if(s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')){
    				return isMatch(s.substring(1), p);	
    			}
    			return false;
    		}
    		else{
    			if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')){
    				return isMatch(s.substring(1), p.substring(1));
    			}
    			else{
    				return false;
    			}
    		}
    	}
    } 
}
