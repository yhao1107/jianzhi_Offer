package 二叉搜索树的第k个小的节点;


import java.util.Stack;

/*
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4
 */
public class Solution {
	TreeNode KthNode(TreeNode pRoot, int k)
    {   
	
		Stack<TreeNode> stack=new Stack<TreeNode>();
        if(pRoot==null||k<=0)return null;
        TreeNode root=pRoot;
        int c=0;
        while(root!=null||!stack.isEmpty()) {
        	
        	if(root!=null) {
        		stack.push(root);
        		root=root.left;
        	}else {
        			root=stack.pop();
            		c++;
            		if(c==k)return root;
            		root=root.right;          		
        	}      	
        	
        }
        return null;
    }

}
