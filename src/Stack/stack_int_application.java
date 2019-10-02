package Stack;
import java.util.Scanner;

public class stack_int_application {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		stack_int stack_int= new stack_int(64);
		
		while(true) {
			System.out.println("current data number : "+stack_int.size()+" / "+stack_int.capacity());
			System.out.println("choose work to do");
			System.out.println("1. push    2. pop    3. peek    4. dump    5. exit");
			int menu=scanner.nextInt();
			if(menu ==5)
				break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("data : ");
				x=scanner.nextInt();
				try {
					stack_int.push(x);
				}catch(stack_int.OverflowStackException e) {
					System.out.println("stack is full");
				}
				break;
			case 2:
				try {
					x=stack_int.pop();
					System.out.println("poped data is "+ x+".");
					System.out.println("-----------------------------------------------");
				}catch(stack_int.EmptyStackException e) {
					System.out.println("stack is empty");
				}
				break;
			
			
			case 3:
				try {
					x=stack_int.peek();
					System.out.println("peeked data is "+x+".");
					System.out.println("-----------------------------------------------");
				}catch(stack_int.EmptyStackException e) {
					System.out.println("stack is empty");
				}
				break;
			
			case 4:
				stack_int.dump();
				System.out.println("----------------------------------------------------");
				break;
			}
		}
	}

}
