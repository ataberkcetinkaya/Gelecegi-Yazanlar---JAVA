package staticVsNormalMethods;

public class Main {
	
	private static int x = 20; //that must be static variable too, if we want to reach it from a static method.

	public static void main(String[] args) {
		// Main main = new Main();
		Main.staticMethod(); //static method can run without an instance.
		
		Math.abs(x); //default static from Math
		
		int max = Main.max(5, 13, 10);
		System.out.println("The highest int is: " + max);
		
		double dMax = Main.max(2.0, 5.0, 3.0);
		System.out.println("The highest double is: " + dMax);
	}
	
	public void normalMethod() {
		System.out.println(x);
	}
	
	public static void staticMethod() {
		System.out.println(x);
	}

	public static int max(int x, int y, int z) {
		int max = x;
		if(y > max) {
			max = y;
		}
		if(z > max) {
			max = z;
		}
		return max;
	}
	
	public static double max(double x, double y, double z) {
		double max = x;
		if(y > max) {
			max = y;
		}
		if(z > max) {
			max = z;
		}
		return max;
	}
}
