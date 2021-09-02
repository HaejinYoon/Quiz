package quiz10;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard key;
	private Monitor mon;
	private Mouse mice;
	
	
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer() {
		this.key = new KeyBoard();
		this.mon = new Monitor();
		this.mice = new Mouse();
		
	}

	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
		key.info();
		mon.info();
		mice.info();
	}
	
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요
	// getKeyBoard보단 getKey로 변수명을 따라가는게 좋다
	public KeyBoard getKey(){
		return key;
	}
	public void setKey(KeyBoard key) {
		this.key=key;
	}
	
	public Monitor getMon() {
		return mon;
	}
	public void setMon(Monitor mon) {
		this.mon=mon;
	}
	
	public Mouse getMice() {
		return mice;
	}
	public void setMice(Mouse mice) {
		this.mice=mice;
	}
	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
