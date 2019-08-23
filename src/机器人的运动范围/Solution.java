package 机器人的运动范围;
/*
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），
 * 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Solution {
	 public int movingCount(int threshold, int rows, int cols){
		 int[][] flag=new int[rows][cols];
		 return helper(0,0,threshold,rows,cols,flag);
	        
	 }
	 
	 public int helper(int i,int j,int threshold,int rows,int cols,int[][] flag) {
		 int count=0;
		 if(i<0||j<0||i>=rows||j>=cols||sum(i)+sum(j)>threshold||flag[i][j]==1) {
			 return count;
		 }else {
			 count=1;
		 }
		 flag[i][j]=1;
		 return helper(i-1,j,threshold,rows,cols,flag)
				 +helper(i+1,j,threshold,rows,cols,flag)
				 +helper(i,j-1,threshold,rows,cols,flag)
				 +helper(i,j+1,threshold,rows,cols,flag)
				 +count;
	 }
	 

	private int sum(int i) {
		int s=0;
		while(i>0) {
			s+=i%10;
			i=i/10;
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
