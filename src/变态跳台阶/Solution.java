package ��̬��̨��;

/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 * */
public class Solution {
	
public int JumpFloorII(int target) {
	//int sum=1;
/*
	if(target==0)return -1;
  if(target==1) {
      return 1;
    }
   int sum=1;
   for(int i=0;i<=target-2;i++) {
      sum*=2;
   }


    return sum;
    */
	if(target==0)return -1;
	if(target==1) {
		return 1;
	}	
	return 2*JumpFloorII(target-1);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s = new Solution();
        int a=s.JumpFloorII(8);
        System.out.println(a);
	}

}
