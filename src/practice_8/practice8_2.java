package practice_8;

public class practice8_2 {
	
	public static void main(String[] args) {
		// 2.	 *
		//		***
		//	   *****
		//	  *******
		// 1, 3, 5, 7로 삼각형 별 모양을 출력하는 코드
		
		String ast = "*";
		String nbsp = " ";
		//줄 반복
		for(int i = 0; i < 4; i++){ //4줄 출력
            for(int j = 0; j < (3 - i); j++){ //삼각형 별을 출력하기 위해 공백 생성  
                System.out.print(nbsp);
            }
            for(int j = 0; j < (i * 2 + 1); j++) { //각행의 홀수(삼각형줄) 만큼 별출력 
                System.out.print(ast);
            }
            System.out.println();
        }
	}
}
