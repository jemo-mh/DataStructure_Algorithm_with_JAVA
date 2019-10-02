package Stack;

public class stack_int {
	/*
	 * stack : Last In First Out
	 * push : Input data to stack
	 * pop : pull out data to stack
	 * 
	 * @param ptr : stack pointer
	 * @param max : stack capacity
	 */
	private int max;
	private int ptr;
	private int[] stack;
	
	public class EmptyStackException extends RuntimeException{
		public EmptyStackException() {
			
		}
	}
	
	public class OverflowStackException extends RuntimeException{
		public OverflowStackException() {
			
		}
	}
	
	public stack_int(int capacity) {
		ptr=0;
		max=capacity;
		try {
			stack= new int[max]; //make an array for stack
		}catch(OutOfMemoryError e) { //if capacity is 0, can't create stack
			max=0;
		}
	}
	
	public int push(int x) throws OverflowStackException{
		if(ptr>=max) //if stack is full, throw OverflowException
			throw new OverflowStackException();
		return stack[ptr++]=x; 
	}
	
	public int pop() throws EmptyStackException{
		if(ptr<= 0)
			throw new EmptyStackException();
		return stack[--ptr]; //return ptr and ptr-1
	}
	
	public int peek() throws EmptyStackException{
		if(ptr<=0)
			throw new EmptyStackException();
		return stack[ptr-1]; //if stack is not empty, return ptr-1.
	}
	
	public int indexOf(int x) { //method to check existence of x
		for(int i=ptr-1;i>=0;i--) {
			if(stack[i]==x)
				return i; //searching success
		}
		return -1; //searching failed
	}
	
	public void clear() {// clear all stack
		ptr=0;
	}
	
	public int capacity() { //return capacity of stack
		return max;
	}
	
	public int size() { //return data size of stack
		return ptr;
	}
	
	public boolean isEmpty() { //check empty of the stack
		return ptr<=0;
	}
	
	public boolean isFull() { //judge stack is full or not
		return ptr>=max;
	}
	
	public void dump() { //print out all data in the stack, bottom to top
		if(ptr<=0)
			System.out.println("The stack is empty");
		else {
			for(int i=0;i<ptr;i++)
				System.out.print(stack[i]+"    ");
			System.out.println();
		}
	}

}
