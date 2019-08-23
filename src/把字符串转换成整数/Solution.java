package 把字符串转换成整数;
/*
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class Solution {
	
	 public static int StrToInt(String str) {
		 
		 if(str==null||str.length()<=0)return 0;
		 boolean isPosotive=true ;
		 char[] ch=str.toCharArray();
		 int i=0;
		 if(ch[0]=='+') {
			i=1; 			 
		 }else if(ch[0]=='-') {
			 isPosotive=false;
			 i=1;
		 }
		 int sum=0;
		 for(;i<ch.length;i++) {
			 
             if(ch[i]<'0'||ch[i]>'9'){
				 return 0;
			 }
			 sum=sum*10+(int)(ch[i]-'0');
			
		 }
		 if(sum==0)return 0;
	
	      return isPosotive==true?sum:-sum;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StrToInt("-12345"));

	}

}
