package ch13.sec02;

// 제네릭 타입
public class Product<K, M> {
	// 필드
	private K kind;
	private M model;
	
	public K getKind() { return kind; }
	public M getModel() { return model; }
	public void setKind(K kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
}
