package staticLab;

public class Main {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.min(6,3));
		System.out.println(Math.max(6,3));
		
		float f = 1.6f;
		System.out.println(Math.ceil(f)); //2.0
		System.out.println(Math.floor(f)); //1.0
		
		System.out.println(Math.round(f)); //if 1.5 > f = 1  //if 1.5 < f = 2
		
		System.out.println((int) Math.floor( Math.random() * 11));
	}

}
