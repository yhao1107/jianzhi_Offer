package �������к�Ϊĳһֵ��·��;
/*
 * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
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
	  * ���м��Ľⷨ
	  * ���ӣ�https://www.nowcoder.com/questionTerminal/b736e784e3e34731af99065031301bca
��Դ��ţ����

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
