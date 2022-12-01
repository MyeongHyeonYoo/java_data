package practice_3;

import java.util.Scanner;

public class practice3_5 {

	public static void main(String[] args) {
		// 5. 처음 입력한 숫자가 12일때 두번째 입력한 숫자가 약수이면 약수라고 출력하고,
		// 그렇지 않으면 약수가 아님이라고 출력하도록 함.
//		Scanner input = new Scanner(System.in);
//		
//		// (1) '12의 고정 값'에 대한 코드
//		int num = 12;
//		System.out.println("첫 번째 데이터 : 12");
//		System.out.print("두 번째 데이터 입력: ");
//		String inputData = input.nextLine();
//		num = Integer.parseInt(inputData);
//		if (num == 1 || num == 2 || num == 3 || num == 4 || num == 6 || num == 12) {
//			System.out.println(num + ": 약수입니다.");
//		}
//		else {
//			System.out.println("약수가 아닙니다.");
//		}
		
		// (2) 두 개의 값을 입력 받은 후 약수 구분
		Scanner input1 = new Scanner(System.in);
		String inputData1 = input1.nextLine();
		int num1 = Integer.parseInt(inputData1);
		System.out.println("첫번째 데이터: " + num1);
		Scanner input2 = new Scanner(System.in);
		System.out.print("두번째 데이터: ");
		String inputData2 = input2.nextLine();
		int num2 = Integer.parseInt(inputData2);
		if (num1 % num2 == 0) {
			System.out.println(num2 + "는(은) " + num1 + "의 약수입니다." );
		}
		else {
			System.out.println(num2 + "는(은) " + num1 + "의 약수가 아닙니다." );
		}
	}
}
