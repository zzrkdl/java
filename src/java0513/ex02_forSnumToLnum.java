/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  :	S 부터 N 까지 합 구하기
		Version  :  1.1
*/
package java0513;

import java.util.Scanner;

public class ex02_forSnumToLnum {

	public static void main(String[] args) {
		// for문 사용해서
		// 두개의 정수 (시작값, 끝나는 값)입력받아서
		// 총합을 구하는 프로그램을 만들어 보시오.
		
		Scanner sc= new Scanner(System.in);
	
	
	System.out.println("시작 값 입력");	
	int ksj = sc.nextInt();
	System.out.println("끝 값 입력");
	int kjh = sc.nextInt();
	
	int KKK;
	int SSS = 0;
		
	
	for(KKK=ksj; KKK<=kjh; KKK++){
		SSS= SSS+KKK;
		// SSS = SSS + KKK;
//		if(KKK==kjh) {
//			System.out.println(KKK+"="+SSS);
//		}else {
//			System.out.print(KKK+"+");
//		}
		if(KKK<kjh) {
			System.out.println("+");
		} else {
			System.out.println("="+SSS);
		}
	
		
	}
	System.out.println(ksj + "부터 " + kjh + "의 합:" + SSS);
	}
	

}
