package staticMethods;

public class Main {

	public static void helloStatic() {
		System.out.println("hello static method");
	}
	
	public static void main(String[] args) {
		Main.helloStatic();
		
		Math.pow(2, 3);
		Math.sqrt(9); //these are all static methods
		
		System.out.println(Integer.parseInt("5")); //string to int
	
	}

}
