package quiz01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 단수를 입력하세요 : ");
		int a1 = scan.nextInt();
		int a2 = 1;
		System.out.println("랜덤 구구단 " + a1+ " 단");
		System.out.println("=====================");
		
		while(a2<=9) {
			System.out.println(a1 +" x "+ a2 +" = " + (a1 *a2));
			a2++;
		}
		
		
		
		
		
		
		
	}
}
