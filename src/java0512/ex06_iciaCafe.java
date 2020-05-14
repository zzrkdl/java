/*
		Date  :  2020.05.12
		Author  :  김성진
		Description  :iciaCafe
		Version  :  1.0
*/
package java0512;

import java.util.Scanner;

public class ex06_iciaCafe {

	public static void main(String[] args) {
		// 키오스크 : 무인결제 시스템
		// 아메리카노(4,000원)
		// 바닐라라떼(4,500원)
		// 자몽허니블랙티(5,000원)
		// 바닐라초코칩모카(5,500원)
		
		Scanner sc = new Scanner(System.in);
		int num;
		int price = 0;
		String menu= " ";
		
		System.out.println("ICIA Cafe에 오신 것을 환영합니다.");
		System.out.println("주문을 도와드리겠습니다.");
		// \n 의미
		// \t 의미
		System.out.println(" 1. 아메리카노 \t\t 2.바닐라라떼");
		System.out.println(" 3. 자몽허니블랙티 \t\t 4.바닐라초코칩모카");
		
		System.out.println("메뉴를 선택해 주세요 >>");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			menu = "아메리카노";
			price = 4000;
			break;
		case 2:
			menu = "바닐라라떼";
			price = 4500;
			break;
		case 3:
			menu = "자몽허니블랙티";
			price = 5000;
			break;
		case 4:
			menu = "바닐라초코칩모카";
			price = 5500;
			break;                    
		default:
		System.out.println("해당 메뉴는 없습니다.");
		}
		if(num >=1 && num <=4) {
			System.out.println("주문하신 메뉴는 " + menu + "입니다."
					+ "");
			System.out.println("가격은" + price + "원입니다.");
		}
		System.out.println("이용해 주셔서 감사합니다.");
	}

}
