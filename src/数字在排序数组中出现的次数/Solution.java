package 数字在排序数组中出现的次数;

public class Solution {
	
	 public int GetNumberOfK(int [] array , int k) {
		 if(array==null||array.length<=0)return 0;
		 int n=0;
		 int start=0;
		 int end=array.length-1;
		 int mid=0;
		 while(start<=end) {
			 mid=(start+end)/2;
			 if(array[mid]==k) {
				 n++;
				 break;
			 }
			 if(array[mid]>k) {
				 end=mid-1;
			 }else if(array[mid]<k) {
				 start=mid+1;
			 }
		 }
		 for(int i=mid+1;i<array.length;i++) {
			 if(array[i]==k) {
				 n++;
			 }else {
				 break;
			 }
		 }
		 for(int j=mid-1;j>=0;j--) {
			 if(array[j]==k) {
				 n++;
			 }else {
				 break;
			 }
		 }
	     return n;
	    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s=new Solution();
		int k=7;
		int [] arr= {5,6,7,8,9,9};
		int count=s.GetNumberOfK(arr, k);
		System.out.println(count);

	}

}
