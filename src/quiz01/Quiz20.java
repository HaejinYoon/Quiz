package quiz01;

import java.util.Arrays;

public class Quiz20 {
	public static void main(String[] args) {
		
		
		//중첩반복문을 이용해서 정렬. (선택, 버블, 킉)
		int[] arr = { 5, 23, 1, 43, 100, 200, 40};
		//선택정렬
		int temp;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
			
				if(arr[i] > arr[j]) {
				
					temp = arr[i];
					
					arr[i] = arr[j];
					
					arr[j] = temp;
				
				}
			
			}
			
			//System.out.println("중간과정 : " + Arrays.toString(arr));
		
		}
		
		//Arrays.sort(arr); //자동정렬 (퀵정렬방식)
		
		System.out.println("최종결과 : " + Arrays.toString(arr));
	
	}

}