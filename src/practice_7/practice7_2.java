package practice_7;

import java.util.Scanner;

public class practice7_2 {

	public static void main(String[] args) {
		// % 연산자를 사용해서 금액을 입력하면 돈을 금액에 맞게 출력
		// 금액을 입력 : 18590
		// 만 원 : 1
		// 오천원 : 1
		// 천 원 : 3
		// 오백원 : 1
		// 오십원 : 1
		// 십 원 : 4
		
		Scanner input = new Scanner(System.in);
		System.out.print("금액을 입력하세요: ");
		int money = input.nextInt();
		int[] fraction = { 10000, 5000, 1000, 500, 100, 50, 10 };
		int result = 0;
		
		for (int i = 0; i < fraction.length; i++) {
			result = money / fraction[i];
			money %= fraction[i];
			System.out.println(fraction[i] + "원 : " + result);
		}
	}
}