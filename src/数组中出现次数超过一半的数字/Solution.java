package �����г��ִ�������һ�������;
/*
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
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
				   if(map.get(array[i])>mid)return array[i];//���������Сֻ��1
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
