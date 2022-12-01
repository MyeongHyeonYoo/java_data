package ch04;

import java.util.Scanner;

public class ClassPractice5 {

	public static void main(String[] args) {
		// 5. 1 ~ 100 사이에서 5의 배수의 합만 출력하는 프로그램 작성
		Scanner input = new Scanner(System.in);
		System.out.print("5의 배수 :");
		for (int i = 0; i <= 100; i += 5) {
			if ( i == 0 ) {
				continue;
			}
			System.out.print(" " + i);
		}
		// 6. 한 자리 숫자를 입력하되, 총 합이 30을 초과하면 종료하는 프로그램 작성
				
		// 7. 1부터 5까지 출력하는 프로그램을 do-while(); 사용하여 작성
	}

}
