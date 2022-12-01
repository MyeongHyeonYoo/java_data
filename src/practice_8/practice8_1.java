package practice_8;

import java.util.Scanner;

public class practice8_1 {
	// BMI 측정 함수 구현
	public static double bmi(double height, double weight) {
		double result = 0;
		double h = height / 100;
		result = weight / (Math.pow(h, 2));
		return result;
	}
	
	public static void main(String[] args) {
		// 1. 비만도를 측정하는 코드 작성 -> 입력 값은 키와 체중
		System.out.println("비만도 측정(BMI지수)");
		Scanner input = new Scanner(System.in);
		System.out.print("키 : "); // 키 입력
		double height = input.nextDouble();
		System.out.print("몸무게 : "); // 몸무게 입력
		double weight = input.nextDouble();
		
		// BMI 값 출력
		double bmiResult = bmi(height, weight);
		System.out.printf("BMI : %.2f => ", bmiResult);
		
		// BMI 측정
		if (0 <= bmiResult && bmiResult < 18.5) {
			System.out.println("[저체중]입니다.");
		}
		else if (18.5 <= bmiResult && bmiResult < 23) {
			System.out.println("[정상]입니다.");
		}
		else if (23 <= bmiResult && bmiResult < 25) {
			System.out.println("[과체중]입니다.");
		}
		else if (25 <= bmiResult) {
			System.out.println("[비만]입니다.");
		}
	}
}
