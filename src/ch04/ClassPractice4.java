package ch04;

import java.util.Scanner;

public class ClassPractice4 {

	public static void main(String[] args) {
		// 4. 점수를 입력하면 90이상 A, 80점 이상은 B, 70점 이상 C 
		// 60점 이상은 D, 그 외에는 F를 출력하는 것을 switch-case 문으로 작성
		Scanner input = new Scanner(System.in);
		String inputData = input.nextLine();
		int num = Integer.parseInt(inputData);
		
		float score = (float)num / 10;
		
		switch ((int)score) {
		case 9: 
			System.out.println("grade : A");
			break;
		case 8: 
			System.out.println("grade : B");
			break;
		case 7: 
			System.out.println("grade : C");
			break;
		case 6: 
			System.out.println("grade : D");
			break;
		default:
			System.out.println("grade : F");
		}
		
		
		// 5. 1 ~ 100 사이에서 5의 배수의 합만 출력하는 프로그램 작성
		
		// 6. 한 자리 숫자를 입력하되, 총 합이 30을 초과하면 종료하는 프로그램 작성
				
		// 7. 1부터 5까지 출력하는 프로그램을 do-while(); 사용하여 작성
	}

}
