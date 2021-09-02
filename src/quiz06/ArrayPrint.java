package quiz06;

public class ArrayPrint {
	
	//Array.toString 따라해보기(int 배열, String배열, char배열)을 각각 받아서
	//배열 내부에 요소를 문자열의 형태로 가로로 더해서 반환해주는 메서드를 오버로딩
	
	String Print(int a[]) {
		String n = "[";
		
		for(int i=0; i<a.length; i++) {
			n += a[i];
			if(i<a.length-1)
				n+=", ";
			
		}
		n+="]";
		return n;
	}
	
	String Print(String a[]) {
		String n = "[";
		
		for(int i=0; i<a.length; i++) {
			n += a[i];
			if(i<a.length-1)
				n+=", ";
			
		}
		n+="]";
		return n;
	}
	
	String Print(char a[]) {
		String n = "[";
		
		for(int i=0; i<a.length; i++) {
			n += a[i];
			if(i<a.length-1)
				n+=", ";
			
		}
		n+="]";
		return n;
	}
	
	
}
