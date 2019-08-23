package 从尾到头打印链表;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Solution {
	
	ArrayList<Integer> list =new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		if(listNode!=null) {
			printListFromTailToHead(listNode.next);
			list.add(listNode.val);
		}
		return list;
		
	}
	

	
	/*
public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	Stack<Integer> stack=new Stack<Integer>();
	ArrayList<Integer> list=new ArrayList<Integer>();
	while(listNode!=null) {
		stack.push(listNode.val);
		listNode=listNode.next;
		
	}
	while(!stack.isEmpty()) {
		list.add(stack.pop());
	}
	return list;
	
        
    }
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
