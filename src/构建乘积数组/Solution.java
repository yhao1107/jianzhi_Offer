package �����˻�����;
/*
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
 */
public class Solution {
	
    public static int[] multiply(int[] A) {
    	if(A.length<=0)return A;
    	int[] B=new int[A.length];
    	B[0]=1;
    	
    		for(int i=1;i<A.length;i++) {
    	    	   B[i]=B[i-1]*A[i-1];
    	    		
    	    	}
    	    	int temp=1;
    	    	for(int j=A.length-2;j>=0;j--) {
    	    		temp*=A[j+1];
    	    		B[j]*=temp;
    	    	}
    
    	
    	return B;
    	

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,2,3,4,5};
		int[] B=multiply(A);
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i]+" ");
		}

	}

}
