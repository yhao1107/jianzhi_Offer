package �����˵��˶���Χ;
/*
 * ������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ��
 * ���ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ� ���磬��kΪ18ʱ���������ܹ����뷽��35,37����
 * ��Ϊ3+5+3+7 = 18�����ǣ������ܽ��뷽��35,38������Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
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
