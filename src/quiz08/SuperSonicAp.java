package quiz08;

public class SuperSonicAp extends Airplane {

	/* ************부모클래스는 수정하지 않습니다***********
	 * 1. Airplane을 상속받습니다. 생성자는 이름을 받아서 초기화 하도록 생성하세요
	 * 2. flyMode int형 변수를 선언하세요
	 * 3. fly() 메서드를 오버라딩합니다
	 * 	  fly() 메서드 안에서는 flyMode가 1이라면 "고속 모드로 비행합니다" 출력
	 *          flyMode 0이라면, super를 통해 부모님의 메서드를 호출
               4. info() - 부모의 메서드를 이용해서, 비행기의 이름을 반환하는 메서드
	 */
	
	int flyMode;
	
	SuperSonicAp(String name) { //맨처음 빨간줄인 이유는 부모의 기본 생성자가 없어서. 없는 경우는 변수를 받아 꼭 변경할 값을 받아야 할 경우도 있기때문에
		super(name);
	}
	SuperSonicAp(){
		super();
	}

	void fly() {
		if(flyMode == 1)
			System.out.println("고속 모드로 비행합니다");
		if(flyMode == 0)
			super.fly();
	}
	
	String info() {
		return super.getName();
	}
	
	
	
	
	
	
}






