package ˳ʱ���ӡ����;

import java.util.ArrayList;

/*
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Solution {
	 public ArrayList<Integer> printMatrix(int [][] array) {
	
			 ArrayList<Integer> result = new ArrayList<Integer> ();
			         if(array.length==0) return result;
			         int n = array.length,m = array[0].length;
			         if(m==0) return result;
			         int layers = (Math.min(n,m)-1)/2+1;//����ǲ���
			         for(int i=0;i<layers;i++){
			             for(int k = i;k<m-i;k++) result.add(array[i][k]);//������
			             for(int j=i+1;j<n-i;j++) result.add(array[j][m-i-1]);//����������
			             for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(array[n-i-1][k]);//������
			             for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(array[j][i]);//����������
			         }
			         return result;       
			     
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
