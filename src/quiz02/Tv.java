package quiz02;

public class Tv {
	
	String company = "LG";
	int channel;
	boolean power;
	
	int changeChannel(int ch) {
		channel = ch;
		System.out.println(channel + "변경");
		return channel;
	}
	
	String power() {
		if(power) {
			System.out.println("전원을 껐어용!");
			power = false;
			return "켜다";
		} else
			System.out.println("전원을 켰어용!");
			power = true;
			return "끄다";
	}
	
	
	void info() {
		System.out.println("모델:" +company);
		System.out.println("채널:" +channel);
		
	}
}
