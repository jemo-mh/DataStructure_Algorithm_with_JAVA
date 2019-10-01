package Search;

class Id {
	private static int counter=0;
	private int id;
	
	public Id() {
		id=++counter;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getCounter() {
		
		return counter;
	}
}
	
public class IdTester{
	public static void main(String[] args) {
		Id first= new Id();
		Id second= new Id();
		
		System.out.println("first ID : "+first.getId());
		System.out.println("second Id : "+second.getId());
		System.out.println("assigned id number :"+Id.getCounter());
	}
}
