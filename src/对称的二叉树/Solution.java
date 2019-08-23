package �ԳƵĶ�����;

/*
 * ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
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
     * ��������ջ�ķ�������
	
	 boolean isSymmetricalDFS(TreeNode pRoot)
	    {
	        if(pRoot == null) return true;
	        Stack<TreeNode> s = new Stack<>();
	        s.push(pRoot.left);
	        s.push(pRoot.right);
	        while(!s.empty()) {
	            TreeNode right = s.pop();//�ɶ�ȡ��
	            TreeNode left = s.pop();
	            if(left == null && right == null) continue;
	            if(left == null || right == null) return false;
	            if(left.val != right.val) return false;
	            //�ɶԲ���
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
