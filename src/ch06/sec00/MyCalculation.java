package ch06.sec00;

import java.util.Scanner;

public class MyCalculation {
	static int myCalculation (int num1, int num2, char sign) {
		int result = 0;
		String gb = "";
		
		if (sign == '+') {
			result = num1 + num2;
			gb = "덧셈";
		}
		else if (sign == '-') {
			result = num1 - num2;
			gb = "뺄셈";
		}
		else if (sign == '*') {
			result = num1 * num2;
			gb = "곱셈";
		}
		else if (sign == '/') {
			result = num1 / num2;
			gb = "나눗셈";
		}
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("계산하고 싶은 공식을 작성하시오(문자별 띄어쓰기)");
		int num1 = input.nextInt();
		String sign = input.next();
		char sg = sign.charAt(0);
		int num2 = input.nextInt();
		
		myCalculation(num1, num2, sg);
		
	}
//	static void myCalculation(int a, int b, char c ) {
//		if (c == '+') {
//			System.out.println("두수의 덧셈 : " + (a + b));
//		}
//		else if (c == '-') {
//			System.out.println("두수의 뺄셈 : " + (a - b));
//		}
//		else if (c == '*') {
//			System.out.println("두수의 곱셈 : " + (a * b));
//		}
//		else if (c == '/') {
//			System.out.println("두수의 나눗셈 : " + (a / b));
//		}
//	}
	
//	static void myCalculation(int a, int b, char c ) {
//		
//		int result = 0;
//		String gb = "";
//		
//		if (c == '+') {
//			result = a + b;
//			gb = "덧셈";
//		}
//		else if (c == '-') {
//			result = a - b;
//			gb = "뺄셈";
//		}
//		else if (c == '*') {
//			result = a * b;
//			gb = "곱셈";
//		}
//		else if (c == '/') {
//			result = a / b;
//			gb = "나눗셈";
//		}
//		
//		System.out.println("두 수의" + gb + "는 : " + result + "입니다.");
//	}
}
