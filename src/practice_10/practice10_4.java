package practice_10;

	import java.util.Random;
	 
	 public class practice10_4 {
		 // 학번 이름 국어 영어 수학 총점 평균 등수
		 // ─────────────────────────────────
		 //  1	일번
		 //  2	이번
		 //  3	삼번
		 //  4	사번
		 //  5	오번
		 public static void main(String[] args) {
			 
		 int[] arr = { 1, 2, 3, 4, 5 };
		 String[] hangulNumber = { "일", "이", "삼", "사", "오" };
		 String turn = "번";
		 int sum = 0, num = 100; // 총점 및 시드값 생성
		 int[][] result = new int[5][3]; // 랜덤 '점수' 2차원 배열 선언
		 double[] avgScore = new double[5]; // '등수' 배열 선언
		 int[] rank = {1, 1, 1, 1, 1};
		 
		 Random rand = new Random();
		 rand.setSeed(3);
		 System.out.printf(" %3s  %3s  %3s %3s %3s %3s %4s %6s \n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "등수" );
		 System.out.println("──────────────────────────────────────────────");
		 
		 // 
		 for (int i = 0; i < arr.length; i++) {
		   System.out.printf(" %3d  %3s%s ", (arr[i]), hangulNumber[i], turn);
		   for (int j = 0; j < 3; j++) {
		     result[i][j] = rand.nextInt(num);
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
		   
		   for (int a = 0; a < avgScore.length; a++) {
			   rank[i] = 5;
			   for (int b = 0; b < avgScore.length; b++) {
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