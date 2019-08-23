package 字符流中第一个不重复的字符;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	
	HashMap<Character,Integer> map=new HashMap<>();
	ArrayList<Character> list=new ArrayList<Character>();
	
	   //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)) {
        	map.put(ch, map.get(ch)+1);
        }else {
        	map.put(ch, 1);
        }
        list.add(ch);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
       
        for(char k:list) {
        	if(map.get(k)==1) {       		
        		return k;
        	}
        }
        return '#';
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="asfkjhkj";
        Solution s=new Solution();
        for(int i=0;i<str.length();i++) {
        	s.Insert(str.charAt(i));
        }
        
        char out=s.FirstAppearingOnce();
        System.out.println(out);
	}

}
