package ���ӵ���ϷԲȦ��ʣ��������;

import java.util.LinkedList;

/*
 * ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ��
 * ����,�и���Ϸ��������:����,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,
 * ��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��
 * ������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)
 */
public class Solution {
	public int LastRemaining_Solution(int n, int m) {
	        if(n<=0)return -1;
	        LinkedList<Integer> list=new LinkedList<Integer>();
	        for(int i=0;i<n;i++) {
	        	list.add(i);
	        }
	        int bt=0;//����
	        while(list.size()>1) {
	        	bt=(bt+m-1)%list.size();
	        	list.remove(bt);
	        }
	        return list.size()==1?list.get(0):-1;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
