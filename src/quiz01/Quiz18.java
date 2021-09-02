package quiz01;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		
		/*
		 * 가로 세로 입력받아서 직사각형을 출력.
		 * 단, 윤곽만 출력
		 * 먼저 사각형을 만들고, 첫행, 마지막행, 첫열, 마지막열에만 * 출력
		 * 나머지는 공백
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("가로 > ");
		int a = scan.nextInt();
		System.out.print("세로 > ");
		int b = scan.nextInt();
		System.out.println();
		
		for(int i=1; i<=a; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=1; i<=b-2; i++) {
			System.out.print("*");
			for(int j=1; j<=a-2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=1; i<=a; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		
		
		for(int i=1; i<=b; i++) {
			for(int j=1; j<=a; j++) {
				if(i==1 || i==b) { //첫행과 마지막행
					System.out.print("*");
				} else { //나머지행
					if(j == 1 || j == a) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
		scan.close();
		
	}
}
