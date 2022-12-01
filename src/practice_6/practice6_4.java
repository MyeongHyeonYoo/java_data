package practice_6;

import java.util.Scanner;

public class practice6_4 {

	public static void main(String[] args) {
		// 2자리 정수값(0 ~ 99)을 맞추는 '숫자 맞추기 게임' 코드 작성
		double doubleNum = (Math.random() * 100);
		int numChangeInt = (int)doubleNum;
		System.out.println("숫자 맞추기 게임 [범위 : 0 ~ 99]");
		
		int count = 10;
		for(int i = 0; i < 10; i++) {
			System.out.print(" \n [ 남은 횟수 : " + (count - i) + "번 ]" + "숫자를 입력하세요! : " );
			
			Scanner input = new Scanner(System.in);
			int inputNum = input.nextInt();
			if ((0 <= inputNum) && (inputNum < 100)) {
				if (inputNum == numChangeInt) {
					System.out.println("\n 정답입니다!!!!!!!");
					break;
				}
				else if (inputNum < numChangeInt) {
					System.out.println("\n UP !");
				}
				else if (inputNum > numChangeInt) {
					System.out.println("\n DOWN !");
				}
			}
			
			else {
				System.out.println("\n 범위를 벗어났습니다. 다시 시도해 주세요.");
				break;
			}
		}
		System.out.println("\n 프로그램을 종료합니다.");
	}
}
