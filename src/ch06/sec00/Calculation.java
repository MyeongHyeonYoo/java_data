package ch06.sec00;

public class Calculation {

	public static void main(String[] args) {
		
		int result1 = add(3, 5);
		int result2 = add(10, 5);
		horiLine();
		System.out.println("두 수의 합 : " + result1);
		horiLine();
		System.out.println("두 수의 합 : " + result2);
	}
	static int add (int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}	
	static void horiLine() {
		System.out.println("======================");
	}
}
