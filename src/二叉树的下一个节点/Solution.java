package ����������һ���ڵ�;
/*
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 */
public class Solution {
	 public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		 if(pNode==null)return null;
		 if(pNode.right!=null) {
			 pNode=pNode.right;
			 while(pNode.left!=null)pNode=pNode.left;
			 return pNode;
		 }
		 while(pNode.next!=null) {
			 if(pNode.next.left==pNode)return pNode.next;
			 pNode=pNode.next;
		 }
		 return null;
	 

    }

}
