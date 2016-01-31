package offer;
/**
* @author : gaoweibupt
* Date:2016年1月31日上午10:59:01
*/
public class Test {
	/**
	 * 	剑指offer面试题3：二维数组中的查找
	 * */
	public static int[] problem3(int [][] matrix, int rows, int columns, int number){
		int[] result = new int[2];
		int row = 0;
		int column = columns - 1;
		while(row < rows && column >=0){
			if (matrix[row][column] == number){
				result[0] = row;
				result[1] = column;
				break;
			} 
			else if (matrix[row][column] > number){
				column--;
			}
			else if (matrix[row][column] < number){
				row++;
			}
		}
		if (row < rows && column >= 0)
			return result;
		return null;
	}
	
	public static void main(String[] args){
		int[] ss;
		int[][] matrix = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		ss = problem3(matrix, 4, 4, 15);
		if (ss != null){
			System.out.println(ss.length);
			System.out.println(ss[0]);
			System.out.println(ss[1]);
		}
		else{
			System.out.println("123");
		}
	}
}
