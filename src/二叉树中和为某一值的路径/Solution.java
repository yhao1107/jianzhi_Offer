package 二叉树中和为某一值的路径;
/*
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */


import java.util.ArrayList;

public class Solution {
	
	ArrayList<ArrayList<Integer>> arraylist=new ArrayList<ArrayList<Integer>>();
	 public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 if(root!=null) {
			 funtionTree(root,list,0,target);
		 }
	
	     return arraylist;
	  }
	 public void funtionTree(TreeNode root,ArrayList<Integer> list,int sum,int target) {
        sum=sum+root.val;
		 list.add(root.val);
		 if(root.left==null&&root.right==null) {
			 if(sum==target) {
				 arraylist.add(list);
			 }
			 return ;
		 }
		 ArrayList<Integer> list2=new ArrayList<Integer>();
		 list2.addAll(list);
		 if(root.left!=null)funtionTree(root.left,list,sum,target);
		 if(root.right!=null)funtionTree(root.right,list2,sum,target);
		 
		 
	 }
	 /*
	  * 大佬简洁的解法
	  * 链接：https://www.nowcoder.com/questionTerminal/b736e784e3e34731af99065031301bca
来源：牛客网

    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) return listAll;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            listAll.add(new ArrayList<Integer>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        return listAll;
    }
	  */

}
