package staticVsNormalMethods;

import java.util.Arrays;

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
		
		boolean majority = Main.majority(true, false, true);
		System.out.println("The majority is: " + majority);
		
		int[] x = {1,2,3};
		int[] y = {1,2,4};
		System.out.println("the arrays are exactly same? " + Main.eq(x, y));
	
		System.out.println("Cube of the number is: " + Main.cube(2));
		
		System.out.println("Total is: " + Main.sum(x));
		
		int[] findingTheEvens = Main.evenNumbers(new int[] {1,2,3,4,5,6,7,8});
		System.out.println("Even numbers are: " + Arrays.toString(findingTheEvens));
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
	
	public static boolean majority(boolean x, boolean y, boolean z) {
		return (x && y) || (x && z) || (y && z); //if any of two parameters comes true, will show up the result as true
	}
	
	public static boolean eq(int[] x, int[] y) { //this method will compare the int arrays (100% same or not)
		boolean result = true;
		
		if(x.length == y.length) {
			for(int i = 0; i < x.length; i++) {
				if(x[i] != y[i]) {
					result = false;
					break;
				}
			}
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public static int cube(int x) {
		return x * x * x;
	}
	
	public static int sum(int[] x) {
		int total = 0;
		for(int i = 0; i < x.length; i++) {
			total +=  x[i];
		}
		return total;
	}
	
	public static int[] evenNumbers(int[] numbers) {
	    int count = 0;
	    for(int i = 0; i < numbers.length; i++) { //iterate through the array and find the even numbers also increase the count
	        if (numbers[i] % 2 == 0) {
	            count++;
	        }
	    }
	    int[] theEvens = new int[count]; //we use the count variable to create another array.
	    int index = 0; //will hold the place of even numbers
	    for(int i = 0; i < numbers.length; i++) {
	        if (numbers[i] % 2 == 0) { //iterate through the numbers array again and find the evens
	            theEvens[index] = numbers[i]; //and at these numbers to the theEvens array we just created.
	            index++; 
	            //theEvens[0] = numbers[2];
	            //theEvens[1] = numbers[4];
	            //theEvens[2] = numbers[6];
	        }
	    }
	    return theEvens;
	}

	
	
}
