package ch04;

import java.util.Scanner;

public class ClassPractice2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 2. 숫자를 입력 받아 짝수 또는 홀수를 구분하는 프로그램을 
		// if문을 사용하여 작성
		System.out.print("2. 숫자를 입력: ");
		String inputDate2 = input.nextLine();
		int num1 = Integer.parseInt(inputDate2);
		if (num1 % 2 == 0) {
			System.out.println(num1 + "은 짝수입니다.");
		}
		else {
			System.out.println(num1 + "은 홀수입니다.");
		}
		
		// 3. 데이터를 한 개 입력받아
		// 1) 숫자
		// 2) 영여대문자
		// 3) 영어소문자
		// 를 구분하여 출력하는 프로그램을 작성하되
		// 단, Q이면 종료
		
		// 4. 점수를 입력하면 90이상 A, 80점 이상은 B, 70점 이상 C 
		// 60점 이상은 D, 그 외에는 F를 출력하는 것을 switch-case 문으로 작성

		// 5. 1 ~ 100 사이에서 5의 배수의 합만 출력하는 프로그램 작성
		
		// 6. 한 자리 숫자를 입력하되, 총 합이 30을 초과하면 종료하는 프로그램 작성
				
		// 7. 1부터 5까지 출력하는 프로그램을 do-while(); 사용하여 작성
	}

}
