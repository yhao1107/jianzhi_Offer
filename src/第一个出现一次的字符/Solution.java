package ��һ������һ�ε��ַ�;
import java.util.HashMap;
/*
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
 * */

public class Solution {

	
	public int FirstNotRepeatingChar(String str) {
		HashMap<Character,Integer> map=new HashMap<>();
		if(str==null)return -1;
		int length=str.length();
		for(int i=0;i<length;i++) {
			if(map.containsKey(str.charAt(i))) {
				int value=map.get(str.charAt(i));
				map.put(str.charAt(i), value+1);
			}else {
				map.put(str.charAt(i), 1);
				
			}
		}
		for(int i=0;i<length;i++) {
			if(map.get(str.charAt(i))==1) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int n=s.FirstNotRepeatingChar("jlsnljssfjep");
		System.out.println(n);

	}
}
