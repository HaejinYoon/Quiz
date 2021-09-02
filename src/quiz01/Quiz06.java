package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * 정수는 3개 순서대로 입력받습니다.
		 * 가장 큰값, 중간값, 가장 작은값을 구해서 max, mid, min변수에 저장하고 출력
		 * 
		 * 단, 값이 같은 경우는 없다고 가정.
		 */
		int a, b, c;
		int max=0, mid=0, min = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		a = scan.nextInt();
		System.out.print(">");
		b = scan.nextInt();
		System.out.print(">");
		c = scan.nextInt();
		
		if(a==b || a==c || b==c) {
			System.out.println("같은 수가 있습니다. 문제를 해결하지 못합니다.");
		}else {
			if(a-b > 0 && a-c >0) {
				max = a;
				if(b-c >0) {
					mid = b;
					min = c;
				} else {
					mid = c;
					min = b;
				}
			} else if (b-c>0 && b-a>0) {
				max = b;
				if( a-c>0) {
					mid = a;
					min = c;
				} else {
					mid = c;
					min = a;
				}
			} else if ( c-a>0 && c-b>0) {
				max = c;
				if( a-b>0) {
					mid = a;
					min = b;
				} else {
					mid = b;
					min = a;
				}
			}
			System.out.println("최대 값 : " + max);
			System.out.println("중간 값 : " + mid);
			System.out.println("최소 값 : " + min);
		}
		
			
		
		
		
		scan.close();
		
	}
}
