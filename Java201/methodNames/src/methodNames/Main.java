package methodNames;

public class Main {

	private void helloWorld() {
		System.out.println("hello world");
	}
	
	private int sum(int x, int y) {
		int total = x + y;
		return total;
	}
	
	private float sum(float x, int y) { //the methods with the same num but their parameters are different, So thats ok to use all of them.
		float total = x + y;
		return (float)total;
	}
	
	private float sum(float x, float y) {
		float total = x + y;
		return (float)total;
	}
	
	public static void main(String[] args) {

		Main main = new Main();
		main.helloWorld();
		
		int sonuc = main.sum(5, 3);
		System.out.println(sonuc);
	}

}
