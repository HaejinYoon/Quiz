package quiz02;

public class Person {
	
	String name;
	int age;
	int tall;
	//매개변수를 받는 생성자를 작성할 때는 꼭 매개변수를 받지 않는 기본 생성자도 함께 작성해 줄 것.
	Person(){
		
	}
	
	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키:" + tall);
	}
	
	
}
