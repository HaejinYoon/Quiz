package quiz03;

public class Student {
	String name;
	int no, kor, eng, math;
	
	Student(){
		
	}
	
	Student(String n, int num, int k, int e, int m){
		name=n;
		no=num;
		kor=k;
		eng=e;
		math=m;
	}
	
	int getTotal(){
		return kor+eng+math;
	}
	
	double getAvg() {
		//double avg = (int)(getTotal()/3*100)/100.0;
		
		double avg=(int)(100*getTotal())/3;
		avg /= 100;
		
		System.out.println(avg);
		return avg;
	}
}
