package practice_3;

import java.util.Scanner;

public class practice3_2 {

	public static void main(String[] args) {
		// 2.
		// 주소를 입력하면 출력하는 프로그램 작성 -> 주소는 학교주소로 통일
		Scanner input = new Scanner(System.in);
		String inputData = input.nextLine();
		String address1 = "경기 안산시 상록구 광덕1로 375 강우프라자 5층";
		String address2 = "경기 안산시 상록구 이동 715-3 강우프라자 5층";
		String address3 = "경기 안산시 상록구 광덕1로 375 강우프라자";
		String address4 = "경기 안산시 상록구 이동 715-3 강우프라자";
		if (inputData.equals(address1) || inputData.equals(address2) || inputData.equals(address3) || inputData.equals(address4)) {
			System.out.println("\"이젠아카데미컴퓨터학원\" <안산캠퍼스>입니다.");
		}
	}
}
