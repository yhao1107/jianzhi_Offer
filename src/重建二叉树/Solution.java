package �ؽ�������;

/*
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
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

			�ҵ�����Ǵ�startPreλ��Խ�����Ӽ����ӽڵ��ƫ����
			����i-startIn����ΪstartIn��i֮��ȫ��i���Ԫ�ص����Ӽ����ӽڵ㣩������һ���ڵ��ߣ����Һ�����ʼ�㣩��
			���д��startPre+(i-startIn)+1����Ҫ���׿���Щ�����ԵĻ���ָ����
			*/
		 return root;
	 }
}
