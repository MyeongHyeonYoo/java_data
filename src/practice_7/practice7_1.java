package practice_7;

import java.util.Scanner;

public class practice7_1 {
	
	public static void main(String[] args) {
		// 종류를 선택 :
		// 1. +
		// 2. *
		// 3. +*
		// 를 선택하고 반복 횟수를 입력하면
		// 수평으로 연속해서 출력하는 코딩 작성
		
		Scanner input = new Scanner(System.in);
		System.out.println(" 1. + \n 2. * \n 3. +* ");
		System.out.print("출력하고 싶은 \'특수문자의 번호\'와 \'반복 횟수\'를 입력하세요 :  ");
		int num = input.nextInt();
		int repeat = input.nextInt();
		
		System.out.println();
		System.out.println("출력 번호 : " + num + "번 | " + repeat + "회 출력");
		
		boolean alpha = true;
		while(alpha) {
			if (num == 1 || num == 2 || num == 3) {
				System.out.println();
				for (int i = 0; i < repeat; i++) {
					if  (num == 1) {
						System.out.print("+ ");
					}
					else if (num == 2) {
						System.out.print("* ");
					}
					else if (num == 3) {
						System.out.print("+* ");
					}
				}
			}
			else {
				System.out.print("다시 시도하세요 : ");
				num = input.nextInt();
				repeat = input.nextInt();
				continue;
			}
			alpha = false;
		}
	}
}
