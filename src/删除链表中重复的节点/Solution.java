package ɾ���������ظ��Ľڵ�;
/*
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
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
