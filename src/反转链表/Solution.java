package ��ת����;
/*
 * ����һ��������ת��������������ı�ͷ��
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
