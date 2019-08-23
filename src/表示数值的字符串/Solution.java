package 表示数值的字符串;
/*
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class Solution {
	/*nb的方法
	  public static boolean isNumeric(char[] str) {
	
			   String string = String.valueOf(str);
			          return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
	        
	    }
*/
	/*牛逼的方法
	public static boolean isNumberic(char[] str) {

			 try {
			            double re = Double.parseDouble(new String(str));
			        } catch (NumberFormatException e) {
			            return false;
			        }
			        return true;
	}
	*/
	public static boolean isNumberic(char[] str) {
		 //signal表示符号，decimal表示小树点，hasE表示含有符号e
        boolean signal = false,decimal = false,hasE = false;
        for(int i=0;i<str.length;i++) {
        	if(str[i]=='e'||str[i]=='E') {
        		//e后面必须有数字，e不能再最后一个
        		if(i==str.length-1)return false;
        		//不能有两个e
        		if(hasE)return false;
        		hasE=true;
        	}else if(str[i]=='-'||str[i]=='+') {
        		//第二个+-号必须在e的后面
        		if(signal&&str[i-1]!='E'&&str[i-1]!='e') {
        			return false;        			
        		}
        		//第一个+-号必须在第一位，第一位没有符号+-号必须在e的后面
        		if(!signal&&i>0&&str[i-1] != 'E' && str[i-1] != 'e') {
        			return false;        			
        		}
        		signal=true;
        		
        	}else if(str[i]=='.') {
        		//不能再最后一位
        		if(i==str.length-1)return false;
        		//如果存在e并且e后面为小数则不通过
        	    if(hasE){                  
                    return false;                                       
                }
        	    //不能有两个小数点
        	    if(decimal)return false;
        	    decimal=true;
        	}else if(str[i]<'0'||str[i]>'9') {
        		return false;
        	}
        }
        return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c= {'+'};
		System.out.print(isNumberic(c));

	}

}
