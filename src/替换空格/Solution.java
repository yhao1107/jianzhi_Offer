package 替换空格;

/*
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 */
public class Solution {
	public String replaceSpace(StringBuffer str) {
    	StringBuffer out=new StringBuffer();
    	
    	for(int i=0;i<str.length();i++) {
    		if(str.charAt(i)==' ') {
    			out.append("%20");
    		}else {
    			out.append(str.charAt(i));
    		}
    	}
    	return out.toString();
	   
    }
	
	/*
	 public String replaceSpace(StringBuffer str) {
	    	
		    
	        String newstr=str.toString();
	        return  newstr.replace(" ","%20");
	    }
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s=new Solution();
        StringBuffer strf=new StringBuffer("hello word");
        String returnStr=s.replaceSpace(strf);
        System.out.println(returnStr);
        
	}

}
