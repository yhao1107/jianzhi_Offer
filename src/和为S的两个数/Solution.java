package ��ΪS��������;
import java.util.ArrayList;
/*
 * ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 */

public class Solution {
	
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
    	   
           ArrayList<Integer> list = new ArrayList<>();
           if(array==null||array.length<2)return list;
           int temp=Integer.MAX_VALUE;
           int a=0,b=0;
           for(int i=0;i<array.length;i++) {
        	   for(int j=i+1;j<array.length;j++) {
        		   if(array[i]+array[j]==sum&&array[i]*array[j]<temp) {
        			  temp=array[i]*array[j];
        			  a=array[i];
        			  b=array[j];
        		   }
        	   }
           }
           if(a==0||b==0) {
        	   return list;
           }else {
        	   list.add(a);
    		   list.add(b);
    		   return list;
           }
           
           /*
            * ���Ǵ���Ľⷨ
		
		 public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		        ArrayList<Integer> list = new ArrayList<Integer>();
		        if (array == null || array.length < 2) {
		            return list;
		        }
		        int i=0,j=array.length-1;
		        while(i<j){
		            if(array[i]+array[j]==sum){
		            list.add(array[i]);
		            list.add(array[j]);
		                return list;
		           }else if(array[i]+array[j]>sum){
		                j--;
		            }else{
		                i++;
		            }
		             
		        }
		        return list;
		    }
            */
          
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		Solution s=new Solution();
		int[] a= {1,2,4,7,11,16};
		int sum=10;
		list=s.FindNumbersWithSum(a, sum);
		for(int x:list) {
			System.out.println(x);
		}

	}

}
