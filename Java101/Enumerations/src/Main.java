import java.time.DayOfWeek;

public class Main {

	public static void main(String[] args) {
		Months months = Months.JANUARY;
		System.out.println(months);

		months = Months.MARCH;
		System.out.println(months);
		
		System.out.println("------------------------");
		
		Months[] theMonths = Months.values();
		for(int i = 0; i < theMonths.length; i++) {
			System.out.println(theMonths[i]);
		}
		
		System.out.println("------------------------");
		
		DayOfWeek monday = DayOfWeek.MONDAY; //MONDAY
		
		DayOfWeek indexOf = DayOfWeek.of(3); //WEDNESDAY
		System.out.println(indexOf);
		
		//MONTH enum also available
	}

}
