package ���ַ���ת��������;
/*
 * ��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�����string����������Ҫ��ʱ����0)��Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
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
