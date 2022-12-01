//package ch11.sec05;
//
//public class ThrowsExample1 {
//
//	public static void main(String[] args) {
//		try {
//			findClass();
//		} catch (Exception e) {
//			System.out.println("예외 처리 : " + e.toString());
//		}
//
//	}
//	public static void findClass() throws ClassNotFoundException {
//		Class.forName("java.lang.String2");
//	}
//}

package ch11.sec05;

public class ThrowsExample1 {

	public static void main(String[] args) {
		
			findClass();
	}
	public static void findClass() {
		try {
			Class.forName("java.lang.String2");
		} catch (Exception e) {
			System.out.println("예외 처리 : " + e.toString());
		}
	}
}
