package 两个链表的第一个公共节点;

import java.util.HashMap;
/*
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class Solution {
	 public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 
		 HashMap<ListNode,Integer> map=new HashMap<ListNode,Integer>();
		 while(pHead1!=null) {
				 map.put(pHead1, 1);	
				 pHead1=pHead1.next;
		 }
		 while(pHead2!=null) {
			 if(map.containsKey(pHead2))return pHead2;
			 pHead2=pHead2.next;
		 }
		 
		 return null;
	    }

}
