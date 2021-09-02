package quiz01;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=1;
		int sum = 0;
		while (a != 0) {
			System.out.print("정수 입력 >> ");
			a= scan.nextInt();
			sum +=a;
		}
		System.out.println("입력받은 수의 합 : " + sum);
		
		scan.close();
		
	}
}
