package practice_7;

import java.util.Scanner;

public class practice7_5 {

	public static void main(String[] args) {
		
		// 정수를 최대값을 입력하고 배수를 입력하면 
		// 1부터 시작해서 최대값까지 배수를 출력하는 코드 작성
		Scanner input = new Scanner(System.in);
		
		System.out.print("최대값 입력 : ");
		int num1 = input.nextInt();
		
		System.out.print("원하는 배수값 입력: ");
		int num2 = input.nextInt();
		
		System.out.print("\nresult : ");
		int result = 0;
		for (int i = 1; i <= num1; i++) {
			if (i % num2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		if (num1 < num2) {
			System.out.println("범위를 벗어났습니다.");
		}
	}

}
