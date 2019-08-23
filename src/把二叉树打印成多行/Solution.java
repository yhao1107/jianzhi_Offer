package 把二叉树打印成多行;

import java.util.ArrayList;

public class Solution {
	

	    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
	    	ArrayList<ArrayList<Integer> > list=new ArrayList<ArrayList<Integer> >();
	    	depth(pRoot,1,list);
	    	return list;
	    
	    }
	    
	    public void depth(TreeNode root,int deep,ArrayList<ArrayList<Integer> > list) {
	    	if(root==null) {
	    		return;
	    	}
	    	if(list.size()<deep) {
	    		list.add(new ArrayList<Integer>());
	    		list.get(deep-1).add(root.val);
	    	}else {
	    		list.get(deep-1).add(root.val);
	    	}
	    	depth(root.left,deep+1,list);
	    	depth(root.right,deep+1,list);
	    	
	    	
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
