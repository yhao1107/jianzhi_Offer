package 쳲���������;

/*/
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
n<=39
 */
public class Solution {
    public int Fibonacci(int n) {
        
        if(n==0)return 0;
        if(n==1||n==2)return 1;
        if(n==3)return 2;
        return Fibonacci(n-1)+Fibonacci(n-2);

    }
   
    public static void main(String [] args) {
    	
    }
    

}
