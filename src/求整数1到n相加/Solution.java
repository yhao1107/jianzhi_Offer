package ������1��n���;
/*
 * ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C��
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
