package multipleArrays;

public class Main {

	public static void main(String[] args) {
		
		int[][] numbers = new int[2][3];
		
		numbers[0][0] = 1;
		numbers[0][1] = 2;
		numbers[0][2] = 3;
		
		numbers[1][0] = 4;
		numbers[1][1] = 5;
		numbers[1][2] = 6;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		/////////////////////////////////////////////////
		
		String[][] students = new String[3][3];
		
		students[0][0] = "Ataberk";
		students[0][1] = "Yeliz";
		students[0][2] = "Zeynep";

		students[1][0] = "Kaan";
		students[1][1] = "Mert";
		students[1][2] = "Mia";
		
		students[2][0] = "Julia";
		students[2][1] = "Eliza";
		students[2][2] = "Kevin";
		
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students[i].length; j++) {
				System.out.print(i + " " + j + ": ");
				System.out.println(students[i][j]);
			}
		}
	}

}
