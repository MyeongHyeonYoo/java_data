package practice_9;

public class practice9_3 {

	public static void main(String[] args) {
		// 3. 구구단 출력
		// 	  2 3 4 5 6 7 8 9
		// --+---------------
		// 1 | 2 3 4 5 6 7 8 9
		// 2 | 4 6 8 10 ...
		// 3 |
		// 4 |
		// 5 |
		// 6 |
		// 7 |
		// 8 |
		// 9 |
		int num = 1;
		System.out.printf("        [ 구 구 단   출 력 ]%n%n");
		System.out.println("  " + "  " + "   2   3   4   5   6   7   8   9");
		System.out.println("---+--------------------------------");
		for (int i = 1; i < 10; i++) {
				System.out.printf(" %d |", num);
				num += 1;
			for (int j = 2; j < 10; j++) {
				System.out.printf(" %3d", (i * j));
			}
			System.out.println();
		}
	}

}
