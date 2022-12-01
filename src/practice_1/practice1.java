package practice_1;

public class practice1 {

	public static void main(String[] args) {
		//1. 두 줄의 문자열을 출력하는 프로그램 작성
		String str1 = "두 줄의 문자열";
		System.out.println(str1 + '\n' + str1);
		System.out.print('\n');
		//2. 1번에 작성한 두줄을 한줄로 출력하는 프로그램 작성
		String str2 = "한 줄의 "
				+ "문자열";
		System.out.println(str2);
		
		//3. 자신의 이름을 세줄로 출력하는 프로그램 작성
		System.out.println("유\n명\n현");
		
		//4. 두 수(11, 20)의 합을 구하여 출력하는 프로그램 작성
		byte x = 11;
		byte y = 20;
		System.out.println(x + y);
		//5. 지정된 x=11와 y=20의 값을 출력하고 합계와 평균을 출력
		float sum = x + y;
		float ava = sum / 2;
		System.out.println(sum);
		System.out.println(ava);
	}

}
