 package practice_10;

import java.util.Random;
import java.util.Scanner;

public class practice10_5 {
	
  public static void main(String[] args) {
	  	// 5. 총점, 평균 등수를 출력하는 코드를 작성하되 
		// 숫자가 변경되면 총점 / 평균 / 등수 또한 변경되시키기
	  
	  	table();
		System.out.println();
		table();
		System.out.println();
		table();
	}
  
  public static void table () {
	  
	  int[] arr = { 1, 2, 3, 4, 5 };
		 String[] hangulNumber = { "일", "이", "삼", "사", "오" };
		 String turn = "번";
		 int sum = 0; // 총점 및 시드값 생성
		 int[][] result = new int[5][3]; // 랜덤 '점수' 2차원 배열 선언
		 double[] avgScore = new double[5]; // '등수' 배열 선언
		 int[] rank = {1, 1, 1, 1, 1};
		 
		 // 1 ~ 100 입력 받기
		 Scanner input = new Scanner(System.in);
		 System.out.print("1 ~ 100 중에 임의의 수를 입력하세요: ");
		 int num = input.nextInt();
		 Random rand = new Random();
		 rand.setSeed(num);
		 System.out.printf(" %3s  %3s  %3s %3s %3s %3s %4s %6s \n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "등수" );
		 System.out.println("──────────────────────────────────────────────");
		 
		 // 
		 for (int i = 0; i < arr.length; i++) {
		   System.out.printf(" %3d  %3s%s ", (arr[i]), hangulNumber[i], turn);
		   for (int j = 0; j < 3; j++) {
		     result[i][j] = rand.nextInt(100);
		     System.out.printf(" %3d ", result[i][j]);
		   } 
		   
		   // 총점 계산
		   for (int k = 0; k < 3; k++) {
			   sum += result[i][k];
		   }
		   System.out.printf(" %4d ", sum); // 총점 출력
		   avgScore[i] = ((double)sum / 3);
		   System.out.printf(" %.2f ", avgScore[i]); // 평균 출력
		   sum = 0; // 총점 0으로 초기화(재활용) 
		   
		   // 등수 구하기
		   for (int a = 1; a < avgScore.length; a++) {
			   rank[i] = 5;
			   for (int b = 1; b < avgScore.length; b++) {
				   if (avgScore[a] < avgScore[b]) 
					   if (avgScore[a] != avgScore[b]) {
						   if (avgScore[a] == avgScore[b]) {
							   continue;
						   }
						 rank[i]--; // ranking count;
				   } 
				   if (avgScore[a] == avgScore[b]) {
					   rank[b]--;
					   rank[b]--;
				   }
			   }
		   }
		   System.out.printf("%5d등", rank[i]); // 등수 출력
		   System.out.println();
		}
	}
}