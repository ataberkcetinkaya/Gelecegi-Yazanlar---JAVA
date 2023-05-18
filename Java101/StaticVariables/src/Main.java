
public class Main {

	//int i = 10; //to reach this from anywhere in the project, I'll convert it like that;
	static int i = 10;
	
	static {
		System.out.println("this static method will be running automatically even if you do not new the class");
	}
	
	public static void main(String[] args) {
		System.out.println(Main.i); //as long as it has static keyword, I don't have to new it.
	}

}
