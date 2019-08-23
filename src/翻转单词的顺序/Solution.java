package 翻转单词的顺序;

import java.util.Stack;

public class Solution {
	
/*
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。
 * 后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
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
