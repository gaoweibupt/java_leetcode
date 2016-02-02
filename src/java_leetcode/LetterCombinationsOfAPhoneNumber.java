package java_leetcode;

import java.util.ArrayList;
import java.util.List;

/**
* @author : gaoweibupt
* Date:2016年2月2日下午10:39:40
*/
public class LetterCombinationsOfAPhoneNumber {
	char[][] c = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
	
	public List<String> letterCombinations(String digits) {
        if (digits == null || digits.equals(""))return new ArrayList<>();
        List<String> result =new ArrayList<>();
        for (int j = 0; j < c[digits.charAt(0) - '0'].length; j++){
    		result.add(Character.toString(c[digits.charAt(0) - '0'][j]));
    	}
        for(int i = 1; i < digits.length(); i++){
        	List<String> temp = new ArrayList<>();
        	for(int j = 0; j < result.size(); j++){
        		temp.add(result.get(j));
        	}
        	result.clear();
        	for (int j = 0; j < c[digits.charAt(i) - '0'].length; j++){
        		for (int k = 0; k < temp.size(); k++){
        			result.add(temp.get(k) + c[digits.charAt(i) - '0'][j]);
        		}
        	}
        }
        return result;
    }
}
