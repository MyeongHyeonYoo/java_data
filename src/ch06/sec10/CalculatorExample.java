package ch06.sec10;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculatior.pi;
		int result2 = Calculatior.plus(10, 5);
		int result3 = Calculatior.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
