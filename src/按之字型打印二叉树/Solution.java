package ��֮���ʹ�ӡ������;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
 */
public class Solution {
	 public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		 ArrayList<ArrayList<Integer> > lists=new ArrayList<ArrayList<Integer> >();
		 Queue<TreeNode> queue=new LinkedList<TreeNode>();
		 if(pRoot==null)return lists;
		 queue.offer(pRoot);
		 int deep=0;//���
		 while(!queue.isEmpty()) {
			 deep++;
			 ArrayList<Integer> list=new ArrayList<Integer>();
			 if(deep%2==1) {//������

			     Iterator<TreeNode> it = queue.iterator();
				 while (it.hasNext()) {
					  list.add(it.next().val);
				 }
				 /*
				  *  
				  *  for(TreeNode n:queue){
	                   list.add(n.val);
	               }
				  */
				 
			 }else {		

				 Iterator<TreeNode> it = ((LinkedList<TreeNode>) queue).descendingIterator();
                 while (it.hasNext()) {
                     list.add(it.next().val);
                 }
			 }
			 int cur=0;int size=queue.size();
			 while(cur<size) {
				 TreeNode root=queue.poll();
				 if(root.left!=null)queue.offer(root.left);
				 if(root.right!=null)queue.offer(root.right);
				 cur++;
				 
			 }
			 lists.add(list);
			 
		 }
		 
		 
		 return lists;

	    }
	 

}
