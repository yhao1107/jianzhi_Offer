package �˿���˳��;

import java.util.Arrays;

/*
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
 * ��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
 * ������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,��������,������\С �����Կ�
 * ���κ�����,����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����
 * LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Σ� ����������˳�Ӿ����true����������false��Ϊ�˷������,�������Ϊ��С����0��
 */
public class Solution {
	
	 public static boolean isContinuous(int [] numbers) {
		    if(numbers.length<5)return false;
            Arrays.sort(numbers);
            int c=0;
            for(int i=0;i<numbers.length-1;i++) {
            	if(numbers[i]==0) {
            		c++;
            	}else {
            		int t=numbers[i+1]-numbers[i];
            		if(t==0)return false;
            		if(t>1) {
            			c=c-t+1;
            		}
            	}
            }
            return c<0?false:true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,0,6,3,5};
		System.out.print(isContinuous(a));

	}

}
