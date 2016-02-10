package java_leetcode;

import java.util.ArrayList;
import java.util.List;

/**
* @author : gaoweibupt
* Date:2016年2月8日下午11:07:19
*/
public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {  
        List<String> ret = new ArrayList<String>(), inner, outter;  
        if (n == 0) {  
            ret.add("");  
            return ret;  
        }  
        if (n == 1) {  
            ret.add("()");  
            return ret;  
        }  
        for (int i = 0; i < n; ++i) {  
            inner = generateParenthesis(i);  
            outter = generateParenthesis(n - i - 1);  
            for (int j = 0; j < inner.size(); ++j) {  
                for (int k = 0; k < outter.size(); ++k) {  
                    ret.add("(" + inner.get(j) + ")" + outter.get(k));  
                }  
            }  
        }  
        return ret;  
    }  
}
