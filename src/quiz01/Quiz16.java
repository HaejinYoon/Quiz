package quiz01;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 *
		 * 
		 *         *
		 *       ***      
		 *     *****
		 *   *******
		 * *********
		 * 
		 * 
		 * 
		 */
		int star = 5;
		
		for(int i = 1 ; i<=star ; i++) {
			for(int j=1 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1 ; i<=star ; i++) {
			for(int j=1 ; j<=star+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("> ");
		int x = scan.nextInt();
		for(int i = 1 ; i<=x ; i+=2) {
			for(int k=1; k<=x-i; k++) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1 ; i<=star ; i++) {
			for(int j=1; j<=star-i; j++) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=2*i-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
