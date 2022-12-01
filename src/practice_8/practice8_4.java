package practice_8;

public class practice8_4 {
	public static void Diamond() {
		System.out.println();
	}
	public static void main(String[] args) {
		// 4. 2와 3을 합쳐서 다이아몬드 형상을 출력하되
		// for문을 최소로 코딩
		
		String ast = "*";
		String nbsp = " ";
		
		for(int i = 0; i < 4; i++){ 
            for(int j = 0; j < (3 - i); j++){ 
                System.out.print(nbsp);
            }
            for(int j = 0; j < (i * 2 + 1); j++) {  
                System.out.print(ast);
            }
            System.out.println();
        }
		for (int i = 0; i < 4; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print(nbsp);
            }
            for (int j = 7 ; j >= (i * 2 + 1); j--) { 
                System.out.print(ast);
            }
            System.out.println();
        }
	}
}
