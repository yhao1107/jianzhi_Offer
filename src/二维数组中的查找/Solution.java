package ��ά�����еĲ���;

/*
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �������һ������������������һ����ά�����һ���������ж��������Ƿ��и�����
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
