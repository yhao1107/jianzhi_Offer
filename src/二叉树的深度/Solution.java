package 二叉树的深度;

import java.util.Deque;
import java.util.LinkedList;
//import java.util.Queue;

/*
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * */
public class Solution {
	
	public int TreeDepth(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<TreeNode>(); 		
    	if(root==null)return 0;
    	deque.push(root);    	
    	return fun(deque,1,1);
    }
    //递归调用
    public int fun( Deque<TreeNode> deque,int m,int n) {

    		TreeNode node=deque.peek();//读取栈顶节点
    		if(node.left!=null) { //判断是否有左子树
    			deque.push(node.left);
    			n++;
    			if(n>m)m=n;//保持当前最大计数，深度
    			m=fun(deque,m,n);//递归调用
    			n--;//左子树已经出栈n-1;    			
    		}
    		if(node.right!=null) {
    			deque.push(node.right);
    			n++;
    			if(n>m)m=n;
    			m=fun(deque,m,n);
    			
    		}
    		deque.pop();//出栈   		   	
    	return m;
    
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
