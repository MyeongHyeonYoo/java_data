package ch09.sec00;

//import java.util.Scanner;

public class Number9x9 {

	public static void main(String[] args) {
		// 구구단 입력 받아 출력
//		Scanner input = new Scanner(System.in);
//		System.out.println("구구단 출력기");
//		System.out.print("\"X 단\" \nX = ");
//		int number = input.nextInt();
//		int result = 0;
//		System.out.println("[ " + number + " 단 ]");
//		for (int i = 1; i < 10; i++ ) {
//			result = number * i;
//			System.out.println(number + " X " + i + " = " + result);

		// 2단부터 출력
		for (int i = 2; i < 10; i++) {
			System.out.println("\n ====" + i + "단 ====");
			for (int j = 1; j < 10; j++) 
				System.out.printf("%2d x %2d = %2d" + '\n', i, j, i * j );
		}
	}
}
