package day9;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Program has started");
		System.out.println("program is in progress");
		
		int a=100;
		try {
			System.out.println(a/0);
		}
		catch (ArithmeticException e){
			System.out.println(a/20);
		}

	}

}
