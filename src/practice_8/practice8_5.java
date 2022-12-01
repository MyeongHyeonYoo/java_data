package practice_8;

import java.util.Scanner;

public class practice8_5 {
	
	public static void main(String[] args) {
		// 5. 년도를 입력하면 윤년을 반별하는 코드 작성
	
		System.out.print("연도를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년 -> 윤년");
		} 
		else {
			System.out.println(year + "년 -> 평년");
		}
	}
}
