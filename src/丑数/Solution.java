package ����;
/*
 * ��ֻ����������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ������������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 */
public class Solution {
	
	  public static int GetUglyNumber_Solution(int index) {
		  if(index<7)return index;
		  int [] a=new int[index];
		  a[0]=1;
		  int i2=0,i3=0,i5=0;
		  for(int i=1;i<index;i++) {
			  a[i]=Math.min(a[i2]*2, Math.min(a[i3]*3,a[i5]*5));
			  if(a[i2]*2==a[i]) i2++;
			  if(a[i3]*3==a[i]) i3++;
			  if(a[i5]*5==a[i]) i5++;
		  }
		  return a[index-1];
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int out=GetUglyNumber_Solution(7);
		System.out.println(out);

	}

}
