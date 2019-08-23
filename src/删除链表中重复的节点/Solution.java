package 删除链表中重复的节点;
/*
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Solution {
	   public ListNode deleteDuplication(ListNode pHead){
		   if(pHead==null)return null;
		   if(pHead!=null&&pHead.next==null)return pHead;
		   ListNode head=new ListNode(0);
		   head.next=pHead;
		   ListNode pre=head;
		   ListNode last=head.next;
		   
		   while(last!=null) {
			   if(last.next!=null&&last.val==last.next.val) {
				   while(last.next!=null&&last.val==last.next.val) {
					   last=last.next;
				   }
				   pre.next=last.next;
				  
				   last=last.next;
			   }else {
				   pre=pre.next;
				   last=last.next;
			   }
		   }
		   return head.next;
	    }

}
