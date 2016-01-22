package item;

import java.util.ArrayList;
import java.util.List;

/**
* @author : gaoweibupt
* Date:2016年1月22日下午8:14:39
*/
public class chapter01 {

	//计算100 以内的素数和
	public static int  sumOfPrime(){
		int sum = 0;
		for (int i = 3; i < 100; i++){
			boolean flag = true;
			for (int j = 2; j < i / 2; j++){
				if (i % j == 0){
					flag = false;
				}
			}
			if (flag){
				sum += i;
			}
		}
		return sum;
	}
	
	//计算最短阶数，每步2阶剩1阶，3阶剩2阶，5阶剩4阶，6阶剩5阶，7阶不剩
	public static int shortestOrder(){
		int sum = 7;
		while (sum != 0){
			if (sum % 2 == 1 && sum % 3 == 2 && sum % 5 == 4 && sum % 6 == 5){
				break;
			}
			sum += 7;
		}
		return sum;
	}
	
	//合数分解成质数
	public static List<Integer> primeDisset(int s){
		List<Integer> result = new ArrayList<>();
		for (int i = 2 ; i < s / 2; i++){
			if (s % i == 0){
				result.addAll(primeDisset(i));
				result.addAll(primeDisset(s / i));
				return result;
			}
		}
		result.add(s);
		return result;
	}
	
	//汉诺塔
	public static int hanio(int n, int s){
		if (n ==1){
			s = s + 1;
		}
		else if (n > 1){
			s = hanio(n-1, s); //把a上的n-1个放到b上
			s = hanio(1, s);  //a上的最后一个放到c上
			s = hanio(n-1, s);  //把b上的n-1个放到c上
		}
		return s;
	}
	
	public static void main(String[] args){
		System.out.println(sumOfPrime());
		System.out.println(shortestOrder());
		System.out.println(primeDisset(120));
		System.out.println(hanio(64, 0));
	}
}
