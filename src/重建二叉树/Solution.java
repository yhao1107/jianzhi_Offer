package 重建二叉树;

/*
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Solution {
	    
	 public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		 
		 TreeNode root=funtion(pre,0,pre.length-1, in,0,in.length-1);
		 return root;
		 
	    }
	 public TreeNode funtion(int [] pre,int preStart,int preEnd,int [] in,int inStart,int inEnd) {
		 
		 if(preStart>preEnd||inStart>inEnd)return null;
		 int i=inStart;
		 TreeNode root=new TreeNode(pre[preStart]);
		 for(;i<=inEnd;i++) {
			 if(in[i]==pre[preStart])break;
		 }
		 root.left=funtion(pre,preStart+1,preStart+(i-inStart),in,inStart,i-1);
		 root.right=funtion(pre,preStart+(i-inStart)+1,preEnd,in,i+1,inEnd);
         /*

			我的理解是从startPre位置越过左孩子及其子节点的偏移量
			（即i-startIn，因为startIn和i之间全是i这个元素的左孩子及其子节点）再往下一个节点走（即右孩子起始点），
			如果写成startPre+(i-startIn)+1可能要容易看懂些，不对的话请指正哈
			*/
		 return root;
	 }
}
