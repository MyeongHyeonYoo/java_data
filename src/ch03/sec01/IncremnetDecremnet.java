package ch03.sec01;

public class IncremnetDecremnet {

	public static void main(String[] args) {
		int a = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(++a + a++);
			System.out.println("a = " + a);
		}
		System.out.println();
		for (int i = 0; i <= 100; i +=10) {
			System.out.println("i = " + i);
		}

	}

}
