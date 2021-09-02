package quiz02;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		Car bmw = new Car("BMW", "5 Series", 70000, 2021, "V8");
		
		bmw.info();
		System.out.print("Input Engine>");
		bmw.engine = scan.next();
		bmw.info();
		
		Car benz = new Car();
		benz.manu="Mercedes";
		benz.model="S Class";
		benz.price=12500;
		benz.year=2019;
		benz.engine="V12";
		
		benz.info();
		
		scan.close();
	}

}
