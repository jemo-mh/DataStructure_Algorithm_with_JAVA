package Queue;
import java.util.Scanner;

public class queue_int_application {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		queue_int queue= new queue_int(64); 
		
		while(true) {
			System.out.println("current data number : "+queue.size() + " / "+queue.capacity());
			System.out.println("choose the function ");
			System.out.println("1. enqueue    2. dequeue    3. peek    4. dump    5. exit");
			int function= scanner.nextInt();
			if (function==0)
					break;
			
			int x;
			switch(function) {
			case 1:
				System.out.print("data : ");
				x=scanner.nextInt();
				try {
					queue.enqueue(x);
				}catch(queue_int.OverflowQueueException e) {
					System.out.println(" the queue is full");
				}
				break;
			case 2:
				try {
					x=queue.dequeue();
					System.out.println("the dequeued data was "+x);
					System.out.println("-----------------------------------------------");
				}catch(queue_int.EmptyQueueException e) {
					System.out.println("the queue is empty");
				}
				break;
			case 3:
				try {
					x=queue.peek();
					System.out.println("the peeked data was "+x);
					System.out.println("-----------------------------------------------");
				}catch(queue_int.EmptyQueueException e) {
					System.out.println("the queue is empty");
					System.out.println("-----------------------------------------------");
				}
			case 4:
				queue.dump();
				System.out.println("-----------------------------------------------");
				break;
				
			}
			
		}
	}
}
