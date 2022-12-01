package practice_5;

import java.util.Scanner;
		//1. 두 수를 입력하여 차이를 구하는 프로그램을 작성하되,
		// diff(int a, int b) 사용자 정의 함수로 실행하도록 함.

public class practice5_1 {
	// 실수 타입에 대한 함수
	static double diff(double a, double b) {
		if ( a < b ) {
			System.out.println("a(" +  a + ")는 " + "b = " + b + ")보다 작습니다.");
			System.out.println("a와 b의 차이는 : " + Math.abs(a - b));
			return Math.abs(a - b);
		}
		else if ( a > b ) {
			System.out.println("a(" +  a + ")는 " + "b = " + b + ")보다 큽니다.");
			System.out.println("a와 b의 차이는 : " + Math.abs(a - b));
			return Math.abs(a - b);
		}
		else {
			System.out.println("a(" +  a + ")는 " + "b = " + b + ")와 같습니다.");
			System.out.println("a와 b의 차이는 : " + Math.abs(a - b));
			return Math.abs(a - b);
		}
	}
	
	// 정수 타입에 대한 함수
	static int diff(int a, int b) {
		if ( a < b ) {
			System.out.println("a(" +  a + ")는 " + "b(" + b + ")보다 작습니다.");
			System.out.println("a와 b의 차이는 : " + Math.abs(a - b));
			return Math.abs(a - b);
		}
		else if ( a > b ) {
			System.out.println("a(" +  a + ")는 " + "b(" + b + ")보다 큽니다.");
			System.out.println("a와 b의 차이는 : " + Math.abs(a - b));
			return Math.abs(a - b);
		}
		else {
			System.out.println("a(" +  a + ")는 " + "b(" + b + ")와 같습니다.");
			System.out.println("a와 b의 차이는 : " + Math.abs(a - b));
			return Math.abs(a - b);
		}
	}
	
	public static void main(String[] args) {
		// 정수값 또는 실수값 입력
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("첫번째 숫자는? :");
		double num1 = input.nextDouble();
		System.out.print("두번째 숫자는? :");
		double num2 = input.nextDouble();
		if (num1 % 1 == 0 && num2 % 1 == 0) {
			int intNum1 = (int)num1;
			int intNum2 = (int)num2;
			System.out.println();
			diff(intNum1, intNum2);
		}
		else {
			System.out.println();	
			diff(num1, num2);
		}
	}
}