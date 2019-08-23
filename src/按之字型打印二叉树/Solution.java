package 按之字型打印二叉树;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Solution {
	 public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		 ArrayList<ArrayList<Integer> > lists=new ArrayList<ArrayList<Integer> >();
		 Queue<TreeNode> queue=new LinkedList<TreeNode>();
		 if(pRoot==null)return lists;
		 queue.offer(pRoot);
		 int deep=0;//深度
		 while(!queue.isEmpty()) {
			 deep++;
			 ArrayList<Integer> list=new ArrayList<Integer>();
			 if(deep%2==1) {//奇数层

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
