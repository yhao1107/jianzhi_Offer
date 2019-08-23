package 连续子数组的最大和;

public class Solution {
	
	 public static int FindGreatestSumOfSubArray(int[] array) {
		 if(array==null||array.length<=0)return 0;
		 int n=Integer.MIN_VALUE;
		 for(int i=0;i<array.length;i++) {
			 int temp=array[i];
			 if(temp>n)n=array[i];
			 for(int j=i+1;j<array.length;j++) {
				 temp=temp+array[j];
				 if(temp>n)n=temp;
			 }
		 }
	    return n;     
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {6,-3,-2,7,-15,1,2,2};
		int m=FindGreatestSumOfSubArray(a);
		System.out.println(m);

	}

}
