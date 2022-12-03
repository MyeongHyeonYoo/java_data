package practice_10;

public class test {

	public static void main(String[] args) {
		double avgScore[] = {50.20, 39.40, 48.33, 89.1, 95};
		int rank[] = {0, 0, 0, 0, 0};
		   for (int a = 0; a < avgScore.length; a++) {
			   rank[a] = 1;
			   for (int b = 0; b < avgScore.length; b++) {
				   if (avgScore[a] < avgScore[b]) {
					   rank[a]++; // ranking count;
				   } 
			   }
			   
		   }
		   for (int i = 0 ; i < avgScore.length; i++) {
			   System.out.printf("%.2f점 %d등\n", avgScore[i], rank[i]);
		   }
	}
}
		  
