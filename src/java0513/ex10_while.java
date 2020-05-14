/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  :(while)
		Version  :  1.0
*/

package java0513;

public class ex10_while {

	public static void main(String[] args) {
		// while
		
		/*
			while(반복조건) {
			실행내용
			
			}
		 */
		int i = 1;
		int sum= 0;
		while (i <= 10) {
			sum= sum+=i ;
			System.out.print(i + " " );
			i++;
			
		}
		System.out.println("sum :" + sum);
		// for(초기화식 ; 조건식 ; 증감식)
		
		// 초기화식
		// while(조건식) {
		//       증감식
		// }
	}

}
