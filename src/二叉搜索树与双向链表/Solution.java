package 二叉搜索树与双向链表;

import java.util.Stack;

/*
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Solution {
	  //非递归算法
	  public TreeNode Convert(TreeNode pRootOfTree) {
		  if(pRootOfTree==null)return null;
		  Stack<TreeNode> stack=new Stack<TreeNode>();
		  TreeNode pre=null;//用于保存中序遍历序列的上一节点
		  TreeNode p=pRootOfTree;
		  boolean isHead=true;
		  while(p!=null||!stack.isEmpty()) {
			  while(p!=null) {
				  stack.push(p);
				  p=p.left;
			  }
			  p=stack.pop();
			  if(isHead) {
				  pRootOfTree=p;
				  pre=p;
				  isHead=false;
			  }else {
				  pre.right=p;
				  p.left=pre;
				  pre=p;
			  }
			  p=p.right;
		  }
		  return pRootOfTree;
	        
	    }

}
