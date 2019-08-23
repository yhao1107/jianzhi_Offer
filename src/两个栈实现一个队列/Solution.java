package 两个栈实现一个队列;

import java.util.Stack;

public class Solution {
	
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) { 
      
        stack1.push(node);
        
    }
    
    public int pop() {
    	if(stack2.isEmpty()) {
    		while(!stack1.isEmpty()) {
    			stack2.push(stack1.pop());
    		}
    	}
    	return stack2.pop();
    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.push(1);
		s.push(5);
		System.out.println(s.pop());
		s.push(6);
		System.out.println(s.pop());
		System.out.println(s.pop());
		

	}

}
