package practice_9;

import java.util.Scanner;

public class practice9_1Test {

	public static void main(String[] args) {
		// 정수를 더하는 프로그램을 작성하는데 더할 개수와 최대 금액을 입력하고 
		// 입력한 개수의 입력은 총합계 금액을 넘어가는 순간 멈추고
		// 1) 입력한 금액, 2) 최대금액 3) 최소금액 4) 총합계 5) 평균(소수점 2자리까지) 출력
		Scanner input = new Scanner(System.in);
		
		int i;
		int[] arr = new int[2];
		int sum = 0;
		double avg = 0;
		int max, min;
		
		for ( i = 0; i < 2; i++) {
			System.out.println("첫번째 정수 입력 : ");
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		
		avg = (double) sum / arr.length;
		
		for (i = 0; i < 2; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		
		max = arr[0];
		min = arr[0];
		
		for (i = 0; i < 2; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + max);
	}
}
