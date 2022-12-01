package ch04;

import java.util.Scanner;

public class ClassPractice3 {

	public static void main(String[] args) {
		// 3. 데이터를 한 개 입력받아
			// 1) 숫자
			// 2) 영여대문자
			// 3) 영어소문자
			// 를 구분하여 출력하는 프로그램을 작성하되
			// 단, Q이면 종료
		Scanner input = new Scanner(System.in);

		System.out.print("데이터를 1개 입력: ");
		String inputData3 = input.nextLine();
		char data = inputData3.charAt(0);
		while (true) {
			if ( '0' <= data && data <= '9' ) {
				System.out.println(data + " => 숫자");
				break;
			}
//			if (data == 'Q') break; // 아래 q, Q들을 먼저 빼서 쓸 수 있다.
			else if ('A' <= data && data <= 'Z' && data != 'q' && data != 'Q') {
				System.out.println(data + " => 영어대문자");
				break;
			}
			else if ('a' <= data && data <= 'z' && data != 'q' && data != 'Q') {
				System.out.println(data + " => 영어소문자");
				break;
			}
			else if (data == 'q' || data == 'Q') {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("데이터가 범위를 벗어났습니다.");
				break;
			}	
		}
		
		// 4. 점수를 입력하면 90이상 A, 80점 이상은 B, 70점 이상 C 
		// 60점 이상은 D, 그 외에는 F를 출력하는 것을 switch-case 문으로 작성
		
		// 5. 1 ~ 100 사이에서 5의 배수의 합만 출력하는 프로그램 작성
		
		// 6. 한 자리 숫자를 입력하되, 총 합이 30을 초과하면 종료하는 프로그램 작성
				
		// 7. 1부터 5까지 출력하는 프로그램을 do-while(); 사용하여 작성
	}

}
