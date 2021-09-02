package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {

	public static void main(String[] args) {

		method1();
		System.out.println(method2("Hello"));
		System.out.println(method3(1,2,3));
		System.out.println(method4(4));
		method5("가", 10);
		System.out.println(maxNum(45, 23));
		System.out.println(abs(-10));
		
		char[] arr = {'가', '나','다','라','마'};
		System.out.println(method6(arr));
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println((method7(arr2)));
		
		System.out.println(Arrays.toString(method8("가", "나")));
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String str) {
		
		return str;
	}
	
	static double method3(int a, int b, double c) {
		double sum=0;
		sum = a+b+c;
		return sum;
	}
	
	static String method4(int a) {
		if(a%2==0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	static void method5(String a, int b) {
		for (int i =1; i<=b; i++) {
			System.out.print(a);
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
		return a==0 ? 0 : (a>b ? a : b);
	}
	
	static int abs(int a) {
		return(a>0 ? a : -a);
	}
	
	
	static String method6(char[] arr) {
		String str = "";
		for(int i=0; i<arr.length; i++) {
			str += arr[i];
		}
		return str;
		
//		for(char c : arr) {
//			str +=c;
//		}
//		return str;
	}
	
	static int method7(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static String[] method8(String a, String b) {
		
		String[] arr = {a,b};
		
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
