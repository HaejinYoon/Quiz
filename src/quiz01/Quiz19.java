package quiz01;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		//정수를 입력 받으세요
		// 2중 for문을 이용하여 입력받은 수까지 수수들의 합을 구하세요.
		//입력 받은 수까지 반복, 내부 for문 에서 외부 for문의 수까지 반복
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력 > ");
		int a = scan.nextInt();
	
		int count;
		
		int sum = 0;
		
		
		for(int i = 1 ; i<=a ; i++) { //a까지의 정수들이 소수인지 아닌지 판별할거임
			
			count=0;
			
			for(int j = 1 ; j<=i ; j++) { // a 아래 정수들을 하나하나 소수인지 판별
				
				if( i%j == 0) {
				
					count++;
				
				}
				
			}
			
			if(count == 2) {
			
				sum +=i;
				
			}
			
		}
		
		System.out.println(a +"까지 소수의 합은 : " + sum);
		
		scan.close();
	
	}
}
