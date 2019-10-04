package Queue;

public class queue_int {
	/*
	 * queue is also similar with stack, it is kind of data structure for temporary save data.
	 * FIFO: Fist In First Out
	 * input data to queue called enqueue
	 * pull out data from queue called dequeue.
	 * and part of pulling out data called front, part of putting data in called rear
	 */
	private int max; //max capacity of queue
	private int num; //current data number
	private int[] que; //queue
	private int front; // cursor of the first component
	private int rear; // cursor of the last component
	
	public class EmptyQueueException extends RuntimeException{
		public EmptyQueueException(){}
	}
	
	public class OverflowQueueException extends RuntimeException{
		public OverflowQueueException() {}
	}
	
	public queue_int(int capacity) {
		num=front=rear=0;
		max=capacity;
		try {
			que= new int [max];
			
		}catch(OutOfMemoryError e) {
			max=0;
		}
	}
	
	public int enqueue(int x) throws OverflowQueueException{
		if(num>=max)
			throw new OverflowQueueException();
		que[rear++]=x;
		num++;
		if(rear==max)
			rear=0;
		return x;
	}
	
	public int dequeue() throws EmptyQueueException{
		if(num<=0)
			throw new EmptyQueueException();
		int x=que[front++];
		num--;
		if(front==max)
			front=0;
		return x;
	}
	
	public int peek() throws EmptyQueueException{ //peek data
		if(num<=0)
			throw new EmptyQueueException(); //mean queue is empty
		return que[front];
	}
	
	public int indexOf(int x) { // find x in queue, if cannot found than return -1\
		for(int i=0;i<num;i++) {
			int index=(i+front)%max;
			if(que[index]==x)
				return index;
		}
		return -1; //fail to find x
	}
	
	public void clear() {
		num=front=rear=0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num<=0;
	}
	
	public boolean isFull() {
		return num>=max;
	}
	
	public void dump() { //print out all data in queue -> rear sequence
		if(num<=0)
			System.out.println("the queue is empty");
		else {
			for(int i=0;i<num;i++)
				System.out.print(que[(i+front)%max]+ " ");
			System.out.println();
		}
	}
	
}
