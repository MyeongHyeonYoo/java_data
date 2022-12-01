package practice_3;

import java.util.Scanner;

public class practice3_1 {

	public static void main(String[] args) {
		// 1. 
		// 성 : 홍
		// 이름 : 길동
		// 입력하면, 안녕하세요 홍길동님으로 출력되도록 함. -> 각자 자기 이름
		Scanner input = new Scanner(System.in);
		System.out.print("성을 입력하세요: ");
		String inputData1 = input.nextLine();
		System.out.println("성 : " + inputData1);
		System.out.print("이름을 입력하세요: ");
		String inputData2 = input.nextLine();
		System.out.println("이름 : " + inputData2);
		System.out.println("안녕하세요." + inputData1 + inputData2 + "님 반갑습니다!");
	}
}
