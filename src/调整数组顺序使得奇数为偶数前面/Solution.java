package ��������˳��ʹ������Ϊż��ǰ��;

//import java.util.ArrayList;

/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
 * ���е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
 */
public class Solution {
	

	public void reOrderArray(int [] array) {
           int k=0;//��¼���ҵ��������ĸ���
	       for(int i=0;i<array.length;i++) {
			    if(array[i]%2==1) {
				   int temp=array[i];
				   int j=i;
				   while(j>k) {
					   array[j]=array[j-1];
					   j--;
					   
				   }
				   array[j]=temp;
				   k++;						   
				}
			    
		    }
		         
   }
	
	/*
	   public void reOrderArray(int [] array) {
		   for(int i=0;i<array.length;i++) {
			   if(array[i]%2==0) {
				   for(int j=i+1;j<array.length;j++) {
					   if(array[j]%2!=0) {
						   removeArray(array,i,j);
						   break;
					   }
				   }
			   }
		   }
	
	        
	    }
	   public void removeArray(int [] array,int i,int j) {
		   int temp=array[j];
		   for(;j>i;j--) {
			   array[j]=array[j-1];
			   
		   }
		   array[i]=temp;
	   }
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s=new Solution();
		int [] a= {1,3,5,4,6,7,8,9};
		s.reOrderArray(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}

	}

}
