/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  :	forStar
		Version  :  1.0
*/
package java0513;

public class ex06_forStar {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}

	}

}
