package ch04;

import java.util.Scanner;

public class ClassPractice6 {

	public static void main(String[] args) {
		// 6. 한 자리 숫자를 입력하되, 총 합이 30을 초과하면 종료하는 프로그램 작성
		Scanner input = new Scanner(System.in);	
		int result = 0;
		for (;;) {
			System.out.print("한 자리 숫자를 입력: ");
			String inputdata = input.nextLine();
			int num = Integer.parseInt(inputdata);
			result += num;
			if (result >  30) {
				System.out.println("결과: " + result + "는 30을 초과합니다. (종료)");
				break;
			}
			System.out.println(result);
		}		// 7. 1부터 5까지 출력하는 프로그램을 do-while(); 사용하여 작성
	}

}
