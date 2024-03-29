package 左旋转字符;

/*
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class Solution {
	
    public String LeftRotateString(String str,int n) {
    	if(str==null||str.length()<n)return "";
        String strIndex=str.substring(0,n);
        String strEnd=str.substring(n, str.length());
        return strEnd+strIndex;
    }
    /*
     * 链接：https://www.nowcoder.com/questionTerminal/12d959b108cb42b1ab72cef4d36af5ec?f=discussion
来源：牛客网

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
