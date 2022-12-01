package practice_4;

import java.util.Scanner;

public class practice4_3 {

	public static void main(String[] args) {
		// 3. 점수를 입력하면 90이상은 A, 80이상은 B, 70이상은 C,
		// 60이상은 D를 그리고 그 외는 F가 출력되도록 else if문을 사용하여 작성
		System.out.println("점수별 등급 확인");
		System.out.print("점수를 입력하세요[0 ~ 100점] : ");
		for (;;) {
			Scanner num =  new Scanner(System.in);
			int number = num.nextInt();
			char[] grade = {'A', 'B', 'C', 'D', 'F'};
			if ( 90 <= number && number <= 100 ) {
				System.out.println(number +"점 : Grade: " + grade[0]);
			}
			else if ( 80 <= number && number < 90 ) {
				System.out.println(number +"점 : Grade: " + grade[1]);
			}
			else if ( 70 <= number && number < 80 ) {
				System.out.println(number +"점 : Grade: " + grade[2]);
			}
			else if ( 60 <= number && number < 70 ) {
				System.out.println(number +"점 : Grade: " + grade[3]);
			}
			else if ( 0 > number || number > 100 ) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			else {
				System.out.println(number +"점 : Grade: " + grade[4]);
			}
			break;
		}
	}
}
