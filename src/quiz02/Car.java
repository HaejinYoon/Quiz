package quiz02;

public class Car {
	
	String manu;
	String model;
	int price;
	int year;
	String engine;
	
	Car(){
		
	}
	
	Car(String cManu, String cModel, int cPrice, int cYear, String cEngine){
		manu = cManu;
		model = cModel;
		price = cPrice;
		year = cYear;
		engine = cEngine;
	}
	
	void info() {
		System.out.println("===== Vehicle Info =====\n");
		System.out.println("Manufacturer:" + manu);
		System.out.println("Model:" + model);
		System.out.println("Price:$" + price);
		System.out.println("Year:" + year);
		System.out.println("Engine:" + engine);
		System.out.println("\n========================\n");
	}
	
	
}
