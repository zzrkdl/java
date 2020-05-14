/*
		Date  :  2020.05.11
		Author  :  김성진
		Description  :  조건문연습문제1(ifExample1)
		Version  :  1.0
*/
package java0511;

import java.util.Scanner;

public class ex12_ifExample1 {

	public static void main(String[] args) {
		// 문제. 성적출력 예제
		// 점수를 입력받아서
		// 90점 이상이면 "A학점 입니다." 출력
		// A : 90~100
		// B : 80~89
		// C : 70~79
		// D : 60~69
		// F : 60미만
		
		int num;
		System.out.println("점수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>=90) {
			System.out.println("A학점 입니다.");
		} else if(num>=80) {
			System.out.println("B학점 입니다.");
		} else if(num>=70) {
		    System.out.println("C학점 입니다.");
		} else if(num>=60) {
			}else {
				System.out.println("F학점 입니다.");
	
			}
		}

}
