package quiz01;

public class Quiz17 {
	public static void main(String[] args) {
		
		for (int i=1; i<=3; i+=1) {
			for (int j=1; j<=9; j++) {
				for (int k=i; k<=3; k+=1) {
					System.out.print(k + " x " + j + " = " + (j*k) +" ");
					System.out.print("\t");
				}
			System.out.println();
			}
			
		System.out.println();
		}
	
		
		
		
		for (int i=1; i<=9; i+=3) {
			for (int j=1; j<=9; j++) {
//				System.out.print(i + " x " + j + " = " + (i*j) +"\t");
//				System.out.print((i+1) + " x " + j+ " = " + (i+1)*j + "\t");
//				System.out.print((i+2) + " x " + j+ " = " + (i+2)*j + "\t");
//				System.out.println();
			
				System.out.printf("%d x %d = %d\t%d x %d = %d\t%d x %d = %d\n", i, j, i*j, i+1, j, (i+1)*j, i+2, j, (i+2)*j);
			
			
			
			
			
			
			}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
