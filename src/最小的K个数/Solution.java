package ��С��K����;

/*
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * */
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;

public class Solution {
	
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	Arrays.sort(input);//�������������
        //ArrayList<Integer> arraylist=new ArrayList<Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(input==null||input.length<=0||input.length<k||k<=0){
            return list;
        }
        /*
        for(int i=0;i<input.length;i++) {
        	arraylist.add(input[i]);
        }
        Collections.sort(arraylist);
        */
        for(int i=0;i<k;i++) {
        	list.add(input[i]);
        }
        for(int i = 0 ; i<list.size();i++){
			System.out.print(list.get(i));
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] a= {2,5,8,7,4,6,9,1,3,0};
		int k=5;
		s.GetLeastNumbers_Solution(a, k);
		

	}

}
