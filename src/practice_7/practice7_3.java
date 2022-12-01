package practice_7;

import java.util.Scanner;

public class practice7_3 {

	public static void main(String[] args) {
		// shift 연사자를 사용하여 숫자를 입력하고
		// 오른쪽 및 왼쪽 이동 횟수를 입력하면
		// 이동 횟수에 맞게 값을 이진수로 출력하는 코드 작성
		
			Scanner input = new Scanner(System.in);
			System.out.print("shift할 정수 입력 : ");
			int num1 = input.nextInt();
			System.out.print("이동할 수 : ");
			int num2 = input.nextInt();
			System.out.print("왼쪽 shift[<<] : 1번 | 오른쪽 shift[>>] : 2번 : ");
			int num3 = input.nextInt();
			System.out.println();
			
			switch (num3) {
			case 1: {
				String binary = Integer.toBinaryString((num1 << num2));
				System.out.println("result decimal : " + (num1 << num2));
				System.out.println("result binary :  " + binary);
				break;
			}
			case 2: {
				String binary = Integer.toBinaryString((num1 >> num2));
				System.out.println("result decimal : " + (num1 >> num2));
				System.out.println("result binary : " +  binary);
				break;
			}
			default: {
				System.out.println("다시 시도하세요.");
			}
		}
	}
}
