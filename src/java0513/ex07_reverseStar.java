/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  :(reverseStar)
		Version  :  1.0
*/
package java0513;

public class ex07_reverseStar {

	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		for(int i=1; i<=5; i++) {
			for(int j =5 ; j>=i; j--) {
				System.out.println("*");
			}
			System.out.println();
		}

	}

}
