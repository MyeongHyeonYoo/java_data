package practice_4;

import java.util.Scanner;

public class practice4_2 {

	public static void main(String[] args) {
		// 2. 입력된 정수 값에 대해 양수 / 음수 / 0을 출력하는 코드 작성
		System.out.print("정수를 입력하세요 : ");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		if (0 < number && number <= Integer.MAX_VALUE) {
			System.out.println("값: " + number + "는(은) \'양수\'입니다.");
		}
		else if (Integer.MIN_VALUE <= number && number < 0) {
			System.out.println("값: " + number + "는(은) \'음수\'입니다.");
		}
		else {
			System.out.println("값: " + number);
		}
	}
}