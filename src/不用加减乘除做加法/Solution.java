package ���üӼ��˳����ӷ�;

/*
 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
 */
public class Solution {
	
	  public static int Add(int num1,int num2) {
		  while(num2!=0) {
			  int temp=num1^num2;
			  num2=(num1&num2)<<1;
			  num1=temp;
		  }
		  return num1;
		  
	        
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print(Add(12,15));
	}

}
