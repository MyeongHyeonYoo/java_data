package ch03.sec02;

import java.util.Scanner;

public class OddEvenPractice {

	public static void main(String[] args) {
		// * 키보드를 숫자를 입력 받아 삼항연산자로 짝수와 홀수를 구분하는 프로그램 작성
				Scanner oddenve = new Scanner(System.in);
				System.out.print("숫자를 입력 : ");
				String inputData = oddenve.nextLine();
				long num = Integer.parseInt(inputData);
//				if (num % 2 == 0) {
//					System.out.println(num + " 짝수입니다.");
//				}
//				else {
//					System.out.println(num + " 홀수입니다.");
//				}
				String result = (num % 2 == 0) ? num + " 짝수입니다." : num + " 홀수입니다.";
				System.out.println(result);

	}

}
