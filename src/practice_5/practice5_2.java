package practice_5;

import java.util.Scanner;

public class practice5_2 {
	
	public static void main(String[] args) {
		// 2. 두 수를 입력하여 차이를 구하는 프로그램을 작성하되,
				// 삼항연산자를 사용하여 작성
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("첫번째 숫자는? :");
		double num1 = input.nextDouble();
		System.out.print("두번째 숫자는? :");
		double num2 = input.nextDouble();
		
		if (num1 % 1 == 0 && num2 % 1 == 0) {
			// 정수값 입력에 대한 구현부
			int intNum1 = (int)num1;
			int intNum2 = (int)num2;
			int result = 0;
			System.out.println();
			if (intNum1 < intNum2) {
				int dif  = ((intNum1 < intNum2) ? intNum2 : intNum1);
				System.out.println("큰 수: " + dif);
				result = Math.abs(intNum1 - intNum2);
				System.out.print("두 수의 차이는: " + result);
				
			}
			else if (intNum1 > intNum2) {
				int dif = ((intNum1 > intNum2) ? intNum1 : intNum2);
				System.out.println("큰 수: " + dif);
				result = Math.abs(intNum1 - intNum2);
				System.out.print("두 수의 차이는: " + result);
				
			}
			else {
				int dif = ((intNum1 == intNum2) ? result : Math.abs(intNum1 - intNum2));
				System.out.println("값 : " + dif);
				System.out.print("두 수의 차이는: " + result);
			}
		}
		// 실수값 입력에 대한 구현부
		else {
			double result = 0;
			if (num1 < num2) {
				double dif  = ((num1 < num2) ? num2 : num1);
				System.out.println("큰 수: " + dif);
				result = Math.abs(num1 - num2);
				System.out.print("두 수의 차이는: " + result);
				
			}
			else if (num1 > num2) {
				double dif = ((num1 > num2) ? num1 : num2);
				System.out.println("큰 수: " + dif);
				result = Math.abs(num1 - num2);
				System.out.print("두 수의 차이는: " + result);

			}
			else {
				double dif = ((num1 == num2) ? result : Math.abs(num1 - num2));
				System.out.println("값 : " + dif);
				System.out.print("두 수의 차이는: " + result);
			}
			System.out.println();	
		}
	}
}