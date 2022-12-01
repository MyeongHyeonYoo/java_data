package practice_4;

import java.util.Scanner;

public class practice4_4 {

	public static void main(String[] args) {
		// 4. 논리 연산자를 사용하여 입력된 두 개의 값이 정수이면 True,
		// 그 외는 False가 출력되도록 코드 작성
	
		for(;;) {
			Scanner num = new Scanner(System.in);
			System.out.print("첫번째 값을 입력하세요: ");
			double data1 = num.nextDouble();
			System.out.print("두번째 값을 입력하세요: ");
			double data2 = num.nextDouble();
			if ((data1 % 1 == 0) && (data2 % 1 == 0)) {
				int num1 = (int)data1;
				int num2 = (int)data2;
				int result = num1 + num2;
				System.out.println("result: " + result + "\t[true]");
				System.out.println();
			}
			else {
				System.out.println("\n정수만 입력하세요. [false]");
				System.out.println();
				continue;
			}
			break;
		}
	}
}
