package practice_5;

import java.util.Scanner;

public class practice5_3 {
	
	public static void main(String[] args) {
		// 3. 키보드로 입력한 3개의 숫자 중 최대값을 출력하는 코드를 작성
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("[1] : ");
		double num1 = input.nextDouble();
		System.out.print("[2] : ");
		double num2 = input.nextDouble();
		System.out.print("[3] : ");
		double num3 = input.nextDouble();
		double result = Math.max(Math.max(num1, num2), num3);
		if (result % 1 == 0) {
			int change = (int)result; 
			System.out.println("최대값 : " + change);
		}
		else {
			System.out.println("최대값 : " + result);
		}
	}
}