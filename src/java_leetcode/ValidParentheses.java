package java_leetcode;

import java.util.Stack;

/**
* @author : gaoweibupt
* Date:2016年2月2日下午8:00:27
* 第20题
*/
public class ValidParentheses {
	public static boolean isValid(String s){
		if (s == null || s.equals(""))return true;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++){
			switch(s.charAt(i)){
			case '[': stack.push(s.charAt(i));break;
			case '(':stack.push(s.charAt(i));break;
			case '{': stack.push(s.charAt(i));break;
			case ')': {if (stack.isEmpty() || !stack.pop().equals('('))return false;break;}
			case '}': {if (stack.isEmpty() || !stack.pop().equals('{'))return false;break;}
			case ']': {if (stack.isEmpty() || !stack.pop().equals('['))return false;break;}
			}
		}
		if (stack.isEmpty())return true;
		else return false;
	}
}
