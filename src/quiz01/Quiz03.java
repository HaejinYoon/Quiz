package quiz01;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
							
		Scanner scan = new Scanner(System.in);
		System.out.println("키와 나이를 입력하세요.");
		System.out.print("키 : ");
		double h = scan.nextDouble();

		System.out.print("나이 : ");
		int age = scan.nextInt();

		System.out.println("========================");
		if(h>=140 && age >=8) {
			System.out.println("놀이기구 탑승 가능합니다.");
		} else {
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}
		scan.close();
		
	}
}
