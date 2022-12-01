package ch08.sec05;

public interface RemoteControl {
	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 10;
	
	// 추상 메소드
	void turnOn();
	void trunOff();
	void setVolume(int volume);
	
	// 디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			// 추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("무음 해재합니다.");
		}
	}
}
