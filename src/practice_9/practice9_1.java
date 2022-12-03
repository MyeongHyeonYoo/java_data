package practice_9;

import java.util.Arrays;
import java.util.Scanner;

public class practice9_1 {

	public static void main(String[] args) {
		// 정수를 더하는 프로그램을 작성하는데 더할 개수와 최대 금액을 입력하고 
		// 입력한 금액은 총합계 금액을 넘어가는 순간 멈추고
		// 1) 입력한 금액, 2) 최대금액 3) 최소금액 4) 총합계 5) 평균(소수점 2자리까지) 출력
		Scanner input = new Scanner(System.in);
		System.out.println("┌━━━━━━━━━━━━━━━━━━┐");
		System.out.println("  정수 더하기 프로그램  ");
		System.out.println("└━━━━━━━━━━━━━━━━━━┘");
		System.out.print("\n 더할 개수를 입력하세요 : ");
		int count = input.nextInt(); // 더할 개수
		System.out.print(" 최대 금액을 입력하세요 : ");
		int maximumAmount = input.nextInt(); // 최대 금액
		
		
		
		int[] arr = new int[count];
		int sum = 0, i, in = 0;
		System.out.println("\n 1)");
		for (i = 1; i < count + 1; i++) {
			System.out.printf(" No.%d 입력한 금액 : ", i);
			int inputNumber = input.nextInt();
			arr[(count - count) + i - 1] = inputNumber;
			in = inputNumber;
				if ( (sum + inputNumber) > maximumAmount) {
					System.out.printf(" 2) 최 대 금 액 : %,2d (원)\n", maximumAmount);
					break;
				}
				sum += inputNumber;
			}
		for (int j = 0; j < count; j++) {
			if (arr[j] == 0) {
				arr[j] = maximumAmount;
				if (arr[j] == maximumAmount) {
					arr[j - 1] = maximumAmount;
				}
			}
			if (arr[0] == maximumAmount && arr[0] < in) {
				arr[0] = 0;
			}
		}
		Arrays.sort(arr);
	
		System.out.printf(" 3) 최 소 금 액 : %,d (원) \n", arr[0]);
		System.out.printf(" 4) 총  합  계 : %,d (원)\n", sum);
		if (i != 0) {
			double abs = ((double)sum / i);
			if (abs == 0.0) {
				System.out.printf(" 5) 평      균 : %,d (원)", ((int)abs));
			}
			else {
				System.out.printf(" 5) 평      균 : %,.2f (원)", abs);
			}
		}
	}
}
