package ch04;

import java.util.Scanner;

public class ClassPractice1 {

	public static void main(String[] args) {
		// 1. 한 개의 데이터를 입력 받아 숫자이면 출력하고 
		// '숫자가 아님'을 출력하되, 단 Q 또는 q이면 종료
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("한 개의 데이터를 입력: ");
			
			String inputData1 = input.nextLine();
			char data1 = inputData1.charAt(0);
			
			if ( data1 >= '0' && data1 <= '9') {
				System.out.println("숫자입니다.");
			}
			else {
				System.out.println("숫자가 아닙니다.");
			}
			if (data1 == 'q' || data1 == 'Q') {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
