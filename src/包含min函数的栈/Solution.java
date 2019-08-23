package ����min������ջ;
import java.util.Stack;
/*
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
 */
public class Solution {
	
	Stack<Integer> stack=new Stack<Integer>();
	Stack<Integer> minstack=new Stack<Integer>();

    public void push(int node) {
    	stack.push(node);
    	if(minstack.isEmpty()||node<=minstack.peek()) {
    		minstack.push(node);
    	}
    	
        
    }
    
    public void pop() {
        int temp=stack.pop();
        if(temp==minstack.peek())minstack.pop();
    }
    
    public int top() {
    	return stack.peek();
        
    }
    
    public int min() {
    	return minstack.peek();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
