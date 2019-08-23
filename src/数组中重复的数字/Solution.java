package 数组中重复的数字;

public class Solution {
	
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		if(numbers==null) {
			return false;
		}
		int [] temp=new int[length];
		for(int i=0;i<length;i++) {
			if(temp[numbers[i]]==1) {
				duplication[0]=numbers[i];
				return true;
			}else {
				temp[numbers[i]]=1;
			}
			
		}
		return false;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		int [] a= {2,3,1,5,2,4,3,6,0};
		int [] d= {0};
		boolean b=s.duplicate(a, a.length, d);
		System.out.println(b);
		System.out.println(d[0]);
		

	}

}
