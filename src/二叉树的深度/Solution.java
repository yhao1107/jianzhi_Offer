package �����������;

import java.util.Deque;
import java.util.LinkedList;
//import java.util.Queue;

/*
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * */
public class Solution {
	
	public int TreeDepth(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<TreeNode>(); 		
    	if(root==null)return 0;
    	deque.push(root);    	
    	return fun(deque,1,1);
    }
    //�ݹ����
    public int fun( Deque<TreeNode> deque,int m,int n) {

    		TreeNode node=deque.peek();//��ȡջ���ڵ�
    		if(node.left!=null) { //�ж��Ƿ���������
    			deque.push(node.left);
    			n++;
    			if(n>m)m=n;//���ֵ�ǰ�����������
    			m=fun(deque,m,n);//�ݹ����
    			n--;//�������Ѿ���ջn-1;    			
    		}
    		if(node.right!=null) {
    			deque.push(node.right);
    			n++;
    			if(n>m)m=n;
    			m=fun(deque,m,n);
    			
    		}
    		deque.pop();//��ջ   		   	
    	return m;
    
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
