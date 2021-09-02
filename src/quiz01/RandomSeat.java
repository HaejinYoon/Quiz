package quiz01;

import java.util.Arrays;

public class RandomSeat {

	public static void main(String[] args) {
		/*
		 * 정수를 매개변수로 받아서,
		 * 1~매개변수까지의 값을 배열에 랜덤하게 넣어 반환해주는 함수 seat
		 * 
		 * 조건
		 * 1.숫자는 중복되지 않음.
		 * 2.swap을 사용하지 않음.
		 * 
		 * 입력=5
		 * 출력=[1~5가 랜덤하게 섞여있는 길이가 5인배열]
		 * 
		 * 입력=10
		 * 출력=[1~10이 랜덤하게 섞여있는 길이가 10인배열]
		 */
		int[] arr = seat(10);
		int[] arr2 = seat(10);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	
	static int[] seat (int n) {
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i]=(int)((Math.random()*n)+1);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) { 
					i--;
				}	
			}
		}
		return arr;
	}
	
	
	static int[] seat2(int size) {
		int[] arr = new int[size];
		int index = 0;
		
		start:while(true) {
			int ran = (int)(Math.random() * size)+1;
			//중복검사
			for(int i=0; i<index; i++) {
				if(arr[i]==ran) {
					continue start;
				}
			}
			
			arr[index] = ran;
			index++;
			
			if(index == size) {
				break;
			}
		}
		
		
		return arr;
	}
	
}
