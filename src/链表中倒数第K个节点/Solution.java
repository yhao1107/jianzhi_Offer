package �����е�����K���ڵ�;
/*
 * ����һ����������������е�����k����㡣
 * */

public class Solution {
	
	public ListNode FindKthToTail(ListNode head,int k) {

			if(head==null||k<=0){
			            return null;
			        }
			        ListNode pre=head;
			        ListNode last=head;       
			        for(int i=1;i<k;i++){
			            if(pre.next!=null){
			                pre=pre.next;
			            }else{
			                return null;
			            }
			        }
			        while(pre.next!=null){
			            pre = pre.next;
			            last=last.next;
			        }
			        return last;
			    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
