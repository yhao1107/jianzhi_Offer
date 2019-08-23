package 变态跳台阶;

/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
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
