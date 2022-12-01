package practice_4;

import java.util.Scanner;

public class practice4_5 {

	public static void main(String[] args) {
		// 5. if~else 문을 예제를 하나 만들고 그것을 다시 삼항연산자로 변환된
		// 코드로 출력결과가 같이 되는 코드를 작성.
		System.out.print("숫자를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num % 2 == 0) {
			num = 0;
		} else {
			num = 1;
		}
		String result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println(result);
	}
}
