package quiz01;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("0입니다.");
		} else if (a <0) {
			System.out.println(a + "은(는) 음의 정수입니다.");
		} else if (a% 2 != 0) {
			System.out.println(a + "은(는) 홀수입니다.");
		} else if (a%2==0) {
			System.out.println(a +"은(는) 짝수입니다.");
		}
		
		
		
		//양수 or 음수
//		if(a >= 0) { //양수
//			
//			if(a==0) {//0
//				System.out.println("0입니다.");
//			} else if(a %2 ==0) {//짝수
//				System.out.println(a +"은(는) 짝수입니다.");
//			}else {//홀수
//				System.out.println(a + "은(는) 홀수입니다.");
//			}
//		} else {//음수
//			System.out.println(a + "은(는) 음수입니다.");
//		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
