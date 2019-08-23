package 反转链表;
/*
 * 输入一个链表，反转链表后，输出新链表的表头。
 */


public class Solution {
	 
	 public ListNode ReverseList(ListNode head) {
		 ListNode newHead=null;
		 ListNode nextNode=null;
		 if(head==null)return null;
		 while(head!=null) {
			 nextNode=head.next;
			 head.next=newHead;
			 newHead=head;
			 head=nextNode;
			 
			 			 
		 }
       return newHead;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
