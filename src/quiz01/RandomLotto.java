package quiz01;

import java.text.DecimalFormat;
import java.util.Arrays;

public class RandomLotto {
	public static void main(String[] args) {
		/*
		 * 무작위로 생성된 로또번호를 이용하여 당첨되기까지 금액을 알아보는 프로그램
		 * 
		 * 1. 입력-x
		 * 2. 출력-길이가 6인 배열
		 * lotto함수는 1~45까지의 중복되지 않는 랜덤수를 배열에 넣어 반환하는 베서드
		 * 이 메서으의 실행 결과는 당첨번호
		 * 
		 * 1. 입력-당첨배열
		 * 2. 출력-long(당첨되기까지의 금액)
		 * run함수는 당첨배열을 받아서 당첨되기 까지 랜덤한 금액을 계산하는 메서드
		 * ***당첨의 조건***
		 * 당첨번호 -[10.9.8.7.6.5]
		 * ex> [5,6,8,7,9,10] 당첨
		 * ex> [10,9,8,7,6,45] 당첨 x
		 */
		DecimalFormat formatter = new DecimalFormat("###,###");
		int[] lotnum = lotto();
		long win = run(lotnum);
		System.out.println("Win Number: " + Arrays.toString(lotnum));
		System.out.println("Spent money : " + formatter.format(win)+"원");
		
	}
	
	static int[] lotto() {
		int[] arr = new int[6];
			for(int i=0; i<6; i++) {
				arr[i]=(int)(Math.random()*45+1);
				for(int j=0; j<i; j++) {
					if(arr[i] == arr[j])
					i--;
				}
			}
		Arrays.sort(arr);
		return arr;
	}
	
	static long run(int[] a) {
		long money=0;
		int count=0;
		int[] mynum = new int[6];
		while(count<6) {
			count=0;
			for(int i=0; i<6; i++) {
				mynum[i]=(int)(Math.random()*45+1);
				for(int j=0; j<i; j++) {
					if(mynum[i] == mynum[j])
					i--;
				}
			}
			Arrays.sort(mynum);
			//System.out.println("My number: " + Arrays.toString(mynum));
			money += 1000;
			
			for(int i=0; i<6; i++) {
				if(mynum[i] == a[i]) {
					count++;
				}
			}
		}
		System.out.println("======= Finally Win! =======");
		return money;
	}
	
	
	
}
