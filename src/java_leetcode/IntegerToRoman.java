package java_leetcode;
/**
* @author : gaoweibupt@gmail.com
* Date: 2015年11月28日下午2:19:25
*/
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
    	int num1 = num / 1000;
    	int num2 = num / 100 % 10;
    	int num3 = num / 10 % 10;
    	int num4 = num % 10;
    	for (int i = 0; i < num1; i++){
    		sb.append("M");
    	}
        if (num2 < 4){
        	for (int i = 0; i < num2; i++){
        		sb.append("C");
        	}
        }
        else if (num2 == 4){
        	sb.append("CD");
        }
        else if (num2 >=5 && num2 < 9){
        	sb.append("D");
        	for (int i = 0; i < num2 - 5;i++){
        		sb.append("C");
        	}
        }
        else if (num2 == 9){
        	sb.append("CM");
        }
        if (num3 < 4){
        	for (int i = 0; i < num3; i++){
        		sb.append("X");
        	}
        }
        else if (num3 == 4){
        	sb.append("XL");
        }
        else if (num3 >=5 && num3 < 9){
        	sb.append("L");
        	for (int i = 0; i < num3 - 5;i++){
        		sb.append("X");
        	}
        }
        else if (num3 == 9){
        	sb.append("XC");
        }
        if (num4 < 4){
        	for (int i = 0; i < num4; i++){
        		sb.append("I");
        	}
        }
        else if (num4 == 4){
        	sb.append("IV");
        }
        else if (num4 >=5 && num4 < 9){
        	sb.append("V");
        	for (int i = 0; i < num4 - 5;i++){
        		sb.append("I");
        	}
        }
        else if (num4 == 9){
        	sb.append("IX");
        }
        return sb.toString();
    }
}
