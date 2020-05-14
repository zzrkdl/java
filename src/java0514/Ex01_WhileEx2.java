/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  :(while문 을 사용한 예제2)
		Version  :  1.0
*/
package java0514;

import java.util.Scanner;

public class Ex01_WhileEx2 {

	public static void main(String[] args) {


		
		int account = 0;	//통장만들기 0원		 
		Scanner sc = new Scanner(System.in);
		//int balance;                 
		boolean run = true; //while문 사용하기 위해서
							//run(조건변수) 선언, true 초기화
		
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료  ");
			System.out.println("---------------------------------");
			System.out.print("선택 >>");
		int	menu = sc.nextInt();// menu 변수선언 ,입력
		
			// switch-case문 사용
			switch(menu) {
			case 1:
				System.out.println("예금할 금액");
				// int a = sc.nextInt();
				// account += a
				account += sc.nextInt(); //예금액 입력
				break; //switch 탈출
			case 2:
				System.out.println("출금할 금액");
				account -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고 : " + account);
				break;
			case 4:
				run = false;
				break;
				
			default:
				System.out.println("다시 입력해주세요.");
			} //switch문 종료
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
