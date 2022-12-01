package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : 10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
		
//		10 / 3을 계산했을 때 3.33이 출력되도록 작성.
		int a = 10;
		int b = 3;
		double c = a/(double)b;
		System.out.println("c = " + c);
		System.out.printf("c = %4.2f %4.4f", c, c);
	}

}
