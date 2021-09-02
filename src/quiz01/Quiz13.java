package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1. 
		
		int[] arr = {1000, 500, 100, 50, 10}; //동전
		//int[] arr1 = new int[5];
		int money = 17520; // 금액
		int a;
		int k = 0;
		
		while(money>0) {
			a= money/arr[k];
			//arr1[k] = a;
			
			System.out.println(arr[k]+"원 : " + a +"개");
			money = money - (arr[k]*a); // money %= arr[k]; or money = money % arr[k];
			
			//System.out.println(arr[k]+"원 : "+ arr1[k]+ "개");
			k++;
		}
		
		
		
		//2.  양수를 입력받아, 입력 받은 수 크기의 배열을 생성.
	    //배열에 1~ 입력받은 수 까지 차례대로 값을 넣으세요.
		System.out.print("정수 입력 >>");
		int x = scan.nextInt();
		int i = 0;
		//int j = 1;
		int[] arr2 = new int[x];
		
		while(i<arr2.length) {
			arr2[i]=i+1; //j
			i++;
			//j++;
		}
		System.out.println(Arrays.toString(arr2));
		
		scan.close();
	}
}
