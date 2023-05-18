package methods1;

import java.util.Scanner;

public class Main {

	public void hello() {
		System.out.println("hello");
	}
	//if I was writing it like this, "public static void", then I could be using it as
	//hello(); without new the Main class.
	
	public int sumTowNum(int x, int y) {
		int total = x + y;
		return total;
	}
	
	
	public static void main(String[] args) {
		/*
		Main main = new Main();
		main.hello();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(main.sumTowNum(scanner.nextInt(), scanner.nextInt()));
		*/
		
		//////////////////////////////////////////////////////////////////////////////
		
		Calculator calculator = new Calculator();
		// int theSum = calculator.sum(2, 3);
		// System.out.println("The result from the calculator: " + theSum);
		
		float theSquare = calculator.square(66);
		System.out.println("The result from the calculator: " + theSquare);
	
	}

}
