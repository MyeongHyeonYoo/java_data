package practice_10;

 	public class practice10_1 {
	 // 이력값 :  x : 0.123456789123456789
	 //			y : 0.123456789123456789
	 // 두 개의 값의 합을 구하는 코드 작성
	 
 		public static void main(String[] args) {
	   
 			// double 및 float 선언 및 초기화
			 double x1 = 0.123456789123456789, y1 = 0.123456789123456789;
			 double doubleResult = x1 + y1, doubleRealSum = 0.246913578246913578; // 실제 소수점의 합
			 float x2 = 0.12345679f, y2 = 0.12345679f;
			 float floatResult = x2 + y2, floatRealSum = 0.246913578246913578f; // 실제 소수점의 합
			 System.out.println("──────────────────────────────────");
			 System.out.println("│ 0.123456789123456789의 <실수형>의 합 │");
			 System.out.println("──────────────────────────────────");
			 
			 // double 함산 비교
			 if (doubleResult == doubleRealSum) {
			   System.out.println("1) double의 합은 '실제 계산된 값과 같습니다.'");
			 } else {
			   System.out.println("1) double의 값이 '실제 계산된 값과 다릅니다.'");
			 } 
			 
			 // float 합산 비교
			 if (floatResult == floatRealSum) {
			   System.out.println("2) float의  합은 '실제 계산된 값과 같습니다.'");
			 } else {
			   System.out.println("2) float의  합은 '실제 계산된 값과 다릅니다.'");
			} 
			 
			// double과 float 합산 비교
			if (doubleResult == floatResult) {
			  System.out.println("3) double과 float 타입 합의 결과는 같습니다. ");
			} else {
			 System.out.println("3) double과 float 타입 합의 결과는 같지 않습니다. ★ ");
			} 
			System.out.println();
			
			// double & float 합산 결과
			System.out.println("[result]");
			System.out.printf("double : %.18f \n", new Object[] { Double.valueOf(doubleResult) });
			System.out.printf("float : %.18f \n", new Object[] { Float.valueOf(floatResult) });
	   }
 }