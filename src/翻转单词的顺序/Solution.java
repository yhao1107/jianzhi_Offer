package ��ת���ʵ�˳��;

import java.util.Stack;

public class Solution {
	
/*
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼�����磬��student. a am I����
 * ��������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 */
	public static String ReverseSentence(String str) {
		   if(str.trim().equals(""))return str;
		   String[] s=str.split(" ");
		   StringBuffer o=new StringBuffer();
		   int i;
		   for(i=s.length-1;i>=0;i--) {
			   o.append(s[i]);
			   if(i>0)o.append(" ");
		   }
		   
	       return o.toString(); 
	    }

	/*
	  public static String ReverseSentence(String str) {
		  if(str.length()<=0)return str;
		  Stack<String> stack = new Stack<String>();
		  char[] a=str.toCharArray();
		  System.out.println(a.length);
		  
		  String s="";
		  System.out.println(s);
		  for(int i=0;i<a.length;i++) {
			  if(a[i]!=' '&&i<a.length) {				  
				  s=s+a[i];
			  }else {
				  s=" "+s;
				  stack.push(s);
				  s="";
			  }
		  }
		  while(!stack.isEmpty()) {
			  s=s+stack.pop();
		  }
	       return s; 
	    }
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=ReverseSentence("I am a Student");
		System.out.println(str);

	}

}
