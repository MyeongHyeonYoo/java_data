package practice_2;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// 1. 실수형 데이터 두 개(3524.2323, 423423.1234)를 곱한 값을 출력
			double dob1 = 3524.2323;
			double dob2 = 423423.1234;
			double result1 = dob1 * dob2;
			System.out.println(result1);
			System.out.println("-------------------");
			
		// 2. 키보드에서 입력한 정수 값에 100을 더한 값과 100을 곱한 값 출력
			Scanner scan = new Scanner(System.in);
			String inputData1 = scan.nextLine();
			int num = Integer.parseInt(inputData1);
			int number = 100;
			System.out.println(("2. result : num + 100 = " +(num + number)) + "\n");
			System.out.println(("2. result : num * 100  = " + (num * number)));
			System.out.println("-------------------");
			
		// 3. 키보드로부터 두 개의 실수 값을 받아 합계 / 평균을 출력
			String inputData2 = scan.nextLine();
			String inputData3 = scan.nextLine();
			float flt1 = Float.parseFloat(inputData2);
			float flt2 = Float.parseFloat(inputData3);
			float result2 = flt1 + flt2;
			System.out.println("3. result : " + result2 / 2);
			System.out.println("-------------------");
			
		// 4. 키보드로부터 사각형의 가로/세로 값을 입력 받아 넓이를 같이 출력
			String inputWidth = scan.nextLine();
			String inputHeight = scan.nextLine();
			double width = Double.parseDouble(inputWidth);
			double height = Double.parseDouble(inputHeight);
			double result3 = width * height;
			System.out.println("4. result : " + result3 + "cm²");
			System.out.println("-------------------");
			
		// 5. 1 ~ 9 | -1 ~ -9 | 10 ~ 99 사이의 난수를 생성하여 출력
			double  ran1 = (Math.random() * 9 + 1);
			double  ran2 = (Math.random() * (-9) - 1);
			double  ran3 = (Math.random() * 99 + 1);
			
			System.out.println((int)ran1 + " => [scope: 1 ~ 9]");
			System.out.println((int)ran2 + " => [scope: -1 ~ -9]");
			System.out.println((int)ran3 + " => [scope: 10 ~ 99]");
			System.out.println("-------------------");
			
	}

}
