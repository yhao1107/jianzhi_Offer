package 不用加减乘除做加法;

/*
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
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
