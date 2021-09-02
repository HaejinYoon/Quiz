package quiz01;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 1;
		int sum = 0;
		int sum2=0;
		
		//1. 1~100까지 정수중에 3의 배수이거나, 4의 배수일 경우에 가로로 출력
		
		while (a<=100) {
			if(a %3==0 ||  a %4 == 0)
			System.out.print(a +" ");
			a++;
		}
		System.out.println();
		
				
		a=1;	
		//2. 1~200까지 정수중 5의 배수의 합.
		while (a <=200) {
			if ( a%5 ==0) {
				sum +=a;
			}
			a++;
		}
		System.out.println("2번 - 5의 배수의 합 : "+sum);
		
		
		
		
		
		//3. 1~200까지 정수중에 4의 배수이면서 8의 배수가 아닌 수의 개수
		a=1;
		sum = 0;
		int c1=0;
		int c2=0;
		while(a<=200) {
			if( a% 4 == 0 && a % 8 !=0) {
				c1++;
			}
			a++;
		}	
		System.out.println("200까지 개수 : " + c1 + "개");	
			
//			if ( a % 4 ==0) {
//				c1++;
//			}
//			if (a % 8 ==0) {
//				c2++;
//			}
//			a++;
//			
//		}
//		System.out.println("3번 - " + (c1-c2) +"개");
		
		
		
		
		//4. 두 정수를 입력 받아서 두 정수 사이의 합.(같은 경우는 없다.)
		System.out.print("정수1 >> ");
		int n1 = scan.nextInt();
		System.out.print("정수2 >> ");
		int n2 = scan.nextInt();
		int tot = 0;
		
		if (n1>n2) {
			while (n2 <= n1) {
				tot= tot+n2;
				n2++;
			} 
		}else  {
			while (n1<=n2) {
				tot=tot+n1;
				n1++;
			}
			
		}
		System.out.println("두 수 사이의 총 합 : " + tot);
		
		/* 강사님 코딩
		System.out.print("정수1 >> ");
		int n1 = scan.nextInt();
		System.out.print("정수2 >> ");
		int n2 = scan.nextInt();
		
		int max = num1 > num2 ? num1: num2;
		int min = num1 < num2 ? num1 : num2;
		
		int result = 0;
		while(min <= max) {
			result += min;
			min++;
			
		}
		System.out.println("두수의 합 : " + result);
		*/
		
		
	}
}
