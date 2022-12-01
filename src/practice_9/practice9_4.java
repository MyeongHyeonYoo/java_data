package practice_9;

import java.util.Scanner;

public class practice9_4 {

	public static void main(String[] args) {
		// 십진수를 입력하면 2, 8, 16 진수를 출력하는 코드 작성
		System.out.println("[10진수 -> 2진수, 8진수, 16진수 변환]");
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int numChange = input.nextInt();
		
		System.out.println("10진수 : " + numChange); // 10진수
		System.out.println("2진수  : " + Integer.toBinaryString(numChange)); // 10진수 -> 2진수
		System.out.println("8진수  : " + Integer.toOctalString(numChange)); // 10진수 -> 8진수
		System.out.println("16진수 : " + Integer.toHexString(numChange)); // 10진수 -> 16진수
	}
}
