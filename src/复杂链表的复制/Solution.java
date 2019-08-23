package 复杂链表的复制;
/*
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Solution {
	
	
	public RandomListNode Clone(RandomListNode pHead){
		if(pHead==null)return null;
		//复制链表，A节点复制的A1节点然后插入到A 节点的后面
		RandomListNode curNode=pHead;
		while(curNode!=null) {
			RandomListNode newNode=new RandomListNode(curNode.label);
			RandomListNode nextNode=curNode.next;
			curNode.next=newNode;
			newNode.next=nextNode;		
			curNode=nextNode;
		}
		
		//在遍历一次链表，将无向指针复制到兄弟节点；
		curNode=pHead;
		while(curNode!=null) {
			if(curNode.random==null) {
				curNode.next.random=null;
			}else {
				curNode.next.random=curNode.random.next;
			}
			curNode=curNode.next.next;
		}
		
		//拆分链表
		RandomListNode nHead=pHead.next;
		curNode=pHead;
		while(curNode!=null) {
			RandomListNode cloneNode=curNode.next;
			curNode.next=cloneNode.next;
			if(cloneNode.next!=null) {
				
				cloneNode.next=cloneNode.next.next;
				
			}else {
				curNode.next=null;
				cloneNode.next=null;
			}
			curNode=curNode.next;
		}
		return nHead;
		
	      
	}

}
