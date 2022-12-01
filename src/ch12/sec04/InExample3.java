package ch12.sec04;

import java.io.IOException;

public class InExample3 {

	public static void main(String[] args) throws IOException {
		
		int speed = 0;
		int keyCode = 0;
		
		while (true) {
			// Enter 키를 읽지 않았을 경우에만 실행
			if (keyCode != 13 && keyCode != 10) {
				if (keyCode == 105) { // 숫자 1 키를 읽었을 경우
					speed++;
				}
				else if (keyCode == 109 ) { // 숫자 2 키를 읽었을 경우
					speed--;
				}
				else if (keyCode == 51) { // 숫자 3키를 읽었을 경우
					break;
				}
				System.out.println("------------------------");
				System.out.println("1. 종속 | 2. 감속 | 3. 중지");
				System.out.println("------------------------");
				System.out.println("현재 속도 = " + speed);
				System.out.print("선택 : ");
			}
			// 키를 하나씩 읽음
			keyCode = System.in.read();
		}
		System.out.println("프로그램 종료");
	}
}
