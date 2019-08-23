package 序列化二叉树;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class Solution {

    String Serialize(TreeNode root) {
    	
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
        StringBuffer strb=new StringBuffer();
        if(root!=null) queue.offer(root);    
        while(!queue.isEmpty()) {
        	TreeNode node=queue.poll();
        	if(node!=null) {
        		queue.offer(node.left);
        		queue.offer(node.right);
        		strb.append(node.val+",");
        	}else {
        		strb.append("#"+",");
        	}
        }
        if(strb.length()!=0) {
        	strb.deleteCharAt(strb.length()-1);
        }
        return strb.toString();
  }
    
    TreeNode Deserialize(String str) {
    	if(str.length()<=0)return null;
    	String[] str1=str.split(",");
    	return Deserialize(str1,-1);
    	
       
  }
    TreeNode Deserialize(String[] str2,int index) {
    	index++;
    	TreeNode treeNode=null;
    	if(index>=str2.length) {
    		return null;
    	}
    	if(!str2[index].equals("#")) {
    		treeNode=new TreeNode(Integer.valueOf(str2[index]));
    		treeNode.left=Deserialize(str2,index);
    		treeNode.left=Deserialize(str2,index+1);
    	}
    	return treeNode;
    }
}
