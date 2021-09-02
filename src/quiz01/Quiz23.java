package quiz01;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 투입해 주세요>");
		int coin = scan.nextInt();
		int sel;
		int add;
		
		ex:while(true) {
			System.out.println("남은금액 : " + coin +"원");
			System.out.println("[1]뎀이소다: 400원, [2]밀킥스: 500원. [3]코가콜라: 600원, [4]잔돈받기 ");
			System.out.print("음료수 선택 >");
			sel = scan.nextInt();
			
			//boolean flag = false;//탈출을 위한
			
			switch (sel) {
			case 1:
				
				if(coin>=400) {
					coin =coin - 400;
					System.out.println("뎀이소다를 받았습니다.");
				}else {
					System.out.println("금액이 부족합니다. 돈을 더 넣어주세요.");
					System.out.print("추가투입 금액 >");
					add = scan.nextInt();
					coin = coin + add;
				}
				break;
			
			case 2:
				if(coin>=500) {
					coin =coin - 500;
					System.out.println("밀킥스를 받았습니다.");
				}else {
					System.out.println("금액이 부족합니다. 돈을 더 넣어주세요.");
					System.out.print("추가투입 금액 >");
					add = scan.nextInt();
					coin = coin + add;
				}
				break;
			case 3:
				if(coin>=600) {
					coin =coin - 600;
					System.out.println("코가콜라를 받았습니다.");
				}else {
					System.out.println("금액이 부족합니다. 돈을 더 넣어주세요.");
					System.out.print("추가투입 금액 >");
					add = scan.nextInt();
					coin = coin + add;
				}
				break;
			case 4:
				System.out.println("남은 금액" + coin + "원을 반환합니다.");
				break ex;
				//flag = true;
				//return;

			default:
				System.out.println("잘못 입력 했습니다.");
				System.out.println("메뉴를 정확히 입력하세요.");
				break;
			}
			System.out.println();
			//if(flag) break; //true라면 탈출
			
		}
	scan.close();	
	}
}
