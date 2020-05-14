/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  : forProject
		Version  :  1.0
*/
package java0513;

public class ex09_forProject {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		int k=0;
		
		
//		for (l=0; i<4; i++) {
//			for(j=1; j<=3-i; j++) {
//			System.out.print(" ");
//			}
//			for(k=0; k<=i; k++)
//				System.out.print("*");
//			
//			for(l=1; l<=i; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for ( i=1; i<=4; i++) {
			for(j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
				System.out.println();
		}			 
				
			
		 
		
		
		
		
		
		
		
		
	}

}
