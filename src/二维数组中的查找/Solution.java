package 二维数组中的查找;

/*
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
 * 。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */

public class Solution {
	
	 public boolean Find(int target, int [][] array) {
             int row=array.length;
             int col=array[0].length;
             int i=row-1,j=0;
             while(i>=0&&j<=col-1) {
            	 if(array[i][j]==target)return true;
            	 if(array[i][j]<target) {
            		 j++;
            	 }else if(array[i][j]>target) {
            		 i--;
            	 }
            	 
             }
             return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
