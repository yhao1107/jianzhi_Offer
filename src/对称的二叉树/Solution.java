package 对称的二叉树;

/*
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class Solution {
	
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null)return true;
        
        return TreeHelp(pRoot.left,pRoot.right);
           	
    }
    boolean TreeHelp(TreeNode leftNode,TreeNode rightNode) {
    	if(leftNode==null&&rightNode==null)return true;
    	if(leftNode==null||rightNode==null)return false;
    	if(leftNode.val==rightNode.val) {
    		return TreeHelp(leftNode.left,rightNode.right)&&TreeHelp(leftNode.right,rightNode.left);
    	}else {
    		return false;
    	}
    	
    }
    
    /*
     * 这是用入栈的方法来的
	
	 boolean isSymmetricalDFS(TreeNode pRoot)
	    {
	        if(pRoot == null) return true;
	        Stack<TreeNode> s = new Stack<>();
	        s.push(pRoot.left);
	        s.push(pRoot.right);
	        while(!s.empty()) {
	            TreeNode right = s.pop();//成对取出
	            TreeNode left = s.pop();
	            if(left == null && right == null) continue;
	            if(left == null || right == null) return false;
	            if(left.val != right.val) return false;
	            //成对插入
	            s.push(left.left);
	            s.push(right.right);
	            s.push(left.right);
	            s.push(right.left);
	        }
	        return true;
	    }
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
