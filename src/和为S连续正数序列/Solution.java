package 和为S连续正数序列;

import java.util.ArrayList;

/*
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
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
