package 从上往下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Solution {
    /*public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
		ArrayList<Integer> list=new ArrayList<Integer>();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		if(root==null) {
			return list;
		}
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode treenode=queue.poll();
			if(treenode.left!=null) {
				queue.offer(treenode.left);
			}
			if(treenode.right!=null) {
				queue.offer(treenode.right);
			}
			list.add(treenode.value);
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
}
