package ������ֻ����һ�ε�����;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε�����.
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
