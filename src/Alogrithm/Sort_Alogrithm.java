package Alogrithm;
/**
* @author : gaoweibupt
* Date:2015年12月6日下午10:18:52
*/
public class Sort_Alogrithm {
	
	/**
	 * 插入排序
	 * 步骤：
	 * 	前提： j之前的数组是排好序的
	 *  	将第j个元素依次与前一个元素比较，如果大于则结束，小于则换位置
	 *  算法时间复杂度：O（n ^2）
	 * */
	public  static int[] insertSort(int[] array){
		if (array.length <= 1)return array;
		for (int i = 1; i < array.length; i++){
			int temp = array[i];
			for (int j = i - 1;j >=0  && temp < array[j]; j--){
				array[j + 1] = array[j];
				array[j] = temp;
			}
		}
		return array;
	}
	
	/**
	 * 归并排序
	 * 步骤：(长度为n)
	 * 	1.如果 n = 1,直接返回
	 * 	2.递归调用归并函数，排序（0，n/2），（n/2，n）两个数组
	 * 	3.将两个数组按归并
	 *算法时间复杂度： O（nlogn）
	 *算法空间复杂度：O（n） 
	 * */
	public static int[] mergeSort(int[] array, int front, int back){
		int[] result = new int[back - front];
		if (back - front == 1){
			result[0] = array[front];
			return result;
		};
		if (back - front == 0){
			return result;
		}
		int middle =  (front + back) / 2;
		int[] a = mergeSort(array, front, middle);
		int[] b = mergeSort(array, middle, back);
		for (int i = 0, j =0, k = 0; i < result.length; i++){
			if (j < a.length && k < b.length){
				if (a[j] < b[k]){
					result[i] = a[j];j++;
				}
				else{
					result[i] = b[k];k++;
				}
			}
			else if (j < a.length){
				result[i] = a[j];j++;
			}
			else if (k < b.length){
				result[i] = b[k];k++;
			}
		}
		return result;
	}
	
	public static void main(String[] arg){
		int[] array = {3,5,2,4,7,1,9,6,2,0,10};
		//array = insertSort(array);
		array = mergeSort(array, 0, array.length);
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i]+" ");
		}
	}
}
