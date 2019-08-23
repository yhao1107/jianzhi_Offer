package 包含min函数的栈;
import java.util.Stack;
/*
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
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
