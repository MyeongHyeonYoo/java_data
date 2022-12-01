package practice_7;


public class practice7_4 {
	public static void main(String[] args) {
		// 3차원 배열을 설명할 수 있는 간단한 예제 코드를 작성
		int[][][] arr = new int[3][3][3];
		int num = 1;
		
		for (int i =0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(num * num + " ");
					num++;
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
