package ��ʾ��ֵ���ַ���;
/*
 * ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С���������磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ�� ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
 */
public class Solution {
	/*nb�ķ���
	  public static boolean isNumeric(char[] str) {
	
			   String string = String.valueOf(str);
			          return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
	        
	    }
*/
	/*ţ�Ƶķ���
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
		 //signal��ʾ���ţ�decimal��ʾС���㣬hasE��ʾ���з���e
        boolean signal = false,decimal = false,hasE = false;
        for(int i=0;i<str.length;i++) {
        	if(str[i]=='e'||str[i]=='E') {
        		//e������������֣�e���������һ��
        		if(i==str.length-1)return false;
        		//����������e
        		if(hasE)return false;
        		hasE=true;
        	}else if(str[i]=='-'||str[i]=='+') {
        		//�ڶ���+-�ű�����e�ĺ���
        		if(signal&&str[i-1]!='E'&&str[i-1]!='e') {
        			return false;        			
        		}
        		//��һ��+-�ű����ڵ�һλ����һλû�з���+-�ű�����e�ĺ���
        		if(!signal&&i>0&&str[i-1] != 'E' && str[i-1] != 'e') {
        			return false;        			
        		}
        		signal=true;
        		
        	}else if(str[i]=='.') {
        		//���������һλ
        		if(i==str.length-1)return false;
        		//�������e����e����ΪС����ͨ��
        	    if(hasE){                  
                    return false;                                       
                }
        	    //����������С����
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
