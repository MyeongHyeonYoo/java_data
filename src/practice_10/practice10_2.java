package practice_10;

import java.util.Scanner;
 
 public class practice10_2 {
	   public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    
		    // 프로그램 타이틀
		    System.out.println("정수 4개를 입력하여 a + b 와 c + d의 값의 비교");
		    System.out.println("───────────────────────────────────────\n");
		    System.out.println("정수 4개를 입력하세요.");
		    
		    // a, b, c, d 각각의 정수 값 입력
		    System.out.print("정수 a의 값: "); int a = input.nextInt();
		    System.out.print("정수 b의 값: "); int b = input.nextInt();
		    System.out.print("정수 c의 값: "); int c = input.nextInt();
		    System.out.print("정수 d의 값: "); int d = input.nextInt();
		    
		    // 합산 값 출력
		    System.out.print("a + b = "); System.out.println(a + b);
		    System.out.print("c + d = "); System.out.println(c + d);
		    System.out.println();
		
		    // (a + b)와 (c + d)  비교
		    if (a + b == c + d) {
		    	System.out.println("a + b는 c + d의 값과 같습니다. [ a + b == c + d ]");
		    } else {
			      String result = (a + b > c + d) ? "True" : "False";
			      System.out.println(result);
		    } 
	  }
}