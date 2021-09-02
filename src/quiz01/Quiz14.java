package quiz01;

public class Quiz14 {
	public static void main(String[] args) {
		
		//1. 랜덤수 2~9 만들고 구구단 출력
		int a = (int)(Math.random()*8 +2 );
		
		for(int i = 1; i<=9; i++) {
			System.out.println( a +"x" + i +"=" +(a * i));
			System.out.printf("%d x %d = %d \n", a, i, a*i);
		}
		
		
		
		
		
		
		//2. 50에서 100까지 두 수 사이의 합.
		int sum = 0 ;
		for(int j = 50; j <= 100; j++) {
			sum +=j;
			
		}
		System.out.println("50~100사이의 합 : " + sum);
		
		//3. A~Z까지 문자를 가로롤 출력 (A=65 Z=90)
		for(char c = 'A'; c <= 'Z' ; c++) {
			System.out.print(c + " ");
		}
		System.out.println();
		for (int k=65; k<=90; k++) {
			char c = (char)k;
			System.out.print(c+" ");
		}
		System.out.println();
		
		
		
		//4. 200까지 정수중의 if문을 사용하지 않고 짝수만 출력
		
		for(int l = 2; l<=200; l+=2) {
			System.out.print(l + " ");
		}
		
		
	}
}
