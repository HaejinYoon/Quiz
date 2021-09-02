package quiz01;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		
		//간단한 사칙연산이 되는 간략한 프로그램
		Scanner scan =new Scanner(System.in);
		System.out.print("정수1 >> ");
		double num1 = scan.nextInt();
		
		System.out.print("연산을 선택하세요. [+, -, *, /] >>> ");
		String op = scan.next();
		
		System.out.print("정수2 >> ");
		double num2 = scan.nextInt();
		
		switch (op) {
		case "+":
			System.out.println("두 수의 덧셈은 " + (num1 + num2));
			break;
		case "-":
			System.out.println("두 수의 뺄셈은 " + (num1 - num2));
			break;
		case "*":
			System.out.println("두 수의 곱셈은 " + (num1 * num2));
			break;
		case "/":
			System.out.println("두 수의 나눗셈은 " + (num1 / num2));
			break;
		default:
			System.out.println("연산자를 잘못 입력하였습니다. ");
			break;
		}
		
		
		
	}
}
