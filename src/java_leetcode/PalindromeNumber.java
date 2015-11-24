package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com	
 * Date： 2015年11月24日下午3:34:30
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)return false;
        int z = x;
        int y = 0;
        while (z != 0){
        	y = y * 10 + z % 10;
        	z = z / 10;
        }
        if (x == y)return true;
        else return false;
    }
}
