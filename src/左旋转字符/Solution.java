package ����ת�ַ�;

/*
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
 * ����һ���������ַ�����S���������ѭ������Kλ������������
 * ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 */
public class Solution {
	
    public String LeftRotateString(String str,int n) {
    	if(str==null||str.length()<n)return "";
        String strIndex=str.substring(0,n);
        String strEnd=str.substring(n, str.length());
        return strEnd+strIndex;
    }
    /*
     * ���ӣ�https://www.nowcoder.com/questionTerminal/12d959b108cb42b1ab72cef4d36af5ec?f=discussion
��Դ��ţ����

public String LeftRotateString(String str,int n) {
        char[] chars = str.toCharArray();        
        if(chars.length < n) return "";
        reverse(chars, 0, n-1);
        reverse(chars, n, chars.length-1);
        reverse(chars, 0, chars.length-1);
        StringBuilder sb = new StringBuilder(chars.length);
        for(char c:chars){
            sb.append(c);
        }
        return sb.toString();
    }
     
    public void reverse(char[] chars,int low,int high){
        char temp;
        while(low<high){
            temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }
    }
     */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		String outstr=s.LeftRotateString("asdfljkl", 4);
		System.out.println(outstr);

	}

}
