package ������������˫������;

import java.util.Stack;

/*
 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 */
public class Solution {
	  //�ǵݹ��㷨
	  public TreeNode Convert(TreeNode pRootOfTree) {
		  if(pRootOfTree==null)return null;
		  Stack<TreeNode> stack=new Stack<TreeNode>();
		  TreeNode pre=null;//���ڱ�������������е���һ�ڵ�
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
