package practice_10;

import java.util.Scanner;
 
	public class practice10_3 {
		// cast 연산자를 사용하여 double -> float을 변환하는 코드를
		// 작성하되 강제형변환이 일어나도 숫자가 그대로 유지되도록 하기
		public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    System.out.println("[실수 랜덤 출력] \n");
			System.out.print("임의의 정수 아무거나 입력하세요: ");
			int num = input.nextInt();
			 
			// 임의의 실수 값 생성
			double casting = Math.pow(Math.random(), num);
			 
			if (Float.MIN_VALUE <= casting && casting <= Float.MAX_VALUE) {
			   float floating = (float)casting;
			   System.out.println(floating);
			} 
			else {
			   System.out.println("\n범위를 넘어서 출력할 수 없습니다.");
			} 
	 }
}


