package practice_6;

import java.util.Scanner;

public class practice6_2 {

	public static void main(String[] args) {
		// 2) 키보드로 숫자를 입력하면 1 ~ 12월을 가지고,
		// 3 ~ 5 : 봄,
		// 6 ~ 8 : 여름,
		// 9 ~ 11: 가을,
		// 12 ~ 2 : 겨울
		// 로 출력하는 코드 작성
		boolean alpha = true;
			while (alpha) {
			System.out.println("3 ~ 5 : 봄");
			System.out.println("6 ~ 8 : 여름");
			System.out.println("9 ~ 11: 가을");
			System.out.println("12 ~ 2 : 겨울");
			System.out.print("해당하는 번호를 선택하세요 : ");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			switch(num) {
			case 3, 4, 5:
				System.out.println("봄");
				break;
			case 6, 7, 8:
				System.out.println("여름");
				break;
			case 9, 10, 11:
				System.out.println("가을");
				break;
			case 12, 1, 2:
				System.out.println("겨울");
				break;
			default:
				if (num == 0) {
					System.out.println();
					System.out.println("다시 입력하세요.");
					continue;
				}
				else if ( num < 0 || 12 < num ) {
					System.out.println();
					System.out.println("[1 ~ 12 범위 내 입력하세요.]");
					continue;
				}
			}
			alpha = false;
		}
	}

}
