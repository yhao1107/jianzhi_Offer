package 求整数1到n相加;
/*
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 */

public class Solution {
	
	
	  public int Sum_Solution(int n) {
		  int count=n;
		  boolean flas=count!=0&&(count+=Sum_Solution(n-1))>0;
		  return count;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
