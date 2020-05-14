/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  : 중첩For문(nestedFor)
		Version  :  1.0
*/
package java0513;

public class ex04_nestedFor {

	public static void main(String[] args) {
		// 중첩For문
		// for 문  초기화 =>조건식 =>반복문 => 증감식 =>조건식  아닐시 종료
		/*
		 	for(초기화식; 조건식; 증감식){
		 	
		 		for(초기화식; 조건식; 증감식){
		 			실행할 반복문
		 		}
		 		
		 	}
		 
		 
		 
		 */
		 for(int i=1; i<=2; i++) {
			 for(int j=1; j<=3; j++) {
				 // 실행할 반복문
				 System.out.print("i값 : " + i);
				 System.out.println("\t\t j값 : " + j);
			 }
		 System.out.println("====================");
		 }
		 
	}

}
