package practice_6;

import java.util.Scanner;

public class practice6_3 {

	public static void main(String[] args) {
		// 3자리 양수 값(100 ~ 999) 값이 입력될 때까지 계속 입력을 요구하는 코드 작성
			for (;;) {
			System.out.print("100 ~ 999까지의 3자리 정수를 입력하세요: ");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			
			if ( 99 < num && num < 1000) {
				System.out.println("\n" + num + "은 3자리 정수가 맞아요!");
			}
			else if ((Integer.MIN_VALUE <= num && num <= 99) || (1000 <= num && num <= Integer.MAX_VALUE)) {
				System.out.println();
				System.out.println("3자리 정수를 입력해 주세요. [100 ~ 999]");
				continue;
			}
			break;
		}
	}
}
