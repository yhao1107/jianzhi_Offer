package 数组中只出现一次的数字;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字.
 */
public class Solution {
	
	   public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		   HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		   
		   for(int i=0;i<array.length;i++) {
			   if(!map.containsKey(array[i])) {
				   map.put(array[i], 1);
				   
			   }else {
				   map.put(array[i], map.get(array[i])+1);
			   }
			   
		   }
		   num1[0]=0;
		   for(int i=0;i<array.length;i++) {
			   if(map.get(array[i])==0) {
				   if(num1[0]!=0) {
					   num1[0]=array[i];
				   }else {
					   num2[0]=array[i];
				   }
			   }
		   }
		   
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
