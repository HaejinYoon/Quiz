package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {

	public static void main(String[] args) {
		/*
		 * 1.java함수는 매개변수로 숫자를 받습니다.
		 * 2.매개변수 숫자길이만큼 패턴 "자바자바자바....."를 리턴하는 함수를 완성하세요
		 * 		1이면 자
		 * 		2이면 자바
		 * 		3이면 자바자
		 * 		4이면 자바자바
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("매개변수 숫자를 입력하세요 >>");
		int n = scan.nextInt();
		String str = java(n);
		System.out.println(str);
		
		System.out.println(sum(n));
		
		System.out.println(primeNum(n));
		
		System.out.println("두 수 사이의 합: "+ sumNum(7, 9));
		
		System.out.println("nSum :"+nSum(12345678)); //(int)Math.random()*100000000+1)
		
		scan.close();
	}
	
	
	static String java(int n) {
		String str = "";
		for(int i=1; i<=n; i++) {
			if(i%2==1) {
				str+="자";
			}else {
				str+="바";
			}
		}	
		return str;
	}
	
	static int sum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				sum +=i;
			}
		}
		return sum;
	}
	
	static int primeNum(int n) {
		int count, count2=0;
		for(int i=1; i<=n; i++) {
			count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				count2 +=1;
			}
		}
		return count2;
	}
	
	
	//sumNum은 매개변수 2개
	//두 매개변수 사이에 속한 모든 정수의 합을 구하는 sumNum
	//두 매개변수의 크기는 정해지지 않았다.
	
	static int sumNum(int a, int b) {
		
//		int max = a>b ? a : b;
//		int min = b>a ? a : b;
//		int sum = 0;
//		for(int i= min ; i<= max; i++) {
//			sum += i;
//			
//		}
//		return sum;
		
		
		int sum=0;
		if(a>b) {
			for(int i=b; i<=a; i++) {
				
				sum +=i;
			}
		} else if(b>a) {
			for(int i=a; i<=b; i++) {
				
				sum +=i;
			}
		} else
			sum=a;
		return sum;
	}
	
	
	
	/*
	 * 자연수 자리수 합 구하기
	 * 자연수 n이 매개변수로 주어지면 n자리수의 합을 구해서 return하는 메서드
	 * 
	 * 조건
	 * n은 1억 이하의 자연수
	 * n의 자료형을 바꾸면 안됨.
	 * ex > 123456
	 */
	
	
	
	
	
	static int nSum(int a) {
//		int sum=0;
//		for(int i = 10000000; i>= 1; i/=10) {
//			if(a/i != 0) {//몫이 있는 경우
//				sum += (a/i); //몫을 구해서 누적
//				a %= i;
//			}
//		}
//		
//		return sum;
//		
		
		
		
		
		
		
		int sum=0;
		while(a>0) {
			sum += a%10;
			a= a/10;
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
