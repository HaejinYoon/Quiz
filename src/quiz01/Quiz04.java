package quiz01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		System.out.println( "숫자 비교입니다.");
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int a = scan.nextInt();
		System.out.print("숫자2 : ");
		int b = scan.nextInt();
		
		if( a>b) {
			System.out.println( a + "이(가) 큰수입니다.");
		} else if (b>a) {
			System.out.println( b + "이(가) 큰수입니다.");
		} else {
			System.out.println( "같은수입니다.");
		}
		
		scan.close();
		
		
		
		
		
	}
}
