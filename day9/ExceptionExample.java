package day9;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Program has started");
		System.out.println("program is in progress");
		System.out.println("Program has started");
		System.out.println("program is in progress");
		System.out.println("Program has started");
		System.out.println("program is in progress");
		System.out.println("Change in GitHub");
		System.out.println("Change in GitHub");
		System.out.println("Change in GitHub");
		System.out.println("Change in GitHub");
		
		int a=100;
		try {
			System.out.println(a/0);
		}
		catch (ArithmeticException e){
			System.out.println(a/20);
		}

	}

}
