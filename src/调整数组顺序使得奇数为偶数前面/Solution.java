package 调整数组顺序使得奇数为偶数前面;

//import java.util.ArrayList;

/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution {
	

	public void reOrderArray(int [] array) {
           int k=0;//记录已找到的奇数的个数
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
