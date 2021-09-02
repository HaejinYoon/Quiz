package quiz01;

import java.util.Arrays;

public class Quiz08 {
	public static void main(String[] args) {
		
		String[] arr = {"안녕하세요", "hi", "니취팔로마", "#$%"};
		
		/*
		 * Math.random()을 이용해서 0~3까지 랜덤수를 발생시키고,
		 * 해당 인덱스를 배열에 적용해서, 선택된 값이 한국어, 영어, 중국어, 외계어 인지 구별.
		 */
		
		int a = (int)(Math.random()*arr.length);
		System.out.println(a);
		switch (a) {
		case 0:
			System.out.println("한국어 : "+arr[a]);
			break;
		case 1:
			System.out.println("영어 : "+arr[a]);
			break;
		case 2:
			System.out.println("증국어 : "+arr[a]);
			break;
		case 3:
			System.out.println("외계어 : "+arr[a]);
			break;

		default:
			System.out.println("해당언어 없음");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
