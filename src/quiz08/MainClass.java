package quiz08;

public class MainClass {

	public static void main(String[] args) {
		SuperSonicAp ssa = new SuperSonicAp("F-22");
		
		ssa.takeOff();
		ssa.flyMode=1;
		ssa.fly();
		ssa.flyMode=0;
		ssa.fly();
		ssa.land();
		System.out.println(ssa.name);
		System.out.println("이름 : " + ssa.info());
		
	}

}