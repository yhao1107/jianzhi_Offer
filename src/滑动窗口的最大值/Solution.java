package 滑动窗口的最大值;

import java.util.ArrayList;

/*
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 *  针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
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
        //双端队列，用来记录每个窗口的最大值下标
        LinkedList<Integer> qmax = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            while (!qmax.isEmpty() && num[qmax.peekLast()] < num[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            //判断队首元素是否过期
            if (qmax.peekFirst() == i - size) {
                qmax.pollFirst();
            }
            //向result列表中加入元素
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
