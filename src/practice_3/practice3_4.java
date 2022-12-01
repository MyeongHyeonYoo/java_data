package practice_3;

import java.util.Scanner;

public class practice3_4 {

	public static void main(String[] args) {
		// 4.
		// 음수나 양수를 입력해도 양수로 변환해서 출력되도록 함.
		Scanner input = new Scanner(System.in);
		String inputData = input.nextLine();
		int num = Integer.parseInt(inputData);
		System.out.println("절대값: " + Math.abs(num));
	}
}