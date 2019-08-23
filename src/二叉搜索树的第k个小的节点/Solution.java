package �����������ĵ�k��С�Ľڵ�;


import java.util.Stack;

/*
 * ����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣���磬 ��5��3��7��2��4��6��8��    �У��������ֵ��С˳�����С����ֵΪ4
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
