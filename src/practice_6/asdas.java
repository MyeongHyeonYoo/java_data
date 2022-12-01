package practice_6;

import java.util.Scanner;

public class asdas {
	public static void main(String[] args) {
		// 2자리 정수값(0 ~ 99)을 맞추는 '숫자 맞추기 게임' 코드 작성
		double doubleNum = (Math.random() * 100);
		int numChangeInt = (int)doubleNum;
		System.out.println("숫자 맞추기 게임 [범위 : 0 ~ 99]");
		
		int count = 10;
			for(int i = 0; i < 10; i++) {
				System.out.print("  [ 남은 횟수 : " + (count - i) + "번 ]" + "숫자를 입력하세요! : " );
				
				Scanner input = new Scanner(System.in);
				int inputNum = input.nextInt();
				
				if (inputNum == numChangeInt) {
					System.out.println("정답입니다!!!");
					break;
				}
				else if (inputNum < numChangeInt) {
					System.out.println("UP !");
				}
				else if (inputNum > numChangeInt) {
					System.out.println("DOWN !");
				}
			}
	}
}
