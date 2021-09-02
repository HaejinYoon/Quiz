package quiz01;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int acount = 0;
		int wcount = 0;
		String[] arr = {"+", "-"};
		
		while(true) {
			int a = (int)(Math.random()*100)+1;
			int b = (int)(Math.random()*100)+1;
			int c = (int)(Math.random()*2);
			
			//int oper = (int)(Math.random() * 2);
			
			System.out.println("============================");
			System.out.println(a + arr[c] + b +" = ?" );
			//System.out.println(a + (oper == 1 ? "+" : "-") + b +" = ?" );
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">>");
			
			int answer = scan.nextInt();
			//int result = (oper == 1 ? a+b : a-b);
			
			//if(answer == 0 && result !=0) break;
			
			
			if(answer == 0) {
				System.out.println("[프로그램을 종료합니다.]");
				System.out.println("============================");
				System.out.println("[정답 횟수 : "+ acount + "]");
				System.out.println("[오답 횟수 : "+ wcount + "]");
				break;
			}
			if (answer == a+b) {
				System.out.println("정답입니다.");
				acount ++;
			} else if( answer == a-b) {
				System.out.println("정답입니다.");
				acount ++;
			} else {
				System.out.println("오답입니다.");
				wcount ++;				
			}
			System.out.println();
		}
		scan.close();
	}
}
