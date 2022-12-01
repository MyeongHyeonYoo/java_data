package practice_5;

public class practice5_5 {
	
	public static void main(String[] args) {
		// 5. 1차원 배열을 10개의 값을 설정하고 내림차순으로 정렬하는 코드
		int[] num = { 5, 3, 2, 4, 6 ,7, 10, 14, 9, 8 };
		for (int i = 0; i <= num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) {
					int temp = num[j + 1];
					num[j + 1] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int a = 0; a < num.length; a++ ) {
			System.out.println(num[a]);
		}
	}
}