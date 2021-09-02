package quiz06;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		char b[] = {'가', '나', '다', '라', '마'};
		String c[] = {"a","p","p","l","e"};
		
		ArrayPrint ap = new ArrayPrint();
		System.out.println("Arrays.toString: " + Arrays.toString(a));
		System.out.println("ArrayPrint: "+ap.Print(a));
		System.out.println("ArrayPrint: "+ap.Print(b));
		System.out.println("ArrayPrint: "+ap.Print(c));

	}

}
