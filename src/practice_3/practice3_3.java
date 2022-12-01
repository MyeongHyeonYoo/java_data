package practice_3;

import java.util.Scanner;

public class practice3_3 {

	public static void main(String[] args) {
		// 3.
		// 정수를 입력받으면 양수인지 음수인지 판별하고
		// 만일 q 또는 Q를 입력하면 종료.
			while(true) {
			Scanner input = new Scanner(System.in);
			String inputData = input.nextLine();
			if (inputData.equals("q")  || inputData.equals("Q")) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			int num = Integer.parseInt(inputData);
			int x = num;
			if (x > 0) {
				System.out.println(x + " -> 양수입니다.");
			}
			else if (x < 0) {
				System.out.println(x + " -> 음수입니다.");
			}
			else {
				System.out.println("0입니다.");
			}
		}
	}
}
