package 数组中出现次数超过一半的数字;
/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */

import java.util.HashMap;

public class Solution {
	
	   public static int MoreThanHalfNum_Solution(int [] array) {
		   //if(array.length<=0)return 0;
		   
		   HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		   int mid=array.length/2;
		   for(int i=0;i<array.length;i++) {
			   if(map.containsKey(array[i])) {
				   map.put(array[i], map.get(array[i])+1);
				   if(map.get(array[i])>mid)return array[i];
			   }else {
				   map.put(array[i], 1);
				   if(map.get(array[i])>mid)return array[i];//避免数组大小只有1
			   }
		   }
		   return 0;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,2,4,5,2,4,2,2,2,3,5,2,2};
		
		System.out.println(MoreThanHalfNum_Solution(a));

	}

}
