package �������ڵ����ֵ;

import java.util.ArrayList;

/*
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ�����磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ����ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}��
 *  �������{2,3,4,2,6,2,5,1}�Ļ�������������6���� {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
 */
public class Solution {
	 public ArrayList<Integer> maxInWindows(int [] num, int size){
		 ArrayList<Integer> list=new ArrayList<>();
		 if(num.length<=0||size<=0)return list;
		 for(int i=0;i<num.length-size;i++) {
			 int max=maxNum(num,i,i+size);
			 list.add(max);		 
		 }
		 return list;
		 
	        
	 }
	 public int maxNum(int [] num,int start,int end) {
		 int temp=Integer.MIN_VALUE;
		 for(int i=start;i<=end;i++) {
			 if(num[i]>temp) {
				 temp=num[i];
			 }
		 }
		 return temp;
		 
	 }
	 /*


public ArrayList<Integer> maxInWindows(int [] num, int size) {
        if (num == null || num.length == 0 || size <= 0 || num.length < size) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        //˫�˶��У�������¼ÿ�����ڵ����ֵ�±�
        LinkedList<Integer> qmax = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            while (!qmax.isEmpty() && num[qmax.peekLast()] < num[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            //�ж϶���Ԫ���Ƿ����
            if (qmax.peekFirst() == i - size) {
                qmax.pollFirst();
            }
            //��result�б��м���Ԫ��
            if (i >= size - 1) {
                result.add(num[qmax.peekFirst()]);
            }
        }
        return result;
    }
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
