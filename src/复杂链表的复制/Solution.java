package ��������ĸ���;
/*
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 */
public class Solution {
	
	
	public RandomListNode Clone(RandomListNode pHead){
		if(pHead==null)return null;
		//��������A�ڵ㸴�Ƶ�A1�ڵ�Ȼ����뵽A �ڵ�ĺ���
		RandomListNode curNode=pHead;
		while(curNode!=null) {
			RandomListNode newNode=new RandomListNode(curNode.label);
			RandomListNode nextNode=curNode.next;
			curNode.next=newNode;
			newNode.next=nextNode;		
			curNode=nextNode;
		}
		
		//�ڱ���һ������������ָ�븴�Ƶ��ֵܽڵ㣻
		curNode=pHead;
		while(curNode!=null) {
			if(curNode.random==null) {
				curNode.next.random=null;
			}else {
				curNode.next.random=curNode.random.next;
			}
			curNode=curNode.next.next;
		}
		
		//�������
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
