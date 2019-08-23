package 合并两个排序的链表;

/*
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Solution {
	
	  public ListNode Merge(ListNode list1,ListNode list2) {
		  
	        if(list1==null)return list2;
	          if(list2==null)return list1;
	        ListNode pre=new ListNode(0);
	        ListNode list3=pre;
	        boolean startNode=true;
	        while(list1!=null&&list2!=null){
	            if(list1.val<list2.val){
	                
	                pre.next=list1;
	                pre=list1;
	                list1=list1.next;
	            }else{
	                pre.next=list2;
	                pre=list2;
	                list2=list2.next;
	               
	            }
	        }
	        if(list1!=null){
	            pre.next=list1;
	        }
	        if(list2!=null){
	            pre.next=list2;
	        }
	        return list3.next;
	    }
	  /*
	   * 大佬的方法
	   *  
	 public ListNode Merge(ListNode list1,ListNode list2) {

           链接：https://www.nowcoder.com/questionTerminal/d8b6b4358f774294a89de2a6ac4d9337
      来源：牛客网

        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode res = null;
        if(list1.val<list2.val){
            res = list1;
            res.next = Merge(list1.next, list2);
        }else{
            res = list2;
            res.next = Merge(list1, list2.next);
        }
        return res;       
    }
	   */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
