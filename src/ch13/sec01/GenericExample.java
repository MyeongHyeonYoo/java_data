package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		// Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		// Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();
		box2.content = "100";
		String value = box2.content;
		System.out.println(value);
	}

}
