package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		try {
			int value =Integer.parseInt("1oo");
		} catch (NumberFormatException e) {
			
			System.err.println("[에러 내용]");
			System.out.println("출력 결과");
			System.err.println(e.getMessage());
			
		}
	}
}

//public class ErrExample {
//
//	public static void main(String[] args) {
//		try {
//			int value = Integer.parseInt("1oo");
//		} catch (Exception e) {
//			
//			System.err.println("[에러 내용]");
//			System.out.println("출력결과");
//			System.err.println(e.getMessage());
//			
//		}
//
//	}
//} 