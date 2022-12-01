package practice_6;

import java.util.Scanner;

public class practice6_5 {

	public static void main(String[] args) {
		// 두 개의 정수값을 입력받아 작은 숫자에서부터 큰 숫자까지 출력
		// ex) 37, 25 -> 25, 26, 27, 28, ..., 36, 37
		Scanner input = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요.");
		System.out.print("No.1 Int : ");
		int num1 = input.nextInt();
		System.out.print("No.2 Int : ");
		int num2 =  input.nextInt();
		
		System.out.print("result : ");
		if (num1 < num2) {
			do {
				System.out.print(num1 + " ");
				num1++;
			} while ( num1 <= num2 );
		}
		else if (num1 > num2 ) {
			do {
				System.out.print(num2 + " ");
				num2++;
			} while ( num1 >= num2 );
		}
	
	}

}
