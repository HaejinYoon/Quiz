package quiz01;

public class Quiz02 {
	public static void main(String[] args) {
		
		
		
		//1. 1~100까지 랜덤한 수를 만들고 짝, 홀수 판별
//		int result = (int)(Math.random() *100) +1;
//		System.out.println(result);
//		String result2 = result % 2 ==0 ? "짝수입니다" : "홀수입니다.";
//		System.out.println(result2);
		
		
		
		//2. -5~5까지 랜덤한 수를 만들고, 절대값으로만 출력해주세요.
//		int result3 = (int)(Math.random()*10)-5;
//		System.out.println(result3);
//		if(result3 < 0) {
//			result3 = -result3; 
//		}
//		System.out.println(result3);
//		
//		
//		int r2 = 5 -(int)(Math.random() * 11); //0~10
//		System.out.println("랜덤값 : " +r2);
//		System.out.println("절대값 : " + (r2 <0 ? -r2 : r2));
		
		//삼항연산자 안에는 삼항연산자가 들어갈 수 있습니다.
		//3.
		//1~150까지 랜덤한 수를 사과의 개수로 가정.
		//bucket은 변수는 사과를 담울 수 있는 양
		//필요한 bucket.의 개수를 구하면 됩니다.
		//ex> 사과 148개? 15개, 사과 150개? 15개
		
		int bucket = 10;
		int app = (int)(Math.random()* 150) + 1;
		System.out.println("사과의 개수 : " + app + "개");
		int result = app % bucket == 0 ? app / bucket : app / bucket +1 ;
		System.out.println("필요한 버킷의 갯수 : "+ result + "개");
		
		int apple = (int)(Math.random()* 150) + 1;
		System.out.println("사과의 개수 : " + apple + "개");
		
		System.out.println("바구니의 개수 : " + ( apple % bucket == 0 ? apple / bucket : apple/ bucket +1));
		
	}
}
