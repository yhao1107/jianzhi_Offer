package ��ΪS������������;

import java.util.ArrayList;

/*
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
 * ���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 * û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
 * ���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
 * */

public class Solution {
	
	 public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		 ArrayList<ArrayList<Integer>> arraylist=new ArrayList<ArrayList<Integer>>();
		 arraylist=findHelp(arraylist,sum,1);
		 return arraylist;
	       
	    }
	 public ArrayList<ArrayList<Integer> > findHelp(ArrayList<ArrayList<Integer>> arraylist, int s,int n) {
		 if(n+1>s)return arraylist;
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 int m=0;
		 int i=n;
		 for(;i<=s;i++) {
			 list.add(i);
			 m+=i;
			 if(m==s) {
				 arraylist.add(list);
				 break;
			 }
			 if(m>s)break;			 
		 }
		 return findHelp(arraylist,s,n+1);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer> > arraylist = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer > arr = new ArrayList<Integer>();
		Solution s=new Solution();
		arraylist=s.FindContinuousSequence(1001);
		for(int i=0;i<arraylist.size();i++) {
			arr=arraylist.get(i);
			for(int j=0;j<arr.size();j++) {
				System.out.print(arr.get(j)+" ");
			}
			System.out.println();
		}

	}

}
