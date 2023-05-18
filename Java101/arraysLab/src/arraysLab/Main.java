package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;
		numbers[3] = 30;
		numbers[4] = 40;
		
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("--------------------");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("--------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type the array length; ");
		int length = scanner.nextInt(); //User will choose the length of the array
		int[] numbers2 = new int[length]; //numbers2 array with the given length from the user
		
		for(int i = 0; i < numbers2.length; i++) { //for loop to get every index number from the user.
			System.out.print("Type the Number " + (i+1) + " ");
			numbers2[i] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(numbers2));
		
		System.out.println("--------------------");
		
		int total = 0;
		for(int i = 0; i < numbers2.length; i++) {
			total += numbers2[i];
		}
		System.out.println(total); //total of the given numbers from the user
		System.out.println(total / numbers2.length); //average
		
		scanner.close();
		*/
		
		//LAB-2
		/*
		String[] names = new String[3];
		names[0] = "Emma";
		names[1] = "Steve";
		names[2] = "Charles";
		
		System.out.println(Arrays.toString(names));
		
		for(int i = names.length - 1; i >= 0; i--) { //will print the names reverse
			System.out.println(names[i]);
		}
		
		System.out.println("--------------------");
		
		int[] numbers1 = {1,2,3}; //arrays & classes are reference types. (primitives are value type: byte, short, int, long, char, boolean... variables in short)
		System.out.println(Arrays.toString(numbers1));
		int[] numbers2 = numbers1;
		System.out.println(Arrays.toString(numbers2));
		
		numbers1[0] = 5;
		System.out.println(Arrays.toString(numbers2));
		*/
		
		//LAB-3
		
		int[] numbers = {20,32,12,46,4};
		System.out.println(Arrays.toString(numbers)); //will print it formatted
		System.out.println(Arrays.binarySearch(numbers, 12)); //will search for a value for it's index
		
		int[] copyOfNumbers = Arrays.copyOf(numbers, 3); //will copy the amount of the user choice from an array
		System.out.println(Arrays.toString(copyOfNumbers));
		
		int[] copyOfNumbersRange = Arrays.copyOfRange(numbers, 2, 4); //will get the numbers between those indexes (2 will be included, but not 4)
		System.out.println(Arrays.toString(copyOfNumbersRange));
		
		//Arrays.fill(numbers, 44); //will fill all the values inside the array of the user choice
		//System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers); //ASC sort
		System.out.println(Arrays.toString(numbers));
	}
	

}













