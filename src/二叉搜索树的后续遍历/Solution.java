package �����������ĺ�������;


/*
 * 
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
 * 
 * */
public class Solution {
	
	
	 public boolean VerifySquenceOfBST(int [] sequence) {
		 if(sequence.length<=0)return false;
	        int temp=0;
	        for(int i=sequence.length-2;i>=0;i--){
	            if(sequence[i]<sequence[sequence.length-1]&&i!=0){
	                for(int j=i-1;j>=0;j--){
	                    if(sequence[j]>sequence[sequence.length-1])
	                        return false;
	                }
	            }
	        }
	        return true;
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Solution s=new Solution();
         int[] a= {1,3,5,4,2};
         boolean b=s.VerifySquenceOfBST(a);
         System.out.println(b);
	}

}
