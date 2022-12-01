package practice_9;

import java.util.Scanner;

public class practice9_5 {

	public static void main(String[] args) {
		// 숫자를 읽어 들여 문자로 출력
		// ex) 3259 -> 삼천이백오십구
		String[] unit = { "", "십", "백", "천", "만 ", "십", "백", "천", "억 ", "십", "백", "천", "조 ", "십", "백", "천", "경 ", "십", "백", "천"};
		
		Scanner input = new Scanner(System.in);
		System.out.println("[ 숫자를 한글로 변환 ] \n");
		System.out.print("한글로 변환할 숫자를 입력하세요: ");
		long num = input.nextLong();
		
		// 스캐너로 정수형태 받기
		String output = Long.toString(num);

		int out = output.length() - 1;

		
		System.out.printf("입력한 금액   : %,d (원)%n", num);
		System.out.print("한글 변환 금액 : ");
		for (int i = 0; i < output.length(); i++) {
			//// 문자열의 길이 만큼 반복문 실행
			int n = output.charAt(i) - '0';
			
			if (read(n) != null) {
				// 숫자가 0일 경우는 출력하지 않음
				System.out.print(read(n));
				// 숫자를 한글로 읽어서 출력
				System.out.print(unit[out]);
			}
			else {
				System.out.print("영");
			}
			out--;
		}
		System.out.print(" (원)");
	}
	

	public static String read(int num) {
		switch (num) {
		case 1:
			return "일";
		case 2:
			return "이";
		case 3:
			return "삼";
		case 4:
			return "사";
		case 5:
			return "오";
		case 6:
			return "육";
		case 7:
			return "칠";
		case 8:
			return "팔";
		case 9:
			return "구";
		}
		return null;
	}
}
