package com.offer.question03;

/**
 * 二维数组中，每一行升序排序，每一列升序排序
 * 找到指定的数，找到返回true，没找到返回false
 */
public class FindIn2DArray {
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,8,9}, {2,4,9,12}, {4,7,10,13}, {6,8,11,15}};
		System.out.print(find(matrix, 4, 4, 3));
	}
	
	private static boolean find(int[][] matrix, int rows, int columns, int number) {
		if(matrix != null && rows>0 && columns >0 ){
			int row = 0;
			int column = columns-1;
			while(row<rows && column>=0){
				if(number < matrix[row][column]) {
					column--;
				}else if(number > matrix[row][column]){
					row++;
				}else if(number == matrix[row][column]){
					return true;
				}
			}
			return false;
		}
		return false;
	}
}
