package ��ֵ�������η�;

/*
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 */
public class Solution {
	
    public double Power(double base, int exponent) {
    	if(base==0)return 0;
    	//if(exponent==0)return 1.0;
    	double sum=1;
		for(int i=1;i<=Math.abs(exponent);i++) {
    		sum=sum*base;
    	}
        if(exponent<0) {
        	sum=1/sum;
        }
    
    	return sum;
        
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s=new Solution();
		double d=s.Power(2.12354123456, -3);
		System.out.println(d);

	}

}
