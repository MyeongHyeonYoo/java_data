package practice_9;

public class practice9_2 {

	public static void main(String[] args) {
		// 2. 숫자 정렬
		// 1) 1 ~ 100사이의 임의의 숫자 10개를 생성
		// 2) 셀렉터 솔트를 한다.
		// 3) 버블 소트를 한다.
		// 4) 출력 -> 정렬 전:
		//			 셀렉트 :
		//			 버 블 :
		
		int[] arr = new int[10];
		int[] selectSort = new int[10];
		int[] bubbleSort = new int[10];
		
		// 1) 정렬 전 임의의 수 생성
		// 2) 셀렉트 솔트 & 버블 솔트 생성
		for (int i = 0; i < arr.length; i++) {
			int num = ((int)((Math.random() * 100) + 1));
			arr[i] = num;
			selectSort[i] = arr[i];
			bubbleSort[i] = arr[i];
		}
	
		// 셀렉트 솔트 & 버블 솔트 진행
		for	(int j = 0; j < arr.length; j++) {
			int min_index = j;
			for (int k = 0; k <= (arr.length - 1 - 1); k++) {
				// 버블 솔트
				if ( bubbleSort[k] > bubbleSort[k + 1] ) {
					int temp = bubbleSort[k];
					bubbleSort [k] = bubbleSort[k + 1];
					bubbleSort [k + 1] = temp;
				}
				// 셀렉트 솔트 (1)
				if (selectSort[k] > selectSort[min_index]) {
					min_index = k;
				}
				// 셀렉트 솔트 (2)
				int temp = selectSort[j];
				selectSort[j] = selectSort[min_index];
				selectSort[min_index] = temp;
			}
		}
		
		
		// 정렬 전 임의의 수 10개 출력 
		System.out.print("Original    : ");
		for (int num : arr) {
			System.out.printf("%2d ", num);	
		}
		System.out.println();
		
		// 셀렉트 솔트 출력
		System.out.print("Select Sort : ");
		for (int select : selectSort) {
			System.out.printf("%2d ", select);
		}
		System.out.println();
		
		// 버블 솔트 출력
		System.out.print("Bubble Sort : ");
		for (int bubble : bubbleSort) {
			System.out.printf("%2d ", bubble);
		}
	}
}
