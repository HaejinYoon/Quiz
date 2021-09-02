package quiz10;

public class MainClass {

	public static void main(String[] args) {
		Computer c = new Computer();
		
		c.computerInfo();
		
		KeyBoard k = new KeyBoard();
		System.out.println();
		k.info();
		Monitor m = new Monitor();
		m.info();
	}

}
