package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com	
 * Date�� 2015��11��25������10:11:46
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
//    	//j֮��ĵڶ�λ  �Ҽ��j ��Խ��
//    	if (j < p.length -1 && p[j+1] == '*'){
//    		//p �������λ�Ƿ���ȣ����������s�����һλ
//    		return recursive(s, i, p, j+2) || i < s.length && matches(s[i], p[j]) && recursive(s, i+1, p, j);
//    	}
//    	else{
//    		//�ڶ�λ����*�� ��һλ���������һλ
//    		return  i < s.length && matches(s[i], p[j]) && recursive(s,i+1, p, j+1);
//    	}
//    }
//    
//    boolean matches(char c, char d){
//    	if (d == '.')return true;
//    	else return c == d;
//    }
    
    //pҪ��ȫƥ��s
    public boolean isMatch(String s, String p){
    	if (p.length() == 0)return s.length() == 0;
    	if (p.length() == 1){
    		return s.charAt(0) == p.charAt(0) || p.charAt(0) == '.';
    	}
    	else{
    		if (p.charAt(1) == '*'){
    			int i = 0;
    			while(s.length() > i && s.charAt(i) == p.charAt(0) || p.charAt(0) == '.'){
    				if (isMatch(s.substring(i), p.substring(2)))return true;
    				i++;	
    			}
    			return isMatch(s.substring(i), p.substring(2));
    		}
    		else{
    			if (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'){
    				return isMatch(s.substring(1), p.substring(1));
    			}
    			else{
    				return false;
    			}
    		}
    	}
    } 
}
