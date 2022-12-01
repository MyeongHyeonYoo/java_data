package practice_5;

import java.util.Scanner;

public class practice5_4 {
	
	public static void main(String[] args) {
		// 4. 키보드로 입력한 3개의 숫자 중 중앙값을 출력하는 코드를 작성
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("[1] : ");
		double num1 = input.nextDouble();
		System.out.print("[2] : ");
		double num2 = input.nextDouble();
		System.out.print("[3] : ");
		double num3 = input.nextDouble();
		
		double[] arr2 = { num1, num2, num3 };
		int result1 = 0;
		double result2 = 0; 
		
		if (num1 % 1 == 0 && num2 % 1 == 0 && num3 % 1 == 0 ) {
			// 정수 타입 중간 값
			int numChange1 = (int)num1;
			int numChange2 = (int)num2;
			int numChange3 = (int)num3;
			int[] arr1 = { numChange1, numChange2, numChange3 };
			for (int i = 0; i <= arr1.length; i++) {
				for (int j = 0; j < arr1.length - 1; j++) {
					if (arr1[j] > arr1[j + 1]) {
						int temp = arr1[j];
						arr1[j] = arr1[j + 1];
						arr1[j + 1] = temp;
					}
				}
			}
			System.out.println(arr1[1]);
		}
		else {
			// 실수 타입 중간 값
			for (int i = 0; i <= arr2.length; i++) {
				for (int j = 0; j < arr2.length - 1; j++) {
					if (arr2[j] > arr2[j + 1]) {
						double temp = arr2[j];
						arr2[j] = arr2[j + 1];
						arr2[j + 1] = temp;
					}
				}
			}
			System.out.println(arr2[1]);
		}
	}
}
