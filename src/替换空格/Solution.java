package �滻�ո�;

/*
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy
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
