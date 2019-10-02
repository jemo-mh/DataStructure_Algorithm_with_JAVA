package Search;

public class generic_class_example {
	static class genericClass<T>{
		private T abc;
		genericClass(T t){ //Creator
			this.abc=t;
		}
		
		T getData(){
			return abc;
		}
	}
	public static void main(String[] args) {
		genericClass<String> string= new genericClass<String>("abc");
		genericClass<Integer> integer= new genericClass<Integer>(123);
		
		System.out.println(string.getData());
		System.out.println(integer.getData());
	}

}
