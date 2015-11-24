package java_leetcode;
/**
 * @author : gaoweibupt@gmail.com	
 * Date�� 2015��11��24������2:52:45
 */
public class StringToInteger {
    public int myAtoi(String str) {
    	//�ַ�������Ϊ0
    	if(str.length() == 0)return 0;
    	//�ַ���ǰ��Ϊ���ַ�
    	int front = 0;
    	while(str.charAt(front) == ' '){
    		front++;
    	}
    	//����ַ���ȫΪ��
    	if (front == str.length())return 0;
    	long x = 0;
    	int flag = 1;
    	if (str.charAt(front) == '-'){
    		flag = -1;
    		front++;
    	}else if (str.charAt(front) == '+'){
    		front++;
    	}
    	while(front < str.length() && str.charAt(front) >= '0' && str.charAt(front) <= '9'){
    		x = x * 10 + (str.charAt(front) - '0');
    		if (x*flag > Integer.MAX_VALUE)return Integer.MAX_VALUE;
    		if (x*flag < Integer.MIN_VALUE)return Integer.MIN_VALUE;
    		front++;
    	}
    	return (int)(x*flag);
    }
}
