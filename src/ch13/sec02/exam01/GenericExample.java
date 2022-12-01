package ch13.sec02.exam01;

import ch13.sec02.Product;

public class GenericExample {

	public static void main(String[] args) {
		// K는 Tv 대체, M은 String으로 대체
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		// Getter 리턴값은 Tv와 String이 됨
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println(tvModel);
	}

}
